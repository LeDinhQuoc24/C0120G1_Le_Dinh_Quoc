package CaseStudyversion2.controller;

import CaseStudyversion2.commons.FuncValidation;
import CaseStudyversion2.models.House;
import CaseStudyversion2.models.Room;
import CaseStudyversion2.models.Service;
import CaseStudyversion2.models.Villa;

import java.util.UUID;

import static CaseStudyversion2.commons.FuncValidation.*;
import static CaseStudyversion2.views.MainRun.sc;


public class AddService {
    public static Service addService(Service service) {
        service.setId(UUID.randomUUID().toString().replace("-",""));
        String     regex = "";
        if (service instanceof Villa) {
            System.out.println("Enter NameVilla:SVVL-xxxx(x:0->9)");
            regex = "^[S][V][V][L]([0-9]{4})$";
        }else if (service instanceof House) {
            System.out.println("Enter NameHouse:SVHO-xxxx(x:0->9)");
            regex = "^[S][V][H][O]([0-9]{4})$";
        }else if (service instanceof Room) {
            System.out.println("Enter NameRoom:SVRO-xxxx(x:0->9)");
            regex = "^[S][V][R][O]([0-9]{4})$";
        }
        service.setNameService(checkString(regex,"NameService failed"));
        System.out.println("Enter AreaUsed:from 100 to 499");
        regex="^[1-4][0-9]{2}$";
        service.setAreaUsed(FuncValidation.checkNumberInteger(regex,"AreaUsed failed"));
        regex="^[1-9][0-9]{5,10}$";
        System.out.println("Enter RentalCosts:>100000");
        service.setRentalCosts(FuncValidation.checkNumberInteger(regex,"AreaUsed failed"));
        System.out.println("Enter MaxNumberOfPeople");
        service.setMaxNumberOfPeople(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter TypeOfRent:prePays,afterPay");
        service.setTypeOfRent(sc.nextLine());
        return service;

    }
}
