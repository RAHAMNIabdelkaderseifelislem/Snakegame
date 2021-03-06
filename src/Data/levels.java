package Data;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class levels extends JFrame{

	Container content;
	int delay;
	JLabel l = new JLabel("LEVEL ?");
	JComboBox<String> lev = new JComboBox<String>();
	JButton enter = new JButton("PLAY");
	
	public levels() {
		
		this.setVisible(true);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(20, 20, 400, 200);
		
		content = this.getContentPane();
		content.setBackground(Color.black);
		
		content.add(l);
		l.setBackground(Color.black);
		l.setForeground(Color.white);
		l.setBounds(175, 10, 50, 25);
		
		content.add(lev);
		lev.setBackground(Color.black);
		lev.setForeground(Color.white);
		lev.setBounds(150, 45, 100, 35);
		lev.addItem("EASY");
		lev.addItem("NORMAL");
		lev.addItem("HARD");
		
		content.add(enter);
		enter.setBackground(Color.black);
		enter.setForeground(Color.white);
		enter.setBounds(150, 90, 100, 35);
		
		enter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String combo;
				combo = String.valueOf(lev.getSelectedItem());
				if(combo.equals("EASY")) {
					speed(150);
				}else if(combo.equals("NORMAL")) {
					speed(75);
				}else {
					speed(25);
				}
				close(false);
				EventQueue.invokeLater(() -> {
		            JFrame ex = new Snake(delay);
		            ex.setVisible(true);
		        });
			}
		});
		
		
		
	}
	public static void main(String[] args) {
        
		new levels();
        
    }
	
	public int speed (int delay) {
		this.delay = delay;
		return this.delay;
	}
	public void close(boolean test) {
		this.setVisible(test);
	}
}
