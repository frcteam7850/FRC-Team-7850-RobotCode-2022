// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.BallStopSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;


public class CloseBallStopCmd extends CommandBase {
  
  private final BallStopSubsystem ballStopSubsystem; //new ExampleSubsystem();
  //use private final varable_type varable_name; to make new varable wich you can grab in constructor
  
  public CloseBallStopCmd(BallStopSubsystem ballStopSubsystem) {
    this.ballStopSubsystem = ballStopSubsystem;
    //use this.varable_name = varable_name; to get varables into command 
    //also make sure to add varable_name in parameters
    //addRequirements(m_subsystem);
  }
  
  @Override
  public void initialize() {
    //put setup code here
  }
  
  @Override
  public void execute() {
    //this function called repetivly while command is running
    ballStopSubsystem.BallClose();
  }

  @Override
  public void end(boolean interrupted) {
    //last end stuff ran at end
    //bool interupted is true if command is stoped
  }
  @Override
  public boolean isFinished() {
    return false;
    //if ture will have the command finnish and let the next command run
  }
}