package com.airhacks.sports.boundary;

import javax.inject.Inject;
import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author airhacks.com
 */
@Path("sports")
public class SportsResource {

    @Inject
    SportsCatalog catalog;

    @GET
    public Response all(@Context UriInfo info) {
        return Response.ok(Json.createObjectBuilder().
                add("sports", catalog.all(info.getPath())).
                add("info", info.getPath()).
                build()).build();

    }

}
