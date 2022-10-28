package org.acme.instance;


import org.acme.TestDiService;
import org.acme.qualifier.Impl;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Foo implements TestDiService {

	@Override
	public String test() {
		return Foo.class.toString();
	}

}
