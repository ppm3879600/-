package pk9;

public class Thisexample {

		int day;
		int month;
		int year;
		
		public void setYear(int year) {
			this.year=year;
		}
		public void printThis() {
			System.out.println(this);
		}
		
	public static void main(String[] args) {
		
		Thisexample bDay=new Thisexample();
		bDay.setYear(2000);
		System.out.println(bDay.year);
		System.out.println("---------------------------");
		System.out.println(bDay);
		System.out.println("---------------------------");
		

	}

}
