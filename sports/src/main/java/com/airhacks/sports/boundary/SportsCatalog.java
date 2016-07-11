package com.airhacks.sports.boundary;

import com.airhacks.legacy.control.UglySoap;
import com.airhacks.sports.entity.Game;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author airhacks.com
 */
@Stateless
public class SportsCatalog {

    @PersistenceContext
    EntityManager em;

    @Inject
    UglySoap us;

    public String all(String category) {
        if (category == null) {
            throw new IllegalArgumentException("Category parameter cannot be null");
        }
        return "go, chess, " + us.legacyGame();
    }

    public void save(String game) {
        this.em.persist(new Game(game));
    }

}
