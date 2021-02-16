package geekbrains.lesson_2_1;

public class Robot implements Run, Jump{
    private String name;
    private int runSpeed;
    private int jumpHeight;
    public Robot(String name, int runSpeed, int jumpHeight){
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runSpeed = runSpeed;

    }

    @Override
    public void run(int v) {
        System.out.println("Robot " + name + " runs on roller skates." + " Velocity: " + v + " mps");

    }

    @Override
    public void jump(int h) {
        System.out.println("Robot " + name + " jumps with turbo engine." + " Height: " + h + " m");
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
