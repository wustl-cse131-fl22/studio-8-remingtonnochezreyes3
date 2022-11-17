package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month; 
	private int day; 
	private int year; 
	private boolean isHoliday; 
	
	/**
	 * 
	 * @param month
	 * @param day
	 * @param year
	 * @param isHoliday
	 */
    public Date(int month, int day, int year, boolean isHoliday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}

    

	public int getMonth() {
		return month;
	}


	public int getDay() {
		return day;
	}



	public int getYear() {
		return year;
	}



	public boolean isHoliday() {
		return isHoliday;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}



	public String toString()
	{
		return this.month + "/" + this.day + "/" + this.year + " Is it a holiday? " + this.isHoliday;
		
	}
	

	public static void main(String[] args) {
		Date d1 = new Date (01, 05, 2004, false);
		System.out.println(d1);
		Date d2 = new Date (10, 02, 2003, true);
		System.out.println(d2);
		Date d3 = new Date (10, 02, 2003, true);
		System.out.println(d3);
		Date d4 = new Date (8, 07, 2022, false);
		System.out.println(d4);
		Date d5 = new Date (9, 23, 1999, false); 
		System.out.println(d5);
		System.out.println(d2.equals(d3)); 
		System.out.println(d2.equals(d4)); 
		LinkedList<Date> list = new LinkedList<Date>(); //ordered but can have repeats  
		list.add(d1); 
		list.add(d2); 
		list.add(d3); 
		list.add(d4); 
		list.add(d5); 
		System.out.println(list); 
		HashSet<Date> set = new HashSet<Date>(); //sets don't have repeats and aren't ordered
		set.add(d1); 
		set.add(d2); 
		set.add(d3); 
		set.add(d4); 
		set.add(d5); 
		System.out.println(set); 
    }

}
