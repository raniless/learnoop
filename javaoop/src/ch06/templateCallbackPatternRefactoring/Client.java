package ch06.templateCallbackPatternRefactoring;

public class Client {

	public static void main(String[] args) {
		Soldier rambo = new Soldier();
		
		rambo.runContext("ÃÑ! ÃÑÃÊÁ¾ÃÑ ÃÑ! ÃÑ!");
		
		System.out.println();
		
		rambo.runContext("Ä®! Ä«°¡°¥ Ä®! Ä®!");
		
		System.out.println();
		
		rambo.runContext("µµ³¢! µ¶µ¶..µµµµµ¶ µ¶³¢!");
	}

}
