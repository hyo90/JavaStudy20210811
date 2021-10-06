package b22_윈도우빌더;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import b22_윈도우빌더.dto.UserDto;
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
	
	private UserDto loginSession;


	private JPanel mainCardPan; //panel 판떼기
	private CardLayout cl_mainCardPan;
	private JTextField login_id_tf;
	private JPasswordField login_pwd_tf;
	private JTextField id_tf;
	private JTextField name_tf;
	private JTextField phone_tf;
	private JTextField email_tf;
	private JPasswordField pwd_tf;
	private JPasswordField repwd_tf;
	private JComboBox gender_cb;
	private JLabel welcomMsg;
	private String[] gender_list = {"선택", "남성", "여성", "선택하지 않음"};
	
	private LoginServiceImpl loginService;
	private SignUpService signUpService;
	private DeleteUserDto deleteUserDao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater (new Runnable() { //Runnable:인터페이스, 무명클래스, 이름없이 매개변수로 넘겨줄떄 쓰임.. ?
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
		loginService = new LoginServiceImpl();
		signUpService = new SignUpServiceImpl();
		DeleteUserDto = new DeleteUserDaoImpl();
				
				
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
		
		login_id_tf = new JTextField();
		login_id_tf.setToolTipText("\uB85C\uADF8\uC778 \uC785\uB825 \uCC3D");
		login_id_tf.setColumns(10);
		login_id_tf.setBounds(255, 122, 198, 35);
		login_pan.add(login_id_tf);
		
		JButton login_btn = new JButton("\uB85C\uADF8\uC778");
		login_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = loginService.loginTextCheck(login_id_tf.getText(), login_pwd_tf.getText());
				if (flag != 2) {
					String msg = null;
					if(flag == 0) {
						msg = "존재하지 않는 아이디입니다.";
					}else if (flag ==1) {
						msg = "비밀번호를 다시 확인해 주세요.";
					}else if(flag == 3) {
						msg = "아이디를 입력해 주세요.";
					}else if (flag == 4) {
						msg = "비밀번호를 입력해 주세요.";
					}
					JOptionPane.showMessageDialog(null, msg, "경고", JOptionPane.WARNING_MESSAGE);
				}else { 
					
					cl_mainCardPan.show(mainCardPan, "index_pan");
					
					loginSession = loginService.getUserDto(login_id_tf.getText());
					welcomMsg.setText(loginSession.getUser_name() + "님 환영합니다.");
					
					
					
				}
			}
		});
		login_btn.setBounds(479, 121, 111, 85);
		login_pan.add(login_btn);
		
		JLabel id_Lable = new JLabel("\uC544\uC774\uB514");
		id_Lable.setBounds(177, 126, 72, 27);
		login_pan.add(id_Lable);
		
		JLabel pwd_Lable = new JLabel("\uBE44\uBE4C\uBC88\uD638");
		pwd_Lable.setBounds(178, 177, 72, 27);
		login_pan.add(pwd_Lable);
		
		login_pwd_tf = new JPasswordField();
		login_pwd_tf.setBounds(257, 173, 198, 35);
		login_pan.add(login_pwd_tf);
		
		JButton sign_up = new JButton("\uD68C\uC6D0\uAC00\uC785");
		sign_up.addMouseListener(new MouseAdapter() {//mouse->mousecliked 하면 무명클래스가 만드러짐
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan, "sign_up_pan");
				
				id_tf.setText("");
				id_tf.setEditable(true);
				pwd_tf.setText("");
				repwd_tf.setText("");
				name_tf.setText("");
				phone_tf.setText("");
				email_tf.setText("");
				gender_cb.setSelectedIndex(0);
				
				// 얘네 여기다가 넣은 이유는 
				
				login_id_tf.setText("");
				login_pwd_tf.setText("");
				
				
				
					
			}
		});
		sign_up.setBounds(304, 225, 103, 27);
		login_pan.add(sign_up);
		
		JPanel sing_up_pan = new JPanel();
		mainCardPan.add(sing_up_pan, "sign_up_pan");
		sing_up_pan.setLayout(null);
		
		JLabel id = new JLabel("\uC544\uC774\uB514");
		id.setHorizontalAlignment(SwingConstants.RIGHT);
		id.setBounds(161, 52, 87, 24);
		sing_up_pan.add(id);
		
		id_tf = new JTextField();
		id_tf.setBounds(282, 50, 137, 32);
		sing_up_pan.add(id_tf);
		id_tf.setColumns(10);
		
		JButton id_chk_btn = new JButton("\uC911\uBCF5\uD655\uC778");
		id_chk_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//마우스클릭을 하게되면
				int flag = signUpService.idCheck(id_tf.getText());
				if(flag == 2) {
					JOptionPane.showInternalMessageDialog(null,  "아이디를 입력하세요.", "경고", JOptionPane.ERROR_MESSAGE);
					
				}else if (flag == 1) {
					JOptionPane.showInternalMessageDialog(null, "존재하는 아이디입니다.", "아이디 중복", JOptionPane.WARNING_MESSAGE);
				}else if (flag == 0) {
					int select = JOptionPane.showConfirmDialog (null, "사용가능한 아이디입니다.\n사용하시겠습니까?", "아이디 확인", JOptionPane.YES_NO_OPTION);
					if(select == 0) {
						id_tf.setEditable(false);
					}
				}
				
			}
		});
		
		id_chk_btn.setBounds(425, 50, 87, 32);
		sing_up_pan.add(id_chk_btn);
		
		JLabel pwd = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pwd.setHorizontalAlignment(SwingConstants.RIGHT);
		pwd.setBounds(161, 102, 87, 26);
		sing_up_pan.add(pwd);
		
		pwd_tf = new JPasswordField();
		pwd_tf.setBounds(282, 105, 230, 32);
		sing_up_pan.add(pwd_tf);
		
		JLabel repwd = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		repwd.setHorizontalAlignment(SwingConstants.RIGHT);
		repwd.setBounds(161, 156, 87, 24);
		sing_up_pan.add(repwd);
		
		repwd_tf = new JPasswordField();
		repwd_tf.setBounds(282, 153, 230, 32);
		sing_up_pan.add(repwd_tf);
				
		JLabel name = new JLabel("\uC774\uB984");
		name.setHorizontalAlignment(SwingConstants.RIGHT);
		name.setBounds(161, 206, 87, 24);
		sing_up_pan.add(name);
		
		name_tf = new JTextField();
		name_tf.setBounds(282, 204, 230, 32);
		sing_up_pan.add(name_tf);
		name_tf.setColumns(10);
		
		JLabel phone = new JLabel("\uC5F0\uB77D\uCC98");
		phone.setHorizontalAlignment(SwingConstants.RIGHT);
		phone.setBounds(161, 255, 87, 24);
		sing_up_pan.add(phone);
		
		phone_tf = new JTextField();
		phone_tf.setBounds(282, 252, 230, 34);
		sing_up_pan.add(phone_tf);
		phone_tf.setColumns(10);
		
		JLabel email = new JLabel("\uC774\uBA54\uC77C");
		email.setHorizontalAlignment(SwingConstants.RIGHT);
		email.setBounds(161, 303, 87, 24);
		sing_up_pan.add(email);
		
		email_tf = new JTextField();
		email_tf.setBounds(282, 301, 230, 32);
		sing_up_pan.add(email_tf);
		email_tf.setColumns(10);
		
		JLabel gender = new JLabel("\uC131\uBCC4");
		gender.setHorizontalAlignment(SwingConstants.RIGHT);
		gender.setBounds(161, 359, 87, 24);
		sing_up_pan.add(gender);
		
		gender_cb = new JComboBox(gender_list); //콤보박스 만들떄 배열만들어주기
		gender_cb.setBounds(282, 356, 230, 32);
		sing_up_pan.add(gender_cb);
		
		
		JButton sign_up_btn = new JButton("\uAC00\uC785\uD558\uAE30");
		sign_up_btn.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] values = {
						id_tf.getText(),
						pwd_tf.getText(),
						repwd_tf.getText(),
						name_tf.getText(),
						phone_tf.getText(),
						email_tf.getText(),
						gender_cb.getSelectedItem().toString(),
						Integer.toString(gender_cb.getSelectedIndex())
				};
				
				String errorMsg = signUpService.isEmptyValues(values);
				if(!errorMsg.equals("value is not  null")) {
					JOptionPane.showMessageDialog(null, errorMsg, "공백 오류", JOptionPane.ERROR_MESSAGE);
				}else {
					errorMsg = signUpService.equalsPassword(pwd_tf.getText(), repwd_tf.getText());
					if(!errorMsg.contentEquals("password equals")) {
						JOptionPane.showMessageDialog(null, errorMsg, "비밀번호 오류", JOptionPane.ERROR_MESSAGE);
					}else {
						boolean flag = signUpService.signUp(values);
						JOptionPane.showMessageDialog(null,  "회원가입에 성공하였습니다.", "회원가입 성공", JOptionPane.INFORMATION_MESSAGE);
						cl_mainCardPan.show(mainCardPan, "login_pan");
//						id_tf.setText("");
//						id_tf.setEditable(true);
//						pwd_tf.setText("");
//						repwd_tf.setText("");
//						name_tf.setText("");
//						phone_tf.setText("");
//						email_tf.setText("");
//						gender_cb.setSelectedIndex(0);
					}
						
				}
						
			}
		});
		
		
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
		
		JPanel index_pan = new JPanel();
		mainCardPan.add(index_pan, "index_pan"); //키 값 바꿔줌 .. 
		index_pan.setLayout(null);
		
		welcomMsg = new JLabel("new");
		welcomMsg.setBounds(12, 10, 446, 29);
		index_pan.add(welcomMsg);
		
		JButton logout_btn = new JButton("\uB85C\uADF8\uC544\uC6C3");
		logout_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = JOptionPane.showConfirmDialog(null, "정말 로그아웃 하시겠습니까?", "로그아웃", JOptionPane.YES_NO_OPTION);
				if(flag == 0) {
					cl_mainCardPan.show(mainCardPan, "lgin_pan");
					loginSession = null;
					login_id_tf.setText("");
					login_pwd_tf.setText("");
				}
			}
		});
		logout_btn.setBounds(615, 10, 125, 29);
		index_pan.add(logout_btn);
		
		JButton mypage_btn = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
		mypage_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan,  "mypage_pan");
				
			}
		});
		mypage_btn.setBounds(487, 11, 116, 28);
		index_pan.add(mypage_btn);
		
		JPanel mypage_pan = new JPanel();
		mainCardPan.add(mypage_pan, "mypage_pan");
		mypage_pan.setLayout(null);
		
		JButton User_drop_btn = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		User_drop_btn.addMouseListener(new MouseAdapter() {
			@override
			Public void mouseClicked(MouseEvent e) {
				int flag = JOptionPane.showConfirmDialog(null,  "정말로 계젇ㅇ을 삭제하시겠습니까?", "회원탈퇴", JOptionPane)
				if( flag == o) {
					boolean dropFlag = deleteUserDao.deleteUser(loginSession.getUser_id()));
					cl.mainCardPan.show(mainCardPan, "login_pan");
					login_id_tf.setText("");
					login_pwd.tg.setText("");
				}
						 
			}
			}
			
		}
	
		user_drop_btn.setBounds(711,453,97,23);
		mypage_pan.add(User_drop_btn);
	} 
}

// 디자인에서 계속 추가하면 코드만 길어짐 
// 모듈화시키기.....
// 