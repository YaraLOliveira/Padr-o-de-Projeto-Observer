package pattern.behavioral.observer;

public class HexaViewObserver extends Observer {

	public HexaViewObserver(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Subject's State in HexaDecimal:" + Integer.toHexString(this.subject.getState()));

	}

}
