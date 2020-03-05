package CaseStudyversion2.models;

import java.io.Serializable;

public class Villa extends House implements Serializable {
    private double poolArea;

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

    @Override
    public String getRoomStandard() {
        return super.getRoomStandard();
    }

    @Override
    public void setRoomStandard(String roomStandard) {
        super.setRoomStandard(roomStandard);
    }

    @Override
    public String getOtherDescriptionOfUtilities() {
        return super.getOtherDescriptionOfUtilities();
    }

    @Override
    public void setOtherDescriptionOfUtilities(String otherDescriptionOfUtilities) {
        super.setOtherDescriptionOfUtilities(otherDescriptionOfUtilities);
    }

    @Override
    public int getNumberOfFloors() {
        return super.getNumberOfFloors();
    }

    @Override
    public void setNumberOfFloors(int numberOfFloors) {
        super.setNumberOfFloors(numberOfFloors);
    }

    public double getPoolArea() {
        return poolArea;
    }
    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }


    @Override
    public String showInfo() {
        return super.showInfo()+this.getPoolArea();
    }
}
