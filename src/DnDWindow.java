import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class DnDWindow extends Frame implements WindowListener,WindowFocusListener,WindowStateListener,ActionListener,KeyListener
{
private Button rollButton;
private TextField inputField;
private Panel mainPanel;
private Panel innerPanel;
private TextField outputField;
private Dice dice;

	public DnDWindow(String name)
	{
		super(name);
		addWindowListener(this);
		addWindowFocusListener(this);
		addWindowStateListener(this);
		init();
		this.setSize(300, 200);
	}
	
	public void init()
	{
		System.out.println("Window: initialization");
		
		rollButton=new Button("Roll!");
		rollButton.addActionListener(this);
		
		inputField=new TextField("1d6",10);
		inputField.addKeyListener(this);
		outputField=new TextField("not rolled",30);
		
		this.add(mainPanel=new Panel());
		mainPanel.add(innerPanel=new Panel());
		innerPanel.add(inputField);
		innerPanel.add(rollButton);
		mainPanel.add(outputField);
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window: activated");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.print("Window: closed");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Virtual Machine closed!");
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window: deactivated");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window: deiconified");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window: iconified");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window: opened");
	}

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowGainedFocus(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Window: gained focus");
	}

	@Override
	public void windowLostFocus(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Window: lost focus");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==this.rollButton)
		{
			System.out.println("Window: rollButton");
			roll();
		}
	}
	
	public void roll()
	{
		String input=inputField.getText();
		Scanner interpret=new Scanner(input).useDelimiter("\\s*d\\s*");
		outputField.setText(Dice.roll(interpret.nextInt(), interpret.nextInt()));
	}
	
	public static void main(String[] args)
	{
		DnDWindow f=new DnDWindow("DnD Dice");
		f.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode()==KeyEvent.VK_ENTER)
		{
			System.out.println("Window: ENTER pressed");
			roll();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
