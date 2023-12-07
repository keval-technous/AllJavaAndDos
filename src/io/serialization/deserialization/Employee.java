package io.serialization.deserialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private int eid;
    private String name;
    private String email;
    private String address;

    public Employee(){}
    public Employee(int eid, String name, String email, String address) {
        this.eid = eid;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEid() {
        return eid;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
