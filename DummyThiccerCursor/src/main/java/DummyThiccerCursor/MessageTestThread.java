package DummyThiccerCursor;

public class MessageTestThread extends Thread {

	public void run() {
		while (true) {
			MessageStream.addToStream("hello");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
}
