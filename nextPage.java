import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
public class nextPage extends JFrame implements ActionListener{
    public
    JLabel labelTime;
    JLabel label1,label3,label4,label5,label6,label7,label8;
    JButton buttonCancel,buttonSubmit;
    JTextField number,text2,text3,text4;
    JRadioButton button1,button2,genderMale,genderFemale;
    ButtonGroup groupGender,groupEvidence;
    JPanel panelLeft,panelRight;
    JTextArea commentBox,resultBox;
    String nid1,name1,area1, time;
    nextPage(String name,String nid, String area){
        this.name1=name;
        this.nid1=nid;
        this.area1=area;

        this.setLayout(null);
        ImageIcon imageInside = new ImageIcon("D:\\D drive files\\java\\report.png");
        this.setIconImage(imageInside.getImage());

        labelTime = new JLabel();
        labelTime.setBounds(230,655,250,27);
        labelTime.setFont(new Font("Monospaced",Font.BOLD,20));
        
        Timer timer = new Timer(1000, e -> {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        labelTime.setText(now.format(formatter));
});
        timer.start();
        this.add(labelTime);

        groupEvidence = new ButtonGroup();
        groupGender = new ButtonGroup();

        button1 = new JRadioButton("Don't Have vedios/pics");
        button1.setBounds(230,120,280,27);
        button1.setFocusable(false);
        button1.setForeground(Color.white);
        button1.setFont(new Font("Monospaced",Font.BOLD,18));
        button1.setBackground(new Color(0xD82C20));
        this.add(button1);

        button2 = new JRadioButton("Have vedios/pics");
        button2.setBounds(230,170,280,27);
        button2.setFocusable(false);
        button2.setForeground(Color.white);
        button2.setFont(new Font("Monospaced",Font.BOLD,18));
        button2.setBackground(new Color(0x026645));
        this.add(button2);
        groupEvidence.add(button1);
        groupEvidence.add(button2);

        resultBox = new JTextArea();
        resultBox.setBounds(640,200,520,440);
        resultBox.setBackground(Color.white);
        resultBox.setForeground(Color.black);
        resultBox.setEditable(false);
        this.add(resultBox);


        /*JLabel label1 = new JLabel(imageInside);
        label1.setBounds(0, 0,
                 imageInside.getIconWidth(),
                 imageInside.getIconHeight());
        label1.setLayout(null);*/

        genderMale = new JRadioButton("Male");
        genderMale.setBounds(230,22,100,30);
        genderMale.setBackground(new Color(0x000080));
        genderMale.setFont(new Font("Monospaced",Font.BOLD,20));
        genderMale.setFocusable(false);
        genderMale.setForeground(Color.white);
        genderMale.setOpaque(true);
        genderMale.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        this.add(genderMale);

        genderFemale = new JRadioButton("Female");
        genderFemale.setBounds(340,22,100,30);
        genderFemale.setBackground(Color.PINK);
        genderFemale.setFont(new Font("Monospaced",Font.BOLD,20));
        genderFemale.setForeground(Color.white);
        genderFemale.setFocusable(false);
        genderFemale.setOpaque(true);
        genderFemale.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        this.add(genderFemale);
        groupGender.add(genderFemale);
        groupGender.add(genderMale);

        label6 = new JLabel("Gender");
        label6.setBounds(15,22,160,27);
        label6.setFont(new Font("Monospaced",Font.BOLD,20));
        label6.setForeground(Color.white);
        label6.setBackground(Color.BLACK);
        label6.setOpaque(true);
        label6.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        this.add(label6);

        label3 = new JLabel("Evidence ");
        label3.setBounds(15,120,160,27);
        label3.setFont(new Font("Monospaced",Font.BOLD,20));
        label3.setForeground(Color.white);
        label3.setBackground(Color.BLACK);
        label3.setOpaque(true);
        label3.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        this.add(label3);

        number = new JTextField();
        number.setBounds(230,70,350,27);
        number.setFont(new Font("Arial",Font.BOLD,25));
        number.setForeground(Color.orange);
        number.setBackground(Color.white);
        this.add(number);

        label4 = new JLabel("Phone Number");
        label4.setBounds(15,70,160,27);
        label4.setFont(new Font("Monospaced",Font.BOLD,20));
        label4.setForeground(Color.white);
        label4.setBackground(Color.black);
        label4.setOpaque(true);
        label4.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        this.add(label4);

        text2 = new JTextField();
        text2.setBounds(230,250,350,27);
        text2.setFont(new Font("Arial",Font.BOLD,25));
        text2.setForeground(Color.orange);
        this.add(text2);

        label1 = new JLabel("Exact Place");
        label1.setBounds(15,250,160,27);
        label1.setFont(new Font("Monospaced",Font.BOLD,20));
        label1.setForeground(Color.white);
        label1.setBackground(Color.black);
        label1.setOpaque(true);
        label1.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        this.add(label1);

        label6 = new JLabel("Postal Code");
        label6.setBounds(15,300,160,27);
        label6.setFont(new Font("Monospaced",Font.BOLD,20));
        label6.setForeground(Color.white);
        label6.setBackground(Color.black);
        label6.setOpaque(true);
        label6.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        this.add(label6);

        text3 = new JTextField();
        text3.setBounds(230,300,350,27);
        text3.setFont(new Font("Arial",Font.BOLD,25));
        text3.setForeground(Color.orange);
        this.add(text3);

        label7 = new JLabel("Crime Details");
        label7.setBounds(15,340,200,27);
        label7.setFont(new Font("Monospaced",Font.BOLD,20));
        label7.setForeground(Color.white);
        label7.setBackground(Color.black);
        label7.setOpaque(true);
        label7.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        this.add(label7);

        commentBox = new JTextArea();
        commentBox.setBounds(230,340,350,300);
        commentBox.setFont(new Font("Monospaced",Font.BOLD,20));
        commentBox.setForeground(Color.ORANGE);
        commentBox.setBackground(Color.white);
        commentBox.setLineWrap(true);        // moves text to next line
        commentBox.setWrapStyleWord(true);   // wraps at whole words
        commentBox.setOpaque(true);
        commentBox.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        this.add(commentBox);

        /*String[] areas={"","Mirpur-1","Mirpur-2","Mirpur-6","Mirpur-10","Mirpur-11","Mirpur-12","Mirpur-13","Mirpur-14"};
        firstPage = new JComboBox(areas);
        firstPage.setBounds(300,130, 80, 27);
        firstPage.setForeground(Color.black);
        firstPage.addActionListener(this);
        this.add(firstPage);*/
        
        /*text3 = new JTextField();
        text3.setBounds(15,170,445,27);
        text3.setFont(new Font("Arial",Font.BOLD,25));
        text3.setForeground(Color.orange);
        this.add(text3);*/


        buttonCancel= new JButton("CANCEL");
        buttonCancel.setBounds(200,700,120,40);
        buttonCancel.setForeground(Color.red);
        buttonCancel.setBackground(Color.white);
        buttonCancel.setFocusable(false);
        buttonCancel.addActionListener(this);
        this.add(buttonCancel);

        buttonSubmit= new JButton("SUBMIT");
        buttonSubmit.setBounds(350,700,120,40);
        buttonSubmit.setForeground(Color.white);
        buttonSubmit.setBackground(Color.red);
        buttonSubmit.setFocusable(false);
        buttonSubmit.addActionListener(this);
        this.add(buttonSubmit);

        /*label5 = new JLabel("Place of Occurance");
        label5.setBounds(15,130,230,27);
        label5.setFont(new Font("Monospaced",Font.BOLD,20));
        label5.setForeground(Color.ORANGE);
        label5.setBackground(Color.BLACK);
        label5.setOpaque(true);//makes Backgrond color visible
        label5.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        this.add(label5);*/

        panelRight = new JPanel();
        panelRight.setBounds(600,0,600,800);
        panelRight.setBackground(new Color(0xA52A2A));
        this.add(panelRight);

        panelLeft = new JPanel();
        panelLeft.setBounds(0,0,600,800);
        panelLeft.setBackground(new Color(0xA3D0D4));
        this.add(panelLeft);

        this.setTitle("Crime Report MetroPolitan Police");
        this.setSize(1200,800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);//stops from resizing frame
        this.getContentPane().setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*ImageIcon image = new ImageIcon("D:\\D drive files\\java\\haat.png");
        this.setIconImage(image.getImage());
        this.add(label1);*/
        //this.pack();//adjust to image added
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String buttonGender,buttonEvidence;
        time = labelTime.getText().trim();
        String details=commentBox.getText();
        if(button1.isSelected()){
            buttonEvidence=button1.getText();
        }else{
            buttonEvidence=button2.getText();
        }
        if(genderMale.isSelected()){
            buttonGender=genderMale.getText();
        }else{
            buttonGender=genderFemale.getText();
        }
        String postal=text3.getText().trim(),num=number.getText().trim(),place=text2.getText();
        if(e.getSource()==buttonCancel){
            dispose();
        }
        else if(e.getSource()==buttonSubmit){
            if(number.getText().trim().isEmpty() || text2.getText().trim().isEmpty() || place.isEmpty() || buttonEvidence.isEmpty() || buttonGender.isEmpty() || postal.isEmpty() || num.isEmpty() || details.isEmpty()){
                JOptionPane.showMessageDialog(this,"Fill All The Text Boxes First...","Warning",JOptionPane.WARNING_MESSAGE);
            }else if(!postal.matches("\\d{4}") || !num.matches("\\d{11}")){
                JOptionPane.showMessageDialog(this,"Postal and Phone Number can hold only digits","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                String reportInGui = "=============================\n" + " Name         : " + name1 + "\n" + " NID           : " + nid1 + "\n" + " Area          : " + area1 + "\n" + " Phone         : " + num + "\n" + " Gender        :  " + buttonGender + "\n" + " Evidence      : " + buttonEvidence + "\n" + " Exact Place   : " + place + "\n" + " Postal Code   : " + postal + "\n" + " Crime Details : " + details + "\n"+"Date & Time: "+time + "\n" +"================================";
                reportInfo report = new reportInfo(nid1 ,name1, area1 , num , buttonEvidence , buttonGender,details,time);
                report.insertInfo();
                resultBox.setText(reportInGui);
                JOptionPane.showMessageDialog(this,"Info Submitted....","Inputed",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}