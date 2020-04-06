package utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import models.Planets;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MethodsPlanets {
    Planets planets = new Planets();
    String item = "planets";
    String url = "https://swapi.co/api/planets/";
    GetAllUrl getAllUrl = new GetAllUrl();
    private String count = getAllUrl.getCount(item);
    public int numb = Integer.parseInt(count);
    ArrayList<Planets> planet = new ArrayList<Planets>();

    public void iteratorAllPlanets(Planets p) {
        for (int i = 1; i <= numb; i++) {
            Planets obj = getAll(p, i);
            planet.add(obj);
        }
    }

    public Planets getAll(Planets p, int count) {
        Type typeOfT = new TypeToken<Planets>() {}.getType();
        String urls = url + count + "/";
        HttpResponse<JsonNode> jsonResponse = Unirest.get(urls).asJson();
        String json = jsonResponse.getBody().toString();

        Gson gson = new Gson();
        p = gson.fromJson(json, typeOfT);
        return p;
    }

    public void getAllPlanets() {
        planet.removeAll(planet);
        iteratorAllPlanets(planets);
        for (Planets user : planet) {
            System.out.println(user);
        }
    }
    public void getPlanetByName(String name){
        planet.removeAll(planet);
        iteratorAllPlanets(planets);
        for (Planets user : planet) {
            String userLogin = user.getName();
            if(name.equals(userLogin)) {
                System.out.println(user);
            }
        }
    }
    public void getPlanetById(int id){
        planet.removeAll(planet);
        iteratorAllPlanets(planets);
        System.out.println(planet.get(id));
    }

}
