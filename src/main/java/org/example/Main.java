package org.example;

public class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int lengthOfString(String text) {
        return text.length(); // 🚨 możliwy NullPointerException
    }

    // 🚨 MOCNY CODE SMELL
    public static int veryComplexMethod(int a, int b, boolean flag) {
        int result = 0;

        if (a > 0) {
            if (b > 0) {
                if (flag) {
                    if (a > 10) {
                        result = a * 42;
                    } else {
                        result = b * 42;
                    }
                } else {
                    if (a > 5) {
                        result = a + b;
                    } else {
                        result = a - b;
                    }
                }
            } else {
                if (flag) {
                    result = a / 1;
                }
            }
        }

        if (result == result) {
            result = result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(lengthOfString(null));
        System.out.println(veryComplexMethod(5, 3, true));
    }
}
