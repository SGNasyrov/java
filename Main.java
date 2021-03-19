import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] linkedTypeArray = new String[]{"Japan", "Beatles", "April 12", "2021"};
        List<String> arrList = new ArrayList<String>();

        System.out.println("1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);");
        System.out.println("Изначальный массив:");
        System.out.println(Arrays.toString(linkedTypeArray));
        elementReplace(linkedTypeArray, 1, 3);
        System.out.println("Массив с перемещенными элементами:");
        System.out.println(Arrays.toString(linkedTypeArray));
        System.out.println();
        System.out.println("2. Написать метод, который преобразует массив в ArrayList;");
        Collections.addAll(arrList, linkedTypeArray);
        for (String aL : arrList)
            System.out.print(aL + " ");

        System.out.println("3. Большая задача:\n" +
                "a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)\n" +
                "b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;\n" +
                "c. Для хранения фруктов внутри коробки можете использовать ArrayList;\n" +
                "d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);\n" +
                "e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);\n" +
                "f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;\n" +
                "g. Не забываем про метод добавления фрукта в коробку.");

        Orange oranges = new Orange();
        Apple apples = new Apple();
        Box<Orange> orangeBox = new Box();
        Box<Apple> appleBox = new Box();
        float oBoxW;
        float aBoxW;
        for (int i = 0; i < 10; i++) {
            orangeBox.add(new Orange());
        }

        for (int i = 0; i < 10; i++) {
            appleBox.add(new Apple());

        }

        oBoxW = orangeBox.getWeight();
        aBoxW = appleBox.getWeight();

        System.out.println("Коробка апельсинов весит: " + oBoxW + " кг");
        System.out.println("Коробка яблок весит: " + aBoxW + " кг");

        if (orangeBox.comparator(appleBox)) {
            System.out.println("Коробка апельсинов тяжелее коробки яблок");
        }
        else {
            System.out.println("Коробка яблок тяжелее коробки апельсинов");
        }
    }

    private static <ER> void elementReplace (ER[] array, int fElement, int sElement){
        ER additional = array[fElement];
        array[fElement] = array[sElement];
        array[sElement] = additional;

    }



}
