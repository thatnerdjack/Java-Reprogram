package org.usfirst.frc.team4169.robot.commands;

import org.usfirst.frc.team4169.robot.Robot;
import org.usfirst.frc.team4169.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TestAutonomous extends Command {
	
    public TestAutonomous() {
    	requires(Robot.driveTrain);
    	requires(Robot.lift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.mechDrive(0.5, 0, 0);
    	Timer.delay(0.3);
    	Robot.driveTrain.mechDrive(0, 0.5, 0);
    	Timer.delay(0.5);
    	Robot.driveTrain.mechDrive(-0.5, 0, 0);
    	Timer.delay(0.3);
    	Robot.driveTrain.mechDrive(0, -0.5, 0);
    	Timer.delay(0.5);
    	Robot.driveTrain.stopDrive();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
