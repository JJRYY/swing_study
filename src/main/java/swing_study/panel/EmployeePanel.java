package swing_study.panel;

import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public class EmployeePanel extends JPanel {
	private JTextField tfNo;
	private JTextField tfName;
	private JPasswordField pfPass1;
	private JPasswordField pfPass2;
	private JComboBox cmbTitle;
	private JComboBox cmbManager;
	private JSpinner spinSalary;
	private JComboBox cmbDept;
	private JDateChooser dateHire;

	public EmployeePanel() {
		initialize();
	}
	
	private void initialize() {
		setBorder(new TitledBorder(null, "사원 정보", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pTop = new JPanel();
		add(pTop, BorderLayout.NORTH);
		
		JPanel pPic = new JPanel();
		pTop.add(pPic);
		pPic.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPic = new JLabel("");
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setIcon(new ImageIcon("C:\\workspace_java\\swing_study\\images\\14070_0.jpg"));
		lblPic.setPreferredSize(new Dimension(100, 120));
		pPic.add(lblPic, BorderLayout.CENTER);
		
		JPanel pBtnPic = new JPanel();
		pPic.add(pBtnPic, BorderLayout.SOUTH);
		
		JButton btnAddPic = new JButton("사진 추가");
		pBtnPic.add(btnAddPic);
		
		JPanel pItem = new JPanel();
		add(pItem, BorderLayout.CENTER);
		pItem.setLayout(new GridLayout(0, 2, 10, 0));
		
		JLabel lblNo = new JLabel("사원번호");
		lblNo.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblNo);
		
		tfNo = new JTextField();
		pItem.add(tfNo);
		tfNo.setColumns(10);
		
		JLabel lblName = new JLabel("사원명");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblName);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		pItem.add(tfName);
		
		JLabel lblTitle = new JLabel("직책");
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblTitle);
		
		cmbTitle = new JComboBox();
		pItem.add(cmbTitle);
		
		JLabel lblManager = new JLabel("직속상사");
		lblManager.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblManager);
		
		cmbManager = new JComboBox();
		pItem.add(cmbManager);
		
		JLabel lblSalary = new JLabel("급여");
		lblSalary.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblSalary);
		
		spinSalary = new JSpinner();
		pItem.add(spinSalary);
		
		JLabel lblDept = new JLabel("부서");
		lblDept.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblDept);
		
		cmbDept = new JComboBox();
		pItem.add(cmbDept);
		
		JLabel lblHireDate = new JLabel("입사일");
		lblHireDate.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblHireDate);
		
		dateHire = new JDateChooser();
		pItem.add(dateHire);
		
		JLabel lblPass1 = new JLabel("비밀번호");
		lblPass1.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblPass1);
		
		pfPass1 = new JPasswordField();
		pItem.add(pfPass1);
		pfPass1.setColumns(10);
		
		JLabel lblPass2 = new JLabel("비밀번호 확인");
		lblPass2.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblPass2);
		
		pfPass2 = new JPasswordField();
		pItem.add(pfPass2);
		pfPass2.setColumns(10);
		
		JLabel spacePanel = new JLabel("");
		pItem.add(spacePanel);
		
		JPanel lblResultPanel = new JPanel();
		pItem.add(lblResultPanel);
		lblResultPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblResult = new JLabel("New label");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setForeground(Color.RED);
		lblResult.setFont(new Font("굴림", Font.BOLD, 20));
		lblResultPanel.add(lblResult);
	}
	
	public void setEmployee(Employee employee) {
		
		
	}
	
	public Employee getEmployee() {
		return null;
	}
	
	public void clearTf() {
		
	}

}
