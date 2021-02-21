package geekbrains.lesson_2_2;

public class Main {

    public static void main(String[] args) {
        System.out.println("1+3. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.");
        String[][] sizeIssuesArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "0", "1a", "2a"},
                {"25", "23", "52", "32"},
                {"25", "23", "52", "32"}
        };
        try {
            task1(sizeIssuesArray);
        } catch (MyArraySizeException e) {
            System.out.println("Wrong array size");;
        }
        System.out.println("2+3. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.");
        String[][] contentIssuesArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "0", "1a", "2"},
                {"25", "23", "52", "32"}
        };
        try {
            System.out.println(task2(contentIssuesArray));
        } catch (MyArrayDataException e){
            System.out.println("Wrong data in Row #" +e.getRow() +" and Column #"+ e.getCol());
            System.out.println();
        }
    }

    static void task1(String[][] arrTask1) throws MyArraySizeException {
        if (arrTask1.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arrTask1.length; i++) {
            if (arrTask1[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
    }
    static int task2 (String[][] arrTask2) throws MyArrayDataException{
        int sum = 0;
        for (int i = 0; i < arrTask2.length; i++){
            for (int j = 0; j < arrTask2.length; j++){
                try {
                    sum+=Integer.parseInt(arrTask2[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("format" + i + " " + j ,i,j);
                }
            }
        }
        return sum;
    }




}
