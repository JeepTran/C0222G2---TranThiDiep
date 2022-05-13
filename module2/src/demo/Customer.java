package demo;

public class Customer extends Person{
    private String address;

    public Customer() {
    }

    public Customer(String address) {
        this.address = address;
    }

    public Customer(int age, String name, String address) {
        super(age, name);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                "address='" + address + '\'' +
                '}';
    }
}
