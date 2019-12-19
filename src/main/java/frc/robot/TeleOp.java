package frc.robot;

public class TeleOp{
	public static TeleOp instance;
    public static TeleOp getInstance() {
			if(instance == null) instance = new TeleOp();
			return instance;
		
	}
	public static void run(){
		
	}
}
