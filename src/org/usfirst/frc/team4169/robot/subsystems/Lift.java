package org.usfirst.frc.team4169.robot.subsystems;

import org.usfirst.frc.team4169.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
*
/*/
public class Lift extends Subsystem {
	private Talon leftMotor = RobotMap.LIFT_MOTOR_LEFT;
	private Talon rightMotor = RobotMap.LIFT_MOTOR_RIGHT;

    public void initDefaultCommand() {}
    
    public void liftUp() {
    	
    }
    
    public void liftDown() {
    	
    }
    
}

