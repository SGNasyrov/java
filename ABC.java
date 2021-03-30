public class ABC {
    static final Object monitor = new Object();
    static volatile char currentLetter = 'A';

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        synchronized (monitor) {

                            while (currentLetter != 'A') {
                                monitor.wait();

                            }
                            System.out.println("A");
                            currentLetter = 'B';
                            monitor.notify();
                        }
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        synchronized (monitor) {

                            while (currentLetter != 'B') {
                                monitor.wait();

                            }
                            System.out.println("B");
                            currentLetter = 'C';
                            monitor.notify();
                        }
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        synchronized (monitor) {

                            while (currentLetter != 'C') {
                                monitor.wait();

                            }
                            System.out.println("C");
                            currentLetter = 'A';
                            monitor.notify();
                        }
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}









