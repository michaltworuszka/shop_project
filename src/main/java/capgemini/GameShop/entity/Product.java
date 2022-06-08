package capgemini.GameShop.entity;

public class Product {

    String id;
    String name;
    Category category;
    String description;
    String attribute; // String or seperate entity/enum?
    float priceNett;
    float priceGross;
    String discount; // ??
    String homepage;

    public Product(String id, String name, Category category, String description, String attribute, float priceNett, float priceGross, String discount, String homepage) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.attribute = attribute;
        this.priceNett = priceNett;
        this.priceGross = priceGross;
        this.discount = discount;
        this.homepage = homepage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public float getPriceNett() {
        return priceNett;
    }

    public void setPriceNett(float priceNett) {
        this.priceNett = priceNett;
    }

    public float getPriceGross() {
        return priceGross;
    }

    public void setPriceGross(float priceGross) {
        this.priceGross = priceGross;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }


}
