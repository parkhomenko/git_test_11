public class RoomRental {

    final static int DISCOUNT_FIVE = 20;
    final static int discountSeven = 50;

    public static void main(String[] args) {

        int price = 10;
        int days = 50;


        int cost = days * price;

        boolean days5 = days > 5;
        boolean days7 = days <= 7;

        if (days5 && days7) {
            cost -= DISCOUNT_FIVE; //cost = cost - discountFive;
        }

        if (days > 7) {
            cost -= discountSeven;
        }


    }
}
