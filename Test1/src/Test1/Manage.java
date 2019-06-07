package Test1;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Manage extends JFrame {

	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;
	private JTextField textField8;
	private JTextField textField10;
	private JTextField textField11;
	private JTextField textField12;
	private JTextField textField13;
	private JTextField textField19;
	private JTextField textField20;
	private JTextField textField21;
	private JTextField textField22;
	private JTextField textField23;
	private JTextField textField24;
	private JLabel label13;
	private JTable table;
	private JTextField textField7;
	private JTextField textField9;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTable table_2;
	private JComboBox comboBox;
	
	ManageDTO dto = new ManageDTO();
	ManageDAO dao = new ManageDAO();

	ArrayList<ManageDTO> list = null;
	
	public Manage() throws Exception {

		setSize(1000, 600);

		JButton button1 = new JButton("삭제");
		button1.setBounds(486, 5, 76, 23);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String deleteNum = JOptionPane.showInputDialog(null, "정말 삭제하시려면 사업자번호를 한번더 입력하세요");
				
				if (deleteNum.equals("")) {
					JOptionPane.showMessageDialog(null, "삭제 할 수 없습니다. 사업자번호를 입력해주세요");
				} else if (deleteNum.equals(textField1.getText())) {
					
					try {

						dao.delete(deleteNum);
						JOptionPane.showMessageDialog(null, "삭제되었습니다");
						setVisible(false);

					} catch (Exception e1) {
						e1.printStackTrace();
					}
					
					try {
						new Manage();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(null, "사업자 번호가 일치하지 않습니다");
				}
			}
		});

		JButton button2 = new JButton("조회");
		button2.setBounds(741, 5, 76, 23);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "조회 할 수 없습니다. 사업자번호를 작성해주세요");
				} else {

					try {

					} catch (Exception e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				}
			}
		});

		JButton button3 = new JButton("저장");
		button3.setBounds(574, 5, 76, 23);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField1.getText().equals("") || textField2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "등록 할 수 없습니다. 내용을 작성해주세요");
				} else {

					dto.setBUSI_NUM(textField1.getText());
					dto.setCUSTOM(textField2.getText());
					dto.setSHOPT(textField3.getText());
					dto.setCEO(textField4.getText());
					dto.setCHARGE_PERSON(textField5.getText());
					dto.setBUSI_CONDITION(textField6.getText());
					dto.setITEM(textField7.getText());
					dto.setPOST_NUM(textField8.getText());
					dto.setADDR1(textField9.getText());
					dto.setADDR2(textField10.getText());
					dto.setTEL(textField11.getText());
					dto.setFAX(textField12.getText());
					dto.setHOMEPAGE(textField13.getText());

					
					dto.setCO_YN("1");
					dto.setFOREIGN_YN("1");
					dto.setTAX_YN("1");
					dto.setCOUNTRY_ENG("1");
					dto.setCOUNTRY_KOR("1");
					dto.setSPECIAL_RELATION("1");
					dto.setTRADE_STOP("1");


					//dto.setCO_YN 
					//dto.setFOREIGN_YN 
					//dto.setTAX_YN 
					//dto.setCOUNTRY_ENG
					//dto.setCONTRTY_KOR 
					//dto.setSPECIAL_RELATION(); 
					//dto.setTRADE_STOP();
					
					//dto.setCONTRACT_PERIOD_S(textField19.getText());
					//dto.setCONTRACT_PERIOD_E(textField20.getText());
					//dto.setREGI_INFO_DATE(textField22.getText());
					//dto.setMODI_INFO_DATE(textField24.getText());
					
					//콤보박스 텍스트로 저장 
					
					//String comboBoxNum = null; 
					//if (comboBox.getSelectedIndex() ==1) 
					//{ comboBoxNum = "과세"; 
					//} else if (comboBox.getSelectedIndex() == 2) 
					//{ comboBoxNum = "면세"; }
					//dto.setTAX_YN(comboBoxNum);
					 
					
					try {
						dao.insert(dto);

					} catch (Exception e1) {
						e1.printStackTrace();
					}
					JOptionPane.showMessageDialog(null, "저장되었습니다");
				}
			}
		});

		JButton button4 = new JButton("수정");
		button4.setBounds(653, 5, 76, 23);
		getContentPane().add(button4);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "수정 할 수 없습니다. 사업자번호를 작성해주세요");
				} else {

					dto.setBUSI_NUM(textField1.getText());
					dto.setCUSTOM(textField2.getText());
					dto.setSHOPT(textField3.getText());
					dto.setCEO(textField4.getText());
					dto.setCHARGE_PERSON(textField5.getText());
					dto.setBUSI_CONDITION(textField6.getText());
					dto.setITEM(textField7.getText());
					dto.setPOST_NUM(textField8.getText());
					dto.setADDR1(textField9.getText());
					dto.setADDR2(textField10.getText());
					dto.setTEL(textField11.getText());
					dto.setFAX(textField12.getText());
					dto.setHOMEPAGE(textField13.getText());
					dto.setCO_YN("1");
					dto.setFOREIGN_YN("1");
					dto.setTAX_YN("1");
					dto.setCOUNTRY_ENG("1");
					dto.setCOUNTRY_KOR("1");
					dto.setSPECIAL_RELATION("1");
					dto.setTRADE_STOP("1");
					
					try {
						dao.update(dto);

					} catch (Exception e1) {
						e1.printStackTrace();
					}
					JOptionPane.showMessageDialog(null, "저장되었습니다");

				}
			}
		});

		
		getContentPane().setLayout(null);
		getContentPane().add(button2);
		getContentPane().add(button3);
		getContentPane().add(button1);

		JLabel label1 = new JLabel("사업자 번호");
		label1.setBounds(258, 41, 94, 15);
		getContentPane().add(label1);

		JLabel label = new JLabel("거 래 처 명");
		label.setBounds(258, 66, 94, 15);
		getContentPane().add(label);

		JLabel label2 = new JLabel("대 표 자");
		label2.setBounds(258, 91, 79, 15);
		getContentPane().add(label2);

		JLabel label3 = new JLabel("업    태");
		label3.setBounds(258, 116, 57, 15);
		getContentPane().add(label3);

		JLabel label4 = new JLabel("우 편 번 호");
		label4.setBounds(258, 141, 79, 15);
		getContentPane().add(label4);

		JLabel label5 = new JLabel("주 소 2");
		label5.setBounds(258, 168, 57, 15);
		getContentPane().add(label5);

		JLabel label6 = new JLabel("전 화 번 호");
		label6.setBounds(258, 193, 94, 15);
		getContentPane().add(label6);

		JLabel label7 = new JLabel("홈 페 이 지");
		label7.setBounds(258, 218, 94, 15);
		getContentPane().add(label7);

		JLabel label8 = new JLabel("법 인 여 부");
		label8.setBounds(258, 243, 94, 15);
		getContentPane().add(label8);

		JLabel label9 = new JLabel("과 세 구 분");
		label9.setBounds(258, 270, 94, 15);
		getContentPane().add(label9);

		JLabel label10 = new JLabel("특수관계자");
		label10.setBounds(258, 295, 94, 15);
		getContentPane().add(label10);

		JLabel label11 = new JLabel("계 약 기 간");
		label11.setBounds(258, 320, 94, 15);
		getContentPane().add(label11);

		JLabel label12 = new JLabel("등 록 정 보");
		label12.setBounds(258, 345, 94, 15);
		getContentPane().add(label12);

		JLabel label14 = new JLabel("약    칭");
		label14.setBounds(618, 44, 57, 15);
		getContentPane().add(label14);

		JLabel label15 = new JLabel("담 당 자");
		label15.setBounds(618, 94, 57, 15);
		getContentPane().add(label15);

		JLabel label16 = new JLabel("팩 스 번 호");
		label16.setBounds(618, 196, 76, 15);
		getContentPane().add(label16);

		JLabel label17 = new JLabel("해 외 여 부");
		label17.setBounds(615, 246, 79, 15);
		getContentPane().add(label17);

		JLabel label18 = new JLabel("국    가");
		label18.setBounds(618, 273, 57, 15);
		getContentPane().add(label18);

		JLabel label19 = new JLabel("거 래 중 지");
		label19.setBounds(615, 295, 79, 15);
		getContentPane().add(label19);

		JLabel label20 = new JLabel("변 경 정 보");
		label20.setBounds(615, 348, 77, 15);
		getContentPane().add(label20);

		JLabel label21 = new JLabel("종    목");
		label21.setBounds(618, 119, 57, 15);
		getContentPane().add(label21);

		JLabel label22 = new JLabel("주  소  1");
		label22.setBounds(618, 144, 57, 15);
		getContentPane().add(label22);

		textField1 = new JTextField();
		textField1.setBounds(349, 38, 155, 21);
		getContentPane().add(textField1);
		textField1.setColumns(10);

		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(349, 63, 350, 21);
		getContentPane().add(textField2);

		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(704, 41, 177, 21);
		getContentPane().add(textField3);

		textField4 = new JTextField();
		textField4.setColumns(10);
		textField4.setBounds(349, 88, 155, 21);
		getContentPane().add(textField4);

		textField5 = new JTextField();
		textField5.setColumns(10);
		textField5.setBounds(704, 91, 177, 21);
		getContentPane().add(textField5);

		textField6 = new JTextField();
		textField6.setColumns(10);
		textField6.setBounds(349, 113, 155, 21);
		getContentPane().add(textField6);

		textField8 = new JTextField();
		textField8.setColumns(10);
		textField8.setBounds(349, 138, 155, 21);
		getContentPane().add(textField8);

		textField10 = new JTextField();
		textField10.setColumns(10);
		textField10.setBounds(349, 165, 528, 21);
		getContentPane().add(textField10);

		textField11 = new JTextField();
		textField11.setColumns(10);
		textField11.setBounds(349, 190, 155, 21);
		getContentPane().add(textField11);

		textField12 = new JTextField();
		textField12.setColumns(10);
		textField12.setBounds(704, 193, 177, 21);
		getContentPane().add(textField12);

		textField13 = new JTextField();
		textField13.setColumns(10);
		textField13.setBounds(349, 215, 350, 21);
		getContentPane().add(textField13);

		textField19 = new JTextField();
		textField19.setColumns(10);
		textField19.setBounds(349, 317, 155, 21);
		getContentPane().add(textField19);

		textField20 = new JTextField();
		textField20.setColumns(10);
		textField20.setBounds(704, 320, 177, 21);
		getContentPane().add(textField20);

		textField21 = new JTextField();
		textField21.setColumns(10);
		textField21.setBounds(349, 342, 71, 21);
		getContentPane().add(textField21);

		textField22 = new JTextField();
		textField22.setColumns(10);
		textField22.setBounds(428, 342, 162, 21);
		getContentPane().add(textField22);

		textField23 = new JTextField();
		textField23.setColumns(10);
		textField23.setBounds(704, 345, 64, 21);
		getContentPane().add(textField23);

		textField24 = new JTextField();
		textField24.setColumns(10);
		textField24.setBounds(774, 345, 155, 21);
		getContentPane().add(textField24);

		textField7 = new JTextField();
		textField7.setColumns(10);
		textField7.setBounds(704, 116, 177, 21);
		getContentPane().add(textField7);

		textField9 = new JTextField();
		textField9.setColumns(10);
		textField9.setBounds(704, 141, 177, 21);
		getContentPane().add(textField9);

		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(349, 295, 115, 23);
		getContentPane().add(checkBox);

		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(702, 295, 115, 23);
		getContentPane().add(checkBox_1);

		// 아래쪽 Table

		label13 = new JLabel("(거래처 계좌 정보)");
		label13.setBounds(258, 386, 132, 15);
		getContentPane().add(label13);

		table = new JTable(3, 4);
		table.setBounds(258, 411, 627, 87);
		getContentPane().add(table);

		// 왼쪽 Panel

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 246, 519);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel label_1 = new JLabel("사업자 번호");
		label_1.setBounds(3, 23, 94, 15);
		panel.add(label_1);

		JLabel label_2 = new JLabel("거래처명");
		label_2.setBounds(3, 48, 94, 15);
		panel.add(label_2);

		textField_24 = new JTextField();
		textField_24.setBounds(95, 20, 139, 21);
		textField_24.setColumns(10);
		panel.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setBounds(95, 45, 139, 21);
		textField_25.setColumns(10);
		panel.add(textField_25);

		//왼쪽 결과를 담을 
		
		String colName[] = {"사업자 번호", "거래처명"};
		Object rowData[][] = new Object[20][2];
		
		TableModel model = new DefaultTableModel(rowData, colName);
        table_2 = new JTable(model);
        table_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        table_2.setBounds(12, 141, 222, 368);
        table_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        panel.add(table_2);
        
		
		JButton button = new JButton("조회");
		button.setBounds(137, 76, 97, 23);
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)  {
				
				if (textField_24.getText().equals("") && textField_25.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "조회 할 수 없습니다. 내용을 작성해주세요");
					
				} else if (textField_24.getText().equals("")) {
					try {
						list = dao.selectLeft(textField_25.getText());
						
							if (list.size()!=0) {
								for (int i = 0; i < list.size(); i++) {
									
									TableModel model = table_2.getModel();
									
									model.setValueAt(list.get(i).getBUSI_NUM(), i, 0);
									model.setValueAt(list.get(i).getCUSTOM(), i, 1);
									
									rowData[i][0] = list.get(i).getBUSI_NUM();
									rowData[i][1] = list.get(i).getCUSTOM();
									
									System.out.println(rowData[i][0] + "in object");
									System.out.println(rowData[i][1] + "in object");
									System.out.println("------------------");
									System.out.println(i);
									System.out.println("------------------");
									
								};	
								
							} else {
								System.out.println("빈 값이 있습니다");
							}
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				} else if (textField_25.getText().equals("")) {
					try {
						list = dao.selectLeft(textField_24.getText());
						
						if (list.size()!=0) {
							for (int i = 0; i < list.size(); i++) {
								
								
								TableModel model = table_2.getModel();
								
								model.setValueAt(list.get(i).getBUSI_NUM(), i, 0);
								model.setValueAt(list.get(i).getCUSTOM(), i, 1);
								
								rowData[i][0] = list.get(i).getBUSI_NUM();
								rowData[i][1] = list.get(i).getCUSTOM();
								
								System.out.println(rowData[i][0] + "in object");
								System.out.println(rowData[i][1] + "in object");
								System.out.println("------------------");
								System.out.println(i);
								System.out.println("------------------");
								
							};	
						
						} else {
							System.out.println("빈 값이 있습니다");
						}
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			
			}
		});
		
		
		panel.add(button);
		
		JRadioButton radioButton1 = new JRadioButton("법인");
		radioButton1.setBounds(349, 239, 71, 23);
		getContentPane().add(radioButton1);

		JRadioButton radioButton2 = new JRadioButton("개인");
		radioButton2.setBounds(428, 239, 71, 23);
		getContentPane().add(radioButton2);

		ButtonGroup group = new ButtonGroup();
		group.add(radioButton1);
		group.add(radioButton2);

		JRadioButton radioButton3 = new JRadioButton("국내");
		radioButton3.setBounds(702, 239, 71, 23);
		getContentPane().add(radioButton3);

		JRadioButton radioButton4 = new JRadioButton("해외");
		radioButton4.setBounds(774, 239, 71, 23);
		getContentPane().add(radioButton4);

		ButtonGroup group1 = new ButtonGroup();
		group1.add(radioButton3);
		group1.add(radioButton4);

		String tax[] = { "과세", "면세" };
		comboBox = new JComboBox(tax);
		comboBox.setMaximumRowCount(2);
		comboBox.setBounds(349, 268, 132, 18);

		getContentPane().add(comboBox);
		
		
		setVisible(true);

	}

		public static void main(String[] args) throws Exception {

			new Manage();

	}
}
