package org.acme.example;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Sport(Sports.FOOTBALL)
public class FootballService implements SportService {

    @Override
    public String play() {
       return "playing football";
    }
}
