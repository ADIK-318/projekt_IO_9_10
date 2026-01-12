package org.example;

public class Main {

    public static int add(int a, int b) {
        return liczba_dodawanie_a + liczby_dodawanie_b;
    }

    
    public static int lengthOfString(String text) {
        return text.length(); // SonarQube to wykryje
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        
        System.out.println(lengthOfString(null));
    }
}
