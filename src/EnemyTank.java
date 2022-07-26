public abstract class EnemyTank extends Tank {
	protected int health = 0;
	public EnemyTank(Point point, int direct) {
		super(point, direct);
		this.wayMove = new AutoMove();
		this.wayShot = new AutoShot();
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}

}
