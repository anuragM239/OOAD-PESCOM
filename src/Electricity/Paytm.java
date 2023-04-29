package Electricity;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

interface PaymentMethod {
    void makePayment(String meter);
}

class PaytmPayment implements PaymentMethod {
    public void makePayment(String meter) {
        new Paytm(meter).setVisible(true);
    }
}

class PaymentMethodFactory {
    public PaymentMethod getPaymentMethod(String paymentMethod) {
        if (paymentMethod == null) {
            return null;
        }
        if (paymentMethod.equalsIgnoreCase("Paytm")) {
            return new PaytmPayment();
        }
        return null;
    }
}

public class Paytm extends JFrame implements ActionListener {
    String meter;
    JButton b1;

    Paytm(String meter) {
        this.meter = meter;
        JEditorPane j = new JEditorPane();
        j.setEditable(false);

        b1 = new JButton("Back");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(500, 20, 120, 25);
        b1.addActionListener(this);
        j.add(b1);

        try {
            JLabel l1 = new JLabel("Payment Successful");
            l1.setBounds(300, 50, 100, 50);
            add(l1);
        } catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load</html>");
        }

        JScrollPane scrollPane = new JScrollPane(j);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(scrollPane);
        setPreferredSize(new Dimension(800, 600));
        setSize(800, 800);
        setLocation(250, 120);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
        PaymentMethodFactory paymentMethodFactory = new PaymentMethodFactory();
        PaymentMethod paymentMethod = paymentMethodFactory.getPaymentMethod("Paytm");
        paymentMethod.makePayment(meter);
    }

    public static void main(String[] args) {
        PaymentMethodFactory paymentMethodFactory = new PaymentMethodFactory();
        PaymentMethod paymentMethod = paymentMethodFactory.getPaymentMethod("Paytm");
        paymentMethod.makePayment("");
    }
}
