package tecProg;

import java.awt.Color;
import robocode.AdvancedRobot;
import robocode.HitByBulletEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;


public class Juliana extends AdvancedRobot {

		public void run() {
			setColors(Color.MAGENTA, Color.WHITE, Color.GREEN);
			
			while (true) {
				setAhead(50);
				setTurnLeft(20);
				setTurnGunLeft(50);
				turnRadarLeft(180);
				turnRadarRight(180);
				setTurnRight(50);
				setAhead(50);
				}
		}
			public void onScannedRobot(ScannedRobotEvent e) {
				double angulo = e.getBearing();
				double distancia = e.getDistance();
	
				if ( distancia > 50 ) {
					turnGunRight(angulo); 
					fire(2);
				}
				
				if ( distancia <= 50 ) {
					turnGunRight(angulo); 
					fire(3);
				}
				
			}
			public void onHitWall(HitWallEvent event) {
				back(100);
				turnLeft(180);
				turnRadarLeft(180);
			}
			
			public void onHitByBullet(HitByBulletEvent e) {
				setAhead(100);
				setTurnRight(50);
			}
			
			

}
