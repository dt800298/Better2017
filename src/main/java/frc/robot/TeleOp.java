package frc.robot;

public class TeleOp{
	public static TeleOp instance;


	public static XBoxController driver;
	public static XBoxController manip;

    public static TeleOp getInstance() {
			if(instance == null) instance = new TeleOp();
			return instance;
		
	}
	public static void run(){

		//controls here
		if(manip.getLeftTriggerButton()){
			Shooter.shoot(0);
		}

	}
}
