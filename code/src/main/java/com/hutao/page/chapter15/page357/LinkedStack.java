package com.hutao.page.chapter15.page357;

public class LinkedStack<T> {
    private class Node {
        T item;
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

        public boolean end() {
            return null == item && null == next;
        }
    }

    private Node top = new Node(null, null);

    public void push(T item) {
        top = new Node(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> linkedStack = new LinkedStack<String>();
        for (String s : "Phasers or stun!".split(" ")) {
            linkedStack.push(s);
        }
        String s;
        while ((s = linkedStack.pop()) != null){
            System.out.println(s);
        }
    }
}
