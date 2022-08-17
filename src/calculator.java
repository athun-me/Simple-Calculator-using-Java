import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;import javax.management.openmbean.OpenDataException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class calculator implements ActionListener{
	
	boolean isOperatorClicked=false;
	
	String OldValue;
	String newValue;
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton sixButton;
	JButton fiveButton;
	JButton fourButton;
	JButton threeButton;
	JButton twoButton;
	JButton oneButton;
	JButton fullStopButton;
	JButton zeroButton;
	JButton equlTOButton;
	JButton additionButton;
	JButton multiplicationButton;
	JButton divisionButton;
	JButton subtractionButton;
	JButton clearButton;
	
	public calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(450,600);
		jf.setLocation(1000, 100);
		
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 40, 380 , 40);
		displayLabel.setBackground(Color.GRAY);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.setFont(new Font("Arial",Font.PLAIN,40));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.setFont(new Font("Arial",Font.PLAIN,40));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(30, 230, 80, 80);
		sixButton.setFont(new Font("Arial",Font.PLAIN,40));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(230, 230, 80, 80);
		fourButton.setFont(new Font("Arial",Font.PLAIN,40));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(30, 330, 80, 80);
		threeButton.setFont(new Font("Arial",Font.PLAIN,40));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130,330, 80, 80);
		twoButton.setFont(new Font("Arial",Font.PLAIN,40));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(230, 330, 80, 80);
		oneButton.setFont(new Font("Arial",Font.PLAIN,40));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		fullStopButton=new JButton(".");
		fullStopButton.setBounds(30, 430, 80, 80);
		fullStopButton.setFont(new Font("Arial",Font.PLAIN,40));
		fullStopButton.addActionListener(this);
		jf.add(fullStopButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(130,430, 80, 80);
		zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equlTOButton=new JButton("=");
		equlTOButton.setBounds(230, 430, 80, 80);
		zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(equlTOButton);
		
		additionButton=new JButton("+");
		additionButton.setBounds(330, 130, 80, 80);
		additionButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(additionButton);
		
		multiplicationButton=new JButton("X");
		multiplicationButton.setBounds(330, 230, 80, 80);
		multiplicationButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(multiplicationButton);
		
		divisionButton=new JButton("/");
		divisionButton.setBounds(330, 330, 80, 80);
		divisionButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(divisionButton);
		
		subtractionButton=new JButton("-");
		subtractionButton.setBounds(330, 430, 80, 80);
		subtractionButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(subtractionButton);
		
		clearButton=new JButton("CLEAR");
		clearButton.setBounds(30, 95, 80, 25);
		clearButton.setFont(new Font("Arial",Font.PLAIN,13));
		clearButton.addActionListener(this);
		clearButton.setBackground(Color.orange);
		jf.add(clearButton);
		
		
		
		
		jf.add(displayLabel);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 
		if(e.getSource()==sevenButton) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
			
		}else if (e.getSource()==eightButton) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
			
		}else if (e.getSource()==nineButton) {
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		}else if (e.getSource()==fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}else if (e.getSource()==fiveButton) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}else if (e.getSource()==sixButton) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}else if (e.getSource()==threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		}else if (e.getSource()==twoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}else if (e.getSource()==oneButton) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}else if (e.getSource()==zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
		}else if (e.getSource()==clearButton) {
			displayLabel.setText(" ");
		}else if (e.getSource()==additionButton) {
			
		
			isOperatorClicked=true;
			OldValue=displayLabel.getText();
			
		}else if (e.getSource()==multiplicationButton) {
			isOperatorClicked=true;
			OldValue=displayLabel.getText();
			
		}else if (e.getSource()==equlTOButton) {
			
			String newValue=displayLabel.getText();
			float OldValuef=Float.parseFloat(OldValue);
			float newValuef=Float.parseFloat(newValue);
			float result=OldValuef+newValuef;
			displayLabel.setText(result+"");
			
			
		}

	}
}


