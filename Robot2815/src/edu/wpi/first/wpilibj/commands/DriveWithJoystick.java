/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.commands;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author stefan.singer
 */
public class DriveWithJoystick extends CommandBase{
    
 
    public DriveWithJoystick(){   
        requires(drivetrain); 
    }

    protected void initialize() {
       
       
    }

    protected void execute() {
        drivetrain.arcadeDrive(oi.leftSpeed(), oi.rightSpeed());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
