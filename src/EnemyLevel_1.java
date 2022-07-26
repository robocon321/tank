
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;


public class EnemyLevel_1 extends EnemyTank{

	public EnemyLevel_1(Point point, int direct) {
		super(point, direct);
		health = 1;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		if (direct == 0) {
			g.drawImage(new ImageIcon("./resource/graphics.png").getImage(), point.getX() * 10, point.getY() * 10,
					(point.getX() + 3) * 10, (point.getY() + 3) * 10, 225, 0, 255, 30, null);
		} else if (direct == 1) {
			g.drawImage(new ImageIcon("./resource/graphics.png").getImage(), point.getX() * 10, point.getY() * 10,
					(point.getX() + 3) * 10, (point.getY() + 3) * 10, 130, 0, 160, 30, null);
		} else if (direct == 2) {
			g.drawImage(new ImageIcon("./resource/graphics.png").getImage(), point.getX() * 10, point.getY() * 10,
					(point.getX() + 3) * 10, (point.getY() + 3) * 10, 160, 0, 190, 30, null);
		} else if (direct == 3) {
			g.drawImage(new ImageIcon("./resource/graphics.png").getImage(), point.getX() * 10, point.getY() * 10,
					(point.getX() + 3) * 10, (point.getY() + 3) * 10, 193, 0, 220, 30, null);
		}
	}
}
