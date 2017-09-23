package br.com.rrgomide.aula06.exercicio;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ExercicioFrame extends JFrame {
  
  private JList<Atalho> listaAtalhos;
  private JTextArea jtaDescricao;
  
  public ExercicioFrame() {
   
    super("Atalhos");
    this.setSize(640, 480);
    this.setLayout(new BorderLayout(5, 5));
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    listaAtalhos = new JList<Atalho>();
    listaAtalhos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    listaAtalhos.setFont(new Font("Consolas", Font.BOLD, 20));
    listaAtalhos.setFixedCellWidth(200);
    listaAtalhos.setListData(Atalho.getAtalhosPadrao().toArray(new Atalho[0]));
    
    listaAtalhos.addListSelectionListener(new ListSelectionListener() {

        @Override
        public void valueChanged(ListSelectionEvent event) {
          
        	jtaDescricao.setText(listaAtalhos.getSelectedValue().getConteudo());
        	
        }
      });
    
    jtaDescricao = new JTextArea();
    jtaDescricao.setFont(new Font("Consolas", Font.PLAIN, 18));
    jtaDescricao.setText("Descrição");
    
    this.add(new JScrollPane(listaAtalhos), BorderLayout.LINE_START);
    this.add(new JScrollPane(jtaDescricao), BorderLayout.CENTER);
  }
}
