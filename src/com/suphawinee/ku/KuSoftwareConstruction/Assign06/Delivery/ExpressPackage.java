package com.suphawinee.ku.KuSoftwareConstruction.Assign06.Delivery;

public class ExpressPackage extends Package {

    public ExpressPackage(double weight, String destination) {
        super(weight, destination);
    }

    @Override
    public double calculateShippingFee() {
        return (100 * super.getWeight()) + 50;
    }
}
