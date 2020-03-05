package com.centuriLink;

class SingleTonClass {
	private static SingleTonClass a1;

	private SingleTonClass() {

	}

	public static SingleTonClass getInctance() {
		if (a1 == null) {
			a1 = new SingleTonClass();
		}
		return a1;
	}
}

public class SingleTon {
	public static void main(String[] args) {
		SingleTonClass.getInctance();
	}
}
