package tecProg;
import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

public class Juli extends AdvancedRobot{
	
	public void run() {
		setColors(Color.magenta, Color.ORANGE, Color.YELLOW);

		while (true) {
			setAhead(25);
			setTurnGunLeft(50);
			setTurnLeft(25);
			turnRadarLeft(180);
			turnRadarRight(180);
			setTurnRight(50);
			setAhead(200);
		}
	}

	public void onHitWall(HitWallEvent event) {
		turnLeft(90);
		turnRadarLeft(360);
		setAhead(200);
	}
	public void onScannedRobot(ScannedRobotEvent e) {
		double angulo = e.getBearing();
		double distancia = e.getDistance();

		if (distancia > 50) {
			turnGunRight(angulo);
			fire(2);
			setBack(distancia);
			fire(2);
		}

		if (distancia <= 50) {
			setStop();
			turnGunRight(angulo);
			fire(3);
			setBack(distancia);
			fire(3);
		}

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

	public void onHitByBullet(HitByBulletEvent e) {
		setAhead(100);
		setTurnRight(50);
		setAhead(100);
	}


	
}
