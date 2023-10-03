package com.ammstudios.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Entity {
	
	protected double x;
	protected double y;
	protected int width;
	protected int height;
	
	private BufferedImage sprite;
	
	public Entity(double x, double y, int width, int height, BufferedImage sprite) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.sprite = sprite;
	}

	public double getX() {
		return  x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return  y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void tick() {
		
	}

	public void render(Graphics g) {
		g.drawImage(sprite, (int) this.getX(), (int) this.getY(), null);
	}
	
}
