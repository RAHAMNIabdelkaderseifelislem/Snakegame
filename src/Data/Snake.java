package Data;


import java.awt.EventQueue;
import javax.swing.JFrame;

public class Snake extends JFrame {

	int delay;
	
    public Snake(int delay) {
        
    	this.delay=delay;
        
    	initUI();
    }
    
    private void initUI() {
        
        add(new Board(delay));
               
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
