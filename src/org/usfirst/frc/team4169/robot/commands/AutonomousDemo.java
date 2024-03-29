package org.usfirst.frc.team4169.robot.commands;

import org.usfirst.frc.team4169.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonomousDemo extends Command {

	private boolean isDone = false;
	
    public AutonomousDemo() {
    	requires(Robot.driveTrain);
    	requires(Robot.lift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.mechDrive(0, -0.6, 0);
    	Timer.delay(3);
    	Robot.driveTrain.mechDrive(0, -0.6, 0);
    	Timer.delay(3);
    	Robot.driveTrain.stopDrive();
    	Robot.lift.liftUp();
    	Timer.delay(1);
    	Robot.lift.stop();
    	isDone = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isDone;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
