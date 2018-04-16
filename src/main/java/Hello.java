package main.java;

import java.util.ArrayList;
import java.util.List;

public class Hello {
    public static void main(String[] args) {

        List<String> gav = new ArrayList<String>();
        gav.add("1 dog");
        gav.add("2 dog");
        gav.add("3 dog");
        gav.add("4 dog");
        gav.add("5 dog");
        gav.add("6 dog");

        for(String s : gav){
        System.out.println(s);
        }
    }
    public ArrayList<String> doge(ArrayList<String> gav){
        return gav;
    }


}
