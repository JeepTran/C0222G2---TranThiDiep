package extra_practice.VehicleManagement.views;

import extra_practice.VehicleManagement.controllers.VehiclesController;

public class VehiclesView {
    public static void main(String[] args) {
        VehiclesController vehiclesController = new VehiclesController();
        vehiclesController.displayMainMenu();
    }
}
