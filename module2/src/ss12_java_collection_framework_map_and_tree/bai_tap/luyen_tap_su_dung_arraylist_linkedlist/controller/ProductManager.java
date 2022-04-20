package ss12_java_collection_framework_map_and_tree.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.controller;

import ss12_java_collection_framework_map_and_tree.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.service.IProductService;
import ss12_java_collection_framework_map_and_tree.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.service.serviceimpl.ProductServiceImpl;

import java.util.Scanner;

public class ProductManager {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductService iProductService = new ProductServiceImpl();

    public boolean display() {
        while (true) {
            System.out.println("Choose function: " +
                    "\n1. Add new product" +
                    "\n2. Edit product" +
                    "\n3. Delete product" +
                    "\n4. Display product" +
                    "\n5. Search product" +
                    "\n6. Sort products" +
                    "\n7. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.edit();
                    break;
                case 3:
                    iProductService.delete();
                    break;
                case 4:
                    iProductService.display();
                    break;
                case 5:
                    iProductService.search();
                    break;
                case 6:
                    iProductService.sort();
                    break;
                case 7:
                    System.exit(7);
                    return false;
                default:
                    System.out.println("Invalid choice. Choose again!");
            }

        }
    }
}
