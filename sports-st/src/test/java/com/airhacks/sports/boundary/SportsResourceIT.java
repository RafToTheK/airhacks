package com.airhacks.sports.boundary;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class SportsResourceIT {

    private Client client;
    private WebTarget tut;

    @Before
    public void init() {
        this.client = ClientBuilder.newClient();
        this.tut = this.client.target("http://localhost:8080/sports/resources/sports");
    }

    @Test
    public void crud() {
        Response response = this.tut.request().get();
        assertThat(response.getStatus(), is(200));
        String actual = response.readEntity(String.class);
        assertThat(actual, containsString("fishing"));
        System.out.println("actual = " + actual);
    }

}
