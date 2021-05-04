package com.haristallat2001.car_info;

public class cardata {
    String owner_N,company_N,contact,model;

    public cardata() {
    }

    public cardata(String owner_N, String company_N, String contact, String model) {
        this.owner_N = owner_N;
        this.company_N = company_N;
        this.contact = contact;
        this.model = model;
    }

    public String getOwner_N() {
        return owner_N;
    }

    public void setOwner_N(String owner_N) {
        this.owner_N = owner_N;
    }

    public String getCompany_N() {
        return company_N;
    }

    public void setCompany_N(String company_N) {
        this.company_N = company_N;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "car_data{" +
                "owner_N='" + owner_N + '\'' +
                ", company_N='" + company_N + '\'' +
                ", contact='" + contact + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
