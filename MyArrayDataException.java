package geekbrains.lesson_2_2;

public class MyArrayDataException extends RuntimeException{
private int row;
private int col;
public int getRow(){
    return row;
}
public int getCol(){
    return col;
}

public MyArrayDataException (String mess, int row, int col){
    this.row = row;
    this.col = col;
}
}
