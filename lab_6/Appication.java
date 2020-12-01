package lab_6;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class Appication extends JFrame{

    Appication() {
        super("I'm differs!");
        setBounds(0,0,640,480);
        setPreferredSize(new Dimension(640, 480));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JTextArea txtArea = new JTextArea("Здесь был текст");
        txtArea.setLineWrap(true);
        txtArea.setAutoscrolls(true);
        txtArea.setFont(new Font("Times New Roman", 1,22));
        txtArea.setToolTipText("Его даже можно сменить");
        add(new JScrollPane(txtArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER), BorderLayout.CENTER);

        JMenu mColor = new JMenu(("Цвет"));
        JMenuBar mbColor = new JMenuBar();
        JMenuItem itm;
        String[] options = new String[]{
                "Синий",
                "Красный",
                "Чёрный"
        };
        Color[] options2 = new Color[]{
                Color.BLUE,
                Color.RED,
                Color.BLACK
        };
        for (int i = 0; i < options.length; i++) {
            itm = new JMenuItem(options[i]);
            int finalI = i;
            itm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txtArea.setForeground(options2[finalI]);
                }
            });
            mColor.add(itm);
        }
        mbColor.add(mColor);
        add(mbColor, BorderLayout.WEST);

        JMenu mFont = new JMenu(("Шрифт"));
        JMenuBar mbFont = new JMenuBar();
        options = new String[]{
                "Times New Roman",
                "MS Sans Serif",
                "Courier New"
        };

        for (int i = 0; i < options.length; i++) {
            itm = new JMenuItem(options[i]);
            String finalOption = options[i];
            itm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txtArea.setFont(new Font(finalOption, 1, 22));
                }
            });
            mFont.add(itm);
        }
        mbFont.add(mFont);
        add(mbFont, BorderLayout.EAST);
    }


    public static void main(String[] args) {
        Appication app = new Appication();
        app.setVisible(true);
    }
}

