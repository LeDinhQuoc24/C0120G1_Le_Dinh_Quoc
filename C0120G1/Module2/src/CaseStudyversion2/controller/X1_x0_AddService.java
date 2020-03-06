package CaseStudyversion2.controller;

import CaseStudyversion2.commons.FuncValidation;
import CaseStudyversion2.models.House;
import CaseStudyversion2.models.Room;
import CaseStudyversion2.models.Service;
import CaseStudyversion2.models.Villa;

import java.util.Scanner;
import java.util.UUID;

import static CaseStudyversion2.commons.FuncValidation.*;



public class X1_x0_AddService {
    public static Service addService(Service service) {
        service.setId(UUID.randomUUID().toString().replace("-",""));
        String     regex = "";
        if (service instanceof Villa) {
            System.out.println("Enter NameVilla:SVVL-xxxx(x:0->9)");
            regex = "^SVVL([0-9]{4})$";
        }else if (service instanceof House) {
            System.out.println("Enter NameHouse:SVHO-xxxx(x:0->9)");
            regex = "^SVHO([0-9]{4})$";
        }else if (service instanceof Room) {
            System.out.println("Enter NameRoom:SVRO-xxxx(x:0->9)");
            regex = "^SVRO([0-9]{4})$";
        }
        service.setNameService(checkString(regex,"NameService failed"));
        System.out.println("Enter AreaUsed:from 100 to 499");
        regex="^[1-4][0-9]{2}$";
        service.setAreaUsed(checkNumberDouble(regex,"AreaUsed failed"));
        regex="^[1-9][0-9]{5,10}$";
        System.out.println("Enter RentalCosts:>100000");
        service.setRentalCosts(checkNumberDouble(regex,"RentalCosts failed"));
        regex = "^[1-9]|([1-2][0-9])$";
        System.out.println("Enter MaxNumberOfPeople:from 1 to 29");

        service.setMaxNumberOfPeople(checkNumberInteger(regex,"MaxNumberOfPeople failed"));

        regex = "^byYear|byMonth|byDay|byHour$";
        System.out.println("Enter TypeOfRent:byYear/byMonth/byDay/byHour");
        service.setTypeOfRent(checkString(regex,"TypeOfRent failed"));

        return service;

    }
}
