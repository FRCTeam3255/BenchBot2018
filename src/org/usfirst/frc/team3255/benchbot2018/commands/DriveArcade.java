package org.usfirst.frc.team3255.benchbot2018.commands;

import org.usfirst.frc.team3255.benchbot2018.Robot;
import org.usfirst.frc.team3255.benchbot2018.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveArcade extends Command {

    public DriveArcade() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double movespeed = Robot.oi.driverStick.getRawAxis(RobotMap.AXIS_DRIVER_MOVE);
    	double rotatespeed = Robot.oi.driverStick.getRawAxis(RobotMap.AXIS_DRIVER_ROTATE);
    	Robot.drivetrain.arcadeDrive(movespeed, rotatespeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.arcadeDrive(0.0, 0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
