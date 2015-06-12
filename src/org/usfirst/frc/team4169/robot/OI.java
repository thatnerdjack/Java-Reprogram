package org.usfirst.frc.team4169.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4169.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick driverJoy= new Joystick(0);
	private Joystick liftJoy = new Joystick(1);
	
	private JoystickButton trigger;
	
	private JoystickButton d_up;
	private JoystickButton d_down;
	private JoystickButton d_left;
	private JoystickButton d_right;
	
	private JoystickButton l2;
	private JoystickButton r2;
	private JoystickButton l1;
	private JoystickButton r1;
	
	public OI() {
	    //// CREATING BUTTONS
	    // One type of button is a joystick button which is any button on a joystick.
	    // You create one by telling it which joystick it's on and which button
	    // number it is.
	    // Joystick stick = new Joystick(port);
	    // Button button = new JoystickButton(stick, buttonNumber);
	    
	    // There are a few additional built in buttons you can use. Additionally,
	    // by subclassing Button you can create custom triggers and bind those to
	    // commands the same as any other Button.
	    
	    //// TRIGGERING COMMANDS WITH BUTTONS
	    // Once you have a button, it's trivial to bind it to a button in one of
	    // three ways:
	    
	    // Start the command when the button is pressed and let it run the command
	    // until it is finished as determined by it's isFinished method.
	    // button.whenPressed(new ExampleCommand());
	    
	    // Run the command while the button is being held down and interrupt it once
	    // the button is released.
	    // button.whileHeld(new ExampleCommand());
	    
	    // Start the command when the button is released  and let it run the command
	    // until it is finished as determined by it's isFinished method.
	    // button.whenReleased(new ExampleCommand());
			
		trigger = new JoystickButton(driverJoy, 1);
		d_up = new JoystickButton(driverJoy, 3);
	    d_right = new JoystickButton(driverJoy, 5);
	    d_down = new JoystickButton(driverJoy, 2);
	    d_left = new JoystickButton(driverJoy, 4);
	    l2 = new JoystickButton(driverJoy, 9);
	    r2 = new JoystickButton(driverJoy, 10);
	    l1 = new JoystickButton(driverJoy, 11);
	    r1 = new JoystickButton(driverJoy, 12);
	    
	    d_up.whileHeld(new LiftUpWithJoystick());
	    d_down.whileHeld(new LiftDownWithJoystick());	    
	}
	    
    public Joystick getDriverJoystick() {
        return driverJoy;
    }
    
    public Joystick getLiftJoystick() {
    	return liftJoy;
    }
    
    public boolean doesTurnRight() {
    	return d_right.get();
    }
    
    public boolean doesTurnLeft() {
    	return d_left.get();
    }
    
    public boolean doesMoveUp() {
    	return d_up.get();
    }
    
    public boolean doesMoveDown() {
    	return d_down.get();
    }
    
    public boolean isTriggerPulled() {
    	return trigger.get();
    }
	
}

