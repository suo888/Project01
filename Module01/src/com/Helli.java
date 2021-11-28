package com;

import java.util.*;

public class Helli {

    public static void main(String[] args) {
        // 模板：sout
        System.out.println("hhhhh");
        System.out.println("args = " + Arrays.deepToString(args));  //soutp 输出当前参数
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Helli.main");  //soutm
        int num = 10;
        System.out.println("num = " + num); //soutv  输出当前变量
        String[] arr = new String[]{"tom","aii","mi"};
        // 模板：fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //  iter
        for (String s : arr) {
            System.out.println(s);
        }
        // 变形：itar
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        // arraylist  alt+enter
        ArrayList<Object> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("1");
        // 模板：list.for
        for (Object o : list) {
            
        }
        // list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //list.forr  从尾到头
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        // if 模板
        // ifn
        if (list == null) {
            
        }
        //inn
        if (list != null) {

        }
        // 或者 xxx.nn /xxx.null
        if (list != null) {

        }
        if (list == null) {

        }


    }

}