package org.usfirst.frc.team4169.robot.commands;

import org.usfirst.frc.team4169.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftWithController extends Command {

    public LiftWithController() {
        requires(Robot.lift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if((Robot.oi.getLiftJoystick().getY() < 0) && (!Robot.lift.isLiftAtBottom())) {
    		Robot.lift.runLift(Robot.oi.getLiftJoystick());
    		Timer.delay(0.005);
    	} else if((Robot.oi.getLiftJoystick().getY() > 0) && (!Robot.lift.isLiftAtTop())) {
    		Robot.lift.runLift(Robot.oi.getLiftJoystick());
    		Timer.delay(0.005);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.lift.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
