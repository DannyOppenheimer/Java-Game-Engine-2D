package engine;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class GameThread extends JPanel implements Runnable {
	
	private static final long serialVersionUID = -8582387668005880599L;
	
	private final int ms;
	
	private final Game game;
	
	public GameThread(Game game, int ms) {
		
		this.game = game;
		setFocusable(true);
		this.ms = ms;
		
	}
	
	@Override
	public void run() {
		tick();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		if(game.getScreenFactory().getCurrentScreen() != null) {
			game.getScreenFactory().getCurrentScreen().onDraw(g2d);
		}
			
		repaint();
	}
	
	public void tick() {
		
		ActionListener event = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(game.getScreenFactory().getCurrentScreen() != null) {
					game.getScreenFactory().getCurrentScreen().onUpdate();
				}
					
					
			}
		};
		
	    SwingUtilities.invokeLater(new Runnable() {
	        @Override
	        public void run() {
	    		Timer stopWatch = new Timer(ms, event);
	    		stopWatch.setDelay(ms);
	    		stopWatch.start();
	        }
	    });
		
	}
}
