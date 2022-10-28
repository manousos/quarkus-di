package org.acme.example;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Sport(Sports.HOCKEY)
public class HockeyService implements SportService {

    @Override
    public String play() {
        return "playing hockey";
    }
}
