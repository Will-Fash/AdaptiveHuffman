package com.company;

public class Node {

    private int weight;
    private Character data;
    private Node leftChild;
    private Node rightChild;


    public Node(int id, int freq){
        this.leftChild = null;
        this.rightChild = null;
        this.data = null;
        this.weight = freq;
    }


    public void increaseWeight(){
        this.weight = this.weight + 1;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Character getData() {
        return data;
    }

    public void setData(Character data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
