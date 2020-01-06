package engine;

import java.awt.Graphics2D;

public abstract class Screen {
	
	private final ScreenManager screenManager;
	
	public Screen(ScreenManager screenFactory) {
		
		this.screenManager = screenFactory;
		
	}
	
	public abstract void onCreate();
	
	public abstract void onUpdate();
	
	public abstract void onDraw(Graphics2D g2d);
	
	public ScreenManager getScreenFactory() {
		
		return screenManager;
		
	}
}
