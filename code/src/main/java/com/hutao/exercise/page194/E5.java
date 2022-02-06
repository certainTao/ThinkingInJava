package com.hutao.exercise.page194;

import com.hutao.page.page192.Selector;

class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) {
                ++i;
            }
        }

        public Sequence getSequence() {
            return Sequence.this;
        }
    }

    public SequenceSelector selector() {
        return new SequenceSelector();
    }

    public boolean check() {
        return this == selector().getSequence();
    }
}

public class E5 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        System.out.println(sequence.check());
    }
}
