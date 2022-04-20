package extra_assignment.controller;

import extra_assignment.service.IService;
import extra_assignment.service.service_implement.CarServiceImplement;
import extra_assignment.service.service_implement.MotorbikeServiceImplement;
import extra_assignment.service.service_implement.TruckServiceImplement;

import java.util.Scanner;

public class VehicleMainController {
    private static IService carService = new CarServiceImplement();
    private static IService truckService = new TruckServiceImplement();
    private static IService motorbikeService = new MotorbikeServiceImplement();
    public static void showMainMenu() {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("Chọn chức năng:" +
                    "\n1. Thêm mới phương tiện" +
                    "\n2. Hiển thị phương tiện" +
                    "\n3. Xóa phương tiện" +
                    "\n4. Tìm kiếm theo biển kiểm soát" +
                    "\n5. Thoát");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    showAddingMenu(scanner);
                    //add
                    break;
                case 2:
                    //display
                    break;
                case 3:
                    //delete
                    break;
                case 4:
                    //search
                    break;
                case 5:
                    System.exit(5);
                    flag = false;
                    break;
            }
        } while (flag);


    }

    private static void showAddingMenu(Scanner scanner) {
        System.out.println("Thêm mới phương tiện:" +
                "\n1. Thêm xe tải" +
                "\n2. Thêm ô tô" +
                "\n3. Thêm xe máy");
        System.out.print("Enter your adding-choice: ");
        int addingChoice = Integer.parseInt(scanner.nextLine());
        switch (addingChoice){
            case 1:
                //
                break;
            case 2:
                //
                break;
            case 3:
                //
                break;
            default:
                System.out.println("Not an adding-choice!");
                break;
        }
    }
}
