package org.acme.qualifier;


import javax.enterprise.context.ApplicationScoped;

import org.acme.TestDiService;

@ApplicationScoped
@Impl(Foo.class)
public class Foo implements TestDiService {

	@Override
	public String test() {
		return Foo.class.toString();
	}

}
