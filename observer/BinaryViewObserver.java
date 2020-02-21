package pattern.behavioral.observer;

public class BinaryViewObserver extends Observer {

	public BinaryViewObserver(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Subject's State in Binary:" + Integer.toBinaryString(this.subject.getState()));

	}

}
