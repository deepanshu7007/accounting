package currentThreadDemo;
class Currentjava implements Runnable{

    public Currentjava() {
        Thread t = new Thread();
        Thread t1 = new Thread();
        t.start();
        t1.start();
    }
    
    public static void main(String[] args)
    {
        new Currentjava();
        System.out.println("Hello World");
        System.out.println(Thread.getAllStackTraces());
        Thread t = Thread.currentThread();
        t.setName("Deepanshu");
        System.out.println(t);
    }

    @Override
    public void run() {
        System.out.println(Thread.getAllStackTraces());
        System.out.println("Hello World");
    
    }
}
