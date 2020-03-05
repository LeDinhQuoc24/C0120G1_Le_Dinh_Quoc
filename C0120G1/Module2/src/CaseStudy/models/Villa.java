package CaseStudy.models;

public class Villa extends House {
    private double poolArea;
    public Villa() {
    }
    public double getPoolArea() {
        return poolArea;
    }
    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String showInfo() {
        return super.getId()+"\t"+super.getNameService()+"\t"+super.getAreaUsed()+"/t"+
                super.getRentalCosts()+super.getMaxNumberOfPeople()+super.getTypeOfRent()+
                this.getRoomStandard()+this.getOtherDescriptionOfUtilities()+this.getNumberOfFloors();
    }
    @Override
    public String toString() {
        return super.getId()+"\t"+super.getNameService()+"\t"+super.getAreaUsed()+"\t"+
                super.getRentalCosts()+"\t"+super.getMaxNumberOfPeople()+"\t"+super.getTypeOfRent()+
                "\t"+this.getRoomStandard()+"\t"+this.getOtherDescriptionOfUtilities()+"\t"+
                this.getNumberOfFloors();
    }
}
