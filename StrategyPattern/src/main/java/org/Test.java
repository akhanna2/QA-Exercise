package org;

public class Test {

	public static void main(String[] args) {
		StrategySwapper context = new StrategySwapper();
        context.setStrategy(new BluetoothStrategy());
        context.connect("Nick's phone");

        context.setStrategy(new AuxStrategy());
        context.connect("Jordan's phone");

        context.setStrategy(new HdmiStrategy());
        context.connect("Piers' phone");
        
        context.setStrategy(new InfraredStrategy());
        context.connect("Ash's Phone");

	}

}
