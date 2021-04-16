package DummyThiccerCursor;

public class HackerThread extends Thread {

	private String line = "";
	private String name;
	
	public HackerThread(String name) {
		this.name = name;
	}
	
	
	private void pog() {
		System.out.println("Starting...");
		while (true) {
			int process = (int)Math.floor(Math.random() * 4);
			//int process = 3;
			switch (process) {
				case 0:
					peepeeSecurer();
					break;
				case 1:
					hackerSpeak();
					break;
				case 2:
					arpTable();
					break;
				case 3:
					treeMaker();
					break;
				default:
					println("Hacking in progress...");
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
	
	private void peepeeSecurer() {
		int progress = 0;
		println("Securing PP@" + name + "...");
		try {
			Thread.sleep(500);
			println("\tFinding PP...");
			Thread.sleep(500);
			println("\tPP Found...");
			Thread.sleep(500);
			println("\tSecuring...");
		} catch (Exception e) {
			println("no");
		}
		
		while (progress <= 100) {
			int j = (int) Math.floor(Math.random() * 10) + 1;
			for (int i = 0; i < j; i++) {
				println("PP secured: " + progress + "%");
				try {
					Thread.sleep(5);
				} catch (Exception e) {
				}
			}
			progress += 2;
		}
		
		println("PP@" + name + " secured sucessfully!");
	}
	
	private void hackerSpeak() {
		String[] words = {"int", "String", "for", "array", "matrix", "recurse", name, "proxy", "1", 
				"2", "3", "4", "5", "6", "7", "8", "9", "0", "disk-read", "encrypting", "decryptor", 
				"library", "hack.py", "ip", name, "MAC", "wap", "arp table", "69", "420", "1.43.9.10.29",
				"ssl", "firewall", "https", "dns", "ssh", "ftp", "sql", "database", "breach",
				"yygb", "pekd", "iasdk", "omddr", "RAM", "mRNA", "RSA", "hash", "MD5", "blowfish",
				"RTP", "aes", name};
		
		for (int o = 0; o < (int) Math.floor(Math.random() * 3) + 5; o++) {
			int length = (int) Math.floor(Math.random() * 5) + 5;
			
			for (int i = 0; i < length; i++) {
				print(words[(int)Math.floor(Math.random() * words.length)] + " ");
			}
			println("");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
		
	}
	
	
	private void arpTable() {
		println("Scanning Network: 72.109.18.69#" + name);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		
		String[] types = {"dynamic", "static"};
		String[] macPieces = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"a", "b", "c", "d", "e", "f"};
		
		println("IP Address\tPhysical Address\tType");
		for (int i = 0; i < (int)Math.floor(Math.random() * 200) + 1; i++) {
			print((int)Math.floor(Math.random() * 256) + "." + 
					(int)Math.floor(Math.random() * 256) + "." + 
					(int)Math.floor(Math.random() * 256) + "." + 
					(int)Math.floor(Math.random() * 256));
			print("\t");
			
			
			print(macPieces[(int)Math.floor(Math.random() * 16)] +
					macPieces[(int)Math.floor(Math.random() * 16)]);
			for (int o = 0; o < 5; o++) {
				print("-" + macPieces[(int)Math.floor(Math.random() * 16)] +
						macPieces[(int)Math.floor(Math.random() * 16)]);
			}
			print("\t");
			
			println(types[(int)Math.floor(Math.random() * 2)]);
			try {
				Thread.sleep(40);
			} catch (Exception e) {
			}
		}
	}
	
	
	private void treeMaker() {
		int x = 0; int y1 = 0; int y2 = 0; String cLine = "|";
		
		print(fileNameGen() + "\n");
		
		tree1(x, y1, y2, cLine);
		
		print("|-" + fileNameGen());
		
		println("");
	}
	private void tree1(int x, int y1, int y2, String cLine) {
		//handles y1
		int y1chance = 100 - 50 * y1;
		if (y1chance < 1) y1chance = 1;
		
		tree2(x, y1, y2, cLine);
		
		if ((Math.random() * 100) <= y1chance) {
			print(cLine + "-" + fileNameGen() + "\n");
			cLine += " |";
			y1++;
			tree1(x, y1 + 1, y2, cLine);
		}
		print(cLine + "-" + fileNameGen() + "\n");
	}
	private void tree2(int x, int y1, int y2, String cLine) {
		//handles x
		int xchance = 100 - 20 * x;
		if (xchance < 1) xchance = 1;
		
		tree3(x, y1, y2, cLine);
		
		if ((Math.random() * 100) <= xchance) {
			//print(cLine + "-" + fileNameGen() + "\n");
			cLine += " |";
			x++;
			tree2(x + 1, y1, y2, cLine);
		}
		print(cLine + "-" + fileNameGen() + "\n");
	}
	private void tree3(int x, int y1, int y2, String cLine) {
		//handles y2
		int y2chance = 100 - 10 * y2;
		if (y2chance < 1) y2chance = 1;
		
		
		if ((Math.random() * 100) <= y2chance) {
			print(cLine + "-" + fileNameGen() + "\n");
			cLine += " |";
			y2++;
			tree3(x, y1, y2 + 1, cLine);
		}
		print(cLine + "-" + fileNameGen() + "\n");
	}
	
	private String fileNameGen() {
		String fn = "";
		
		String[] letters = ("A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,"
				+ "S,T,U,V,W,X,Y,Z,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,"
				+ "p,q,r,s,t,u,v,w,x,y,z,1,2,3,4,5,6,7,8,9,0," + name).split(",");
		
		int len = (int) Math.floor(Math.random() * 5) + 2;
		
		for (int i = 0; i < len; i++) {
			fn += letters[(int) Math.floor(Math.random() * letters.length)];
		}
		
		return fn;
	}
	
	
	private void print(String s) {
		line += s;
	}
	
	private void println(String s) {
		MessageStream.addToStream(line + s);
		line = "";
	}
	
	
	
	public void run() {
		pog();
	}
}
