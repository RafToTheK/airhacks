package com.airhacks.sports.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 *
 * @author airhacks.com
 */
@Entity
@NamedQuery(name = "all", query = "SELECT g FROM Game g where g.skill")
public class Game {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    public Game(String name) {
        this.name = name;
    }

    public Game() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
