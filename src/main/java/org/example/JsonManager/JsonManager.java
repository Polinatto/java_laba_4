package org.example.JsonManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;



public class JsonManager<T> {
    public String Serialize(T src)
    {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(src);
        return json;
    }

    public T Deserialize(String json, Type typeOfT)
    {
        Gson gson = new GsonBuilder().create();
        Object djson = gson.fromJson(json, typeOfT);
        return (T)djson;
    }
}
