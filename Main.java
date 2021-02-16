package geekbrains.lesson_2_1;

public class Main {

    public static void main(String[] args) {
        int cV, mV, rV, cJ, mJ, rJ, wH, tV, i;
        cV = (int) (1 + Math.random() * 10);
        mV = (int) (1 + Math.random() * 10);
        rV = (int) (1 + Math.random() * 10);
        cJ = (int) (1 + Math.random() * 10);
        mJ = (int) (1 + Math.random() * 10);
        rJ = (int) (1 + Math.random() * 10);

        wH = (int) (1 + Math.random() * 10);
        tV = (int) (1 + Math.random() * 10);

        System.out.println("1.Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).");
        Cat cat = new Cat("Matroskin", cV, cJ);
        Man man = new Man("Fedor", mV, mJ);
        Robot robot = new Robot("T-1000", rV, rJ);
        cat.run(cV);
        cat.jump(cJ);
        man.run(mV);
        man.jump(mJ);
        robot.run(rV);
        robot.jump(rJ);

        System.out.println();
        System.out.println("2.Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).");
        Wall wall = new Wall(wH);
        Treadmill treadmill = new Treadmill(tV);
        System.out.println("Treadmills speed: " + tV);
        System.out.println("Wall's height: " + wH);
        System.out.println(cat.getName() + ": ");
        treadmill.speedOvercome(tV, cat.getRunSpeed());
        wall.wallOvercome(wH, cat.getJumpHeight());
        System.out.println(man.getName() + ": ");
        treadmill.speedOvercome(tV, man.getRunSpeed());
        wall.wallOvercome(wH, man.getJumpHeight());
        System.out.println(robot.getName() + ": ");
        treadmill.speedOvercome(tV, robot.getRunSpeed());
        wall.wallOvercome(wH, robot.getJumpHeight());

        System.out.println();
        System.out.println("Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.");

    Run[] sportsmen = {
            new Cat("Tom",cV,cJ),
            new Man("Ross",mV,mJ),
            new Robot("Wall-E",rV,rJ)
    };
    Competition[] barrs = {
            new Treadmill(tV),
            new Wall(wH)
    };

        }



    }


