
public class MenInBlackLevel2 extends MenInBlack {

	AlienPack pack;
	
	public MenInBlackLevel2(AlienPack pack) {
		// TODO Auto-generated constructor stub
		super(pack);
	}

	public void kill() {
		
		Alien[] aliens = pack.getAliens(); 

		
		for(int i=0;i<aliens.length;i++) {
			int score = super.getScore();
			score += aliens[i].getScore();
			super.setScore(score);
		}
		
	}
	
}
