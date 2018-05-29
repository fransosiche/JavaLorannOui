package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.mobil.Lorann;

public class Movement extends Lorann{
	private int aPersoWidth;
	private int aPersoHeight;
	private int aPersoX;
	private int aPersoY;
	protected Object left;
	public Movement(){
		super();
		aPersoX = this.getX();
        aPersoY = this.getY();
        aPersoX = 30;
        aPersoY = 300;
        aPersoWidth=20;
        aPersoHeight=32;
        
        this.addKeyListener(new KeyListener()
        {
		public void keyPressed(KeyEvent e) {


              int keyCode = e.getKeyCode();
              switch( keyCode ) {
              		case KeyEvent.VK_UP:
                        moveUp();
            	       aPersoY = aPersoY +3;
                       
                        
                       break;
                   case KeyEvent.VK_DOWN:
                       moveBack();
                          
                	   aPersoY = aPersoY -3;
                         
                         
                       break;
                   case KeyEvent.VK_LEFT:
                          
                         aPersoX = aPersoX -3;
                          moveLeft();
                        
                         
                       break;
                   case KeyEvent.VK_RIGHT :
                          moveRight();
                         aPersoX = aPersoX +3;
                         
                         
                         break;
                  
                  
                }
                
           }

           

		



		public void keyReleased(KeyEvent e) {}
           public void keyTyped(KeyEvent e) {}
            
        
        });
	}
	
	private void addKeyListener(KeyListener keyListener) {
		// TODO Auto-generated method stub
		
	}

	private int getY() {
		// 
		return aPersoY;
	}
	private int getX() {
		// TODO Auto-generated method stub
		return aPersoX;
	}
}
