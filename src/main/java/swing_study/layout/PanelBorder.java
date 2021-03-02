package swing_study.layout;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class PanelBorder extends JPanel {

	public PanelBorder() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(10, 10));
		
		JLabel lblNorth = new JLabel("North");
		lblNorth.setFont(new Font("굴림", Font.BOLD, 20));
		lblNorth.setOpaque(true);
		lblNorth.setBackground(Color.RED);
		lblNorth.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNorth, BorderLayout.NORTH);
		
		JLabel lblWest = new JLabel("West");
		lblWest.setFont(new Font("굴림", Font.BOLD, 20));
		lblWest.setHorizontalAlignment(SwingConstants.CENTER);
		lblWest.setBackground(Color.MAGENTA);
		lblWest.setOpaque(true);
		add(lblWest, BorderLayout.WEST);
		
		JLabel lblCenter = new JLabel("Center");
		lblCenter.setFont(new Font("굴림", Font.BOLD, 20));
		lblCenter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCenter.setBackground(Color.YELLOW);
		lblCenter.setOpaque(true);
		add(lblCenter, BorderLayout.CENTER);
		
		JLabel lblEast = new JLabel("East");
		lblEast.setFont(new Font("굴림", Font.BOLD, 20));
		lblEast.setHorizontalAlignment(SwingConstants.CENTER);
		lblEast.setBackground(Color.CYAN);
		lblEast.setOpaque(true);
		add(lblEast, BorderLayout.EAST);
		
		JLabel lblSouth = new JLabel("South");
		lblSouth.setFont(new Font("굴림", Font.BOLD, 20));
		lblSouth.setHorizontalAlignment(SwingConstants.CENTER);
		lblSouth.setBackground(Color.GREEN);
		lblSouth.setOpaque(true);
		add(lblSouth, BorderLayout.SOUTH);
	}

}