package com;

import java.awt.*;

public class Hello {
    // 模板：prsf:生成 private static final
    private static final Customer COM = new Customer();  //alt + enter 使得project01能够依赖module     ctr + shift + u  小写转大写
    // 变形：psf
    public static final int NUM =1;  // 常量一般是大写
    // 变形：psfi
    public static final int NUM1 =1;
    // 变形：psfs
    public static final String NATION = "S";
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println();
    }
}
