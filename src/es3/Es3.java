package es3;

import entities.Article;
import entities.Cart;
import entities.Client;

public class Es3 {
    public static void main(String[] args) {

        Article article1 = new Article("4234", "Book of cats",
                12.99, 4);

        Article article2 = new Article("42324", "kitchen knives",
                24.99, 10);


        Client clientA = new Client("A007", "James", "Bond",
                "jamesbond@secreat.agent.com");


        Cart cartClientA = new Cart(clientA);

        cartClientA.addArticle(article1, 3);

        System.out.println("Cart of the client: " + clientA.getFullName() + " " +
                cartClientA.getTotal() + " $");

        System.out.println(clientA);
        System.out.println(cartClientA);
    }
}
