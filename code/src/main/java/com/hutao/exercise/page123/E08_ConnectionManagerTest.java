package com.hutao.exercise.page123;

import com.hutao.exercise.page123.connection.Connection;
import com.hutao.exercise.page123.connection.ConnectionManager;

public class E08_ConnectionManagerTest {
    public static void main(String[] args) {
        Connection connection;
        while(null!=(connection = ConnectionManager.getConnection())){
            System.out.println(connection);
        }
    }
}
