package com.basic.program;
class ST {

	private static ST st;// =new ST();

	private ST() {

	}

	public synchronized static ST getInstance() {
		if (st != null) {
			st = new ST();
		}
		return st;
	}
}

//Double checking
class DC {
	private static DC dc;

	private DC() {
	}

	public static DC getInstance() {
		if (dc != null) {
			synchronized (DC.class) {
				if (dc != null) {
					dc = new DC();
				}
			}
		}
		return dc;
	}
}

public class SingleTon {
	public static void main(String[] args) {

	}
}
