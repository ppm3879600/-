package pk9;

import javax.swing.JOptionPane;

public class Thistestmain {

	public static void main(String[] args) {
		Thistest R1 = new Thistest();
		R1.move();
		R1.move();
		R1.Rage();
		
		System.out.println("======객체2=======");
		
		int Rspeed;
		int Rage;
		String Rname;
		String Rnum;
		
		Rspeed=Integer.parseInt(JOptionPane.showInputDialog("속도"));
		Rage=Integer.parseInt(JOptionPane.showInputDialog("나이"));
		Rname=JOptionPane.showInputDialog("이름");
		Rnum=JOptionPane.showInputDialog("번호");
		
		Thistest swing = new Thistest(Rspeed, Rage, Rname, Rnum);
		System.out.println("속도:"+Rspeed);
		System.out.println("나이:"+Rage);
		System.out.println("이름:"+Rname);
		System.out.println("번호:"+Rnum);
		
		swing.move();
		swing.Rage();
		swing.Rname();
		swing.Rnum();
		System.out.println();
		swing.move();
		swing.stop();
		
		
		
		

	}

}
