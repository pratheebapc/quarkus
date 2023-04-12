package com.devops.Rest;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;

import com.devops.Entity.Personal;
import com.devops.service.PersonService;

public class PersonRest {
   
    @Inject
    PersonService perService;

    @POST
    @Path("/createDetails")
    @Operation(description = "Creating a new report")
    public Response createPersonalDetails(Personal person) {
        Personal reportNew = perService.addPerson(person);
        return Response.status(Response.Status.OK).entity(reportNew).build();
    }
}
