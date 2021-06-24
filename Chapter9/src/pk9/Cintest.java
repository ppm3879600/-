package pk9;

public class Cintest {
	

    private int aa;
    private int bb;
    
    public Cintest(int aa,int bb) {
    	this.aa=aa;
    	this.bb=bb;
    }


	public int getAa() {
		return aa;
	}


	public void setAa(int aa) {
		this.aa = aa;
	}


	public int getBb() {
		return bb;
	}


	public void setBb(int bb) {
		this.bb = bb;
	}


	public static void main(String[] args) {
		
	Cintest c=new Cintest(1,4);
	System.out.println(c.aa);
	System.out.println(c.bb);
		}

}
