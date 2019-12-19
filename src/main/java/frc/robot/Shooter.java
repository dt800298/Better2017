package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Shooter {
    public static Shooter instance;
    public static Shooter getInstance() {
		if(instance == null) instance = new Shooter();
		return instance;
		
	}

	public static TalonSRX conva;
	public static TalonSRX elev;
	public static TalonSRX shoot1;
	public static TalonSRX shoot2;


	public Shooter(){
		conva = new TalonSRX(Constants.SHOOT_TALONID_TALONCONVA);

	}

}