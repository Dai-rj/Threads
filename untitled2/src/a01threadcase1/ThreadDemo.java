package a01threadcase1;

public class ThreadDemo {

    public static void main(String[] args){
        /*
        实现多线程的第一种方式
        1.继承Thread类
        2.重写run()方法
        3.创建子类对象,并启动接口
         */



        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
