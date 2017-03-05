package com.username.bl.service;

import com.username.bl.DAO.TestDBConnector;

import java.sql.*;

public class TestService {

    public static String getData(String database, String user, String password)
    {
        String result = null;
        try {
            TestDBConnector testController = new TestDBConnector(database, user, password);
            result = testController.getFirstEntity().getData() + " PERFECT!";
        } catch (SQLException e) {
            result = "Something is wrong. Try again pls.";
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  result;
    }
}
