package org.usfirst.frc.team4169.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.*;

/**
 *
 */
public class DriveTrain extends Subsystem {
	private SpeedController motorFL;
	private SpeedController motorFR;
	private SpeedController motorBL;
	private SpeedController motorBR;
	
	private RobotDrive drive;
	
	public DriveTrain() {
		motorFL = new Talon(12);
		motorFR = new Talon(3);
		motorBL = new Talon(13);
		motorBR = new Talon(2);
		
		drive = new RobotDrive(motorFL, motorBL, motorFR, motorBR);
		
		LiveWindow.addActuator("DriveTrain", "Motor FL", (Talon) motorFL);
		LiveWindow.addActuator("DriveTrain", "Motor FR", (Talon) motorFR);
		LiveWindow.addActuator("DriveTrain", "Motor BL", (Talon) motorBL);
		LiveWindow.addActuator("DriveTrain", "Motor BR", (Talon) motorBR);
	}
	
	public void drive() {
		drive.drive(1, 0);
	}
    
}

