package models;

import java.util.List;

public class Peoples extends Counts{
    String name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,created,edited,url;
    List<String> films,species,vehicles,starships;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Peoples{" +
                "name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", mass='" + mass + '\'' +
                ", hair_color='" + hair_color + '\'' +
                ", skin_color='" + skin_color + '\'' +
                ", eye_color='" + eye_color + '\'' +
                ", birth_year='" + birth_year + '\'' +
                ", gender='" + gender + '\'' +
                ", homeworld='" + homeworld + '\'' +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                ", url='" + url + '\'' +
                ", films=" + films +
                ", species=" + species +
                ", vehicles=" + vehicles +
                ", starships=" + starships +
                '}';
    }
}
