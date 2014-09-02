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
public class Compress extends CommandBase{
   
   
    public Compress(){
        requires(compressor);
    }
    protected void initialize() {
    }

    protected void execute() {
        compressor.compress();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
