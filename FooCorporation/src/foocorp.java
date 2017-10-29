
public class foocorp {
	public static void main(String[] args) {
		double base_pay = 4.00;			//enter hourly pay
		double hours_worked = 30.00;	//enter hours worked
		double hours_base;
		double hours_over;
		double payment;
		
		Foo Bar
		
		if(hours_worked > 60.0) {
			System.out.println("Max hours allowed is 60. Please reenter hours worked.");
			return;
		}
		if(base_pay < 8.0) {
			System.out.println("Min hourly rate is $8.00/hr. Please re-enter hourly pay.");
			return;
		}
		if(hours_worked > 40.0) {
			hours_base = 40.0;
			hours_over= hours_worked - 40.0;
		}
		else {
			hours_base = hours_worked;
			hours_over = 0.0;
		}
		System.out.println("hours at base pay: " + hours_base + ", hours overtime: " + hours_over);
		payment = hours_base*base_pay + hours_over*base_pay*1.5;
		
		System.out.println("Employee to be paid " + payment + " dollars this week.");
		return;
		}
	
}
