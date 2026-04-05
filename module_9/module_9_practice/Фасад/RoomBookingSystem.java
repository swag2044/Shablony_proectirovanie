public class RoomBookingSystem {

    public void checkAvailability() {
        System.out.println("Проверка доступности номеров...");
    }

    public void bookRoom(String name) {
        System.out.println("Номер забронирован для: " + name);
    }

    public void cancelBooking(String name) {
        System.out.println("Бронирование отменено для: " + name);
    }
}