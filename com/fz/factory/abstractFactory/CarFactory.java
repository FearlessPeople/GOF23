package com.fz.factory.abstractFactory;

/**
 *	汽车总工厂，可以创建轮胎，座椅，发动机 
 */
public interface CarFactory {
	Engine createEngine();//创建发动机
	Seat createSeat();//创建座椅
	Tyre createTyre();//创建轮胎
}
