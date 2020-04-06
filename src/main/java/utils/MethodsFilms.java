package utils;

import com.google.gson.internal.LinkedTreeMap;
import models.Films;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MethodsFilms extends OneForAll{
    Films films = new Films();
    String item = "films";
    String url = "https://swapi.co/api/films/";
    String count = getAllUrl.getCount(item);
    public int numb = Integer.parseInt(count);
    List<Films> film = new ArrayList<Films>();

    public void getAll() {
        //films.removeAll(films);
        iteratorAll(films,numb,url,film);
        for (Films user : film) {
            System.out.println(user);
        }
    }
    public void getFilmByName(String name){
        //films.removeAll(films);
        iteratorAll(films,numb,url,film);
        for (Films user : film) {
            String userLogin = user.getTitle();
            if(name.equals(userLogin)) {
                System.out.println(user);
            }
        }
    }
    public void getFilmById(int id){
        //films.removeAll(films);
        iteratorAll(films,numb,url,film);
        System.out.println(film.get(id));
    }
}
