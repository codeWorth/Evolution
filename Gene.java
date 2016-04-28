package Evolution;
public abstract class Gene<E> {
	public abstract Gene<E> clone();
	public abstract void mutate(double amount); //amount from 0 to 1
	public abstract E getVal();
}