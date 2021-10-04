package b22_윈도우빌더;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import b22_윈도우빌더.service.LoginServiceImpl;
import b22_윈도우빌더.service.SignUpService;
import b22_윈도우빌더.service.SignUpServiceImpl;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;

public class User extends JFrame { //JFrame을 상속받고있음


	private JPanel mainCardPan; //panel 판떼기
	private CardLayout cl_mainCardPan;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField id_tx;
	private JTextField name_tx;
	private JTextField phone_tx;
	private JTextField email_tx;
	private JPasswordField psw_ft;
	private JPasswordField repwd_tf;
	private String[] gender_list = {"선택", "남성", "여성", "선택하지 않음"};
	
	private LoginServiceImpl loginService;
	private SignUpService signUpService;

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
		}
	

	/**
	 * Create the frame.
	 */
	public User() {
		loginService = new LoginServiceImpl();
		signUpService = new SignUpServiceImpl();
				
				
		//loginLogic() = new loginLogic();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //끄는창
		setBounds(100, 100, 778, 528); //프레임 열리는 위치.. 창 크기  
		mainCardPan = new JPanel(); //컨텐츠 팬을 뉴 패널해서 생성함, 땅바닥 ㅋㅋ 
		mainCardPan.setToolTipText("");
		mainCardPan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainCardPan);
		cl_mainCardPan = new CardLayout();
		mainCardPan.setLayout(cl_mainCardPan);
		
		JPanel login_pan = new JPanel();
		mainCardPan.add(login_pan, "login_pan");
		login_pan.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("\uB85C\uADF8\uC778 \uC785\uB825 \uCC3D");
		textField.setColumns(10);
		textField.setBounds(255, 122, 198, 35);
		login_pan.add(textField);
		
		JButton login_Lable = new JButton("\uB85C\uADF8\uC778");
		login_Lable.setBounds(479, 121, 111, 85);
		login_pan.add(login_Lable);
		
		JLabel id_Lable = new JLabel("\uC544\uC774\uB514");
		id_Lable.setBounds(177, 126, 72, 27);
		login_pan.add(id_Lable);
		
		JLabel pwd_Lable = new JLabel("\uBE44\uBE4C\uBC88\uD638");
		pwd_Lable.setBounds(178, 177, 72, 27);
		login_pan.add(pwd_Lable);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(257, 173, 198, 35);
		login_pan.add(passwordField);
		
		JButton sign_up = new JButton("\uD68C\uC6D0\uAC00\uC785");
		sign_up.addMouseListener(new MouseAdapter() {//mouse->mousecliked 하면 무명클래스가 만드러짐
			@Override
			public void mouseClicked(MouseEvent e) {
					cl_mainCardPan.show(mainCardPan, "sign_up_pan");
					
			}
		});
		sign_up.setBounds(304, 225, 103, 27);
		login_pan.add(sign_up);
		
		JPanel sing_up_pan = new JPanel();
		mainCardPan.add(sing_up_pan, "sign_up_pan");
		sing_up_pan.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(161, 52, 87, 24);
		sing_up_pan.add(lblNewLabel);
		
		id_tx = new JTextField();
		id_tx.setBounds(282, 50, 137, 32);
		sing_up_pan.add(id_tx);
		id_tx.setColumns(10);
		
		JButton id_chk_btn = new JButton("\uC911\uBCF5\uD655\uC778");
		id_chk_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//마우스클릭을 하게되면
				int flag = signUpService.idCheck(id_tx.getText());
				if(flag == 2) {
					JOptionPane.showInternalMessageDialog(null,  "아이디를 입력하세요.", "경고", JOptionPane.ERROR_MESSAGE);
					
				}else if (flag == 1) {
					JOptionPane.showInternalMessageDialog(null, "존재하는 아이디입니다.", "아이디 중복", JOptionPane.WARNING_MESSAGE);
				}else if (flag == 0) {
					int select = JOptionPane.showConfirmDialog (null, "사용가능한 아이디입니다.\n사용하시겠습니까?", "아이디 확인", JOptionPane.YES_NO_OPTION);
					if(select == 0) {
						id_tx.setEditable(false);
					}
				}
				
			}
		});
		id_chk_btn.setBounds(425, 50, 87, 32);
		sing_up_pan.add(id_chk_btn);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(161, 102, 87, 26);
		sing_up_pan.add(lblNewLabel_1);
		
		psw_ft = new JPasswordField();
		psw_ft.setBounds(282, 105, 230, 32);
		sing_up_pan.add(psw_ft);
		
		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(161, 156, 87, 24);
		sing_up_pan.add(lblNewLabel_2);
		
		repwd_tf = new JPasswordField();
		repwd_tf.setBounds(282, 153, 230, 32);
		sing_up_pan.add(repwd_tf);
				
		JLabel lblNewLabel_3 = new JLabel("\uC774\uB984");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(161, 206, 87, 24);
		sing_up_pan.add(lblNewLabel_3);
		
		name_tx = new JTextField();
		name_tx.setBounds(282, 204, 230, 32);
		sing_up_pan.add(name_tx);
		name_tx.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\uC5F0\uB77D\uCC98");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(161, 255, 87, 24);
		sing_up_pan.add(lblNewLabel_4);
		
		phone_tx = new JTextField();
		phone_tx.setBounds(282, 252, 230, 34);
		sing_up_pan.add(phone_tx);
		phone_tx.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(161, 303, 87, 24);
		sing_up_pan.add(lblNewLabel_5);
		
		email_tx = new JTextField();
		email_tx.setBounds(282, 301, 230, 32);
		sing_up_pan.add(email_tx);
		email_tx.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\uC131\uBCC4");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setBounds(161, 359, 87, 24);
		sing_up_pan.add(lblNewLabel_6);
		
		JComboBox gender_cb = new JComboBox(gender_list); //콤보박스 만들떄 배열만들어주기
		gender_cb.setBounds(282, 356, 230, 32);
		sing_up_pan.add(gender_cb);
		
		
		JButton sign_up_btn = new JButton("\uAC00\uC785\uD558\uAE30");
		sign_up_btn.addMouseListener(new MouseAdapter()){
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] values = {
						id_tx.getText();
						psw_ft.getText();
						repwd_tf.getText();
						name_tx.getText();
						phone_tx.getText();
						email_tx.getText();
						gender_cb.getSelectedItem().toString();
				};
				
				String errorMsg = signUpService.isEmptyValues(values);
				if(!errorMsg.equals("value is not  null")) {
					JOptionPane.showInternalMessageDialog(null, errorMsg, "공백 오류", JOptionPane.ERROR_MESSAGE);
				}else {
					errorMsg = signUpSeervice.equalsPassword(psw_ft.getText(), repwd_tf.getText());
					if(!errorMsg.contentEquals("password equals")) {
						JOptionPane.showInternalMessageDialog(null, errorMsg, "비밀번호 오류", JOptionPane.ERROR_MESSAGE);
					}
						
					}
			}
						
		);
		
		
		sign_up_btn.setBounds(282, 416, 104, 29);
		sing_up_pan.add(sign_up_btn);
		
		JButton page_back_btn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		page_back_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan, "login_pan");
			}
		});
		page_back_btn.setBounds(408, 416, 104, 29);
		sing_up_pan.add(page_back_btn);
		

	
	} 
}

// 디자인에서 계속 추가하면 코드만 길어짐 
// 모듈화시키기.....
// 