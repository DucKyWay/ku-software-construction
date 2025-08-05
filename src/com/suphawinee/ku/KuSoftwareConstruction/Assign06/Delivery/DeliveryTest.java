package com.suphawinee.ku.KuSoftwareConstruction.Assign06.Delivery;

public class DeliveryTest {
    public static void main(String[] args) {
        Package express = new ExpressPackage(2.5, "เชียงใหม่");
        Package standard = new StandardPackage(3.0, "กรุงเทพฯ");

        System.out.println("ปลายทาง: " + express.getDestination() + " ค่าจัดส่ง: " +
                express.calculateShippingFee());
        System.out.println("ปลายทาง: " + standard.getDestination() + " ค่าจัดส่ง: " +
                standard.calculateShippingFee());
    }
}
