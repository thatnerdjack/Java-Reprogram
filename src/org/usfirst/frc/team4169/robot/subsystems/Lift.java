package org.usfirst.frc.team4169.robot.subsystems;

import org.usfirst.frc.team4169.robot.RobotMap;
import org.usfirst.frc.team4169.robot.commands.LiftWithController;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Lift extends Subsystem {
	private Talon leftMotor = RobotMap.LIFT_MOTOR_LEFT;
	private Talon rightMotor = RobotMap.LIFT_MOTOR_RIGHT;
	
	private DigitalInput upperLimitSwitch = RobotMap.LIFT_UPPER_LIMIT_SWITCH;
	private DigitalInput lowerLimitSwitch = RobotMap.LIFT_LOWER_LIMIT_SWITCH;

    public void initDefaultCommand() {
    	setDefaultCommand(new LiftWithController());
    }
    
    public void liftUp() {
    	leftMotor.set(1);
    	rightMotor.set(1);
    }
    
    public void liftDown() {
    	leftMotor.set(-1);
    	rightMotor.set(-1);
    }
    
    public void stop() {
    	leftMotor.set(0);
    	rightMotor.set(0);
    }
    
    public void runLift(Joystick j) {
    	leftMotor.set(j.getY());
    	rightMotor.set(j.getY());
    }
    
    public boolean isLiftAtTop() {
    	return upperLimitSwitch.get();
    }
    
    public boolean isLiftAtBottom() {
    	return lowerLimitSwitch.get();
    }
    
}

