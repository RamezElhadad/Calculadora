package Calculadora;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Ventana{
	private static JTextField pant;

	public static void main(String[] args) {
		show();
	}

	private static int value1;
	private static int value2;
	private static int caso;
	
	public static void show() {
		JFrame frame = new JFrame("Calculadora");
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(200, 200, 621, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.getContentPane().setLayout(null);
		
		pant = new JTextField("0");
		pant.setForeground(new Color(0, 0, 0));
		pant.setBackground(new Color(255, 255, 255));
		pant.setEditable(false);
		pant.setHorizontalAlignment(SwingConstants.RIGHT);
		pant.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		pant.setBounds(81, 43, 465, 59);
		frame.getContentPane().add(pant);
		pant.setColumns(15);
		
//--------------------------------------TEXT FIELD-----------------------------------------------		
		
		JButton c = new JButton("C");
		c.setBackground(new Color(240, 240, 240));
		c.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pant.setText("");
			}
			
		});
		c.setBounds(81, 128, 64, 39);
		frame.getContentPane().add(c);
		
//--------------------------------------BUTTON C-----------------------------------------------			
		
		JButton c9 = new JButton("9");
		c9.setBackground(new Color(255, 255, 255));
		c9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pant.setText(pant.getText() + "9");
			}
			
		});
		c9.setBounds(81, 178, 64, 39);
		frame.getContentPane().add(c9);
		
//--------------------------------------BUTTON 9-----------------------------------------------			
		
		JButton c6 = new JButton("6");
		c6.setBackground(new Color(255, 255, 255));
		c6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pant.setText(pant.getText() + "6");
			}
			
		});
		c6.setBounds(81, 228, 64, 39);
		frame.getContentPane().add(c6);
		
//--------------------------------------BUTTON 6-----------------------------------------------			
		
		JButton c3 = new JButton("3");
		c3.setBackground(new Color(255, 255, 255));
		c3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pant.setText(pant.getText() + "3");
			}
			
		});
		c3.setBounds(81, 278, 64, 39);
		frame.getContentPane().add(c3);
		
//--------------------------------------BUTTON 3-----------------------------------------------			

		JButton cDot = new JButton(".");
		cDot.setBackground(new Color(255, 255, 255));
		cDot.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		cDot.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pant.setText(pant.getText() + ".");
			}
			
		});
		cDot.setBounds(81, 328, 64, 39);
		frame.getContentPane().add(cDot);

//--------------------------------------BUTTON DOT-----------------------------------------------			

		JButton cPM = new JButton("+/-");
		cPM.setBackground(new Color(255, 255, 255));
		cPM.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		cPM.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int value = Integer.getInteger(pant.getText());
				value = 0 - value;
				pant.setText("");
				pant.setText(Integer.toString(value));
		}});
		cPM.setBounds(212, 128, 64, 39);
		frame.getContentPane().add(cPM);
		
//--------------------------------------BUTTON */- -----------------------------------------------			
			
		JButton c8 = new JButton("8");
		c8.setBackground(new Color(255, 255, 255));
		c8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pant.setText(pant.getText() + "8");
			}
			
		});
		c8.setBounds(212, 178, 64, 39);
		frame.getContentPane().add(c8);
		
//--------------------------------------BUTTON 8-----------------------------------------------			
		
		JButton c5 = new JButton("5");
		c5.setBackground(new Color(255, 255, 255));
		c5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pant.setText(pant.getText() + "5");
			}
			
		});
		c5.setBounds(212, 228, 64, 39);
		frame.getContentPane().add(c5);

//--------------------------------------BUTTON 5-----------------------------------------------			

		JButton c2 = new JButton("2");
		c2.setBackground(new Color(255, 255, 255));
		c2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pant.setText(pant.getText() + "2");
			}
			
		});
		c2.setBounds(212, 278, 64, 39);
		frame.getContentPane().add(c2);

//--------------------------------------BUTTON 2-----------------------------------------------			

		JButton cEqual = new JButton("=");
		cEqual.setBackground(new Color(255, 255, 255));
		cEqual.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		cEqual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				value2 = Integer.parseInt(pant.getText());
				
				if(caso == 1) {
					pant.setText(Integer.toString(div(value1,value2)));
				}
				else if(caso == 2) {
					pant.setText(Integer.toString(mul(value1,value2)));
				}
				else if(caso == 3) {
					pant.setText(Integer.toString(min(value1,value2)));
				}
				else if(caso == 4) {
					pant.setText(Integer.toString(plus(value1,value2)));
				}
				else {
					pant.setText(pant.getText());
				}
			}
			
		});
		cEqual.setBounds(482, 328, 64, 39);
		frame.getContentPane().add(cEqual);
		
