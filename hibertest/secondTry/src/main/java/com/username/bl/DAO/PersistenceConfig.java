package com.username.bl.DAO;

import org.apache.log4j.Logger;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.springframework.context.annotation.*;
/**
 * Created by Alom2_000 on 14.03.2017.
 */

@Configuration
public class PersistenceConfig {

    private static final Logger log = Logger.getLogger(PersistenceConfig.class);
    private static SessionFactory sessionFactory = buildSessionFactory();


    private static SessionFactory buildSessionFactory() {
        try {
            org.hibernate.cfg.Configuration cfg =  new org.hibernate.cfg.Configuration()
                    .configure();

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(cfg.getProperties()).build();


            SessionFactory sf = cfg.buildSessionFactory(serviceRegistry);

            log.error(sf == null ? "Created" : "Null");
            return sf;
        } catch (Throwable e) {
            log.error("Initial SessionFactory creation failed.", e);
            return null;
        }
    }

    @Bean
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
