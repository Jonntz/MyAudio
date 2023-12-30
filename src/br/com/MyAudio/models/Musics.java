package br.com.MyAudio.models;

public class Musics extends Audio {
    private String artist;
    private String album;
    private String gender;

    public String getArtist () {
        return artist;
    }

    public void setArtist ( String artist ) {
        this.artist = artist;
    }

    public String getAlbum () {
        return album;
    }

    public void setAlbum ( String album ) {
        this.album = album;
    }

    public String getGender () {
        return gender;
    }

    public void setGender ( String gender ) {
        this.gender = gender;
    }

    @Override
    public int getClassification () {
        if(getNumberOfReproduction() > 5000){
            return 10;
        }else if(getNumberOfReproduction() > 100){
            return 5;
        } else {
            return 0;
        }
    }
}
