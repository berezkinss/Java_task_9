package com.company;



import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws MyException {
        String ans = input();
        System.out.println(ans);
    }

    public static String input() throws MyException {
        Scanner in = new Scanner(System.in);
        String text = null;
        text = in.nextLine();

        if (text.length() > 10){
            throw new MyException("Слово состоит больше чем из 10 букв!");
        }

        return text;
    }




}
