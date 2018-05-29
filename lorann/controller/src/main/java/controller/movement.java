package model.movement;

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
           private Object right;
		public void keyPressed(KeyEvent e) {


              int keyCode = e.getKeyCode();
              switch( keyCode ) {
              case KeyEvent.VK_SPACE:
                        
                       aPersoWidth =20;
                       aPersoHeight =32;
                       Position = "Saut";
                    
                    
                       break;
                   case KeyEvent.VK_DOWN:
                        
                          
                         aPersoWidth =32;
                         aPersoHeight =16;
                         Position = "Crawl";
                         
                       break;
                   case KeyEvent.VK_LEFT:
                          
                         aPersoX = aPersoX -3;
                         aPersoWidth =20;
                         aPersoHeight =32;
                         Position = "Gauche";
                         Object Imagelink = left;
                         
                       break;
                   case KeyEvent.VK_RIGHT :
                          
                         aPersoX = aPersoX +3;
                         aPersoWidth =20;
                         aPersoHeight =32;
                         Position = "Droite";
                         Imagelink = right;
                         
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
		// TODO Auto-generated method stub
		return 0;
	}
	private int getX() {
		// TODO Auto-generated method stub
		return 0;
	}
}
