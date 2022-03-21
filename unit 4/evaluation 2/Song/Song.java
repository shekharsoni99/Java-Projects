package com.masai;

import java.util.ArrayList;
import java.util.List;

public class Song {
    private String movieName;
    private String songName;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Song{" +
                "movieName='" + movieName + '\'' +
                ", songName='" + songName + '\'' +
                '}';
    }
}

abstract class PlayList {
    public List<Song> songs = new ArrayList<>();

    public abstract void addSong(Song song);

    

}