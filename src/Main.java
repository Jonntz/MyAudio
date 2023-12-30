import br.com.MyAudio.models.Favorites;
import br.com.MyAudio.models.Musics;
import br.com.MyAudio.models.Podcasts;

public class Main {
    public static void main ( String[] args ) {
        Musics forever = new Musics();

        forever.setTitle("Forever");
        forever.setArtist("Kiss");
        forever.setAlbum("Kiss No.1");

        for(int i = 0; i <= 1000; i++){
            forever.play();
        }

        for(int i = 0; i <= 50; i++){
            forever.like();
        }

        Podcasts flow = new Podcasts();

        flow.setTitle("Flow No.1 - Nando Moura");
        flow.setHost("Flow");
        flow.setDescription("lorem ipsum");

        for(int i = 0; i <= 10000; i++){
            flow.play();
        }

        for(int i = 0; i <= 10000; i++){
            flow.like();
        }

        Favorites favorites = new Favorites();
        favorites.include(flow);
        favorites.include(forever);
    }
}