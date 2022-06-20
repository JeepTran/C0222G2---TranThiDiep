package com.jeep.repository.impl;

import com.jeep.model.Product;
import com.jeep.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Iphone5", 500, "Nice", "Apple"));
        productList.add(new Product(2, "Iphone7", 700, "Good", "Apple"));
        productList.add(new Product(3, "Iphone8", 900, "Modern", "Apple"));
        productList.add(new Product(4, "Iphone11", 1000, "Luxury", "Apple"));
        productList.add(new Product(5, "Iphone12", 1200, "Vip", "Apple"));
        productList.add(new Product(6, "Iphone13", 1500, "Vip pro", "Apple"));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public void update(int id, Product product) {
        Product updatedProduct = findById(id);
        updatedProduct.setName(product.getName());
        updatedProduct.setPrice(product.getPrice());
        updatedProduct.setDescription(product.getDescription());
        updatedProduct.setManufacturer(product.getManufacturer());
    }

    @Override
    public void remove(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId()==product.getId()) {
                productList.remove(i);
                break;
            }
        }
    }

    @Override
    public Product findById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> searchResult = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                searchResult.add(product);
            }
        }
        return searchResult;
    }
}
