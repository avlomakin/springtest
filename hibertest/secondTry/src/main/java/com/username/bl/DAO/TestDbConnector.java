package com.username.bl.DAO;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class TestDbConnector extends AbstractDbConnector<Message> {

    private static final Logger log = Logger.getLogger(TestDbConnector.class);

    @Override
    public Message getFirstEntity() {


        Message result = null;

        try {
            log.error("1");
            Session session = sessionFactory.openSession();

            log.error("2");
            List entities;
            entities = session.createQuery("from Message").list();
            log.error("3");
            result = (Message)entities.get(0);
            session.close();
        }
        catch (Throwable e)
        {
            log.error(e);
        }

        return result;
    }
}