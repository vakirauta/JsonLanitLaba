package utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import models.Peoples;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MethodsPeoples {
    Peoples peoples = new Peoples();
    GetAllUrl getAllUrl = new GetAllUrl();
    String item = "people";
    String url = "http://swapi.co/api/people/";
    private String count = getAllUrl.getCount(item);
    public int numb = Integer.parseInt(count);
    public ArrayList<Peoples> people = new ArrayList<Peoples>();

    public void iteratorAllPeoples(Peoples p) {
        for (int i = 1; i <= numb; i++) {
           Peoples obj = getAllPeople(p, i);
           people.add(obj);
        }
    }

    public Peoples getAllPeople(Peoples p, int count) {
        Type typeOfT = new TypeToken<Peoples>() {}.getType();
        String urls = url + count + "/";
        HttpResponse<JsonNode> jsonResponse = Unirest.get(urls).asJson();
        String json = jsonResponse.getBody().toString();

        Gson gson = new Gson();
        p = gson.fromJson(json, typeOfT);
        return p;
    }

    public void getAllPeople() {
        people.removeAll(people);
        iteratorAllPeoples(peoples);
        for (Peoples user : people) {
            System.out.println(user);
        }
    }
    public void getPeopleByName(String name){
        people.removeAll(people);
        iteratorAllPeoples(peoples);
        for (Peoples user : people) {
            String userLogin = user.getName();
            if(name.equals(userLogin)) {
                System.out.println(user);
            }
        }
    }
    public void getPeopleById(int id){
        people.removeAll(people);
        iteratorAllPeoples(peoples);
            System.out.println(people.get(id));
    }
}
