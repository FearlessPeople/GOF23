package com.fz.builder;

/**
 * 构建接口:用来构建AirShipz中组件的接口
 */
public interface AirShipBuilder {
	Engine builderEngine();//构建发动机
	OrbitalModule builderOrbitalModule();//构建轨道舱
	EscapeTower builderEscapeTower();//构建逃逸塔
}
