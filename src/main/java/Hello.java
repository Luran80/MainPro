package main.java;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Hello {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        int x = 0;
        String s = "dog";

        Map<Integer, String> gav = new HashMap<Integer, String>();

        while (true) {
            i++;
            gav.put(i, s);
            for (Integer key : gav.keySet())
                System.out.print(key + " ");

            for (String val : gav.values())
                System.out.print(val);
            System.out.println();

            TimeUnit.MILLISECONDS.sleep(500);

            Iterator<Map.Entry<Integer, String>> iterator1 = gav.entrySet().iterator();
            while (iterator1.hasNext()) {
                Map.Entry<Integer, String> pair1 = iterator1.next();
                Iterator<Map.Entry<Integer, String>> iterator2 = gav.entrySet().iterator();
                while (iterator2.hasNext()) {
                    Map.Entry<Integer, String> pair2 = iterator2.next();
                    if (pair1.getValue().equals(pair2.getValue())) {
                        iterator2.remove();
                    }
                }

            }

        }
    }
}




