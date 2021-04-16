package DummyThiccerCursor;



public class Driver {

	public static void main(String args[]) {
		//Thread messageStream = new Thread(new MessageStream());
		Thread twitchMessageReciever = new Thread(new TwitchMessageReciever());
		Thread hackerThread = new Thread(new HackerThread(args[0]));
		
		//messageStream.start();
		twitchMessageReciever.start();
		hackerThread.start();
		
		
		//Thread testThread = new Thread(new MessageTestThread());
		//testThread.start();
		
		MessageStream.run();
	}
}
