package geekbrains.lesson_2_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.");
        System.out.println();
        String [] wordArray = new String[12];
        wordArray[0] = "home";
        wordArray[1] = "cat";
        wordArray[2] = "summer";
        wordArray[3] = "sea";
        wordArray[4] = "field";
        wordArray[5] = "fish";
        wordArray[6] = "windmill";
        wordArray[7] = "silk";
        wordArray[8] = "worm";
        wordArray[9] = "cat";
        wordArray[10] = "sea";
        wordArray[11] = "field";
        String word = new String();
        System.out.println(Arrays.toString(wordArray));

        HashMap<String,Integer> uniqueWord = new HashMap<>();
        for (int i = 0; i < wordArray.length; i++) {
            word = wordArray[i];
            Integer ammount = uniqueWord.getOrDefault(word,0);
            uniqueWord.put(word,ammount + 1);
        }
        System.out.println(uniqueWord);
        System.out.println();
        System.out.println("Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.");
        System.out.println();
        Book phonebook = new Book();
        phonebook.add("Page", 89033678989l);
        phonebook.add("Plant", 89162282828l);
        phonebook.add("Gillan", 89119876532l);
        phonebook.add("Harrison", 89268975632l);
        phonebook.add("Page", 89026851234l);

        System.out.println("Phone number: " + phonebook.get("Plant"));

    }


}
