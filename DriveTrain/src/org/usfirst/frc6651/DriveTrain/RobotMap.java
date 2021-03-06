// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6651.DriveTrain;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainFrontLeft;
    public static SpeedController driveTrainBackLeft;
    public static SpeedController driveTrainFrontRight;
    public static SpeedController driveTrainRearRight;
    public static RobotDrive driveTrain4Wheel;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainFrontLeft = new Spark(1);
        LiveWindow.addActuator("DriveTrain", "Front Left", (Spark) driveTrainFrontLeft);
        
        driveTrainBackLeft = new Spark(0);
        LiveWindow.addActuator("DriveTrain", "Back Left", (Spark) driveTrainBackLeft);
        
        driveTrainFrontRight = new Spark(2);
        LiveWindow.addActuator("DriveTrain", "Front Right", (Spark) driveTrainFrontRight);
        
        driveTrainRearRight = new Spark(3);
        LiveWindow.addActuator("DriveTrain", "Rear Right", (Spark) driveTrainRearRight);
        
        driveTrain4Wheel = new RobotDrive(driveTrainFrontLeft, driveTrainBackLeft,
              driveTrainFrontRight, driveTrainRearRight);
        
        driveTrain4Wheel.setSafetyEnabled(true);
        driveTrain4Wheel.setExpiration(0.1);
        driveTrain4Wheel.setSensitivity(0.5);
        driveTrain4Wheel.setMaxOutput(1.0);


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
