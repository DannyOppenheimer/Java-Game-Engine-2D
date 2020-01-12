package engine;

import java.awt.Graphics2D;

public abstract class Screen {
	
	private final ScreenManager screenManager;
	
	public Screen(ScreenManager screenManager) {
		
		this.screenManager = screenManager;
		
	}
	
	public abstract void onCreate();
	
	public abstract void onUpdate();
	
	public abstract void onDraw(Graphics2D g2d);
	
	public ScreenManager getScreenManager() {
		
		return screenManager;
		
	}
}
