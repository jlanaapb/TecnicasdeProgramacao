package tecProg;

import java.awt.Color;
import robocode.AdvancedRobot;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

public class Juliana extends AdvancedRobot {

	public void run() {
		setColors(Color.MAGENTA, Color.cyan, Color.GREEN);

		while (true) {
			setAhead(50);
			setTurnLeft(25);
			setTurnGunLeft(50);
			turnRadarLeft(360);
			turnRadarRight(180);
			setTurnRight(50);
			setAhead(70);
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		double angulo = e.getBearing();
		double distancia = e.getDistance();

		if (distancia > 50) {
			turnGunRight(angulo);
			setBack(distancia);
			fire(2);
		}

		if (distancia <= 50) {
			setStop();
			turnGunRight(angulo);
			setBack(distancia);
			fire(3);
		}

	}
	public void onHitWall(HitWallEvent event) {
		back(100);
		turnLeft(180);
		turnRadarLeft(180);
		ahead(100);
	}

	public void onHitByBullet(HitByBulletEvent e) {
		setAhead(100);
		setTurnRight(50);
		setAhead(100);
		
	}

	public void onHitRobot(HitRobotEvent event) {
		double angulo = event.getBearing();
		if (angulo > 50) {
			turnRadarLeft(360);
			turnGunRight(angulo);
			fire(2);
		}

		if (angulo <= 50) {
			turnRadarRight(360);
			turnGunRight(angulo);
			fire(3);
		}
	}
}
