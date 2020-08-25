package com.company;

import java.util.HashMap;
import java.util.Map;

public class Tree {

    private Node root;

    private Map<Character,String> codebook = new HashMap<Character, String>();

    private HashMap<Character, Integer> occurence = new HashMap<Character, Integer>();

    public Tree(){

    }

    public void buildTree(){

    }

    public void printCodes(Node root, String str)
    {
        if (root == null)
            return;
        if (!root.getData().equals('$'))
            System.out.println(root.getData() + ": " + str );
        printCodes(root.getLeftChild(), str + "0");
        printCodes(root.getLeftChild(), str + "1");
    }

    public void storeCodes(Node root, String str)
    {
        if (root == null)
            return;
        if (!root.getData().equals('$'))
            codebook.put(root.getData(), str);
        storeCodes(root.getLeftChild(), str + "0");
        storeCodes(root.getRightChild(), str + "1");
    }

    public void  frquencies(String input){

        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            Integer count = occurence.get(c);
            if (count == null){
                occurence.put(c,1);
            }else {
                occurence.put(c, count + 1);
            }
        }
    }

    public String decode(Node root, String s)
    {
        String ans = "";
        Node curr = root;
        for (int i=0; i<s.length(); i++)
        {
            if (s.toCharArray()[i] == '0')
                curr = curr.getLeftChild();
            else
                curr = curr.getRightChild();

            // reached leaf node
            if (curr.getLeftChild() == null && curr.getRightChild() == null)
            {
                ans += curr.getData();
                curr = root;
            }
        }
        // cout<<ans<<endl;
        return ans+'\0';
    }
}
