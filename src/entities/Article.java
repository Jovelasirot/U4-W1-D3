package entities;

public class Article {
    private String codeArticle;
    private String description;
    private double price;
    private int available;

    public Article(String codeArticle, String description,
                   double price, int available) {
        this.codeArticle = codeArticle;
        this.description = description;
        this.price = price;
        this.available = available;
    }


    public String getCodeArticle() {
        return codeArticle;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }


}
