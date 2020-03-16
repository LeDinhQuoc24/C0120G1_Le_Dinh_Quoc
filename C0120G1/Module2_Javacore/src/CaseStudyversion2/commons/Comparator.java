package CaseStudyversion2.commons;
import CaseStudyversion2.models.Customer;


public class Comparator implements java.util.Comparator<Customer> {
    @Override
    public int compare(Customer cus1, Customer cus2) {
        if (!cus1.getName().equals(cus2.getName())) {
            return cus1.getName().compareTo(cus2.getName());
        } else {
            int year1=Integer.parseInt(cus1.getBirth().substring(6));
            int year2=Integer.parseInt(cus2.getBirth().substring(6));
            if (year1 > year2) {
                return 1;
            } else if (year1 < year2) {
                return -1;
            } else {
                int month1=Integer.parseInt(cus1.getBirth().substring(3,5));
                int month2=Integer.parseInt(cus2.getBirth().substring(3,5));
                if (month1 > month2) {
                    return 1;
                } else if (month1 < month2) {
                    return -1;
                } else {
                    int day1=Integer.parseInt(cus1.getBirth().substring(0,2));
                    int day2=Integer.parseInt(cus2.getBirth().substring(0,2));
                    if (day1 > day2) {
                        return 1;
                    } else if (day1 < day2) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        }
    }
}
