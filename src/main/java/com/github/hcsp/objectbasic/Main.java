package com.github.hcsp.objectbasic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        int i = 0;
        while (true){
            ArrayList<ArrayList<Long>> arrayList = new ArrayList<>(2000000000);
            System.out.println(i++);
        }
    }
}
