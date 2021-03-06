package edu.wpi.first.wpilibj.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.OI;
import edu.wpi.first.wpilibj.subsystems.AirCompressor;
import edu.wpi.first.wpilibj.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj.subsystems.Pneumatics;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
    public static DriveTrain drivetrain = new DriveTrain();
    public static AirCompressor compressor = new AirCompressor();
    public static Pneumatics pneumatic = new Pneumatics();
    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();
        

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(exampleSubsystem);
        SmartDashboard.putData(drivetrain);
        SmartDashboard.putData(compressor);
        SmartDashboard.putData(pneumatic);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
