package com.assignment1;

public class Static {

        static int x = 10;
        static void func(int z) {
            System.out.println("x = " + x);
            System.out.println("z = " + z);
        }
        static {
            System.out.println("Static block.");

        }
        public static void main(String args[]) {
            Static.func(8);
        }
    }

