package models;

import java.util.List;

public class Films{
    String title, episode_id, opening_crawl, director, producer, release_date, created, edited, url;
    List<String> characters, planets, starships, vehicles, species;

    public String getTitle() {
        return title;
    }
}
