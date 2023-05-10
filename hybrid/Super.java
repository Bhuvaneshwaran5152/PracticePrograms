package com.full.inheritance.hybrid;

interface Super {
	public void run();

	default void stop() {
		System.out.println("Stop");
	};
}
