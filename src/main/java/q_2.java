import java.util.*;

public class q_2{
	public static Scanner reader = new Scanner(System.in);
	public static void doctorRating(Doctor[] doctors) {
	    for (int i = 0; i < doctors.length; i++) {
	        int sum = 0;
	        int count = 0;
	        int rate = reader.nextInt();

	        while (rate != -1) {
	            sum += rate;
	            count++;
	            rate = reader.nextInt();
	        }

            doctors[i].setRate((double) sum / count);
		}
	}
	public static void main(String[] args) {
		Doctor d1 = new Doctor("1","2");
		Doctor d2 = new Doctor("3","4");
		Doctor d3 = new Doctor("5","6");
		Doctor[] doctors = {d1,d2,d3};
		doctorRating(doctors);
		System.out.println(d1.getRate());
		System.out.println(d2.getRate());
		System.out.println(d3.getRate());

	}

}
