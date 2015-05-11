package org.usfirst.frc.team4169.robot.subsystems;

import org.usfirst.frc.team4169.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.*;

/**
 *
 */
public class DriveTrain extends Subsystem {
	private RobotDrive drive = RobotMap.DRIVE;
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void mechDrive(Joystick j) {
		mechDrive(j.getX(), j.getY(), j.getTwist());
	}
	
	public void mechDrive(double x, double y, double rotation) {
		drive.mecanumDrive_Cartesian(x, y, rotation, 0);
	}
    
}

