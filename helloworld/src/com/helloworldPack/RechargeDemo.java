package com.helloworldPack;

abstract class MobileRecharge {

    abstract void recharge();

}

class AirtelRecharge extends MobileRecharge {

    void recharge() {
        System.out.println("Airtel Recharge Successful");
        System.out.println("Recharge Amount: Rs.299");
        System.out.println("Validity: 28 Days");
    }
}

public class RechargeDemo {
    public static void main(String[] args) {

        AirtelRecharge obj = new AirtelRecharge();
        obj.recharge();
    }
}