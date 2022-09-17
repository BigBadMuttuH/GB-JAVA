package b_practice.seminarOOP07SOLID.Ex02;

interface Discounts{
    double getDiscount(double price);
}

enum Cards{
    BRONZE(0.1),
    SILVER(0.2),
    GOLD(0.3);

    private final double value;

    Cards(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

abstract class Client {
    public Client() {
    }
}


class Silver implements Discounts{
    public Silver() {
    }

    @Override
    public double getDiscount(double price) {
        return price * Cards.SILVER.getValue();
    }
}
class Gold implements Discounts{
    public Gold() {
    }

    @Override
    public double getDiscount(double price) {
        return price * Cards.GOLD.getValue();
    }
}
