package models;

import java.util.List;

public class Counts {
    String count,next,previous;
    List<Object> results;

    public String getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Counts{" +
                "count='" + count + '\'' +
                ", next='" + next + '\'' +
                ", previous='" + previous + '\'' +
                ", results=" + results +
                '}';
    }
}