//--------------------------------------BUTTON =-----------------------------------------------			
		
		JButton btn1x = new JButton("1/x");
		btn1x.setBackground(new Color(255, 255, 255));
		btn1x.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btn1x.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int value = 1 / Integer.parseInt(pant.getText());
				pant.setText("");
				pant.setText(Integer.toString(value));
			}
			
		});
		btn1x.setBounds(350, 128, 64, 39);
		frame.getContentPane().add(btn1x);
		
//--------------------------------------BUTTON 1/x-----------------------------------------------			
		
		JButton c7 = new JButton("7");
		c7.setBackground(new Color(255, 255, 255));
		c7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pant.setText(pant.getText() + "7");
			}
			
		});
		c7.setBounds(350, 178, 64, 39);
		frame.getContentPane().add(c7);

//--------------------------------------BUTTON 7-----------------------------------------------			

		JButton c4 = new JButton("4");
		c4.setBackground(new Color(255, 255, 255));
		c4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pant.setText(pant.getText() + "4");
			}
			
		});
		c4.setBounds(350, 228, 64, 39);
		frame.getContentPane().add(c4);

//--------------------------------------BUTTON 4-----------------------------------------------			

		JButton c1 = new JButton("1");
		c1.setBackground(new Color(255, 255, 255));
		c1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pant.setText(pant.getText() + "1");
			}
			
		});
		c1.setBounds(350, 278, 64, 39);
		frame.getContentPane().add(c1);

//--------------------------------------BUTTON 1-----------------------------------------------			

		JButton c0 = new JButton("0");
		c0.setBackground(new Color(255, 255, 255));
		c0.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		c0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pant.setText(pant.getText() + "0");
			}
			
		});
		c0.setBounds(350, 328, 64, 39);
		frame.getContentPane().add(c0);

//--------------------------------------BUTTON 0-----------------------------------------------			

		JButton divide = new JButton("/");
		divide.setBackground(new Color(255, 255, 255));
		divide.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		divide.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				value1 = Integer.parseInt(pant.getText());
				pant.setText("");
				caso = 1;
			}
			
		});
		divide.setBounds(482, 128, 64, 39);
		frame.getContentPane().add(divide);

//--------------------------------------BUTTON Divide-----------------------------------------------			
		
		JButton mult = new JButton("x");
		mult.setBackground(new Color(255, 255, 255));
		mult.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		mult.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				value1 = Integer.parseInt(pant.getText());
				pant.setText("");
				caso = 2;
			}
			
		});
		mult.setBounds(482, 178, 64, 39);
		frame.getContentPane().add(mult);

//--------------------------------------BUTTON Multipli-----------------------------------------------			

		JButton minus = new JButton("-");
		minus.setBackground(new Color(255, 255, 255));
		minus.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				value1 = Integer.parseInt(pant.getText());
				pant.setText("");
				caso = 3;
			}
			
		});
		minus.setBounds(482, 228, 64, 39);
		frame.getContentPane().add(minus);

//--------------------------------------BUTTON Minus-----------------------------------------------			

		JButton plus = new JButton("+");
		plus.setBackground(new Color(255, 255, 255));
		plus.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				value1 = Integer.parseInt(pant.getText());
				pant.setText("");
				caso = 4;
			}
			
		});
		plus.setBounds(482, 278, 64, 39);
		frame.getContentPane().add(plus);

//--------------------------------------BUTTON Plus-----------------------------------------------			

		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.setBackground(new Color(255, 255, 255));
		btnSqrt.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnSqrt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				value1 = Integer.parseInt(pant.getText());
				pant.setText(Integer.toString(value1*value1));
				
			}
			
		});
		btnSqrt.setBounds(212, 328, 64, 39);
		frame.getContentPane().add(btnSqrt);

//--------------------------------------BUTTON SQRT-----------------------------------------------			

		
		frame.setVisible(true);
	}
	
	public static int plus(int value1, int value2) {
		return value1 + value2;
	}
	
	public static int min(int value1, int value2) {
		return value1 - value2;
	}
	
	public static int mul(int value1, int value2) {
		return value1 * value2;
	}
	
	public static int div(int value1, int value2) {
		return value1 / value2;
	}
	
}
