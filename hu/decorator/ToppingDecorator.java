package oop_hus.hu.decorator;

public abstract class ToppingDecorator extends Bread {
	protected Bread bread;
	
	public abstract String getDescription();

	public Bread getBread() {
		return this.bread;
	}
}
