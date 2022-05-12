package com.example.demo.threadLocalTest;
/**
 *         相关博客地址：  https://my.oschina.net/kangxi/blog/1822023   ， https://blog.csdn.net/weixin_34195546/article/details/91810863
 * @author 炜哥哥
 * @date 2022/05/12 14:01
 * @return
 */
public class ThreadLocalTest {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                    for (int j = 0; j < 10; j++) {
                        A();
                    }
                }
            }).start();
        }
    }

    private static void A(){
        System.out.println(threadLocal.get());
        int a=threadLocal.get()!=null?threadLocal.get(): B();
        System.out.println(a);
    }
    private static int B(){
        threadLocal.set(123);
        return 456;
    }

}
