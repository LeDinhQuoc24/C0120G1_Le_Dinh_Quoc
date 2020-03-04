package CaseStudy.models;

public class House extends Service{
    private String roomStandard="5 stars";
    private String otherDescriptionOfUtilities="Karaoke";
    private int numberOfFloors=5;
    public House() {
    }
    public House(String roomStandard, String otherDescriptionOfUtilities, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.otherDescriptionOfUtilities = otherDescriptionOfUtilities;
        this.numberOfFloors = numberOfFloors;
    }
    public House(String id, String nameService, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeOfRent, String roomStandard, String otherDescriptionOfUtilities, int numberOfFloors) {
        super(id, nameService, areaUsed, rentalCosts, maxNumberOfPeople, typeOfRent);
        this.roomStandard = roomStandard;
        this.otherDescriptionOfUtilities = otherDescriptionOfUtilities;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOtherDescriptionOfUtilities() {
        return otherDescriptionOfUtilities;
    }

    public void setOtherDescriptionOfUtilities(String otherDescriptionOfUtilities) {
        this.otherDescriptionOfUtilities = otherDescriptionOfUtilities;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }


    @Override
    public String showInfo() {
        return "House{" +
                "id='" + super.getId() + '\'' +
                "nameService='" + super.getNameService() + '\'' +
                "areaUsed='" + super.getAreaUsed() + '\'' +
                "rentalCosts='" + super.getRentalCosts() + '\'' +
                "maxNumberOfPeople='" + super.getMaxNumberOfPeople() + '\'' +
                "typeOfRent='" + super.getTypeOfRent() + '\'' +
                "roomStandard='" + this.getRoomStandard() + '\'' +
                ", otherDescriptionOfUtilities='" + this.getOtherDescriptionOfUtilities() + '\'' +
                ", numberOfFloors=" + this.getNumberOfFloors() + '\'' +
                '}';

    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", otherDescriptionOfUtilities='" + otherDescriptionOfUtilities + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
