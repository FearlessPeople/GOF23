package com.fz.factory.abstractFactory;

/**
 *	低端汽车制造工厂 
 */
public class LowCarFactory implements CarFactory{
	@Override
	public Engine createEngine() {
		return new LowEngine();
	}
	@Override
	public Seat createSeat() {
		return new LowSeat();
	}
	@Override
	public Tyre createTyre() {
		return new LowTyre();
	}
}
