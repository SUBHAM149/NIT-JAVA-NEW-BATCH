package com.sub.day10;

public class Robot {
	private Chip chip;
	private Sensor sensor;

	public Robot() {
		System.out.println("0 param");
	}

	public Robot(Chip chip) {
		System.out.println("One param");
		this.chip = chip;
	}

	public Robot(Chip chip, Sensor sensor) {
		System.out.println("2 param");

		this.chip = chip;
		this.sensor = sensor;
	}

	public Chip getChip() {
		return chip;
	}

	public void setChip(Chip chip) {
		this.chip = chip;
	}

	public Sensor getSensor() {
		return sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	@Override
	public String toString() {
		return "Robot [chip=" + chip + ", sensor=" + sensor + "]";
	}
}
