package com.nit.exam6;
public class Bank {

    private int bankId;
    private String bankName;
    private String branch;
    private String IFSCCode;
    private String managerName;

    
    private Customer customer;

    public Bank() {
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setIFSCCode(String iFSCCode) {
        IFSCCode = iFSCCode;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void display() {

        System.out.println("========= Bank Details =========");
        System.out.println("Bank ID      : " + bankId);
        System.out.println("Bank Name    : " + bankName);
        System.out.println("Branch       : " + branch);
        System.out.println("IFSC Code    : " + IFSCCode);
        System.out.println("Manager Name : " + managerName);

        System.out.println();
        System.out.println(customer);
    }
}
