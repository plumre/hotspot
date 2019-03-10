package com.plumre.hotspot.memory;

/**
 * VM Args: -Xss512k
 * @author plumre
 */
public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF sof = new JavaVMStackSOF();
        try {
            sof.stackLeak();
        } catch (Exception e) {
            System.out.println("stackLength = " + sof.stackLength);
            throw e;
        }
    }
}
