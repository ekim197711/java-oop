package com.example.javaoop.space.association;

import java.util.List;

public class SpaceStation {
    {
        spaceships = List.of(
                new SpaceShip("Round", "Mike", "Moon", 90.0),
                new SpaceShip("Pyramid", "Harriet", "Moon", 80.0),
                new SpaceShip("Star", "Maria", "Moon", 60.0),
                new SpaceShip("Box", "Kari", "Moon", 70.0)
        );
    }

    private List<SpaceShip> spaceships;
    public void setDestination(String destination){
        for (SpaceShip ship : spaceships) {
            ship.setDestination(destination);
            ship.showStatus();
        }
    }

}
