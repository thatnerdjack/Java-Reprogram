package org.usfirst.frc.team4169.robot.subsystems;

import org.usfirst.frc.team4169.robot.Robot;
import org.usfirst.frc.team4169.robot.RobotMap;
import org.usfirst.frc.team4169.robot.commands.MecanumDriveWithController;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;

/**
 *
 */
public class DriveTrain extends Subsystem {
	private RobotDrive drive = RobotMap.DRIVE;
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new MecanumDriveWithController());
	}
	
	public void mechDrive(Joystick j) {
		//if(Robot.oi.doesTurnRight()){
		//	mechDrive(j.getX(), j.getY(), 0.5);
		//}
		//else if(Robot.oi.doesTurnLeft()){
		//	mechDrive(j.getX(), j.getY(), -0.5);
		//}
		//else {
			mechDrive(j.getX(), j.getY(), 0);
		//}
		
	}
	
	public void mechDrive(double x, double y, double rotation) {
		drive.mecanumDrive_Cartesian(-x, -y, rotation, 0);
	}
    
}

