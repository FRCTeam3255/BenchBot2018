package org.usfirst.frc.team3255.benchbot2018.subsystems;

import org.usfirst.frc.team3255.benchbot2018.RobotMap;
import org.usfirst.frc.team3255.benchbot2018.commands.DriveArcade;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Drivetrain extends Subsystem {
	
	private WPI_TalonSRX leftFrontTalon = null;
	private WPI_TalonSRX rightFrontTalon = null;
	private WPI_TalonSRX leftBackTalon = null;
	private WPI_TalonSRX rightBackTalon = null;
	
	private DifferentialDrive differentialDrive = null;
	
	public Drivetrain() {
		super();
		//Talons
		leftFrontTalon = new WPI_TalonSRX(RobotMap.DRIVETRAIN_LEFT_FRONT_TALON);
		rightFrontTalon = new WPI_TalonSRX(RobotMap.DRIVETRAIN_RIGHT_FRONT_TALON);
		leftBackTalon = new WPI_TalonSRX(RobotMap.DRIVETRAIN_LEFT_BACK_TALON);
		rightBackTalon = new WPI_TalonSRX(RobotMap.DRIVETRAIN_RIGHT_BACK_TALON);	
		
		leftFrontTalon.setNeutralMode(NeutralMode.Brake);
		rightFrontTalon.setNeutralMode(NeutralMode.Brake);
		leftBackTalon.setNeutralMode(NeutralMode.Brake);
		rightBackTalon.setNeutralMode(NeutralMode.Brake);
		
		leftFrontTalon.setSafetyEnabled(false);
		rightFrontTalon.setSafetyEnabled(false);
		leftBackTalon.setSafetyEnabled(false);
		rightBackTalon.setSafetyEnabled(false);
		
		leftBackTalon.follow(leftFrontTalon);
		rightBackTalon.follow(rightFrontTalon);
		
		//DifferentialDrive
		differentialDrive = new DifferentialDrive(leftFrontTalon, rightFrontTalon);
	}
	
	public void arcadeDrive (double movespeed, double rotatespeed) {
		differentialDrive.arcadeDrive(movespeed, rotatespeed);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveArcade());
    }
}

