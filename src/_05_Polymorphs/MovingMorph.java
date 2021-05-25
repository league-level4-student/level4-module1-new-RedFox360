package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {
	private int boundWidth;
	private boolean right;
	MovingMorph(int x, int y, int width, int height, int boundWidth) {
		super(x, y, width, height);
		this.boundWidth = boundWidth;
		right = true;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, getWidth(), getHeight());
	}

    @Override
    public void update() {
    	if (x >= boundWidth) {
    		right = false;
    	} 
    	if (x < 0){
    		right = true;
    	}
    	
    	if (right) {
    		x += 3;
    	} else {
    		x -= 3;
    	}
    }
}
