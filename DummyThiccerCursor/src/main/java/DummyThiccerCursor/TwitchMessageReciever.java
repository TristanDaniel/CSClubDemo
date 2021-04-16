package DummyThiccerCursor;

import com.github.twitch4j.chat.TwitchChat;
import com.github.twitch4j.chat.TwitchChatBuilder;
import com.github.twitch4j.chat.events.channel.ChannelMessageEvent;

public class TwitchMessageReciever extends Thread {

	
	public void run() {
		TwitchChat chat = TwitchChatBuilder.builder().build();
		chat.joinChannel("asanosanta");
		chat.getEventManager().onEvent(ChannelMessageEvent.class, e -> {
			String message = "\n\n" + e.getUser().getName() + ": " + e.getMessage() + "\n\n";
			MessageStream.addToStream(message);
			//System.out.println(message);
		});
	}
}
