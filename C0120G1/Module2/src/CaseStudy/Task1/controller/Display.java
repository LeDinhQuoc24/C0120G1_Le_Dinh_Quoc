package CaseStudy.Task1.controller;

import CaseStudy.Task1.models.Service;

import static CaseStudy.Task1.views.MainController.Services;

public class Display {
    public static void display() {
        for (Service service : Services) {
            System.out.println(service.showInfo());
        }
    }
}
