// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6651.TestDrive.subsystems;

import org.usfirst.frc6651.TestDrive.RobotMap;
import org.usfirst.frc6651.TestDrive.commands.*;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Climber extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController speedController6 = RobotMap.climberSpeedController6;
    private final DigitalInput floorUp = RobotMap.climberFloorUp;
    private final DigitalInput floorDown = RobotMap.climberFloorDown;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public void startRaiseTable() {
    	speedController6.set(.2);
    }
    public void startLowerTable() {
    	speedController6.set(-.2);
    }
    public void stop() {
    	speedController6.set(0);
    }
    public void startDropCable() {
    	speedController6.set(-.8);
    }
    public void startClimb() {
    	speedController6.set(.8);
    }
    public void holdClimb() {
    	speedController6.set(0);
    }
    public boolean detectFloorUp() {
    	return floorUp.get();
    }
    public boolean detectFloorDown() {
    	return floorDown.get();
    }
}

