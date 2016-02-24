package com.fz.factory.abstractFactory;

/**
 *	高端汽车制造工厂 
 */
public class LuxuryCarFactory implements CarFactory{
	@Override
	public Engine createEngine() {
		return new LuxuryEngine();
	}
	@Override
	public Seat createSeat() {
		return new LuxurySeat();
	}
	@Override
	public Tyre createTyre() {
		return new LuxuryTyre();
	}
}
