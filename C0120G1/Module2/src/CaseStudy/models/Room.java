package CaseStudy.models;

import java.io.Serializable;

public class Room extends Service implements Serializable {
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

    public Room(String id, String nameService, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeOfRent) {
        super(id, nameService, areaUsed, rentalCosts, maxNumberOfPeople, typeOfRent);
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
        return this.rentalCosts;
    }

    @Override
    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts=rentalCosts;
    }

    @Override
    public int getMaxNumberOfPeople() {
        return this.maxNumberOfPeople;
    }

    @Override
    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople=maxNumberOfPeople;
    }

    @Override
    public String getTypeOfRent() {
        return this.typeOfRent;
    }

    @Override
    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent=typeOfRent;
    }
    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String showInfo() {
        return this.getId()+"\t"+this.getNameService()+"\t"+this.getAreaUsed()+"/t"+
                this.getRentalCosts()+this.getMaxNumberOfPeople()+this.getTypeOfRent()+
                this.getFreeService();
    }
}
