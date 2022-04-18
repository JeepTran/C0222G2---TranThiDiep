package extra_assignment;

import java.util.Scanner;

public abstract class Vehicles {
    private String numberPlate;
    private String company;
    private int manufacturingYear;
    private String owner;

    public Vehicles() {
    }

    public Vehicles(String numberPlate, String company, int manufacturingYear, String owner) {
        this.numberPlate = numberPlate;
        this.company = company;
        this.manufacturingYear = manufacturingYear;
        this.owner = owner;
    }

    public static void showMenu() {
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
            choice = Integer.parseInt(scanner.nextLine());
       switch (choice){
           case 1:
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
       }

        } while (flag);


    }


}
