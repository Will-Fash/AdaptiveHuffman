package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = "aasbbbhhtighkkklmoooooogth";

        HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            Integer count = freq.get(c);
            if (count == null){
                freq.put(c,1);
            }else {
                freq.put(c, count + 1);
            }
        }

        for(Character i: freq.keySet())
            System.out.println(i + " " + freq.get(i));
    }
}
