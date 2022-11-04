package com.training.exproject.package1;

public class Main {

	public static void main(String[] args) {
		Time zeit = new Time();

		zeit.print(zeit.getHour(), zeit.getMinute(), zeit.getSecond());

		zeit.setHour(5);
		zeit.setMinute(78);
		zeit.setSecond(50);

		zeit.print(zeit.getHour(), zeit.getMinute(), zeit.getSecond());

		zeit.addHour(5);
		zeit.addMinute(78);
		zeit.addSecond(54);

		zeit.print(zeit.getHour(), zeit.getMinute(), zeit.getSecond());

	}

}
