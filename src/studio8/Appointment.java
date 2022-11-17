package studio8;

import java.util.Objects;

public class Appointment {

	private Time time;
	private Date date; 
	

	public Appointment(Time time, Date date) {
		super();
		this.time = time;
		this.date = date;
	}


	public Time getTime() {
		return time;
	}



	public Date getDate() {
		return date;
	}

	public String toString()
	{
		return "Appointment on " + this.date + "at " + this.time;
		
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}


	public static void main(String[] args) {
		Time t1 = new Time(9, 20, false); 
		Date d1 = new Date(10, 02, 2022, false); 
		Appointment a1 = new Appointment(t1, d1); 
		System.out.println(a1); 
		Time t2 = new Time(9, 20, false); 
		Date d2 = new Date(10, 02, 2022, false); 
		Appointment a2 = new Appointment(t2, d2);
		System.out.println(a2.equals(a1)); 

	}

}
