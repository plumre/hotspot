package com.plumre.hotspot.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author plumre
 */
public class HeapOOM {
    static class OOMObject{}

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        int i = 0;
        try {
            while (true) {
                list.add(new OOMObject());
                i++;
            }
        } catch (Exception e) {
            System.out.println("i = " + i);
            e.printStackTrace();
        }

    }
}
