package com.ammstudios.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.ammstudios.main.Game;

public class Player extends Entity{
	
	public boolean right, left, up, down;
	public double speed = 1.2;
	public int right_dir = 0, left_dir = 1;
	public int dir = right_dir;
	private int frames = 0, maxFrames = 5, index = 0, maxIndex = 3;
	public boolean moved = false;
	private BufferedImage[] rightPlayer;
	private BufferedImage[] leftPlayer;
	

	public Player(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);
		rightPlayer = new BufferedImage[4];
		leftPlayer = new BufferedImage[4];
		
		for(int i = 0; i<4; i++) {
			rightPlayer[i] = Game.spritesheet.getSprite(32 + (i*16), 0, 16, 16);
		}
		
		for(int i = 0; i<4; i++) {
			leftPlayer[i] = Game.spritesheet.getSprite(32 + (i*16), 16, 16, 16);
		}
	}
	
	@Override 
	public void tick() {
		moved = false;
		if(right) {
			moved = true;
			this.dir = this.right_dir;
			this.setX(this.getX() + speed);
		}
		else if(left) {
			moved = true;
			this.dir = this.left_dir;
			this.setX(this.getX() - speed);
		}
		if(up) {
			moved = true;
			this.setY(this.getY() - speed);
		}
		else if(down) {
			moved = true;
			this.setY(this.getY() + speed);
		}
		
		if(moved) {
			frames++;
			if(frames == maxFrames) {
				frames = 0;
				index++;
				if(index > maxIndex) {
					index = 0;
				}
			}
		}
	}
	
	@Override
	public void render(Graphics g) {
		if(dir == right_dir) {
			g.drawImage(rightPlayer[index],(int) this.getX(),(int) this.getY(),this.width,this.height, null);
		}else if(dir == left_dir) {
			g.drawImage(leftPlayer[index],(int) this.getX(),(int) this.getY(),this.width,this.height, null);
		}
	}

}
