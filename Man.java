package geekbrains.lesson_2_1;

public class Man implements Run, Jump{
    private String name;
    private int runSpeed;
    private int jumpHeight;

    public Man (String name, int runSpeed, int jumpHeight){
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runSpeed = runSpeed;
    }

    @Override
    public void run(int v) {
        System.out.println("Man " + name + " runs on 2 legs." + " Velocity: " + v + " mps");
    }

    @Override
    public void jump(int h) {
        System.out.println("Man " + name + " jumps with 2 legs." + " Height: " + h + " m");
    }
    public String getName() {
        return name;
    }
    public int getRunSpeed(){
        return runSpeed;
    }
    public int getJumpHeight(){
        return jumpHeight;
    }
}
