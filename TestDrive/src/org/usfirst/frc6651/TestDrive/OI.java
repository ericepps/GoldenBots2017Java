// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6651.TestDrive;

import org.usfirst.frc6651.TestDrive.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc6651.TestDrive.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
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


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick joystickDrive;
    public JoystickButton a;
    public JoystickButton b;
    public JoystickButton lB;
    public JoystickButton rB;
    public JoystickButton back;
    public JoystickButton x;
    public JoystickButton y;
    public Joystick xbox;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        xbox = new Joystick(1);
        
        // Intake System
        a = new JoystickButton(xbox, 1);
        a.whileHeld(new CaptureBalls());
        
        b = new JoystickButton(xbox, 2);
        b.whenPressed(new ClearJam());
        
        //Output system
        rB = new JoystickButton(xbox, 6);
        rB.whileHeld(new ThrowOutBalls());
        
        // Table system
        x = new JoystickButton(xbox, 3);
        x.whenPressed(new LowerTable());
        
        y = new JoystickButton(xbox, 4);
        y.whileHeld(new RaiseTable());
        
        // Climbing system
        lB = new JoystickButton(xbox, 5);
        lB.whileHeld(new ClimbRope());
        
        back = new JoystickButton(xbox, 7);
        back.whileHeld(new ClearJam());
        
/*      y = new JoystickButton(xbox, 4);
        y.whileHeld(new ThrowOutBalls());
        x = new JoystickButton(xbox, 3);
        x.whileHeld(new CaptureBalls());
        back = new JoystickButton(xbox, 7);
        back.whileHeld(new ClearJam());
        rB = new JoystickButton(xbox, 6);
        rB.whileHeld(new ClimbRope());
        lB = new JoystickButton(xbox, 5);
        lB.whileHeld(new ClearJam());
        b = new JoystickButton(xbox, 2);
        b.whenPressed(new LowerTable());
        a = new JoystickButton(xbox, 1);
        a.whileHeld(new RaiseTable());*/
        
        
        joystickDrive = new Joystick(0); 
        


        // SmartDashboard Buttons
        SmartDashboard.putData("ThrowOutBalls", new ThrowOutBalls());
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("ArcadeDrive", new ArcadeDrive());
        SmartDashboard.putData("CaptureBalls", new CaptureBalls());
        SmartDashboard.putData("ClimbRope", new ClimbRope());
        SmartDashboard.putData("LowerTable", new LowerTable());
        SmartDashboard.putData("RaiseTable", new RaiseTable());
        SmartDashboard.putData("DropCable", new DropCable());
        SmartDashboard.putData("ClearJam", new ClearJam());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystickDrive() {
        return joystickDrive;
    }

    public Joystick getXbox() {
        return xbox;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

