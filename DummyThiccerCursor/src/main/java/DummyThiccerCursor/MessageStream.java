package DummyThiccerCursor;

import java.util.ArrayList;

public class MessageStream {

	public static ArrayList<String> stream = new ArrayList<String>();
	
	public MessageStream() {
	}
	
	public static void addToStream(String s) {
		stream.add(s);
	}
	
	
	public static void run() {
		while (true) {
			if (stream.size() > 0) {
				System.out.println(stream.get(0));
				stream.remove(0);
			} else {
				try {
					Thread.sleep(10);
				} catch (Exception e) {
				}
			}
		}
	}
}
