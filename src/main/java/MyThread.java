class MyThread extends Thread {

    public MyThread(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);

    }

    @Override
    public void run() {
        try {
            while(true) {
                if(isInterrupted()) return;
                Thread.sleep(2500);
                System.out.println(getName() + " Всем привет!");
            }
        } catch (InterruptedException err) {

        } finally{
            System.out.printf("%s завершен\n", getName());
        }
    }
}
