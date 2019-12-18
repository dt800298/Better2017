public class Shooter{
    public static Shooter instance;
    public static Shooter getInstance() {
		if(instance == null) instance = new Shooter();
		return instance;
	}
}