package entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Client client;
    private List<Article> articleList;
    private double total;

    public Cart(Client client) {
        this.client = client;
        this.articleList = new ArrayList<>();
        this.total = 0.0;
    }

    public Client getClient() {
        return client;
    }

    public double getTotal() {
        return total;
    }

    public void addArticle(Article article, int quantity) {
        if (article.getAvailable() >= quantity) {
            articleList.add(article);
            article.setAvailable(article.getAvailable() - quantity);
            total += article.getPrice() * quantity;
        } else {
            System.out.println("Article not available in that quantity");
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "client=" + client +
                ", articleList=" + articleList +
                ", total=" + total +
                '}';
    }
}
