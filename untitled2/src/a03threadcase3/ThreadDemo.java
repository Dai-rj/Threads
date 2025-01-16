package a03threadcase3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /*
        多线程第三种实现方式
        可以获取到多线程的运行结果

        1.创建实现Callable接口的实现类对象
        2重写call方法

        3创建Callable的对象(表示多线程要执行的任务）
        4创建FutureTask对象(作用管理多线程运行的结果)
        5创建Thread对象，并启动线程
         */

        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread t1 = new Thread(ft);
        t1.start();

        Integer result = ft.get();
        System.out.println(result);
    }
}
