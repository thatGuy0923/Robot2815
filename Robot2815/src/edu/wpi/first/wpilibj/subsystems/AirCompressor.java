/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author stefan.singer
 */
public class AirCompressor extends Subsystem {

    private Compressor air;

    public AirCompressor() {
        air = new Compressor(RobotMap.compressor[0], RobotMap.compressor[1]);
        air.start();
    }

    public void compress() {
        if (!air.getPressureSwitchValue()) {
            air.setRelayValue(Relay.Value.kOn);
        } else {
            air.setRelayValue(Relay.Value.kOff);
        }

    }

    public boolean getPressureVale() {
        return air.getPressureSwitchValue();
    }

    protected void initDefaultCommand() {
    }
}
