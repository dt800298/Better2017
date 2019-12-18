public class DriveTrain{
    public static DriveTrain instance;
    public static DriveTrain getInstance() {
		if(instance == null) instance = new DriveTrain();
		return instance;
	}
}