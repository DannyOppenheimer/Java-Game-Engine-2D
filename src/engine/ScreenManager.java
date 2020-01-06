package engine;

public class ScreenManager {
	
	private final Game game;
	private Screen screen;
	
	public ScreenManager(Game game) {
		this.game = game;
	}

	public void showScreen(Screen screen) {
		
		this.screen = screen;
		this.screen.onCreate();
		
	}
	
	public Screen getCurrentScreen() {
		return screen;
	}
	
	public Game getGame() {
		return game;
	}
}
