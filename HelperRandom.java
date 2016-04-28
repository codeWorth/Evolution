package Evolution;
import java.util.Random;

public class HelperRandom {
	public static Random r = new Random();

	public static double randDouble(double min, double max){
		double rand = r.nextDouble();
		return min + (max - min) * rand;
	}
}