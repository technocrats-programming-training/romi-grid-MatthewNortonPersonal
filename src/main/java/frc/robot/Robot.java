// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILi.b BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import lib.ProceduralRobot;

import java.util.Scanner;

import static lib.Romi.*;


public class Robot extends ProceduralRobot {
  @Override
  public void autonomousProcedure() throws InterruptedException {
    
    Joystick m_controller = new Joystick(0);
    
    Position position = new Position();
    
    while (true) {
      if (m_controller.getRawButton(1) == true) {
        position.driveUp();
      }
      
      if (m_controller.getRawButton(4) == true) {
        position.driveRight();
      }

      if (m_controller.getRawButton(3) == true) {
        position.driveLeft();
      }

      if (m_controller.getRawButton(2) == true) {
        position.driveDown();
      }
    }
  }
}
