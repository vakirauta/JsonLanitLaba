package models;

public class AllUrl {
    String people,planets,films,species,vehicles,starships;

    public String getPeople() {
        return people;
    }

    public String getPlanets() {
        return planets;
    }

    public String getFilms() {
        return films;
    }

    public String getSpecies() {
        return species;
    }

    public String getVehicles() {
        return vehicles;
    }

    public String getStarships() {
        return starships;
    }

    @Override
    public String toString() {
        return "AllUrl{" +
                "people='" + people + '\'' +
                ", planets='" + planets + '\'' +
                ", films='" + films + '\'' +
                ", species='" + species + '\'' +
                ", vehicles='" + vehicles + '\'' +
                ", starships='" + starships + '\'' +
                '}';
    }
}
