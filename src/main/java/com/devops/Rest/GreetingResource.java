package com.devops.Rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;

import com.devops.Entity.Personal;
import com.devops.service.PersonService;


@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @Inject
    PersonService perService;

    @POST
    @Path("/createDetails")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(description = "Creating a new report")
    public Response createPersonalDetails(Personal person) {
        Personal reportNew = perService.addPerson(person);
        return Response.status(Response.Status.OK).entity(reportNew).build();
    }
}