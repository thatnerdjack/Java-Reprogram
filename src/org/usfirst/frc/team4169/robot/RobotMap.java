package org.usfirst.frc.team4169.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//DriveTrain
    public static Talon DRIVE_FRONT_LEFT_MOTOR;
    public static Talon DRIVE_FRONT_RIGHT_MOTOR;
    public static Talon DRIVE_BACK_LEFT_MOTOR;
    public static Talon DRIVE_BACK_RIGHT_MOTOR;
    
    public static RobotDrive DRIVE;
    
    //Lift
    public static Talon LIFT_MOTOR_LEFT;
    public static Talon LIFT_MOTOR_RIGHT;
    
    public static DigitalInput LIFT_UPPER_LIMIT_SWITCH;
    public static DigitalInput LIFT_LOWER_LIMIT_SWITCH;
    
    public static void init() {
    	//DriveTrain
    	DRIVE_FRONT_LEFT_MOTOR = new Talon(0);
    	LiveWindow.addActuator("DriveTrain", "Motor FL", (Talon) DRIVE_FRONT_LEFT_MOTOR);
    	
		DRIVE_FRONT_RIGHT_MOTOR = new Talon(2);
		LiveWindow.addActuator("DriveTrain", "Motor FL", (Talon) DRIVE_FRONT_RIGHT_MOTOR);
		
		DRIVE_BACK_LEFT_MOTOR = new Talon(1);
		LiveWindow.addActuator("DriveTrain", "Motor FL", (Talon) DRIVE_BACK_LEFT_MOTOR);
		
		DRIVE_BACK_RIGHT_MOTOR = new Talon(3);
		LiveWindow.addActuator("DriveTrain", "Motor FL", (Talon) DRIVE_BACK_RIGHT_MOTOR);
		
		DRIVE = new RobotDrive(DRIVE_BACK_LEFT_MOTOR, DRIVE_FRONT_LEFT_MOTOR, DRIVE_BACK_RIGHT_MOTOR, DRIVE_FRONT_RIGHT_MOTOR);
		
		//Lift
		LIFT_MOTOR_LEFT = new Talon(4);
		LIFT_MOTOR_RIGHT = new Talon(5);
		
		LIFT_UPPER_LIMIT_SWITCH = new DigitalInput(2);
		LIFT_LOWER_LIMIT_SWITCH = new DigitalInput(1);
	}
}
