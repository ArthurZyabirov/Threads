public class Main {
    public static void main(String[] args) {
        System.out.println("Создаю потоки...");
        ThreadGroup mainGroup = new ThreadGroup("main group");
        final MyThread thread1 = new MyThread(mainGroup, "Я поток 1");
        final MyThread thread2 = new MyThread(mainGroup, "Я поток 2");
        final MyThread thread3 = new MyThread(mainGroup, "Я поток 3");
        final MyThread thread4 = new MyThread(mainGroup, "Я поток 4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {}
        mainGroup.interrupt();
    }

}
