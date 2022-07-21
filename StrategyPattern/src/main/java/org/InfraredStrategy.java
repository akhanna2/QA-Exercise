package org;

public class InfraredStrategy implements ConnectionStrategy {
    @Override
    public void connectTo(String phone) {
        System.out.println(String.format("Connecting to %s via Infrared...", phone));
        System.out.println("Infrared connected.");
    }
}
