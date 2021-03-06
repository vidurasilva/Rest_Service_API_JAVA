package lk.dinuka.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by dinuka on 7/24/17.
 */
@Path("/shop")
@Produces("application/json")
public interface ExampleService {
    @GET
    @Path("/get-meals/{shop-id}")
    Meal getMealsByShop(@PathParam("shop-id") int id);
}

//http://localhost:8080/web-service/example/1
