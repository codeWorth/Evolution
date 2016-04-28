package Evolution;
public class DoubleGene extends Gene<Double>{
	private double val = 0;
	private double max = 1;
	private double min = 0;
	private double average = 0.5;

	public static double maxMutate = 0.5;

	public DoubleGene(double _val, double _min, double _max){
		val = _val;
		max = _max;
		min = _min;
		average = (min+max)/2;
	}
	
	public DoubleGene(double _min, double _max){
		max = _max;
		min = _min;
		average = (min+max)/2;
		
		val = HelperRandom.randDouble(_min, _max);
	}

	public DoubleGene clone(){
		return new DoubleGene(val, min, max);
	}

	public void mutate(double amount){ //higher amount means mutate more
		double newVal = val + (HelperRandom.randDouble(min, max) - average)*amount*maxMutate;
		
		val = newVal;
	}

	public Double getVal(){
		return val;
	}
}