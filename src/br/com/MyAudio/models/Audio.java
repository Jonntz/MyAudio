package br.com.MyAudio.models;

public class Audio {
    private int durationInMinutes;
    private String title;
    private int likes;
    private int numberOfReproduction;
    private int classification;

    public void play(){
        this.numberOfReproduction++;
        System.out.println("Você está ouvindo " + this.title);
    }
    public void like(){
        this.likes++;
    }
    public int getDurationInMinutes () {
        return durationInMinutes;
    }

    public void setDurationInMinutes ( int durationInMinutes ) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle ( String title ) {
        this.title = title;
    }

    public int getLikes () {
        return likes;
    }

    public int getNumberOfReproduction () {
        return numberOfReproduction;
    }

    public int getClassification () {
        return classification;
    }

    public void setClassification ( int classification ) {
        this.classification = classification;
    }
}
