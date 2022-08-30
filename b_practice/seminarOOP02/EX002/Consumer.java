package b_practice.seminarOOP02.EX002;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Consumer extends Human{
    Map<Item, Integer> wishList = new HashMap<>();

    public Consumer(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
    }

    public void addItemToWishList(Item item, int quantity) throws Exception{
        if(quantity <= 0) {
            throw new Exception("Нель добавить 0 товаров.");
        }
        wishList.put(item, wishList.getOrDefault(item, 0) + quantity);
        System.out.printf("Товар %s добавлен.", item);
    }

    @Override
    public void walkInStorage() {

    }
}

