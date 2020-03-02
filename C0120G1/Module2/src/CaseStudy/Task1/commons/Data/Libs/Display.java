package CaseStudy.Task1.commons.Data.Libs;

import CaseStudy.Task1.models.Service;

import static CaseStudy.Task1.controller.MainController.Services;

public class Display {
    public static void display() {
        for (Service service : Services) {
            System.out.println(service.showInfo());
        }
    }
}
