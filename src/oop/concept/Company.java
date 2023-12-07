package oop.concept;

public abstract class Company {
    public final String cname="Technous";
    public final String address="near by motera metro station";

    public abstract String employeeTechnology(String technologyName);

    public String getCname() {
        return cname;
    }

    public String getAddress() {
        return address;
    }
}
