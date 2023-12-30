package br.com.MyAudio.models;

public class Favorites {
    public void include(Audio audio){
        if(audio.getClassification() >=9){
            System.out.println(audio.getTitle() + " é um Sucesso absoluto!");
        } else {
            System.out.println(audio.getTitle() + " é um hit promissor");
        }
    }
}
