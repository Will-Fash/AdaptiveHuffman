package com.company;

import java.util.Comparator;

public class Comparing implements Comparator<Node> {
    public int compare(Node x, Node y){
        return x.getWeight() - y.getWeight();
    }

}
