package com.sub.day10;

public class Sensor {
	private int reflectionTime;
	private boolean isActivate;

	public Sensor() {
	}

	public Sensor(int reflectionTime, boolean isActivate) {
		this.reflectionTime = reflectionTime;
		this.isActivate = isActivate;
	}

	public int getReflectionTime() {
		return reflectionTime;
	}

	public void setReflectionTime(int reflectionTime) {
		this.reflectionTime = reflectionTime;
	}

	public boolean isActivate() {
		return isActivate;
	}

	public void setActivate(boolean isActivate) {
		this.isActivate = isActivate;
	}

	@Override
	public String toString() {
		return "Sensor [reflectionTime=" + reflectionTime + ", isActivate=" + isActivate + "]";
	}
}
