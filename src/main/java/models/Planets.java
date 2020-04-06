package models;

import java.util.List;

public class Planets {
    String name, rotation_period, orbital_period, diameter, climate, gravity, terrain, surface_wate, population, created, edited, url;
    List<String> residents, films;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "name='" + name + '\'' +
                ", rotation_period='" + rotation_period + '\'' +
                ", orbital_period='" + orbital_period + '\'' +
                ", diameter='" + diameter + '\'' +
                ", climate='" + climate + '\'' +
                ", gravity='" + gravity + '\'' +
                ", terrain='" + terrain + '\'' +
                ", surface_wate='" + surface_wate + '\'' +
                ", population='" + population + '\'' +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                ", url='" + url + '\'' +
                ", residents=" + residents +
                ", films=" + films +
                '}';
    }
}
