package ncs.test7;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame{
	
	private JTextField javaScore;
	private JTextField sqlScore;
	private JTextField total;
	private JTextField average;
	private JButton calcBtn;
	
	public ScoreFrame() {
		
		
		setTitle("문제 7");
		setBounds(500, 300, 500, 400);
		setLayout(null);
		
		JLabel title=new JLabel("점수를 입력하세요");
		title.setSize(600, 80);
		title.setLocation(20, 0);
//		title.setHorizontalAlignment(JLabel.CENTER);
		title.setFont(new Font("굴림", Font.BOLD, 50));
		
		JLabel javaText =new JLabel("자바:");
		javaText.setBounds(15, 100, 50, 50);
		
		javaScore=new JTextField();
		javaScore.setBounds(70, 110, 150, 30);
		
		JLabel sqlText =new JLabel("SQL:");
		sqlText.setBounds(260, 100, 50, 50);
		
		sqlScore=new JTextField();
		sqlScore.setBounds(310, 110, 150, 30);
		
		JLabel totalText =new JLabel("총점:");
		totalText.setBounds(15, 280, 50, 50);
		
		total=new JTextField();
		total.setBounds(70, 290, 150, 30);
		
		JLabel averageText =new JLabel("평균:");
		averageText.setBounds(260, 280, 50, 50);
		
		average=new JTextField();
		average.setBounds(310, 290, 150, 30);
		
		calcBtn=new JButton("계산하기");
		calcBtn.setBounds(200, 200, 100, 30);
		calcBtn.addActionListener(new ActionHandler());
		
		add(title);
		add(javaText);
		add(javaScore);
		add(sqlText);
		add(sqlScore);
		add(totalText);
		add(total);
		add(averageText);
		add(average);
		add(calcBtn);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	class ActionHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			int java=Integer.parseInt(javaScore.getText());
			int sql=Integer.parseInt(sqlScore.getText());
			int iTotal=java+sql;
			String sTotal=Integer.valueOf(iTotal).toString();
			int iAverage=iTotal/2;
			String sAverage=Integer.valueOf(iAverage).toString();
			total.setText(sTotal);
			average.setText(sAverage);
			
			
		}
		
	}
}

