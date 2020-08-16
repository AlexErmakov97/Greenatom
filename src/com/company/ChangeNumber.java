package com.company;

public class ChangeNumber {
    static public void change(int a, int b) {
        a = a + b - (b = a);
    }
}
