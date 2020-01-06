package engine;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Game {
	
	private final JFrame window = new JFrame();
	private final ScreenManager screenManager;
	private final GameThread gameThread;
	private final KeyboardListener keyboardListener;
	private final MousepadListener mousepadListener;
	
	public Game(int windowX, int windowY, String windowTitle, int ms) {
		
		// ensures cross-platform usage is correct
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		window.setSize(windowX, windowY);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setFocusable(true);
		window.setLocationRelativeTo(null);
		window.setTitle(windowTitle);
		
		screenManager = new ScreenManager(this);
		
		gameThread = new GameThread(this, ms);
		
		keyboardListener = new KeyboardListener();
		
		mousepadListener = new MousepadListener();
		
		window.add(gameThread);
		window.addKeyListener(keyboardListener);
		window.addMouseListener(mousepadListener);
		
		new Thread(gameThread).start();
		
		window.setVisible(true);
		
	}
	
	public KeyboardListener getKeyboardListener() {
		return keyboardListener;
	}
	
	public MousepadListener getMousepadListener() {
		return mousepadListener;
	}
	
	public ScreenManager getScreenFactory() {
		return screenManager;
	}
	
	public JFrame getWindow() {
		return window;
	}
}
