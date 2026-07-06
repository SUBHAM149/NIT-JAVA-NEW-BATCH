package com.sub.day10;

public class Chip {
	private String producer;
	private String power;

	public Chip() {
	}

	public Chip(String producer, String power) {
		this.producer = producer;
		this.power = power;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Chip [producer=" + producer + ", power=" + power + "]";
	}
}
