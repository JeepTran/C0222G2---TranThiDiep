package ss12_java_collection_framwork_map_and_tree.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.service.serviceimpl;

import ss12_java_collection_framwork_map_and_tree.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.model.Product;
import ss12_java_collection_framwork_map_and_tree.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.service.IProductService;

import java.util.*;

public class ProductServiceImpl implements IProductService {
    private static List<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        productList.add(new Product(1, "AK", 100));
        productList.add(new Product(2, "VM", 300));
        productList.add(new Product(5, "KD", 800));
        productList.add(new Product(4, "MP", 200));
        productList.add(new Product(4, "LDK", 300));
    }

    @Override
    public void add() {
        System.out.print("Enter product id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        int price = Integer.parseInt(scanner.nextLine());
        productList.add(new Product(id, name, price));
    }

    @Override
    public void display() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void edit() {
        System.out.print("Enter id of product to edit: ");
        int editedId = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if (product.getId() == editedId) {
                System.out.print("Enter id: ");
                int newId = Integer.parseInt(scanner.nextLine());
                product.setId(newId);
                System.out.print("Enter name: ");
                String newName = scanner.nextLine();
                product.setName(newName);
                System.out.print("Enter price: ");
                int newPrice = Integer.parseInt(scanner.nextLine());
                product.setPrice(newPrice);
                System.out.println("Product with former-id: " + editedId + " has been edited with new information (id: " + product.getId() + ", name: '" + product.getName() + "', price: " + product.getPrice() + ")");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not found id to edit!");
        }
    }

    @Override
    public void delete() {
        System.out.print("Enter id of product to delete: ");
        int deletedId = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if (product.getId() == deletedId) {
                productList.remove(i);
                System.out.println("Product with id " + product.getId() + ", name '" + product.getName() + "' has been deleted!");
                count++;
                i--;
            }
        }
        if (count == 0) {
            System.out.println("Not found id to delete!");
        }
    }

    @Override
    public void sort() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }

    @Override
    public void search() {
        System.out.println("Choose searching type:" +
                "\n1. By id" +
                "\n2. By name" +
                "\n3. By price");
        int type = Integer.parseInt(scanner.nextLine());
        switch (type) {
            case 1:
                searchById();
                break;
            case 2:
                searchByName();
                break;
            case 3:
                searchByPrice();
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    private void searchById() {
        System.out.print("Enter id to search: ");
        int searchedId = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (Product product : productList) {
            if (product.getId() == searchedId) {
                System.out.println(product);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not found id to search!");
        }
    }

    private void searchByName() {
        System.out.print("Enter name to search: ");
        String searchedName = scanner.nextLine();
        int count = 0;
        for (Product product : productList) {
            if (product.getName().contains(searchedName)) {
                System.out.println(product);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not found name to search!");
        }
    }

    private void searchByPrice() {
        System.out.print("Enter price to search: ");
        int searchedPrice = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (Product product : productList) {
            if (product.getPrice() == searchedPrice) {
                System.out.println(product);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not found price to search!");
        }
    }
}
