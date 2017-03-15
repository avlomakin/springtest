package com.username.bl.DAO;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public abstract class AbstractDbConnector<E> {


    @Autowired
    protected SessionFactory sessionFactory;

    public abstract E getFirstEntity();
}