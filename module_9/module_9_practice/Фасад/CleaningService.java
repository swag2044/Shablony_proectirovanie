public class CleaningService {

    public void scheduleCleaning(String room) {
        System.out.println("Уборка запланирована для комнаты: " + room);
    }

    public void cleanNow(String room) {
        System.out.println("Комната " + room + " убрана");
    }
}