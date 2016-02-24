package com.fz.builder;

/**
 * 具体飞船的组装
 */
public class FzAirShipDirector implements AirShipDirector{

	private AirShipBuilder builder;//创建构建者的引用
	public FzAirShipDirector(AirShipBuilder airShipBuilder) {
		this.builder = airShipBuilder;
	}
	/**
	 * 组装具体的对象
	 */
	@Override
	public AirShip directorAirShip() {
		Engine e = builder.builderEngine();//构建发动机
		EscapeTower et = builder.builderEscapeTower();//构建逃逸塔
		OrbitalModule o = builder.builderOrbitalModule();//构建轨道舱
		//装配对象
		AirShip ship = new AirShip();
		ship.setEngine(e);
		ship.setEscapeTower(et);
		ship.setOrbitalModule(o);
		return ship;
	}

}
