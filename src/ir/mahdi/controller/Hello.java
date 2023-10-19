package ir.mahdi.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
// localhost:8087/api/hello/say
@Path("hello")
public class Hello {

    @Path("say")
    @Produces("text/plain")
    @GET
    public String sayHello() {
        return "salam";
    }
}
