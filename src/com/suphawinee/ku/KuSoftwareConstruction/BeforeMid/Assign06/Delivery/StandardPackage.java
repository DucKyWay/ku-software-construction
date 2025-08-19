package com.suphawinee.ku.KuSoftwareConstruction.BeforeMid.Assign06.Delivery;

public class StandardPackage extends Package {
    
    public StandardPackage(double weight, String destination) {
        super(weight, destination);
    }

    @Override
    public double calculateShippingFee() {
        return 50 * super.getWeight();
    }
}
