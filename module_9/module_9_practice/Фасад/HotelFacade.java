public class HotelFacade {

    private RoomBookingSystem roomSystem;
    private RestaurantSystem restaurant;
    private EventManagementSystem eventSystem;
    private CleaningService cleaning;
    private TaxiService taxi;

    public HotelFacade() {
        roomSystem = new RoomBookingSystem();
        restaurant = new RestaurantSystem();
        eventSystem = new EventManagementSystem();
        cleaning = new CleaningService();
        taxi = new TaxiService();
    }

    
    public void bookRoomWithServices(String name) {
        System.out.println("\n🏨 Полное бронирование...");
        roomSystem.checkAvailability();
        roomSystem.bookRoom(name);
        restaurant.orderFood("Ужин");
        cleaning.scheduleCleaning("101");
    }

    
    public void organizeEvent(String eventName, String organizer) {
        System.out.println("\n🎤 Организация мероприятия...");
        eventSystem.bookHall(eventName);
        eventSystem.orderEquipment("Проектор");
        roomSystem.bookRoom(organizer);
    }

   
    public void reserveRestaurantWithTaxi(String name) {
        System.out.println("\n🍽 Бронь ресторана...");
        restaurant.reserveTable(name);
        taxi.callTaxi(name);
    }

    
    public void cancelRoom(String name) {
        roomSystem.cancelBooking(name);
    }

    
    public void requestCleaning(String room) {
        cleaning.cleanNow(room);
    }
}