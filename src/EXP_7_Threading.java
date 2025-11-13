public class EXP_7_Threading {
    /*
    static class PrintThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Print: " + i);
            if (i == 2) {
                Thread.yield(); // transfer control
            }
        }
    }
}

   static  class ReadThread extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Read: " + i);
            }
        }
    }

    static public class ThreadControl {
        public static void main(String[] args) {
            new PrintThread().start();
            new ReadThread().start();
        }
    }*/

/*

    static class OddThread extends Thread {
        public void run() {
            for (int i = 1; i <= 20; i += 2) {
                System.out.println("Odd: " + i);
            }
        }
    }

    static class EvenThread extends Thread {
        public void run() {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
            }
        }
    }

    static public class ThreadDemo2 {
        public static void main(String[] args) {
            new OddThread().start();
            new EvenThread().start();
        }
    }
*/

    //forward and reverse thread :

    static class ForwardThread extends Thread {
        public void run() {
            for (int i = 10; i <= 20; i++) {
                System.out.println("Forward: " + i);
                if (i == 11) {
                    try {
                        Thread.sleep(20); // Pause to allow other thread to run
                    } catch (InterruptedException e) {
                        System.out.println("Sleep interrupted");
                    }
                }
            }
        }
    }

    static class ReverseThread extends Thread {
        public void run() {
            for (int i = 20; i >= 1; i--) {
                System.out.println("Reverse: " + i);
            }
        }
    }

    static public class ThreadDemo3 {
        public static void main(String[] args) {
            new ForwardThread().start();
            new ReverseThread().start();
        }
    }
}





