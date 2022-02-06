package com.hutao.exercise.page123.connection;

public class ConnectionManager {
    private static Connection[] pool = new Connection[100];
    private static int count = 0;

    static{
        for (int i = 0; i < pool.length; i++) {
            pool[i] = new Connection();
        }
    }

    public static Connection getConnection(){
        if(count>=pool.length){
            return null;
        }
        return pool[count++];
    }
}
