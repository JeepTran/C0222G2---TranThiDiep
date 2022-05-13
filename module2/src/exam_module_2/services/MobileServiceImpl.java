package exam_module_2.services;

import exam_module_2.controllers.MobileController;
import exam_module_2.models.AuthorizedMobile;
import exam_module_2.models.ForeignMobile;
import exam_module_2.models.Mobile;
import exam_module_2.utils.NotFoundProductException;
import exam_module_2.utils.ReadAndWrite;
import exam_module_2.utils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobileServiceImpl implements IMobileService {
    private Scanner scanner = new Scanner(System.in);
    private static List<AuthorizedMobile> authorizedMobileList = new ArrayList<>();
    private static List<ForeignMobile> foreignMobileList = new ArrayList<>();

//    static {
//        AuthorizedMobile authorizedMobile1 = new AuthorizedMobile(1, "d", 3, 3, "d", 600, "f");
//        AuthorizedMobile authorizedMobile2 = new AuthorizedMobile(2, "d", 3, 3, "d", 600, "f");
//        ForeignMobile foreignMobile = new ForeignMobile(3, "d", 3, 3, "d", "H", "h");
//        authorizedMobileList.add(authorizedMobile1);
//        authorizedMobileList.add(authorizedMobile2);
//        foreignMobileList.add(foreignMobile);
//        ReadAndWrite.writeAuthorizedMobile(authorizedMobileList, false);
//        ReadAndWrite.writeForeignMobile(foreignMobileList, false);
//    }

    @Override
    public void addAuthorizedMobile() {
        authorizedMobileList = ReadAndWrite.readAuthorizedMobile();
        int id = Integer.parseInt(inputId());
        String name = inputName();
        Integer price = Integer.parseInt(inputPrice());
        Integer quantity = Integer.parseInt(inputQuantity());
        String manufacturer = inputManufacturer();
        Integer insuranceTime = Integer.parseInt(inputInsuranceTime());
        String insuranceArea = inputInsuranceArea();
        AuthorizedMobile authorizedMobile = new AuthorizedMobile(id, name, price, quantity, manufacturer, insuranceTime, insuranceArea);
        authorizedMobileList.add(authorizedMobile);
        ReadAndWrite.writeAuthorizedMobile(authorizedMobileList, false);
        System.out.println("Add new successfully!");
    }

    @Override
    public void addForeignMobile() {
        foreignMobileList = ReadAndWrite.readForeignMobile();
        Integer id = Integer.parseInt(inputId());
        String name = inputName();
        Integer price = Integer.parseInt(inputPrice());
        Integer quantity = Integer.parseInt(inputQuantity());
        String manufacturer = inputManufacturer();
        String country = inputCountry();
        String status = inputStatus();
        ForeignMobile foreignMobile = new ForeignMobile(id, name, price, quantity, manufacturer, country, status);
        foreignMobileList.add(foreignMobile);
        ReadAndWrite.writeForeignMobile(foreignMobileList, false);
        System.out.println("Add new successfully!");
    }

    private String inputId() {
        System.out.print("Enter Id: ");
        String input = scanner.nextLine();
        return Regex.checkRegex(input, Regex.POSITIVE_INTEGER_REGEX, "Wrong format! ID should be a positive integer!");
    }

    private String inputName() {
        System.out.print("Enter name: ");
        String input = scanner.nextLine();
        return input;
    }

    private String inputPrice() {
        System.out.print("Enter price: ");
        String input = scanner.nextLine();
        return Regex.checkRegex(input, Regex.POSITIVE_INTEGER_REGEX, "Wrong format! Price should be a positive integer!");
    }

    private String inputQuantity() {
        System.out.print("Enter quantity: ");
        String input = scanner.nextLine();
        return Regex.checkRegex(input, Regex.POSITIVE_INTEGER_REGEX, "Wrong format! Quantity should be a positive integer!");
    }

    private String inputManufacturer() {
        System.out.print("Enter manufacturer: ");
        String input = scanner.nextLine();
        return input;
    }

    private String inputInsuranceTime() {
        System.out.print("Enter Insurance Time: ");
        String input = scanner.nextLine();
        return Regex.checkInsuranceTimeRegex(input, Regex.POSITIVE_INTEGER_REGEX);
    }

    private String inputInsuranceArea() {
        System.out.print("Enter Insurance Area: ");
        String input = scanner.nextLine();
        return Regex.checkRegex(input, Regex.INSURANCE_AREA_REGEX, "Insurance area should be 'Toan Quoc' or 'Quoc Te'!");
    }

    private String inputCountry() {
        System.out.print("Enter country: ");
        String input = scanner.nextLine();
        return Regex.checkRegex(input, Regex.COUNTRY_REGEX, "Country should not be 'Viet Nam'!");
    }

    private String inputStatus() {
        System.out.print("Enter status: ");
        String input = scanner.nextLine();
        return input;
    }


    @Override
    public void delete() {
        authorizedMobileList = ReadAndWrite.readAuthorizedMobile();
        foreignMobileList = ReadAndWrite.readForeignMobile();
        System.out.print("Enter ID to delete: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (AuthorizedMobile authorizedMobile : authorizedMobileList) {
            if (authorizedMobile.getId() == id) {
                count++;
                System.out.println("Delete?\n" +
                        "1. Yes\n" +
                        "2. No");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    authorizedMobileList.remove(authorizedMobile);
                    System.out.println("Successfully deleted!");
                    try {
                        ReadAndWrite.writeAuthorizedMobile(authorizedMobileList, false);

                        ReadAndWrite.writeForeignMobile(foreignMobileList, false);
                        displayAuthorizedMobile();
                        displayForeignMobile();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally{
                        MobileController.displayMainMenu();
                    }
                } else if (choice == 2) {
                    System.out.println("Not deleted!\n");
                    MobileController.displayMainMenu();
                }
            }
        }
        for (ForeignMobile foreignMobile : foreignMobileList) {
            if (foreignMobile.getId() == id) {
                count++;
                System.out.println("Delete?\n" +
                        "1. Yes\n" +
                        "2. No");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    foreignMobileList.remove(foreignMobile);
                    System.out.println("Successfully deleted!");
                    try {
                        ReadAndWrite.writeAuthorizedMobile(authorizedMobileList, false);
                        ReadAndWrite.writeForeignMobile(foreignMobileList, false);
                        displayAuthorizedMobile();
                        displayForeignMobile();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally{
                        MobileController.displayMainMenu();
                    }
                } else if (choice == 2) {
                    System.out.println("Not deleted!\n");
                    MobileController.displayMainMenu();
                }
            }
        }

        if (count == 0) {
            try {
                throw new NotFoundProductException("Not found ID!");
            } catch (NotFoundProductException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void displayAuthorizedMobile() {
        authorizedMobileList = ReadAndWrite.readAuthorizedMobile();
        if (authorizedMobileList.isEmpty()) {
            System.out.println("No mobile to display!");
        } else {
            for (AuthorizedMobile authorizedMobile : authorizedMobileList) {
                System.out.println(authorizedMobile.toString());
            }
        }
    }

    @Override
    public void displayForeignMobile() {
        foreignMobileList = ReadAndWrite.readForeignMobile();
        if (foreignMobileList.isEmpty()) {
            System.out.println("No mobile to display!");
        } else {
            for (ForeignMobile foreignMobile : foreignMobileList) {
                System.out.println(foreignMobile.toString());
            }
        }
    }

    @Override
    public void search() {
        authorizedMobileList = ReadAndWrite.readAuthorizedMobile();
        foreignMobileList = ReadAndWrite.readForeignMobile();
        System.out.print("Enter ID to search: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (AuthorizedMobile authorizedMobile : authorizedMobileList) {
            if (authorizedMobile.getId() == id) {
                count++;
                System.out.println("Searching result: " + authorizedMobile.toString());
            }
        }
        for (ForeignMobile foreignMobile : foreignMobileList) {
            if (foreignMobile.getId() == id) {
                count++;
                System.out.println("Searching result: " + foreignMobile.toString());
            }
        }
        if (count == 0) {
            System.out.println("Not found id!");
        }

    }
}
