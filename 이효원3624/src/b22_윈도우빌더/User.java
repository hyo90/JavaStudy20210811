package b22_���������;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class User extends JFrame { //JFrame�� ��ӹް�����

	private JPanel contentPane; //panel �Ƕ���
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {//Runnable:�������̽�, ����Ŭ����, �̸����� �Ű������� �Ѱ��ً� ����.. ?
//			invokelater<-�Ű����� runnable�̶�� ��ü�� �޴� �޼ҵ�
			public void run() {
				try {
					User frame = new User(); //��ӹ��� Ŭ�󽺴� ������
					frame.setVisible(true);//�װ�true�� ���̰��ض�~~ setvisible!
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public User() {
		loginLogic() = new loginLogic();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //����â
		setBounds(100, 100, 484, 188); //������ ������ ��ġ.. â ũ��  
		contentPane = new JPanel(); //������ ���� �� �г��ؼ� ������, ���ٴ� ���� 
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 468, 149);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("\uB85C\uADF8\uC778 \uC785\uB825 \uCC3D");
		textField.setColumns(10);
		textField.setBounds(110, 30, 198, 35);
		panel.add(textField);
		
		JButton login_Lable = new JButton("\uB85C\uADF8\uC778");
		login_Lable.setBounds(334, 29, 111, 85);
		panel.add(login_Lable);
		
		JLabel id_Lable = new JLabel("\uC544\uC774\uB514");
		id_Lable.setBounds(32, 34, 72, 27);
		panel.add(id_Lable);
		
		JLabel pwd_Lable = new JLabel("\uBE44\uBE4C\uBC88\uD638");
		pwd_Lable.setBounds(33, 85, 72, 27);
		panel.add(pwd_Lable);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(112, 81, 198, 35);
		panel.add(passwordField);
	}
}

// �����ο��� ��� �߰��ϸ� �ڵ常 ����� 
// ���ȭ��Ű��.....