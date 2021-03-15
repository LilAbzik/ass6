package com.company.factory;

public abstract class Logistics {
    public void planDelivery() {
        Transport t = createTransport();
    }
    public abstract Transport createTransport();
}
