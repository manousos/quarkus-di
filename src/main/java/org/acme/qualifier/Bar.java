package org.acme.qualifier;

import javax.enterprise.context.ApplicationScoped;

import org.acme.TestDiService;

@ApplicationScoped
@Impl(Bar.class)
public class Bar implements TestDiService {

	@Override
	public String test() {
		return Bar.class.toString();
	}

}
