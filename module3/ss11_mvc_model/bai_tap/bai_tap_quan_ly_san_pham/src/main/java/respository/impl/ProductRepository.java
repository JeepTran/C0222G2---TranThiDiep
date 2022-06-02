package respository.impl;

import model.Product;
import respository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Samsung J3", 5000000d, "Normal", "Samsung"));
        products.add(new Product(2, "Nokia N4", 900000d, "Economic", "Nokia"));
        products.add(new Product(3, "Iphone 12", 20000000d, "Luxury", "Apple"));
        products.add(new Product(4, "Samsung Note10", 10000000d, "Luxury", "Samsung"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void create(Product product) {
        products.add(product);
    }

    @Override
    public void update(int id, Product product) {
        for (Product temp : products) {
            if (temp.getId() == id) {
                temp.setId(product.getId());
                temp.setName(product.getName());
                temp.setPrice(product.getPrice());
                temp.setDescription(product.getDescription());
                temp.setManufacturer(product.getManufacturer());
            }
        }
    }

    @Override
    public void delete(int id) {
//        for (Product temp:products) {
//            if(temp.getId()==id){
//                products.remove(temp);
//            }
//        }
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
            }
        }
    }

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> search(String name) {
        List<Product> searchList = new ArrayList<>();
        for (Product temp : products) {
            if (temp.getName().contains(name)) {
                searchList.add(temp);
            }
        }
        return searchList;
    }

}
