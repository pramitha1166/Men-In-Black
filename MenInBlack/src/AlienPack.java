
public class AlienPack {

	private Alien[] alienArray;
	private String[] a;
	private int numOfAlien;
	
	public AlienPack(int numOfAlien) {
		// TODO Auto-generated constructor stub
		super();
		this.numOfAlien = numOfAlien;
		alienArray = new Alien[numOfAlien];
		/*a = new String[numOfAlien];*/
	}
	
	public void addAlien(Alien alien, int index) {
	/*	a[index] = alien;*/
		alienArray[index] = alien;
	}

}
