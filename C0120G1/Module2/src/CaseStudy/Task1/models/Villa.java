package CaseStudy.Task1.models;

public class Villa extends House{
    private double poolArea;
    public Villa() {
    }
    public Villa(double poolArea) {
        this.poolArea = poolArea;
    }
    public Villa(String roomStandard, String otherDescriptionOfUtilities, int numberOfFloors, double poolArea) {
        super(roomStandard, otherDescriptionOfUtilities, numberOfFloors);
        this.poolArea = poolArea;
    }
    public Villa(String id, String nameService, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeOfRent, String roomStandard, String otherDescriptionOfUtilities, int numberOfFloors, double poolArea) {
        super(id, nameService, areaUsed, rentalCosts, maxNumberOfPeople, typeOfRent, roomStandard, otherDescriptionOfUtilities, numberOfFloors);
        this.poolArea = poolArea;
    }
    public double getPoolArea() {
        return poolArea;
    }
    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String showInfo() {
        return "Villa{" +
                "id='" + super.getId() + '\'' +
                "nameService='" + super.getNameService() + '\'' +
                "areaUsed='" + super.getAreaUsed() + '\'' +
                "rentalCosts='" + super.getRentalCosts() + '\'' +
                "maxNumberOfPeople='" + super.getMaxNumberOfPeople() + '\'' +
                "typeOfRent='" + super.getTypeOfRent() + '\'' +
                "roomStandard='" + super.getRoomStandard() + '\'' +
                ", otherDescriptionOfUtilities='" + super.getOtherDescriptionOfUtilities() + '\'' +
                ", numberOfFloors=" + super.getNumberOfFloors() + '\'' +
                ", poolArea=" + this.getPoolArea() + '\'' +  '}';
    }
    @Override
    public String toString() {
        return "Villa{" +
                "poolArea=" + poolArea +
                '}';
    }
}
