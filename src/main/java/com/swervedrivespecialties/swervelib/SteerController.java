package com.swervedrivespecialties.swervelib;

import com.ctre.phoenix6.hardware.TalonFX;

public interface SteerController {
    TalonFX getSteerMotor();

    AbsoluteEncoder getSteerEncoder();

    double getReferenceAngle();

    void setReferenceAngle(double referenceAngleRadians);

    double getStateAngle();

    void resetToAbsolute();
}
