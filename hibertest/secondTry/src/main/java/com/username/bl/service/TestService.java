package com.username.bl.service;

import com.username.bl.DAO.TestDbConnector;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;



@Service
public class TestService {

    protected static final Logger log = Logger.getLogger(TestService.class);

    public String getData()
    {
        String result;
        TestDbConnector testDbConnector = new TestDbConnector();
        result = testDbConnector.getFirstEntity().toString() + " PERFECT!";
        return  result;
    }
}
