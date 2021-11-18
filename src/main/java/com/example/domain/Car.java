package com.example.domain;
/**
 * Carドメイン
 * @author 81907
 *
 */
public class Car {

	private int speed;    //←publicだめ！
	private String name;

//	引数ありコンストラクタ
	public Car(int speed, String name) {
		super();
		this.speed = speed;
		this.name = name;
	}

//	引数なしコンストラクタ
	public Car() {
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", name=" + name + "]";
	}

}
