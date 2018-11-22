package view;

import controller.DeveloperController;

import java.io.IOException;

public class DeveloperView {
    public static void main(String[] args) throws IOException {
        DeveloperController developerController = new DeveloperController();
        developerController.getAll();
    }
}
