package studio8;

import java.util.LinkedList;

public class Calendar {


	private LinkedList<Appointment> calendar; 


	public Calendar(LinkedList<Appointment> calendar) {
		super();
		this.calendar = calendar;
	}

	public LinkedList<Appointment> getCalendar() {
		return calendar;
	}


	public String toString()
	{
		return "On the calendar we have appointments:" + calendar; 
		
	}

	public static void main(String[] args) {
		

	}

}
