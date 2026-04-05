public class MainHotel {
    public static void main(String[] args) {

        HotelFacade hotel = new HotelFacade();

        hotel.bookRoomWithServices("Олжас");

        hotel.organizeEvent("Конференция", "Компания X");

        hotel.reserveRestaurantWithTaxi("Айжан");

        hotel.cancelRoom("Олжас");

        hotel.requestCleaning("101");
    }
}