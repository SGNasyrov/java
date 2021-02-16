package geekbrains.lesson_2_1;

public class Treadmill implements Competition{
    private int speedLvl;
    private int velocity;
    public boolean tf;

    public Treadmill(int speedLvl){
        this.speedLvl = speedLvl;
        this.velocity = velocity;
    }
    public void speedOvercome (int speedLvl, int velocity) {
        if(speedLvl<=velocity) {
            System.out.println("Treadmill-competition passed.");
        }
        else {
            System.out.println("Treadmill-competition failed.");
        }

    }

    @Override
    public void compete(int barrier, int param) {
        if (param >= barrier) {
            System.out.println("passed the treadmill");
            tf = true;
        }
        else {
            System.out.println("failed the treadmill");
            tf = false;
        }
    }
}
