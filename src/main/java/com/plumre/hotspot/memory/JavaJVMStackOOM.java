package com.plumre.hotspot.memory;

/**
 * VM Args: -Xss2m
 * 请注意：运行风险很大 系统会卡住 因为Java线程用的是操作系统中的
 * @author plumre
 */
public class JavaJVMStackOOM {

    public void dontStop() {
        while (true) {
        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(() -> dontStop());
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaJVMStackOOM oom = new JavaJVMStackOOM();
        oom.stackLeakByThread();
    }
}
