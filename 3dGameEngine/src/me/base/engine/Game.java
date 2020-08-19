package me.base.engine;

import org.lwjgl.input.Keyboard;

public class Game {
	public Game() {
		
	}
	
	public void input() 
	{
		if(Input.getKeyDown(Keyboard.KEY_UP))
			System.out.println("Pressed up");
		
		if(Input.getKeyUp(Keyboard.KEY_UP))
			System.out.println("Released up");
		
		if(Input.getMouseDown(1))
			System.out.println("Pressed mouse");
		
		if(Input.getMouseUp(1))
			System.out.println("Released mouse");
	}
	
	public void update() 
	{
		
	}
	
	public void render() 
	{
		
	}
}
