package geekbrains.lesson_2_1;

public class Wall implements Competition{
    private int height;
    private int jumpHeight;
    public boolean tf;

    public Wall(int height){

        this.height = height;
        this.jumpHeight = jumpHeight;
    }
    public void wallOvercome (int height, int jumpHeight) {
        if (height<=jumpHeight){
        System.out.println("Wall-competition passed.");
    }
        else {
            System.out.println("Wall-competition failed.");
        }
    }

    @Override
    public void compete(int barrier, int param) {
        if (param >= barrier) {
            System.out.println("passed the wall");
            tf = true;
        }
        else {
            System.out.println("failed the wall");
            tf = false;
        }
    }
}
