package ss17_io_binary_file_and_serialization.bai_tap.bai_tap_quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductMain {
    public static final String FILE_PATH = "src/ss17_io_binary_file_and_serialization/bai_tap/bai_tap_quan_ly_san_pham_luu_ra_file_nhi_phan/product.dat";
    private static Scanner scanner = new Scanner(System.in);
    static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "book", "NXB Trẻ", 20000, "self-help"));
        products.add(new Product(2, "pen", "Thiên Long", 5000, "ball-pen"));
        writeToFile(FILE_PATH, products);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose function:\n" +
                    "1. Add new product\n" +
                    "2. Display products\n" +
                    "3. Search product\n" +
                    "4. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    System.exit(4);
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    private static void searchProduct() {
        System.out.print("Enter Product ID to search: ");
        int searchId = Integer.parseInt(scanner.nextLine());
        for (Product product:products ) {
            if(searchId == product.getProductId()){
                System.out.println(product);
            }
        }

    }

    private static void displayProducts() {
        for (Product product : readFile()) {
            System.out.println(product.toString());
        }

    }

    public static void addProduct() {
        System.out.print("Enter product ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter manufacturer: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Enter product price: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter other information: ");
        String otherInfo = scanner.nextLine();

        products.add(new Product(id, name, manufacturer, price, otherInfo));
        writeToFile(FILE_PATH,products);
    }

    public static List<Product> readFile() {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void writeToFile(String s, List<Product> products) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(FILE_PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
