import java.util.Random;

public class FactoryEnemy {
	private FactoryEnemy() {
		
	}
	public static EnemyTank getEnemy(Point point, int direct) {
		Random rd = new Random();
		if(rd.nextInt(2)==0)
			return new EnemyLevel_1(point, direct);
		else 
			return new EnemyLevel_2(point, direct);
	}
}
