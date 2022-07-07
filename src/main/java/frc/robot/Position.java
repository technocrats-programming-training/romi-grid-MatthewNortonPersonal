package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {
    
    int x = 0;
    int y = 0;

  // turning back to facing upwards after every turn

    public void driveUp() throws InterruptedException {
      y += 10;
      driveDistance(10);      
    }

    public void driveDown() throws InterruptedException {
      y -= 10;
      turnDegrees(180);
      driveDistance(10);
      turnDegrees(180);
    }

    public void driveRight() throws InterruptedException {
      x += 10;
      turnDegrees(90);
      driveDistance(10);
      turnDegrees(-90);
    }

    public void driveLeft() throws InterruptedException {
      x -= 10;
      turnDegrees(-90);
      driveDistance(10);
      turnDegrees(90);
    }

    public void returnToHome() {
        // driveDistance(-y);
        
        // turning to the right and then driving the distance back
        // turnDegrees(90);
        // driveDistance(-x);
        // turnDegrees(-90);
        // x = 0;
        // y = 0;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
