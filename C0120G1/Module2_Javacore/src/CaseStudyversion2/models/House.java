package CaseStudyversion2.models;

import java.io.Serializable;

public class House extends Service implements Serializable {
    private String roomStandard;
    private String otherDescriptionOfUtilities;
    private int numberOfFloors;

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getNameService() {
        return super.getNameService();
    }

    @Override
    public void setNameService(String nameService) {
        super.setNameService(nameService);
    }

    @Override
    public double getAreaUsed() {
        return super.getAreaUsed();
    }

    @Override
    public void setAreaUsed(double areaUsed) {
        super.setAreaUsed(areaUsed);
    }

    @Override
    public double getRentalCosts() {
        return super.getRentalCosts();
    }

    @Override
    public void setRentalCosts(double rentalCosts) {
        super.setRentalCosts(rentalCosts);
    }

    @Override
    public int getMaxNumberOfPeople() {
        return super.getMaxNumberOfPeople();
    }

    @Override
    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        super.setMaxNumberOfPeople(maxNumberOfPeople);
    }

    @Override
    public String getTypeOfRent() {
        return super.getTypeOfRent();
    }

    @Override
    public void setTypeOfRent(String typeOfRent) {
        super.setTypeOfRent(typeOfRent);
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
        return super.showInfo()+"\tRoomStandard: "+this.getRoomStandard()+
                "\nOtherDescriptionOfUtilities: "+this.getOtherDescriptionOfUtilities()
                +"\tNumberOfFloors: "+this.getNumberOfFloors();
    }
}
