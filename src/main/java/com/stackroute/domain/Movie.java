package com.stackroute.domain;

public class Movie {
    private Actor oneActor;

    Movie(){}

    // Constructor Injection
    public Movie(Actor oneActor) {
        this.oneActor = oneActor;
    }

    public Actor getOneActor() {
        return oneActor;
    }

    public void setOneActor(Actor oneActor) {
        this.oneActor = oneActor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "oneActor=" + oneActor +
                '}';
    }
}
