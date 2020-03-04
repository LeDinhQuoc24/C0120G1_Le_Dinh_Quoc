package CaseStudy.models;

public abstract class Service {
    private String id="1";
    private String nameService="Villa";
    private double areaUsed=1.0;
    private double rentalCosts=1.0;
    private int maxNumberOfPeople=1;
    private String typeOfRent="ByYear";

    public Service() {
    }
    public Service(String id, String nameService, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeOfRent) {
        this.id = id;
        this.nameService = nameService;
        this.areaUsed = areaUsed;
        this.rentalCosts = rentalCosts;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.typeOfRent = typeOfRent;
    }
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

    abstract public String showInfo();
    @Override
    public String toString() {
        return "Service{" +
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaUsed=" + areaUsed +
                ", rentalCosts=" + rentalCosts +
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                ", typeOfRent='" + typeOfRent + '\'' +
                '}';
    }
}
