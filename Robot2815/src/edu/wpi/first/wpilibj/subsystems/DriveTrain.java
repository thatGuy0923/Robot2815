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
public class DriveTrain extends Subsystem {
    private Jaguar leftMotor[] = 
    {new Jaguar(RobotMap.leftMotor[0]), new Jaguar(RobotMap.leftMotor[1])};
    private Jaguar rightMotor[] = 
    {new Jaguar(RobotMap.rightMotor[0]), new Jaguar(RobotMap.rightMotor[1])};
    private double rTarget;
    private double lTarget;
    private double leftSpeed;
    private double rightSpeed;
    private final double ACCELERATION = .1;
    protected void initDefaultCommand() {
        
    }
    public void drive(double leftSpeed, double rightSpeed){
        for(int i = 0; i<leftMotor.length; i++) leftMotor[i].set(leftSpeed);// fix for 
        for(int i = 0; i<rightMotor.length; i++) rightMotor[i].set(rightSpeed);
       
    }
    public void arcadeDrive(double xAxis, double yAxis){
        lTarget = yAxis * Math.abs(yAxis) + xAxis * Math.abs(xAxis) * xAxis;
        rTarget = yAxis * Math.abs(yAxis) - xAxis * Math.abs(xAxis) * xAxis;
        if(leftSpeed != lTarget){
            if(leftSpeed < lTarget){
                leftSpeed += ACCELERATION;
                if(leftSpeed > lTarget){
                    leftSpeed = lTarget;
                }
            }
            else{
                 leftSpeed -= ACCELERATION;
                 if(leftSpeed<lTarget){
                      leftSpeed = lTarget;
                 }
            }
            
        }
        if (rightSpeed != rTarget) {
            if (rightSpeed < rTarget) {
                rightSpeed += ACCELERATION;
                if (rightSpeed > rTarget) {
                    rightSpeed = rTarget;
                }
            } 
            else {
                rightSpeed -= ACCELERATION;
                if (rightSpeed < rTarget) {
                    rightSpeed = rTarget;
                }
            }
            
        }
        if(rightSpeed != 0){
            rightSpeed += .03;
        }
       this.drive(leftSpeed, rightSpeed);
            
    
}
    
}
