package CaseStudy.Task1.models;

public class Room extends Service{
    private String freeService = "Jav1";
    public Room() {
    }
    public Room(String freeService) {
        this.freeService = freeService;
    }
    public Room(String id, String nameService, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeOfRent, String freeService) {
        super(id, nameService, areaUsed, rentalCosts, maxNumberOfPeople, typeOfRent);
        this.freeService = freeService;
    }
    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String showInfo() {
         return "Room{" +
                "id='" + super.getId() + '\'' +
                "nameService='" + super.getNameService() + '\'' +
                "areaUsed='" + super.getAreaUsed() + '\'' +
                "rentalCosts='" + super.getRentalCosts() + '\'' +
                "maxNumberOfPeople='" + super.getMaxNumberOfPeople() + '\'' +
                "typeOfRent='" + super.getTypeOfRent() + '\'' +
                "freeService='" + this.getFreeService() + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
