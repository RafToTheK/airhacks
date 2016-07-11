package com.airhacks.sports.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Path("sports")
public class SportsResource {

    @GET
    public String all() {
        return "fishing, chess, bowling, soccer";
    }

}
