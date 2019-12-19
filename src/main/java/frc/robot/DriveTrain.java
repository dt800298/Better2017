package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class DriveTrain{
  public static DriveTrain instance;

  public static TalonSRX leftFront;
  public static TalonSRX leftBack;
  public static TalonSRX rightFront;
  public static TalonSRX rightBack; 
  public static DriveTrain getInstance() {
		if(instance == null) instance = new DriveTrain();
		return instance;
		
	}

	public DriveTrain() {
			leftFront = new TalonSRX(Constants.DT_TALONID_LEFTFRONT);
			leftBack = new TalonSRX(Constants.DT_TALONID_LEFTBACK);
			rightBack = new TalonSRX(Constants.DT_TALONID_RIGHTBACK);
			rightFront = new TalonSRX(Constants.DT_TALONID_RIGHTFRONT);

	}
	public static void drive(double leftPower, double rightPower) {
		rightFront.set(ControlMode.PercentOutput, -rightPower);
		rightBack.set(ControlMode.PercentOutput, -rightPower);
		leftFront.set(ControlMode.PercentOutput, leftPower);
		leftBack.set(ControlMode.PercentOutput, leftPower);	
	}
	public static void stop() {
		drive(0, 0);
	}
	public static void arcadeDrice(double fwd, double tur) {
		if (Math.abs(tur) < .01)
			tur = 0;
		if (Math.abs(fwd) < .2)
			fwd = 0;
		drive(Utils.ensureRange(fwd + tur, -1d, 1d), Utils.ensureRange(fwd - tur, -1d, 1d));
	}
}