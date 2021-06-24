package pk9;

public class Thistest {
	
	private int Speed;
	private int Age;
	private String Robotname;
	private String Robotnum;
	
	public Thistest() {
		this(10,3,"bob","20210618");
	}
	public Thistest(int Speed,int Age,String Robotname,String Robotnum) {
		this.Speed=Speed;
		this.Age=Age;
		this.Robotname=Robotname;
		this.Robotnum=Robotnum;
	}
	public void move() {
		Speed+=20;
		System.out.println("Robot's speed="+Speed);
	}
	public void stop() {
		Speed=0;
		System.out.println("Robot's speed="+Speed);
	}
	public void Rage() {
		Age+=1;
		System.out.println("Robot's age="+ Age);
	}
	public void Rname() {
		System.out.println("Robot's Name="+ Robotname);
	}
	public void Rnum() {
		System.out.println("Robot's speed="+Robotnum);
	}
}

