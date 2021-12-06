/*
 * Decompiled with CFR 0.137.
 */
package calculatrice;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class MaCalcule {
    private JFrame frmMaCalculatrice;
    private JTextField txtDisplay;
    double num1;
    double num2;
    double result;
    String operations;
    String reponse;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                try {
                    MaCalcule window = new MaCalcule();
                    window.frmMaCalculatrice.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MaCalcule() {
        this.initialize();
    }

    private void initialize() {
        this.frmMaCalculatrice = new JFrame();
        this.frmMaCalculatrice.getContentPane().setBackground(Color.GREEN);
        this.frmMaCalculatrice.setTitle("Ma calculatrice");
        this.frmMaCalculatrice.setBounds(500, 200, 348, 429);
        this.frmMaCalculatrice.setDefaultCloseOperation(3);
        JMenuBar menuBar = new JMenuBar();
        this.frmMaCalculatrice.setJMenuBar(menuBar);
        JMenu mnChanger = new JMenu("Changer");
        menuBar.add(mnChanger);
        JMenuItem mntmScientifique = new JMenuItem("Scientifique");
        mntmScientifique.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                MaCalcule.this.frmMaCalculatrice.setTitle("Ma calculatrice");
                MaCalcule.this.frmMaCalculatrice.setBounds(500, 200, 680, 429);
                MaCalcule.this.txtDisplay.setBounds(12, 13, 554, 54);
            }
        });
        mnChanger.add(mntmScientifique);
        JMenuItem mntmStandard = new JMenuItem("Standard");
        mntmStandard.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                MaCalcule.this.frmMaCalculatrice.setTitle("Ma calculatrice");
                MaCalcule.this.frmMaCalculatrice.setBounds(500, 200, 345, 429);
                MaCalcule.this.txtDisplay.setBounds(12, 13, 300, 54);
            }
        });
        mnChanger.add(mntmStandard);
        JMenuItem mntmSortir = new JMenuItem("Sortir");
        mntmSortir.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });
        mnChanger.add(mntmSortir);
        this.frmMaCalculatrice.getContentPane().setLayout(null);
        this.txtDisplay = new JTextField();
        this.txtDisplay.setBounds(12, 13, 295, 54);
        this.frmMaCalculatrice.getContentPane().add(this.txtDisplay);
        this.txtDisplay.setColumns(10);
        JButton btnEffacer = new JButton("<-");
        btnEffacer.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String effacer = null;
                if (MaCalcule.this.txtDisplay.getText().length() > 0) {
                    StringBuilder stB = new StringBuilder(MaCalcule.this.txtDisplay.getText());
                    stB.deleteCharAt(MaCalcule.this.txtDisplay.getText().length() - 1);
                    effacer = stB.toString();
                    MaCalcule.this.txtDisplay.setText(effacer);
                }
            }
        });
        btnEffacer.setFont(new Font("Tahoma", 0, 14));
        btnEffacer.setBounds(12, 80, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(btnEffacer);
        final JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String nb = String.valueOf(MaCalcule.this.txtDisplay.getText()) + btn7.getText();
                MaCalcule.this.txtDisplay.setText(nb);
            }
        });
        btn7.setFont(new Font("Tahoma", 0, 16));
        btn7.setBounds(12, 134, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(btn7);
        final JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String nb = String.valueOf(MaCalcule.this.txtDisplay.getText()) + btn4.getText();
                MaCalcule.this.txtDisplay.setText(nb);
            }
        });
        btn4.setFont(new Font("Tahoma", 0, 16));
        btn4.setBounds(12, 188, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(btn4);
        final JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String nb = String.valueOf(MaCalcule.this.txtDisplay.getText()) + btn1.getText();
                MaCalcule.this.txtDisplay.setText(nb);
            }
        });
        btn1.setFont(new Font("Tahoma", 0, 16));
        btn1.setBounds(12, 242, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(btn1);
        final JButton btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String nb = String.valueOf(MaCalcule.this.txtDisplay.getText()) + btn0.getText();
                MaCalcule.this.txtDisplay.setText(nb);
            }
        });
        btn0.setFont(new Font("Tahoma", 0, 16));
        btn0.setBounds(12, 296, 116, 50);
        this.frmMaCalculatrice.getContentPane().add(btn0);
        final JButton btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String nb = String.valueOf(MaCalcule.this.txtDisplay.getText()) + btn8.getText();
                MaCalcule.this.txtDisplay.setText(nb);
            }
        });
        btn8.setFont(new Font("Tahoma", 0, 16));
        btn8.setBounds(73, 134, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(btn8);
        final JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String nb = String.valueOf(MaCalcule.this.txtDisplay.getText()) + btn5.getText();
                MaCalcule.this.txtDisplay.setText(nb);
            }
        });
        btn5.setFont(new Font("Tahoma", 0, 16));
        btn5.setBounds(73, 188, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(btn5);
        final JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String nb = String.valueOf(MaCalcule.this.txtDisplay.getText()) + btn2.getText();
                MaCalcule.this.txtDisplay.setText(nb);
            }
        });
        btn2.setFont(new Font("Tahoma", 0, 16));
        btn2.setBounds(73, 242, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(btn2);
        JButton btnC = new JButton("Clear");
        btnC.setBackground(SystemColor.inactiveCaptionBorder);
        btnC.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                MaCalcule.this.txtDisplay.setText(null);
            }
        });
        btnC.setFont(new Font("Tahoma", 0, 16));
        btnC.setBounds(73, 80, 116, 50);
        this.frmMaCalculatrice.getContentPane().add(btnC);
        final JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String nb = String.valueOf(MaCalcule.this.txtDisplay.getText()) + btn9.getText();
                MaCalcule.this.txtDisplay.setText(nb);
            }
        });
        btn9.setFont(new Font("Tahoma", 0, 16));
        btn9.setBounds(134, 134, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(btn9);
        final JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String nb = String.valueOf(MaCalcule.this.txtDisplay.getText()) + btn6.getText();
                MaCalcule.this.txtDisplay.setText(nb);
            }
        });
        btn6.setFont(new Font("Tahoma", 0, 16));
        btn6.setBounds(134, 188, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(btn6);
        final JButton btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String nb = String.valueOf(MaCalcule.this.txtDisplay.getText()) + btn3.getText();
                MaCalcule.this.txtDisplay.setText(nb);
            }
        });
        btn3.setFont(new Font("Tahoma", 0, 16));
        btn3.setBounds(134, 242, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(btn3);
        JButton btnplusmoin = new JButton("+/-");
        btnplusmoin.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = Double.parseDouble(String.valueOf(MaCalcule.this.txtDisplay.getText()));
                MaCalcule.this.txtDisplay.setText(String.valueOf(op *= -1.0));
            }
        });
        btnplusmoin.setBounds(195, 80, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(btnplusmoin);
        JButton btndiv = new JButton("/");
        btndiv.setBackground(SystemColor.inactiveCaptionBorder);
        btndiv.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                MaCalcule.this.num1 = Double.parseDouble(MaCalcule.this.txtDisplay.getText());
                MaCalcule.this.txtDisplay.setText("");
                MaCalcule.this.operations = "/";
            }
        });
        btndiv.setFont(new Font("Tahoma", 0, 16));
        btndiv.setBounds(195, 134, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(btndiv);
        JButton btnmultip = new JButton("*");
        btnmultip.setBackground(SystemColor.inactiveCaptionBorder);
        btnmultip.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                MaCalcule.this.num1 = Double.parseDouble(MaCalcule.this.txtDisplay.getText());
                MaCalcule.this.txtDisplay.setText("");
                MaCalcule.this.operations = "*";
            }
        });
        btnmultip.setFont(new Font("Tahoma", 0, 16));
        btnmultip.setBounds(195, 188, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(btnmultip);
        JButton btnmoins = new JButton("-");
        btnmoins.setBackground(SystemColor.inactiveCaptionBorder);
        btnmoins.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                MaCalcule.this.num1 = Double.parseDouble(MaCalcule.this.txtDisplay.getText());
                MaCalcule.this.txtDisplay.setText("");
                MaCalcule.this.operations = "-";
            }
        });
        btnmoins.setFont(new Font("Tahoma", 0, 16));
        btnmoins.setBounds(195, 242, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(btnmoins);
        JButton button_4 = new JButton("\u221a");
        button_4.setBackground(SystemColor.menu);
        button_4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = Double.parseDouble(String.valueOf(MaCalcule.this.txtDisplay.getText()));
                op = Math.sqrt(op);
                MaCalcule.this.txtDisplay.setText(String.valueOf(op));
            }
        });
        button_4.setFont(new Font("Tahoma", 0, 16));
        button_4.setBounds(256, 80, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(button_4);
        JButton btnmod = new JButton("%");
        btnmod.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                MaCalcule.this.num1 = Double.parseDouble(MaCalcule.this.txtDisplay.getText());
                MaCalcule.this.txtDisplay.setText("");
                MaCalcule.this.operations = "%";
            }
        });
        btnmod.setFont(new Font("Tahoma", 0, 16));
        btnmod.setBounds(256, 134, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(btnmod);
        JButton btnegal = new JButton("=");
        btnegal.setBackground(SystemColor.controlHighlight);
        btnegal.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String reponse;
                MaCalcule.this.num2 = Double.parseDouble(MaCalcule.this.txtDisplay.getText());
                if (MaCalcule.this.operations == "+") {
                    MaCalcule.this.result = MaCalcule.this.num1 + MaCalcule.this.num2;
                    reponse = String.format("%.2f", MaCalcule.this.result);
                    MaCalcule.this.txtDisplay.setText(reponse);
                }
                if (MaCalcule.this.operations == "-") {
                    MaCalcule.this.result = MaCalcule.this.num1 - MaCalcule.this.num2;
                    reponse = String.format("%.2f", MaCalcule.this.result);
                    MaCalcule.this.txtDisplay.setText(reponse);
                }
                if (MaCalcule.this.operations == "*") {
                    MaCalcule.this.result = MaCalcule.this.num1 * MaCalcule.this.num2;
                    reponse = String.format("%.2f", MaCalcule.this.result);
                    MaCalcule.this.txtDisplay.setText(reponse);
                }
                if (MaCalcule.this.operations == "/") {
                    MaCalcule.this.result = MaCalcule.this.num1 / MaCalcule.this.num2;
                    reponse = String.format("%.2f", MaCalcule.this.result);
                    MaCalcule.this.txtDisplay.setText(reponse);
                }
                if (MaCalcule.this.operations == "%") {
                    MaCalcule.this.result = MaCalcule.this.num1 % MaCalcule.this.num2;
                    reponse = String.format("%.2f", MaCalcule.this.result);
                    MaCalcule.this.txtDisplay.setText(reponse);
                }
            }
        });
        btnegal.setFont(new Font("Tahoma", 0, 18));
        btnegal.setBounds(256, 242, 55, 104);
        this.frmMaCalculatrice.getContentPane().add(btnegal);
        final JButton btnpoint = new JButton(".");
        btnpoint.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String nb = String.valueOf(MaCalcule.this.txtDisplay.getText()) + btnpoint.getText();
                MaCalcule.this.txtDisplay.setText(nb);
            }
        });
        btnpoint.setFont(new Font("Tahoma", 0, 16));
        btnpoint.setBounds(134, 296, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(btnpoint);
        JButton btnplus = new JButton("+");
        btnplus.setBackground(SystemColor.inactiveCaptionBorder);
        btnplus.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                MaCalcule.this.num1 = Double.parseDouble(MaCalcule.this.txtDisplay.getText());
                MaCalcule.this.txtDisplay.setText("");
                MaCalcule.this.operations = "+";
            }
        });
        btnplus.setFont(new Font("Tahoma", 0, 16));
        btnplus.setBounds(195, 296, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(btnplus);
        JButton btnLog = new JButton("Log");
        btnLog.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = Double.parseDouble(String.valueOf(MaCalcule.this.txtDisplay.getText()));
                op = Math.log(op);
                MaCalcule.this.txtDisplay.setText(String.valueOf(op));
            }
        });
        btnLog.setBounds(329, 80, 71, 50);
        this.frmMaCalculatrice.getContentPane().add(btnLog);
        JButton btnsin = new JButton("Sin");
        btnsin.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = Double.parseDouble(String.valueOf(MaCalcule.this.txtDisplay.getText()));
                op = Math.sin(op);
                MaCalcule.this.txtDisplay.setText(String.valueOf(op));
            }
        });
        btnsin.setBounds(412, 80, 70, 50);
        this.frmMaCalculatrice.getContentPane().add(btnsin);
        JButton btnsinh = new JButton("Sinh");
        btnsinh.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = Double.parseDouble(String.valueOf(MaCalcule.this.txtDisplay.getText()));
                op = Math.sinh(op);
                MaCalcule.this.txtDisplay.setText(String.valueOf(op));
            }
        });
        btnsinh.setBounds(495, 80, 70, 50);
        this.frmMaCalculatrice.getContentPane().add(btnsinh);
        JButton btnpi = new JButton("\u03c0");
        btnpi.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = 3.141592653589793;
                MaCalcule.this.txtDisplay.setText(String.valueOf(op));
            }
        });
        btnpi.setBounds(329, 134, 71, 50);
        this.frmMaCalculatrice.getContentPane().add(btnpi);
        JButton btncos = new JButton("Cos");
        btncos.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = Double.parseDouble(String.valueOf(MaCalcule.this.txtDisplay.getText()));
                op = Math.cos(op);
                MaCalcule.this.txtDisplay.setText(String.valueOf(op));
            }
        });
        btncos.setBounds(412, 134, 71, 50);
        this.frmMaCalculatrice.getContentPane().add(btncos);
        JButton btncosh = new JButton("Cosh");
        btncosh.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = Double.parseDouble(String.valueOf(MaCalcule.this.txtDisplay.getText()));
                op = Math.cosh(op);
                MaCalcule.this.txtDisplay.setText(String.valueOf(op));
            }
        });
        btncosh.setBounds(495, 134, 71, 50);
        this.frmMaCalculatrice.getContentPane().add(btncosh);
        JButton btnlnx = new JButton("lnx");
        btnlnx.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = Double.parseDouble(String.valueOf(MaCalcule.this.txtDisplay.getText()));
                op = Math.log10(op);
                MaCalcule.this.txtDisplay.setText(String.valueOf(op));
            }
        });
        btnlnx.setBounds(578, 134, 71, 50);
        this.frmMaCalculatrice.getContentPane().add(btnlnx);
        JButton btnfact = new JButton("x!");
        btnfact.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = Double.parseDouble(String.valueOf(MaCalcule.this.txtDisplay.getText()));
                double f = 1.0;
                int i = 1;
                while ((double)i <= op) {
                    f *= (double)i;
                    ++i;
                }
                MaCalcule.this.txtDisplay.setText(String.valueOf(f));
            }
        });
        btnfact.setBounds(329, 188, 71, 50);
        this.frmMaCalculatrice.getContentPane().add(btnfact);
        JButton btntan = new JButton("Tan");
        btntan.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = Double.parseDouble(String.valueOf(MaCalcule.this.txtDisplay.getText()));
                op = Math.tan(op);
                MaCalcule.this.txtDisplay.setText(String.valueOf(op));
            }
        });
        btntan.setBounds(411, 188, 71, 50);
        this.frmMaCalculatrice.getContentPane().add(btntan);
        JButton btntanh = new JButton("Tanh");
        btntanh.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = Double.parseDouble(String.valueOf(MaCalcule.this.txtDisplay.getText()));
                op = Math.tanh(op);
                MaCalcule.this.txtDisplay.setText(String.valueOf(op));
            }
        });
        btntanh.setBounds(494, 188, 71, 50);
        this.frmMaCalculatrice.getContentPane().add(btntanh);
        JButton btnexp = new JButton("Exp");
        btnexp.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = Double.parseDouble(String.valueOf(MaCalcule.this.txtDisplay.getText()));
                op = Math.exp(op);
                MaCalcule.this.txtDisplay.setText(String.valueOf(op));
            }
        });
        btnexp.setBounds(577, 188, 71, 50);
        this.frmMaCalculatrice.getContentPane().add(btnexp);
        JButton btnxpdeux = new JButton("x^2");
        btnxpdeux.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = Double.parseDouble(String.valueOf(MaCalcule.this.txtDisplay.getText()));
                op *= op;
                MaCalcule.this.txtDisplay.setText(String.valueOf(op));
            }
        });
        btnxpdeux.setBounds(329, 242, 71, 50);
        this.frmMaCalculatrice.getContentPane().add(btnxpdeux);
        JButton btncbr = new JButton("Cbr");
        btncbr.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = Double.parseDouble(String.valueOf(MaCalcule.this.txtDisplay.getText()));
                op = Math.cbrt(op);
                MaCalcule.this.txtDisplay.setText(String.valueOf(op));
            }
        });
        btncbr.setBounds(411, 242, 71, 50);
        this.frmMaCalculatrice.getContentPane().add(btncbr);
        JButton btnrund = new JButton("Rund");
        btnrund.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = Double.parseDouble(String.valueOf(MaCalcule.this.txtDisplay.getText()));
                op = Math.round(op);
                MaCalcule.this.txtDisplay.setText(String.valueOf(op));
            }
        });
        btnrund.setBounds(494, 242, 71, 50);
        this.frmMaCalculatrice.getContentPane().add(btnrund);
        JButton btn2fpi = new JButton("2*\u03c0");
        btn2fpi.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = 6.283185307179586;
                MaCalcule.this.txtDisplay.setText(String.valueOf(op));
            }
        });
        btn2fpi.setBounds(577, 242, 71, 50);
        this.frmMaCalculatrice.getContentPane().add(btn2fpi);
        JButton btnxptrois = new JButton("x^3");
        btnxptrois.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = Double.parseDouble(String.valueOf(MaCalcule.this.txtDisplay.getText()));
                op = op * op * op;
                MaCalcule.this.txtDisplay.setText(String.valueOf(op));
            }
        });
        btnxptrois.setBounds(329, 296, 71, 50);
        this.frmMaCalculatrice.getContentPane().add(btnxptrois);
        JButton btnbin = new JButton("Bin");
        btnbin.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                int a = Integer.parseInt(MaCalcule.this.txtDisplay.getText());
                MaCalcule.this.txtDisplay.setText(Integer.toString(a, 2));
            }
        });
        btnbin.setBounds(411, 296, 71, 50);
        this.frmMaCalculatrice.getContentPane().add(btnbin);
        JButton btnhex = new JButton("Hex");
        btnhex.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                int a = Integer.parseInt(MaCalcule.this.txtDisplay.getText());
                MaCalcule.this.txtDisplay.setText(Integer.toString(a, 16));
            }
        });
        btnhex.setBounds(494, 296, 71, 50);
        this.frmMaCalculatrice.getContentPane().add(btnhex);
        JButton btnoct = new JButton("Oct");
        btnoct.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                int a = Integer.parseInt(MaCalcule.this.txtDisplay.getText());
                MaCalcule.this.txtDisplay.setText(Integer.toString(a, 8));
            }
        });
        btnoct.setBounds(577, 296, 71, 50);
        this.frmMaCalculatrice.getContentPane().add(btnoct);
        JButton btn1surx = new JButton("1/x");
        btn1surx.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = Double.parseDouble(String.valueOf(MaCalcule.this.txtDisplay.getText()));
                if ((op = 1.0 / op) == 0.0) {
                    System.out.println("Erreu! Division par zero!");
                }
                MaCalcule.this.txtDisplay.setText(String.valueOf(op));
            }
        });
        btn1surx.setFont(new Font("Tahoma", 0, 13));
        btn1surx.setBounds(256, 188, 55, 50);
        this.frmMaCalculatrice.getContentPane().add(btn1surx);
        JButton btn10px = new JButton("10^x");
        btn10px.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                double op = Double.parseDouble(String.valueOf(MaCalcule.this.txtDisplay.getText()));
                op = Math.pow(10.0, op);
                MaCalcule.this.txtDisplay.setText(String.valueOf(op));
            }
        });
        btn10px.setBounds(577, 80, 71, 50);
        this.frmMaCalculatrice.getContentPane().add(btn10px);
    }

}

