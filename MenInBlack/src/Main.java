
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlienPack pack1 = new AlienPack(5);
		pack1.addAlien(new MarshmalloAlien(), 0);
		pack1.addAlien(new OgreAlien(), 1);
		pack1.addAlien(new MarshmalloAlien(), 2);
		pack1.addAlien(new SnakeAlien(), 3);
		pack1.addAlien(new SnakeAlien(), 4);
		
		MenInBlack agent = new MenInBlack(pack1);
		agent.kill();
		agent.kill();
		System.out.println("Score : "+agent.getScore());
		
	}

}
