package utils;

import com.google.gson.Gson;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import models.AllUrl;
import models.Counts;
import models.Peoples;

public class GetAllUrl<T> {
    Peoples peoples = new Peoples();
    AllUrl allUrl = new AllUrl();
    Counts count = new Counts();
    String url = "http://swapi.co/api/";

    public AllUrl getAllUrl() {
        HttpResponse<JsonNode> jsonResponse = Unirest.get("http://swapi.co/api/").asJson();
        String json = jsonResponse.getBody().toString();

        Gson gson = new Gson();
        allUrl = gson.fromJson(json, AllUrl.class);
        return allUrl;
    }
    public Counts getItems(String text) {
        HttpResponse<JsonNode> jsonResponse = Unirest.get("http://swapi.co/api/" + text + "/").asJson();
        String json = jsonResponse.getBody().toString();

        Gson gson = new Gson();
        count = gson.fromJson(json, Counts.class);
        return count;
    }

    public String getCount(String text){
        String count = getItems(text).getCount();
        return count;
    }

}
