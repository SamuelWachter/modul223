package ch.zli.m223;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
@Path("/calculator")
public class CalculateNumbers {

    @GET
    @Path("/add/{num1}/{num2}")
    public int addNumbers(
            @PathParam("num1") int num1,
            @PathParam("num2") int num2) {
        return num1 + num2;
    }
}
