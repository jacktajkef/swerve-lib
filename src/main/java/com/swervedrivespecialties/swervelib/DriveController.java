package com.swervedrivespecialties.swervelib;

import com.ctre.phoenix6.hardware.TalonFX;

public interface DriveController {
    TalonFX getDriveMotor();

    void setReferenceVoltage(double voltage);

    double getStateVelocity();

    double getStateDistance();
}
