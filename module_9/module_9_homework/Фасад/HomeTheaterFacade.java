public class HomeTheaterFacade {
    private TV tv;
    private AudioSystem audio;
    private DVDPlayer dvd;
    private GameConsole console;

    public HomeTheaterFacade(TV tv, AudioSystem audio, DVDPlayer dvd, GameConsole console) {
        this.tv = tv;
        this.audio = audio;
        this.dvd = dvd;
        this.console = console;
    }

    public void watchMovie() {
        System.out.println("\n Запуск фильма...");
        tv.on();
        audio.on();
        audio.setVolume(10);
        dvd.play();
    }

    public void endMovie() {
        System.out.println("\n Остановка системы...");
        dvd.stop();
        audio.off();
        tv.off();
    }

    public void playGame() {
        System.out.println("\n Запуск игры...");
        tv.on();
        audio.on();
        console.on();
        console.startGame();
    }

    public void listenMusic() {
        System.out.println("\n Прослушивание музыки...");
        tv.on();
        audio.on();
        audio.setVolume(15);
    }

    public void setVolume(int level) {
        audio.setVolume(level);
    }
}