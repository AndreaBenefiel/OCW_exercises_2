
public class gravity_calc {
	public static void main(String[] args) {
		double g = -9.81; 			//gravity constant m/s
		double v_init = 0.0;		
		double time = 3.0;			//enter fall time in seconds
		double x_init = 50.0;		//enter initial height
		double x_fin;
		
		x_fin = .5 * g * Math.pow(time, 2.0) + v_init*time + x_init ;
		
		System.out.println("An object's position after " + time + " seconds is " + x_fin + " m from ground.");
		}
}
