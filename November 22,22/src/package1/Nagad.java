package package1;

public class Nagad implements OnlinePayment {

    @Override
    public float paymentCharge() {
        return 9.99f;
    }

    @Override
    public void paymentConfirmation() {
        System.out.println("Payment Confirmed by Nagad");
    }
}
