import java.util.List;
import java.util.*;

public class Iphone implements DevicePlayerMusic, Phone, Internet {

    private Music music;
    private Contact contact;
    private List<Music> musicList = new ArrayList<>();

    public Iphone(Contact contact, Music music) {
        this.contact = contact;
        this.music = music;
    }


    public void adicionarMusica(){
        this.musicList .add(new Music());
    }





    public void multi() {
        System.out.println("I am MultiTouch");

    }

    @Override
    public void connection() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'connection'");
    }

    @Override
    public void pageBroser() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pageBroser'");
    }

    @Override
    public void call() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'call'");
    }

    @Override
    public void receiveCall() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receiveCall'");
    }

    @Override
    public void voiceMail() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'voiceMail'");
    }

    @Override
    public void SMS() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'SMS'");
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pause'");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }

    @Override
    public void suffle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'suffle'");
    }

    @Override
    public void nextMusic() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nextMusic'");
    }

    @Override
    public void backMusic() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'backMusic'");
    }

}
