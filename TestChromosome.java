package Evolution;
public class TestChromosome extends Chromosome<DoubleGene> {
	private double p = 0;
	private double i = 0;
	private double d = 0;
	private double f = 0;
	
	public TestChromosome(double _p, double _i, double _d, double _f){
		genes.add(new DoubleGene(_p, 0, 1));
		p = _p;
		
		genes.add(new DoubleGene(_i, 0, 1));
		i = _i;
		
		genes.add(new DoubleGene(_d, 0, 1));
		d = _d;
		
		genes.add(new DoubleGene(_f, 0, 1));
		f = _f;
		
		wantedFitness = 1;
	}
	
	public TestChromosome(){		
		genes.add(new DoubleGene(0, 1));
		genes.add(new DoubleGene(0, 1));
		genes.add(new DoubleGene(0, 1));
		genes.add(new DoubleGene(0, 1));
		setVals();
		
		wantedFitness = 1;
	}
	
	@Override
	protected void setVals(){
		p = (double) genes.get(0).getVal();
		i = (double) genes.get(1).getVal();
		d = (double) genes.get(2).getVal();
		f = (double) genes.get(3).getVal();
	}

	@Override
	public double getRawFitness(){
		return (p*2+i+d/2+f/4)/3.75;
	}

	@Override
	public TestChromosome clone() {
		return new TestChromosome(p, i, d, f);
	}
	
	@Override
	public String print(){
		return "P: "+p+", I: "+i+", P: "+d+", F: "+f;
	}
	
	@Override
	public TestChromosome random(){
		return new TestChromosome();
	}
}