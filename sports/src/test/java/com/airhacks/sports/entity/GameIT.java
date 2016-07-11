package com.airhacks.sports.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class GameIT {

    private EntityManager em;
    private EntityTransaction tx;

    @Before
    public void initEm() {
        this.em = Persistence.createEntityManagerFactory("it").createEntityManager();
        this.tx = this.em.getTransaction();
    }

    @Test
    public void save() {
        this.tx.begin();
        this.em.merge(new Game("soccer"));
        this.tx.commit();
    }

}
