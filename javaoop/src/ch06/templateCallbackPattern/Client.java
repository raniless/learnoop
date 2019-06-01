package ch06.templateCallbackPattern;

public class Client {

	public static void main(String[] args) {
		Soldier rambo = new Soldier();
		
		rambo.runContext(new Strategy() {
			@Override
			public void runStrategy() {
				System.out.println("ÃÑ! ÃÑÃÊÁ¾ÃÑ ÃÑ! ÃÑ!");
			}
		});

		System.out.println();

		rambo.runContext(new Strategy() {
			@Override
			public void runStrategy() {
				System.out.println("Ä®! Ä«°¡°¥ Ä®! Ä®!");
			}
		});

		System.out.println();

		rambo.runContext(new Strategy() {
			@Override
			public void runStrategy() {
				System.out.println("µµ³¢! µ¶µ¶..µµµµµ¶ µ¶³¢!");
			}
		});
	}

}
