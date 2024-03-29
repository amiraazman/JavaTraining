package com.mira.sample;

import static com.mira.sample.Day.*;

public class EnumTest {
	
	Day day;
	
	public EnumTest(Day day){
		this.day = day; 
	}
	
	public void tellItLikeItIs(){
		switch (day){
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
		
		case SATURDAY:
			
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;
		
		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}

	
	public static void main(String args[]){
		
		EnumTest firstDay = new EnumTest(MONDAY);
		firstDay.tellItLikeItIs();
		
		EnumTest thirdDay = new EnumTest(WEDNESDAY);
		thirdDay.tellItLikeItIs();
		
		EnumTest fifthDay = new EnumTest(FRIDAY);
		fifthDay.tellItLikeItIs();
		
		EnumTest sixthDay = new EnumTest(SATURDAY);
		sixthDay.tellItLikeItIs();
		
		EnumTest seventhDay = new EnumTest(SUNDAY);
		seventhDay.tellItLikeItIs();
	}
}
