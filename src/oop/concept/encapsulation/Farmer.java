package oop.concept.encapsulation;

public class Farmer {
    private String fname;
    private int fmobile;
    private String fProductName;
    private  float fProductPrice;

    public String getFname() {
        return fname;
    }

    public int getFmobile() {
        return fmobile;
    }

    public String getfProductName() {
        return fProductName;
    }

    public float getfProductPrice() {
        return fProductPrice;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setFmobile(int fmobile) {
        this.fmobile = fmobile;
    }

    public void setfProductName(String fProductName) {
        this.fProductName = fProductName;
    }

    public void setfProductPrice(float fProductPrice) {
        this.fProductPrice = fProductPrice;
    }
}
