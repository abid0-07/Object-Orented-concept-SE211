package package1;

public class Bkash implements OnlinePayment {

    @Override
    public float paymentCharge() {
        return  14.90f;
    }

    @Override
    public void paymentConfirmation() {
        System.out.println("Payment Confirmed by Bkash");
    }
}
