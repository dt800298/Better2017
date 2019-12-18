public class TeleOp{
    public static TeleOp instance;
    public static Climber getInstance() {
		if(instance == null) instance = new TeleOp();
		return instance;
	}
}