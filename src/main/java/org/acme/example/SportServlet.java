package org.acme.example;

import static org.acme.example.Sports.FOOTBALL;
import static org.acme.example.Sports.HOCKEY;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("sport")
public class SportServlet {

	@Inject
	@Sport(HOCKEY)
	SportService hockeyService;

	@Inject
	@Sport(FOOTBALL)
	SportService footballService;

	@GET
	@Path("hok")
	public String hokey() {
		return hockeyService.play();
	}

	@GET
	@Path("foot")
	public String football() {
		return footballService.play();
	}

}
