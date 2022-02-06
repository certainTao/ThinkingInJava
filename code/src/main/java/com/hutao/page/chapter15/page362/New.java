package com.hutao.page.chapter15.page362;

import java.util.*;

public class New {
    public static <K, V> Map<K, V> map() {
        return new HashMap<K, V>();
    }

    public static <T> List<T> list() {
        return new ArrayList<T>();
    }

    public static <T> LinkedList<T> linkedList() {
        return new LinkedList<T>();
    }

    public static <T> Set<T> set() {
        return new HashSet<T>();
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<T>();
    }

    public static void main(String[] args) {
        Map<String, List<String>> map = New.map();
        List<String> list = New.list();
        LinkedList<String> linkedList = New.linkedList();
        Set<String> set = New.set();
        Queue<String> queue = New.queue();
    }
}
