public class MainFacade {
    public static void main(String[] args) {
        TV tv = new TV();
        AudioSystem audio = new AudioSystem();
        DVDPlayer dvd = new DVDPlayer();
        GameConsole console = new GameConsole();

        HomeTheaterFacade facade = new HomeTheaterFacade(tv, audio, dvd, console);

        facade.watchMovie();
        facade.setVolume(20);
        facade.endMovie();

        facade.playGame();

        facade.listenMusic();
    }
}