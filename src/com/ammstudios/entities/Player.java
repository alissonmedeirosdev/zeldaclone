package com.ammstudios.entities;

import java.awt.image.BufferedImage;

public class Player extends Entity{
	
	public boolean right, left, up, down;
	public int speed = 2;

	public Player(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);
	}
	
	@Override 
	public void tick() {
		if(right) {
			this.setX(this.getX() + speed);
		}
		else if(left)
			this.setX(this.getX() - speed);
		
		if(up) 
			this.setY(this.getY() - speed);
		else if(down)
			this.setY(this.getY() + speed);
	}

}
