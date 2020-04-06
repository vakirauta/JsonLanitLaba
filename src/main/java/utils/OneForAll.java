package utils;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.apache.http.nio.util.SharedInputBuffer;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class OneForAll<T extends Object> {

    GetAllUrl getAllUrl = new GetAllUrl();

    public void iteratorAll(T p, int numb, String url, List<T> list) {
        for (int i = 1; i <= numb; i++) {
            list.add(getAll(p, i, url));
        }
    }

    public T getAll(T p, int count, String url){
        Type itemsListType = new TypeToken<List<T>>() {}.getType();
        String urls = url + count + "/";
        HttpResponse<JsonNode> jsonResponse = Unirest.get(urls).asJson();
        String json = jsonResponse.getBody().toString();

        Gson gson = new Gson();
        p = gson.fromJson(json, itemsListType);
        return p;
    }
}
