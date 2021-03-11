package swing_study.listner;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class AnonymousClasslistener extends JFrame {

	private JPanel contentPane;

	public AnonymousClasslistener() {
		initialize();
	}

	private void initialize() {
		setTitle("익명 클래스");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener() { // 한 곳에서만 사용가능
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println(e);
				JButton btn = (JButton) e.getSource();
				if (e.getActionCommand().equals("Action")) {
					btn.setText("액션");
				} else {
					btn.setText("Action");
				}
			}
		});
		contentPane.add(btn, BorderLayout.CENTER);
	}

}