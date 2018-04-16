package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Hello {
    public static void main(String[] args) {

        List<String> gav = new ArrayList<String>();
        gav.add("1 dog");
        gav.add("2 dog");
        gav.add("3 dog");
        gav.add("4 dog");
        gav.add("5 dog");
        gav.add("6 dog");

        try {
            for (String s : gav) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(s);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public ArrayList<String> doge(ArrayList<String> gav){
        return gav;
    }


}
