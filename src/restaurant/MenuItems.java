package restaurant;

public class MenuItems {
    private int id;
    private static int nextId = 1;
    private double price;
    private String category;
    private String description;
    private boolean isNew;

    public MenuItems(double price,String description, String category, boolean isNew){
        this.price = price;
        this.category = category;
        this.description = description;
        this.isNew = true;
        this.id = nextId;
        nextId ++;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public boolean isNew() {
//        return isNew;
//    }
//
//    public void setNew(boolean aNew) {
//        isNew = aNew;
//    }
}
