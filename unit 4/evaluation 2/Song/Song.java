package com.masai;
import java.util.*;

public class Song {
    private String movieName;
    private String songName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(movieName, song.movieName) && Objects.equals(songName, song.songName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName, songName);
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
