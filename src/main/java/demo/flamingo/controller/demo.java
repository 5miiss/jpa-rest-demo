package demo.flamingo.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("demo")
public class demo {
    
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String gettest()
    {
        return "hello";
    }
}
