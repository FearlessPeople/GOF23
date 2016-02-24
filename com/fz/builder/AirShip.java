package com.fz.builder;

/**
 * 宇宙飞船
 * <br><br><strong>时间:</strong><br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2015年10月30日 下午3:32:45<br>
 * @author FZ
 * @version 1.0
 */
public class AirShip {
	private OrbitalModule orbitalModule;//轨道舱
	private Engine engine;//发动机
	private EscapeTower escapeTower;//逃逸塔
	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}
	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public EscapeTower getEscapeTower() {
		return escapeTower;
	}
	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}
	
}
//轨道舱
class OrbitalModule{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public OrbitalModule() {
		super();
	}
	public OrbitalModule(String name) {
		super();
		this.name = name;
	}
}
//发动机
class Engine{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Engine() {
		super();
	}
	public Engine(String name) {
		super();
		this.name = name;
	}
}
//逃逸塔
class EscapeTower{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EscapeTower() {
		super();
	}
	public EscapeTower(String name) {
		super();
		this.name = name;
	}
	
}