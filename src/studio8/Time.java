package studio8;

import java.util.Objects;

public class Time {
	
	private int hour; 
	private int minute; 
	private boolean is12; 

	
	public Time(int hour, int minute, boolean is12) {
		this.hour = hour;
		this.minute = minute;
		this.is12 = is12; 
	}


	public int getHour() {
		return hour;
	}



	public int getMinute() {
		return minute;
	}



	public boolean isIs12() {
		return is12;
	}




	public static void main(String[] args) {
		Time t1 = new Time (12, 45, true);
		System.out.println(t1);
		Time t2 = new Time (23, 37, false);
		System.out.println(t2);
		Time t3 = new Time (23, 37, false);
		System.out.println(t3);
		Time t4 = new Time (7, 24, true);
		System.out.println(t4);
		System.out.println(t4.equals(t3));
		System.out.println(t2.equals(t3));
    }
	
	public String toString()
	{
		if (is12==true)
		{
			if (hour == 12) {
				return (hour) + ":" + minute + "pm"; 
			}
			if (hour>12)
			{
				return (hour-12) + ":" + minute + "pm"; 
			}
			else
			{
				return hour + ":" + minute + "am"; 
			}
		}
		else
		{
			return hour + ":" + minute; 
		}
	}


	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

}