package CaseStudyversion2.models;

import java.io.Serializable;

public abstract class Service implements Serializable {
    protected String id;
    protected String nameService;
    protected double areaUsed;
    protected double rentalCosts;
    protected int maxNumberOfPeople;
    protected String typeOfRent;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNameService() {
        return nameService;
    }
    public void setNameService(String nameService) {
        this.nameService = nameService;
    }
    public double getAreaUsed() {
        return areaUsed;
    }
    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }
    public double getRentalCosts() {
        return rentalCosts;
    }
    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }
    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }
    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }
    public String getTypeOfRent() {
        return typeOfRent;
    }
    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }
    public  String showInfo() {
        return "Id: "+ this.getId()+
               "\nNameService: "+this.getNameService()+"\tAreaUsed: "+this.getAreaUsed()+
                "\tRentalCost: "+ this.getRentalCosts()+"\nMaxNumberOfPeople: "+this.getMaxNumberOfPeople()+
                "\tTypeOfRent: "+this.getTypeOfRent();

    }
}
