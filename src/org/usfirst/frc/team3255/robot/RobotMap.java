/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3255.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	//Talons
	public static final int DRIVETRAIN_LEFT_FRONT_TALON = 0;
	public static final int DRIVETRAIN_RIGHT_FRONT_TALON = 1;
	public static final int DRIVETRAIN_LEFT_BACK_TALON = 2;
	public static final int DRIVETRAIN_RIGHT_BACK_TALON = 3;
	
	//Joysticks
	public static final int JOYSTICK_DRIVER = 0;
	
	//Axes
	public static final int AXIS_DRIVER_MOVE = 0;
	public static final int AXIS_DRIVER_ROTATE = 1;
}
