package com.fz.builder;

/**
 * 具体飞船的构造 
 */
public class FzAirShipBuilder implements AirShipBuilder{

	@Override
	public Engine builderEngine() {
		System.out.println("方政牌发动机");
		return new Engine("方政牌发动机");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("方政牌轨道舱");
		return new OrbitalModule("方政牌轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("方政牌逃逸塔");
		return new EscapeTower("方政牌逃逸塔");
	}

}
