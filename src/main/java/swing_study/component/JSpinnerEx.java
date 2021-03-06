package swing_study.component;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class JSpinnerEx extends JFrame {

	private JPanel contentPane;
	private JComboBox<String> cmbSelect;

	public JSpinnerEx() {
		initialize();
		
		String[] select = {"년", "월", "일"};
		for (String s : select) {
			cmbSelect.addItem(s);
		}
	
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 0, 0));
		
		JPanel pBook = new JPanel();
		contentPane.add(pBook);
		
		JSpinner spinner1 = new JSpinner();
		spinner1.setPreferredSize(new Dimension(100, 22));
		spinner1.setModel(new SpinnerListModel(new String[] {"소설", "잡지", "전공서적", "취미"}));
		pBook.add(spinner1);
		
		JPanel pSalary = new JPanel();
		contentPane.add(pSalary);
		
		JSpinner spinner2 = new JSpinner();
		spinner2.setModel(new SpinnerNumberModel(1500000, 0, 4000000, 100000));
		pSalary.add(spinner2);
		
		JPanel pTime = new JPanel();
		contentPane.add(pTime);
		
		JSpinner spinner3 = new JSpinner();
		spinner3.setModel(new SpinnerDateModel(new Date(1615129200000L), new Date(37206000000L), new Date(4770802800000L), Calendar.YEAR));
		spinner3.setEditor(new JSpinner.DateEditor(spinner3, "yyyy/MM/dd"));
		pTime.add(spinner3);
		
		cmbSelect = new JComboBox<>();
		pTime.add(cmbSelect);
	}

}
