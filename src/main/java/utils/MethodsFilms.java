package utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import models.Films;

import java.lang.reflect.Type;
import java.util.*;

public class MethodsFilms{
    Films films = new Films();
    GetAllUrl getAllUrl = new GetAllUrl();
    String item = "films";
    String url = "https://swapi.co/api/films/";
    String count = getAllUrl.getCount(item);
    public int numb = Integer.parseInt(count);
    List<Films> film = new ArrayList<Films>();

    public void iteratorAllFilms(Films p) {
        for (int i = 1; i <= numb; i++) {
            Films obj = getAll(p, i);
            film.add(obj);
        }
    }

    public Films getAll(Films p, int count) {
        Type typeOfT = new TypeToken<Films>() {}.getType();
        String urls = url + count + "/";
        HttpResponse<JsonNode> jsonResponse = Unirest.get(urls).asJson();
        String json = jsonResponse.getBody().toString();

        Gson gson = new Gson();
        p = gson.fromJson(json, typeOfT);
        return p;
    }

    public void getAllFilms() {
        film.removeAll(film);
        iteratorAllFilms(films);
        for (Films user : film) {
            System.out.println(user);
        }
    }
    public void getFilmByName(String name){
        film.removeAll(film);
        iteratorAllFilms(films);
        for (Films user : film) {
            String userLogin = user.getTitle();
            if(name.equals(userLogin)) {
                System.out.println(user);
            }
        }
    }
    public void getFilmById(int id){
        film.removeAll(film);
        iteratorAllFilms(films);
        System.out.println(film.get(id));
    }
}
