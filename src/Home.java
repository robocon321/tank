import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Home implements Draw {
	private Point point = new Point(VarPublic.WIDTH / 10 / 2 - 2, VarPublic.HEIGHT / 10 - 3);

	public Home() {

	}

	public void registerPosMap() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				VarPublic.MAP.getMap()[this.getPoint().getY() + j][this.getPoint().getX() + i] = 10;
			}
	}

	public void unregisterPosMap() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				VarPublic.MAP.getMap()[this.getPoint().getY() + j][this.getPoint().getX() + i] = 0;
			}
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(new ImageIcon("./resource/graphics.png").getImage(), point.getX() * 10, point.getY() * 10,
				(point.getX() + 3) * 10, (point.getY() + 3) * 10, 897, 65, 930, 90, null);
	}

}
