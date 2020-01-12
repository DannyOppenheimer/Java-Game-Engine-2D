package engine;

import java.awt.event.MouseEvent; 
import java.awt.event.MouseListener;

public class MousepadListener implements MouseListener {

	private int mouseX, mouseY;
	private boolean clicked;
	
	@Override
	public void mouseClicked(MouseEvent event) {
		
	}

	@Override
	public void mousePressed(MouseEvent event) {
		mouseX = event.getX();
		mouseY = event.getY();
		if (event.getButton() == MouseEvent.BUTTON1) {
		        clicked = true;
		}
		mouseClicked(event);
	}

	@Override
	public void mouseReleased(MouseEvent event) {
	    if (event.getButton() == MouseEvent.BUTTON1) {
	    	clicked = false;
	    }
	}

	@Override
	public void mouseEntered(MouseEvent event) {
		
	}

	@Override
	public void mouseExited(MouseEvent event) {
		
	}
	
	public boolean isMousePressed() {
		return clicked;
	}
	
	public int getX() {
		return mouseX;
	}

	public int getY() {
		return mouseY;
	}
	
}
