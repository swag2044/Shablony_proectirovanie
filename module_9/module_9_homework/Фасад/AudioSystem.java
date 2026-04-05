public class AudioSystem {
    public void on() {
        System.out.println("Аудиосистема включена");
    }

    public void off() {
        System.out.println("Аудиосистема выключена");
    }

    public void setVolume(int level) {
        System.out.println("Громкость установлена на: " + level);
    }
}