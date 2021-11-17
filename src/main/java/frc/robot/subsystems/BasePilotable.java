// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class BasePilotable extends SubsystemBase {
  /** Creates a new BasePilotable. */
  private Talon moteur1;
  private Talon moteur2;
  private Talon moteur3;
  private Talon moteur4;
  private MecanumDrive m_base;

  public BasePilotable() {
    moteur1 = new Talon(Constants.UpperLeftMotor);
    moteur2 = new Talon(Constants.LowerLeftMotor);
    moteur3 = new Talon(Constants.UpperRightMotor);
    moteur4 = new Talon(Constants.LowerRightMotor);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
