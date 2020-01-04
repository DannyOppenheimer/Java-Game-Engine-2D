package game;

import java.awt.Graphics2D;

public class MyScreen extends Screen {
	/* example keypress scenario to move a box
	 * 
	private int x = 0, y = 0;
	private int squareThickness = 64;
	
	*/
	
	public MyScreen(ScreenFactory screenFactory) {
		super(screenFactory);
	}

	@Override
	public void onCreate() {
		System.out.println("Creating MyScreen...");
		
	}

	@Override
	public void onUpdate() {
		/* example keypress scenario to move a box
		 

		if(this.getScreenFactory().getGame().getKeyboardListener().isKeyPressed(KeyEvent.VK_A)) {
			x -= 2;
		}
		if(this.getScreenFactory().getGame().getKeyboardListener().isKeyPressed(KeyEvent.VK_D)) {
			x += 2;
		}
		
		if(this.getScreenFactory().getGame().getKeyboardListener().isKeyPressed(KeyEvent.VK_W)) {
			y -= 2;
		}
		
		if(this.getScreenFactory().getGame().getKeyboardListener().isKeyPressed(KeyEvent.VK_S)) {
			y += 2;
		}
		
		if(x >= 800 - squareThickness) {
			x = 800 - squareThickness;
		}
		if(x <= 0) {
			x = 0;
		}
		
		if(y >= 580 - squareThickness) {
			y = 580 - squareThickness;
		}
		if(y <= 0) {
			y = 0;
		}
		
		
		*/
	}

	@Override
	public void onDraw(Graphics2D g2d) {
		/* example keypress scenario to move a box
		
		g2d.setColor(Color.black);
		g2d.fillRect(x, y, squareThickness, squareThickness);
		
		*/
		
	}

}
