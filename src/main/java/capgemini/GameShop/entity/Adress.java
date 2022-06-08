package capgemini.GameShop.entity;

public class Adress {
    String area;
    String address;
    String state;
    String city;
    String zip;

    public Adress(String area, String address, String state, String city, String zip) {
        this.area = area;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zip = zip;
    }

    public Adress() {
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
