package CaseStudy.views;

        import CaseStudy.models.House;
        import CaseStudy.models.Room;
        import CaseStudy.models.Service;
        import CaseStudy.models.Villa;

        import java.util.ArrayList;

        import static CaseStudy.controller.Menu.menu;

public class MainController {
    static public ArrayList<Service> ListService = new ArrayList<>();
    static public ArrayList<Villa> ListVilla = new ArrayList<>();
    static public ArrayList<House> ListHouse = new ArrayList<>();
    static public ArrayList<Room> ListRoom = new ArrayList<>();
    public static void main(String[] args) {
        menu();
    }
}
