package CaseStudy.models;

import java.io.Serializable;

public class House extends Service implements Serializable {
    private String roomStandard="5 stars";
    private String otherDescriptionOfUtilities="Karaoke";
    private int numberOfFloors=5;
    public House() {
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id=id;

    }

    @Override
    public String getNameService() {
        return this.nameService;
    }

    @Override
    public void setNameService(String nameService) {
        this.nameService=nameService;

    }

    @Override
    public double getAreaUsed() {
        return this.areaUsed;
    }

    @Override
    public void setAreaUsed(double areaUsed) {
        this.areaUsed=areaUsed;
    }

    @Override
    public double getRentalCosts() {
        return rentalCosts;
    }

    @Override
    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts=rentalCosts;

    }

    @Override
    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    @Override
    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople=maxNumberOfPeople;

    }

    @Override
    public String getTypeOfRent() {
        return typeOfRent;
    }

    @Override
    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent=typeOfRent;

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
        return this.getId()+"\t"+this.getNameService()+"\t"+this.getAreaUsed()+"\t"+
                this.getRentalCosts()+"\t"+this.getMaxNumberOfPeople()+"\t"+this.getTypeOfRent()+"\t"+
                this.getRoomStandard()+"\t"+this.getOtherDescriptionOfUtilities()+"\t"+this.getNumberOfFloors();
    }







}
