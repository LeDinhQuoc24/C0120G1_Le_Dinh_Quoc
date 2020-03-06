package CaseStudyversion2.controller;

import CaseStudyversion2.models.House;
import CaseStudyversion2.models.Room;
import CaseStudyversion2.models.Service;
import CaseStudyversion2.models.Villa;

import java.util.UUID;

import static CaseStudyversion2.commons.FuncValidation.checkNameService;
import static CaseStudyversion2.views.MainRun.sc;


public class AddService {
    public static Service addService(Service service) {
        service.setId(UUID.randomUUID().toString().replace("-",""));
        String     regex = "";
        if (service instanceof Villa) {
            System.out.println("Enter NameServide:SVVL-xxxx(Villa)");
            regex = "^[S][V][V][L]([0-9]{4})$";
        }else if (service instanceof House) {
            System.out.println("Enter NameServide:SVHO-xxxx(House)");
            regex = "^[S][V][H][O]([0-9]{4})$";
        }else if (service instanceof Room) {
            System.out.println("Enter NameServide:SVRO-xxxx(Room)");
            regex = "^[S][V][R][O]([0-9]{4})$";
        }
        service.setNameService(checkNameService(regex,"NameService failed"));
        System.out.println("Enter AreaUsed:100,200,300");
        service.setAreaUsed(sc.nextDouble());
        System.out.println("Enter RentalCosts:300,500,1000");
        service.setRentalCosts(sc.nextDouble());
        System.out.println("Enter MaxNumberOfPeople");
        service.setMaxNumberOfPeople(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter TypeOfRent:prePays,afterPay");
        service.setTypeOfRent(sc.nextLine());
        return service;

    }
}
