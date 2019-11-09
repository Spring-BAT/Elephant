package GUIregister;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @program: 注册图形界面
 * @Description:
 * @author: WMJ
 * @date: 2019/11/9 14:00 下午
 */
public class registerform {
    public static void main(String[] args){
        JFrame frame = new JFrame("Register Example");

        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    JPanel panel = new JPanel();

    frame.add(panel);
        /*
         * 调用用户定义的方法并添加组件到面板
         */
    placeComponents(panel);
        // 设置界面可见
    frame.setVisible(true);
}

private static void placeComponents(JPanel panel){

    final String COMMAND_REGIST = "REGIST";

    /* 布局部分我们这边不多做介绍
     * 这边设置布局为 null
     */
     panel.setLayout(null);
    // 创建 JLabel
     JLabel userLabel = new JLabel("User:");
    /* 这个方法定义了组件的位置。
     * setBounds(x, y, width, height)
     * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
     */
    userLabel.setBounds(10,20,80,25);
    panel.add(userLabel);

    /*
     * 创建文本域用于用户输入
     */
    JTextField userText = new JTextField(20);
    userText.setBounds(100,20,165,25);
    panel.add(userText);

    //输入邮箱的文本域
    JLabel mailboxLabel = new JLabel("Mailbox:");
    mailboxLabel.setBounds(10,50,80,25);
    panel.add(mailboxLabel);

    /*
     * 创建文本域用于用户输入
     */

    JTextField mailboxText = new JTextField(20);
    mailboxText.setBounds(100,50,165,25);
    panel.add(mailboxText);

    // 输入密码的文本域
    JLabel passwordLabel = new JLabel("Password:");
    passwordLabel.setBounds(10,80,80,25);
    panel.add(passwordLabel);


    /*
     *这个类似用于输入的文本域
     * 但是输入的信息会以点号代替，用于包含密码的安全性
     */
    JPasswordField passwordText = new JPasswordField(20);
    passwordText.setBounds(100,80,165,25);
    panel.add(passwordText);

    //创建注册按钮
    JButton RegisterButton = new JButton("Register");
    RegisterButton.setBounds(10,120,80,25);
    RegisterButton.setActionCommand(COMMAND_REGIST);
    panel.add(RegisterButton);

    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            String command = e.getActionCommand();

            if(COMMAND_REGIST.equals(command)){
                System.out.println("OK 按钮被点击");
            }
            else{
                System.out.println("Cancel 按钮被点击");
            }
        }
    };
    RegisterButton.addActionListener(actionListener);
}
}

