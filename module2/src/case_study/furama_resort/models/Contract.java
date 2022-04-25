package case_study.furama_resort.models;

public class Contract {
    private Integer contractNumber;
    // mã booking;
    private Integer deposit;
    private Integer totalPayment;
    // mã khách hàng;

    public Contract() {
    }

    public Contract(Integer contractNumber, Integer deposit, Integer totalPayment) {
        this.contractNumber = contractNumber;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
    }

    public Integer getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(Integer contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(Integer totalPayment) {
        this.totalPayment = totalPayment;
    }
}
