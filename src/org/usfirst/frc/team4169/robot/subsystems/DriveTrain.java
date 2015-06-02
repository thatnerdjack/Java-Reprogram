package org.usfirst.frc.team4169.robot.subsystems;

import org.usfirst.frc.team4169.robot.Robot;
import org.usfirst.frc.team4169.robot.RobotMap;
import org.usfirst.frc.team4169.robot.commands.MecanumDriveWithController;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;

/**
 *
 */
public class DriveTrain extends Subsystem {
	private RobotDrive drive = RobotMap.DRIVE;
	
	private double loggedTurnPower = 0;
	
	public DriveTrain() {
		drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
		drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new MecanumDriveWithController());
	}
	
	public void mechDrive(Joystick j) {
		if(Robot.oi.doesTurnRight()) {
			mechDrive(0.5, j.getY(), j.getX());
			loggedTurnPower = 0.5;
		}
		else if(Robot.oi.doesTurnLeft()) {
			mechDrive(-0.5, j.getY(), j.getX());
			loggedTurnPower = -0.5;
		}
		else {
			mechDrive(0, j.getY(), j.getX());
			loggedTurnPower = 0;
		}
	}
	
	public void turn(double turnPower){
		drive.mecanumDrive_Cartesian(0, 0, turnPower, 0);
	}
	
	public void mechDrive(double x, double y, double rotation) {
		drive.mecanumDrive_Cartesian(-x, y, rotation, 0);
	}
	
	public void log() {
		SmartDashboard.putNumber("Front Right Power:", RobotMap.DRIVE_FRONT_RIGHT_MOTOR.getSpeed());
		SmartDashboard.putNumber("Front Left Power:", RobotMap.DRIVE_FRONT_LEFT_MOTOR.getSpeed());
		SmartDashboard.putNumber("Back Right Power:", RobotMap.DRIVE_BACK_RIGHT_MOTOR.getSpeed());
		SmartDashboard.putNumber("Back Left Power:", RobotMap.DRIVE_BACK_LEFT_MOTOR.getSpeed());
		SmartDashboard.putNumber("turn power:", loggedTurnPower);
		
	}
    
}

