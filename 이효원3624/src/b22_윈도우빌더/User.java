package b22_윈도우빌더;

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

public class User extends JFrame { //JFrame을 상속받고있음

	private JPanel contentPane; //panel 판떼기
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {//Runnable:인터페이스, 무명클래스, 이름없이 매개변수로 넘겨줄떄 쓰임.. ?
//			invokelater<-매개변수 runnable이라는 객체를 받는 메소드
			public void run() {
				try {
					User frame = new User(); //상속받은 클라스는 생성함
					frame.setVisible(true);//그게true면 보이게해라~~ setvisible!
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
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //끄는창
		setBounds(100, 100, 484, 188); //프레임 열리는 위치.. 창 크기  
		contentPane = new JPanel(); //컨텐츠 팬을 뉴 패널해서 생성함, 땅바닥 ㅋㅋ 
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

// 디자인에서 계속 추가하면 코드만 길어짐 
// 모듈화시키기.....