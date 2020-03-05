package CaseStudy.models;

public abstract class Service {
    protected String id;
    protected String nameService="Villa";
    protected double areaUsed=1.0;
    protected double rentalCosts=1.0;
    protected int maxNumberOfPeople=1;
    protected String typeOfRent="ByYear";

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
    public abstract String getId() ;
    public  abstract void setId(String id);
    public  abstract String getNameService();
    public  abstract void setNameService(String nameService);
    public abstract double getAreaUsed() ;
    public abstract void setAreaUsed(double areaUsed);

    public abstract double getRentalCosts() ;

    public abstract void setRentalCosts(double rentalCosts) ;

    public abstract int getMaxNumberOfPeople() ;

    public abstract void setMaxNumberOfPeople(int maxNumberOfPeople);

    public abstract String getTypeOfRent() ;

    public abstract void setTypeOfRent(String typeOfRent);

    abstract public String showInfo();
}
