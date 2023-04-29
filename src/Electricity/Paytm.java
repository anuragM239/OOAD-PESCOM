package Electricity;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class MeterInfoBuilder {
    private String meter;
    private String meterLocation;
    private String meterType;
    private String phaseCode;
    private String billType;
    
    public MeterInfoBuilder setMeter(String meter) {
        this.meter = meter;
        return this;
    }
    
    public MeterInfoBuilder setMeterLocation(String meterLocation) {
        this.meterLocation = meterLocation;
        return this;
    }
    
    public MeterInfoBuilder setMeterType(String meterType) {
        this.meterType = meterType;
        return this;
    }
    
    public MeterInfoBuilder setPhaseCode(String phaseCode) {
        this.phaseCode = phaseCode;
        return this;
    }
    
    public MeterInfoBuilder setBillType(String billType) {
        this.billType = billType;
        return this;
    }
    
    public MeterInfo build() {
        return new MeterInfo(meter, meterLocation, meterType, phaseCode, billType);
    }
}

public class MeterInfo extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9, l10, l11;
    Choice c1, c2, c3,c4, c5;
    JButton b1,b2;
    
    MeterInfo(String meter, String meterLocation, String meterType, String phaseCode, String billType) {
        setLocation(600,200);
        setSize(700,500);
        
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(new Color(173,216,230));
        
        JLabel title = new JLabel("Meter Information");
        title.setBounds(180, 10, 200, 26);
        title.setFont(new Font("Tahoma", Font.PLAIN, 24));
        p.add(title);
        
        l1 = new JLabel("Meter Number");
        l1.setBounds(100, 80, 100, 20);
        
        l11 = new JLabel(meter);
        l11.setBounds(240, 80, 200, 20);
        p.add(l1);
        p.add(l11);
        
        l2 = new JLabel("Meter Location");
        l2.setBounds(100, 120, 100, 20);
        c1 = new Choice();
        c1.add("Outside");
        c1.add("Inside");
        c1.setBounds(240, 120, 200, 20);
        p.add(l2);
        p.add(c1);
        c1.select(meterLocation);
        
        l3 = new JLabel("Meter Type");
        l3.setBounds(100, 160, 100, 20);
        c2 = new Choice();
        c2.add("Electric Meter");
        c2.add("Solar Meter");
        c2.add("Smart Meter");
        c2.setBounds(240, 160, 200, 20);
        p.add(l3);
        p.add(c2);
        c2.select(meterType);
        
        l5 = new JLabel("Phase Code");
        l5.setBounds(100, 200, 100, 20);
        c3 = new Choice();
        c3.add("011");
        c3.add("022");
        c3.add("033");
        c3.add("044");
        c3.add("055");
        c3.add("066");
        c3.add("077");
        c3.add("088");
        c3.add("099");
        c3.setBounds(240, 200, 200, 20);
