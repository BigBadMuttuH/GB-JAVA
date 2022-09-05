package b_practice.seminarOOP02.EX002;

import java.util.List;

public interface Communication {

    default double costOfItem(Item item){
        return item.getCost();
    }

    default void isItemsInStorage(Seller seller, List<Item> wishListOfConsumer){
        for (Item item : wishListOfConsumer) {
            if(!seller.getItems().contains(item)){
                System.out.println("У нас нет " + item.getNameOfItem() );
            }
        }
    }

    //Дописать метод
    default double totalCost(){
        return 0.0;
    }

    default void areYouPoor (Consumer consumer){
        if(totalCost() > consumer.getMoney()){
            System.out.println("Ты нищеброд");
        } else {
            walkInStorage();
        }
    }


    //У Покупателя и Продавца реализовать свои вариации метода "пойти на склад"
    void walkInStorage();
}

