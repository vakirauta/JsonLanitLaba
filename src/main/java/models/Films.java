package models;

import java.util.List;

public class Films{
    String title, episode_id, opening_crawl, director, producer, release_date, created, edited, url;
    List<String> characters, planets, starships, vehicles, species;

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Films{" +
                "title='" + title + '\'' +
                ", episode_id='" + episode_id + '\'' +
                ", opening_crawl='" + opening_crawl + '\'' +
                ", director='" + director + '\'' +
                ", producer='" + producer + '\'' +
                ", release_date='" + release_date + '\'' +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                ", url='" + url + '\'' +
                ", characters=" + characters +
                ", planets=" + planets +
                ", starships=" + starships +
                ", vehicles=" + vehicles +
                ", species=" + species +
                '}';
    }
}
