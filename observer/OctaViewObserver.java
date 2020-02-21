/**
 * 
 */
package pattern.behavioral.observer;

public class OctaViewObserver extends Observer {

	public OctaViewObserver(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Subject's State in OctaDecimal:"+Integer.toOctalString(this.subject.getState()));

	}

}
