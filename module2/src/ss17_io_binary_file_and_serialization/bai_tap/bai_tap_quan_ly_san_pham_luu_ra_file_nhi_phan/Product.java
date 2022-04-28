package ss17_io_binary_file_and_serialization.bai_tap.bai_tap_quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.Serializable;

public class Product implements Serializable {
private Integer productId;
private String productName;
private String manufacturer;
private Integer productPrice;
private String otherInfo;

    public Product() {
    }

    public Product(Integer id, String name, String manufacturer, Integer price, String otherInfo) {
        this.productId = id;
        this.productName = name;
        this.manufacturer = manufacturer;
        this.productPrice = price;
        this.otherInfo = otherInfo;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", productPrice=" + productPrice +
                ", otherInfo='" + otherInfo + '\'' +
                '}';
    }
}
