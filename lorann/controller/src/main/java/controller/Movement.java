package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class movement {
	private int aPersoWidth;
	private int aPersoHeight;
	private int aPersoX;
	private int aPersoY;
	private String Position;
	private int i;
	protected Object left;
	public movement(){
		
		aPersoX = this.getX();
        aPersoY = this.getY();
        aPersoX = 30;
        aPersoY = 300;
        aPersoWidth=20;
        aPersoHeight=32;
        Position = "Stand";
        
        this.addKeyListener(new KeyListener()
        {
		public void keyPressed(KeyEvent e) {


              int keyCode = e.getKeyCode();
              switch( keyCode ) {
              case KeyEvent.VK_UP:
                        
            	       aPersoY = aPersoY +3;
                       
                    
                    
                       break;
                   case KeyEvent.VK_DOWN:
                        
                          
                	   aPersoY = aPersoY -3;
                         
                         
                       break;
                   case KeyEvent.VK_LEFT:
                          
                         aPersoX = aPersoX -3;
                         
                        
                         
                         
                       break;
                   case KeyEvent.VK_RIGHT :
                          
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
