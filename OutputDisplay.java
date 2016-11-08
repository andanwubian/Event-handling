import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class ActionHandle{
	private JFrame frame = new JFrame("This is a display component!!!");
	private JLabel lab = new JLabel();
	private JButton but = new JButton("display");
	private JTextField text = new JTextField();
	private JPanel pan = new JPanel();
	public ActionHandle(){
		Font fnt = new Font("Serief",Font.BOLD+Font.ITALIC,38);
		lab.setFont(fnt);
		lab.setText("wait user input");
		but.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				if(arg0.getSource()==but){
					lab.setText(text.getText());
				}
			}
		});
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent arg0){
				System.exit(1);
			}
		});
		frame.setLayout(new GridLayout(2,1));
		pan.setLayout(new GridLayout(1,2));
		pan.add(text);
		pan.add(but);
		frame.add(pan);
		frame.add(lab);
		frame.pack();
		frame.setVisible(true);
	}
}
public class MyWindowEventJFrame01{
	public static void main(String[] args){
		new ActionHandle();
	}
}