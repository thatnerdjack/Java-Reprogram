package org.usfirst.frc.team4169.robot.commands;

import org.usfirst.frc.team4169.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftDownWithJoystick extends Command {

    public LiftDownWithJoystick() {
    	requires(Robot.lift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.lift.liftDown();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return Robot.lift.isLiftAtBottom();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.lift.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
