package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import model.Permeability;
import model.mobil.Lorann;

public class Movement extends Lorann{
	protected Object left;
	private int y;
	private int x;
	private Boolean alive = true;
	 Movement(final char sprite, final Road road, final Permeability permeability) {
        super();
        this.setRoad(road);
    }
	Movement(final int x, final int y, final char sprite, final Imap road, final Permeability permeability) {
        this(sprite, road, permeability);
        this.setX(x);
        this.setY(y);
    }
	
	
	
	private void setY(int y2) {
		// TODO Auto-generated method stub
		
	}
	private void setX(int x2) {
		// TODO Auto-generated method stub
		
	}
	public Movement() throws IOException{
		super();
		
        this.addKeyListener(new KeyListener()
        {
		private int x;
		private int y;
		public void keyPressed(KeyEvent e) {


              int keyCode = e.getKeyCode();
              switch( keyCode ) {
              		case KeyEvent.VK_UP:
                        moveUp();
                        this.setY(this.getY() + 1);
                       
                        
                       break;
                   case KeyEvent.VK_DOWN:
                       moveBack();
                          
                       this.setY(this.getY() - 1);
                         
                         
                       break;
                   case KeyEvent.VK_LEFT:
                          
                	   this.setX(this.getX() - 1);
                          moveLeft();
                        
                         
                       break;
                   case KeyEvent.VK_RIGHT :
                          moveRight();
                          this.setX(this.getX() + 1);
                         
                         
                         break;
                  
                  
                }
                
           }

  

		private void setY(int y) {
			// TODO Auto-generated method stub
			this.y = y;
		}



		private int getY() {
			// TODO Auto-generated method stub
			return this.y;
		}




		private void setX(int x) {
			// TODO Auto-generated method stub
			this.x = x;
	        
	    }
		
		private int getX() {
			// TODO Auto-generated method stub
			return this.x;
		}




		public void keyReleased(KeyEvent e) {}
           public void keyTyped(KeyEvent e) {}
            
        
        });
	}
	
	private void addKeyListener(KeyListener keyListener) {
		// TODO Auto-generated method stub
		
	}

	
}
