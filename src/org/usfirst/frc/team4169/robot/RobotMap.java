package org.usfirst.frc.team4169.robot;

import java.util.prefs.BackingStoreException;

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
    public static Talon DRIVE_FRONT_LEFT_MOTOR;
    public static Talon DRIVE_FRONT_RIGHT_MOTOR;
    public static Talon DRIVE_BACK_LEFT_MOTOR;
    public static Talon DRIVE_BACK_RIGHT_MOTOR;
    
    public static RobotDrive DRIVE;
    
    public static void init() {
    	DRIVE_FRONT_LEFT_MOTOR = new Talon(12);
    	LiveWindow.addActuator("DriveTrain", "Motor FL", (Talon) DRIVE_FRONT_LEFT_MOTOR);
    	
		DRIVE_FRONT_RIGHT_MOTOR = new Talon(3);
		LiveWindow.addActuator("DriveTrain", "Motor FL", (Talon) DRIVE_FRONT_RIGHT_MOTOR);
		
		DRIVE_BACK_LEFT_MOTOR = new Talon(13);
		LiveWindow.addActuator("DriveTrain", "Motor FL", (Talon) DRIVE_BACK_LEFT_MOTOR);
		
		DRIVE_BACK_RIGHT_MOTOR = new Talon(2);
		LiveWindow.addActuator("DriveTrain", "Motor FL", (Talon) DRIVE_BACK_RIGHT_MOTOR);
		
		DRIVE = new RobotDrive(DRIVE_BACK_LEFT_MOTOR, DRIVE_FRONT_LEFT_MOTOR, DRIVE_BACK_RIGHT_MOTOR, DRIVE_FRONT_RIGHT_MOTOR);
	}
}
