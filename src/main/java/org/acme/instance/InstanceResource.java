package org.acme.instance;

import java.util.stream.Collectors;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.TestDiService;



@Path("instance")
public class InstanceResource {

    private final Instance<TestDiService> diServices;

    InstanceResource(Instance<TestDiService> diServices) {
        this.diServices = diServices;
    }
//    @Inject
//    Instance<TestDiService> diServices;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("bar")
    public String bar() {
        var service = diServices.stream()
                .filter(impl -> impl instanceof Bar).collect(Collectors.toSet())
                .iterator()
                .next();

        return service.test();

    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("foo")
    public String foo() {
        TestDiService service = diServices.stream().filter(impl -> impl instanceof Foo)
                .collect(Collectors.toSet()).iterator().next();
        return service.test();
    }

}
