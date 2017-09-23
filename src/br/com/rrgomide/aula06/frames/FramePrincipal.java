package br.com.rrgomide.aula06.frames;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FramePrincipal extends JFrame {
  
  public FramePrincipal() {
   
    JButton btSingle   = new JButton("Single");
    JButton btMultiple = new JButton("Multiple");
    
    btSingle.addActionListener(new ActionListener() {      
      @Override
      public void actionPerformed(ActionEvent e) {        
        new ListFrameSingle();
      }
    });
    
    btMultiple.addActionListener(new ActionListener() {      
      @Override
      public void actionPerformed(ActionEvent e) {        
        new MultipleSelectionFrame();
      }
    });    
    
    this.setLayout(new FlowLayout());
    this.add(btSingle);
    this.add(btMultiple);
    this.setSize(320, 200);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }
}
