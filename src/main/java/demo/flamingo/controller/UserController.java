package demo.flamingo.controller;

import demo.flamingo.entities.users;
import demo.flamingo.service.UserService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("users")
public class UserController {
    
    private final UserService userService;

    {
        userService = new UserService();
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)

    public String test()
    {
        return "welcome !";
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public users getUser(@PathParam("id") int id)
    {
        return userService.getUser(id);
    }
}
