/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.subsystems;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 * @author stefan.singer
 */
public class drivetrain extends Subsystem {
    Jaguar leftMotor[] = 
    {new Jaguar(RobotMap.leftMotor[0]), new Jaguar(RobotMap.leftMotor[1])};
    Jaguar rightMotor[] = 
    {new Jaguar(RobotMap.rightMotor[0]), new Jaguar(RobotMap.rightMotor[1])};
    protected void initDefaultCommand() {
        
    }
    public void drive(double leftSpeed, double rightSpeed){
        for(int i = 0; i<leftMotor.length; i++) leftMotor[i].set(leftSpeed);// fix for 
        for(int i = 0; i<rightMotor.length; i++) rightMotor[i].set(rightSpeed);
       
    }
    
}
