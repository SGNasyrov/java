package geekbrains.lesson_2_1;

public class Cat implements Run, Jump{
    private String name;
    private int runSpeed;
    private int jumpHeight;

    public Cat (String name, int runSpeed, int jumpHeight){
        this.name = name;
        this.runSpeed = runSpeed;
        this.jumpHeight = jumpHeight;

    }

    @Override
    public void run(int v) {
        System.out.println("Cat " + name + " runs on 4 legs." + " Velocity: " + v + " mps");
        runSpeed = v;
    }

    @Override
    public void jump(int h) {
        System.out.println("Cat " + name + " jumps with 4 legs." + " Height: " + h + " m");
        jumpHeight = h;
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


