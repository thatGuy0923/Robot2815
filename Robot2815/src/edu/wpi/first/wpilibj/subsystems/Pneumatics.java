/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.subsystems;

import edu.wpi.first.wpilibj.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author stefan.singer
 */
public class Pneumatics extends Subsystem{
    private Solenoid fire[] = {new Solenoid(RobotMap.latchSolonoid[0]), new Solenoid(RobotMap.latchSolonoid[1])};
    private Solenoid pressure;
    public Pneumatics(){
       
        pressure = new Solenoid (RobotMap.pressureSolonoid);
        
    }
    
    protected void initDefaultCommand() {
    }
    public void activateFire(boolean value){
        fire[0].set(!value);
        fire[1].set(value);
    }
    public void activatePressure(boolean value){
        pressure.set(value);
    }
    
}
