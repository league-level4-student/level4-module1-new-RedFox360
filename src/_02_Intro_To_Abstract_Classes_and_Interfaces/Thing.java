package _02_Intro_To_Abstract_Classes_and_Interfaces;

public abstract class Thing extends AbstractClassDemo implements InterfaceDemo, DemoInterface {

	int thingStuff;
	
	public abstract double doSomething();
	
	public void printThings() {
		for ( int i = 1; i <= 100; i++) {
			System.out.println("Thing " + i);
		}
	}
}
