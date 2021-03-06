import java.awt.Color;

import javax.swing.*;

@SuppressWarnings("serial")
public class PaneManagement extends JFrame {
	
	private JPanel pane;
	private JButton buttonA;
	private JButton buttonB;
	private JButton buttonC;
	private JButton showButton;
	private static int count = 0;
	
	public PaneManagement() {
		
		pane = new JPanel();
		buttonA = new JButton("Amarillo");
		buttonB = new JButton("Azul");
		buttonC = new JButton("Cian");
		showButton = new JButton("Conteo de cambios");
		
		buttonA.setBounds(40,75,75,40);
		buttonB.setBounds(40,75,75,40);
		buttonC.setBounds(40,75,75,40);
		
		pane.add(buttonA);
		pane.add(buttonB);
		pane.add(buttonC);
		pane.add(showButton);

		//Anadiendo evento a botones
		
		buttonA.addActionListener(alA -> methodA());
		buttonB.addActionListener(alB -> methodB());
		buttonC.addActionListener(alC -> methodC());
		showButton.addActionListener(alS -> System.out.println("Se cambio el fondo " + count + " veces."));
		
		//Finalizando detalles
		getContentPane().add(pane);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Aspect HomeWork");
		setSize(400, 200);				
	}
	
	public void methodA(){
		pane.setBackground(Color.YELLOW);
		++count;
	}
	public void methodB(){
		pane.setBackground(Color.BLUE);
		++count;
	}
	public void methodC(){
		pane.setBackground(Color.CYAN);
		++count;
	}
}
