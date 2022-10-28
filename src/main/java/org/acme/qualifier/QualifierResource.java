package org.acme.qualifier;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.TestDiService;

@Path("qualifier")
public class QualifierResource {
//    @Inject
//    @Impl("Foo")
    private final TestDiService foo;


//    @Inject
//    @Impl("Bar")
    private final TestDiService bar;

    public QualifierResource( @Impl(Foo.class) TestDiService foo,  @Impl(Bar.class) TestDiService bar) {
        this.foo = foo;
        this.bar = bar;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("bar")
    public String bar() {
        return bar.test();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("foo")
    public String foo() {
        return foo.test();
    }

}
