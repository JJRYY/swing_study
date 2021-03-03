package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class JLabelEx extends JFrame implements MouseListener {

	private JPanel contentPane;
	private String path = System.getProperty("user.dir") + File.separator + "images" + File.separator;
	private JLabel lblNorth;
	private JLabel lblCenter;
	private JLabel lblSouth;
	
	public JLabelEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JLabel");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 344, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblNorth = new JLabel("므요");
		lblNorth.addMouseListener(this);
		lblNorth.setOpaque(true);
		lblNorth.setBackground(Color.YELLOW);
		lblNorth.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNorth, BorderLayout.NORTH);
		
		lblCenter = new JLabel("");
		lblCenter.setIcon(new ImageIcon(path + "1038.jpg"));
		lblCenter.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCenter, BorderLayout.CENTER);
		
		lblSouth = new JLabel("밥 내놔");
		lblSouth.setBackground(Color.PINK);
		lblSouth.setOpaque(true);
		lblSouth.setIcon(new ImageIcon(path + "14070_0.jpg"));
		lblSouth.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblSouth, BorderLayout.SOUTH);
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblNorth) {
			mouseClickedLblNorth(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLblNorth(MouseEvent e) {
		lblCenter.setIcon(new ImageIcon(path + "14070_0.jpg"));
		lblSouth.setText("츄르도");
		JOptionPane.showMessageDialog(null, "변경완료");
	}
}
