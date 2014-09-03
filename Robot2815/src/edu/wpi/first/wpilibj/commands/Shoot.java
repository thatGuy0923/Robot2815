/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.commands;

/**
 *
 * @author stefan.singer
 */
public class Shoot extends CommandBase {
    public Shoot(){
        requires(pneumatic);
    }
    protected void initialize() {
    }

    protected void execute() {
        
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
