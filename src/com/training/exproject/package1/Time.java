package com.training.exproject.package1;
/*Составьте описание класса для представления времени. 
 * Предусмотрте возможности установки времени и изменения 
его отдельных полей (час, минута, секунда) 
с проверкой допустимости вводимых значений. В случае недопустимых значений 
полей поле устанавливается в значение 0. 
Создать методы изменения времени на заданное количество часов, минут и секунд.
 */

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		hour=0;
		minute=0;
		second=0;
	}
	
	public Time(int hour, int minute, int second) {
		this.hour= hour;
		this.minute=minute;
		this.second=second;
	}
	
	public void setHour(int hourIn) {
		hour=hourIn;
		if (hour>24) {
			hour=0;
		}
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setMinute(int minuteIn) {
		minute=minuteIn;
		if (minute>60) {
			minute=0;
		}
	}
	
	public int getMinute() {
		return minute;
	}

	public void setSecond(int secondIn) {
		second=secondIn;
		if (second>60) {
			second=0;
		}
		
	}
	
	public int getSecond() {
		return second;
	}
	
	public int addHour(int hour1) {
		hour=hour+hour1;
		if (hour>24) {
			hour=hour%24;
		}
		return hour;
	}
	
	public int addMinute(int minute1) {
		minute=minute+minute1;
		if (minute>60) {
			int remainder=minute/60;
			hour=hour+remainder;
			minute=minute%60;
		}
		return minute;
	}
	
	public int addSecond(int second1) {
		second=second+second1;
		if(second>60) {
			int remainder=second/60;
			minute=minute+remainder;
			second=second%60;
		}
		return second;
	}
	
	public void print(int hour,int minute,int second) {
		System.out.println("Hour"+hour+" Minute"+minute+" Second"+second);
	}

}
