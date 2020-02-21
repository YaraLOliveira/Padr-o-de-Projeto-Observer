
package pattern.behavioral.observer;

public class ObserverDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();
		new BinaryViewObserver(subject);
		new OctaViewObserver(subject);
		new HexaViewObserver(subject);

		System.out.println("Setting Subject's state: "+10+"\n");
		subject.setState(10);
		
		System.out.println("Setting Subject's state: "+20+"\n");
		subject.setState(20);
		

	}

}
