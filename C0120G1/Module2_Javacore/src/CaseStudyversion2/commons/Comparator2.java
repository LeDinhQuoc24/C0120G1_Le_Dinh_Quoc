package CaseStudyversion2.commons;


import CaseStudyversion2.models.Employee;

public class Comparator2 implements java.util.Comparator<Employee>{

    @Override
    public int compare(Employee employee1, Employee employee2) {
        if (employee1.getIdEmployee() > employee2.getIdEmployee()) {
            return 1;
        } else if ((employee1.getIdEmployee() < employee2.getIdEmployee())) {
            return -1;
        } else {
            return 0;
        }
    }
}
