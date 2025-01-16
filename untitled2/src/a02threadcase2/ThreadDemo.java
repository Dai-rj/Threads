package a02threadcase2;

public class ThreadDemo {

    public static void main(String[] args){
        /*
        实现多线程的第二种方式
        1.自己定义一个实现Runnable接口
        2.重写run方法
        3创建自己类的对象
        4.创建一个Thread类对象，并启动线程
         */
        //创建run对象
        MyRun mr = new MyRun();
        //创建线程对象
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        //设置线程名称
        t1.setName("线程1");
        t2.setName("线程2");
        //启动线程
        t1.start();
        t2.start();
    }
}
