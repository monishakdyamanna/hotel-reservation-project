import ClMenu.MainMenu;
import service.ReservationService;
import model.Room;
import model.RoomType;

public class HotelApplication {
    public static void main(String[] args) {

        ReservationService reserveService = ReservationService.getInstance();
        reserveService.addRoom(new Room("201", 300.00, RoomType.SINGLE));


        System.out.println("Welcome to the Hotel Reservation Application!");
        System.out.println("We are delighted to host your stay");
        System.out.println("Book your room and enjoy your stay\n");
        MainMenu.displayMainMenu();
    }
}
