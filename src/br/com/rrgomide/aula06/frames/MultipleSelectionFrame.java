package br.com.rrgomide.aula06.frames;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame {

  private final JList<String> listaCores;
  private final JList<String> listaCopiada;

  private JButton btCopiar;

  private static final String[] vetorCoresString = { 
    "Preto", 
    "Azul", 
    "Ciano", 
    "Cinza escuro", 
    "Cinza", 
    "Verde",
    "Cinza claro", 
    "Magenta", 
    "Laranja", 
    "Rosa", 
    "Vermelho", 
    "Branco", 
    "Amarelo"
  };

  // MultipleSelectionFrame constructor
  public MultipleSelectionFrame() {
    
    super("Listas com seleção múltipla");    
    this.setLayout(new FlowLayout());

    listaCores = new JList<String>(vetorCoresString); 
    listaCores.setVisibleRowCount(5); 
    
    //Definindo a seleção múltipla
    listaCores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);    

    btCopiar = new JButton("Copiar >>");
    btCopiar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent event) {
        /*
         * Copiando os itens selecionados para a lista da direita, eliminando o
         * que já existia
         */
        listaCopiada
          .setListData(
            listaCores
              .getSelectedValuesList()
              .toArray(new String[0])
            );
      }
    });

    listaCopiada = new JList<String>(); 
    listaCopiada.setVisibleRowCount(5); 
    
    /*
     * Definindo largura e altura da lista
     */
    listaCopiada.setFixedCellWidth(100); 
    listaCopiada.setFixedCellHeight(15); 
    
    listaCopiada.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    
    /*
     * Adicionando as listas (com scrolls) e o botão
     */
    this.add(new JScrollPane(listaCores)); 
    this.add(btCopiar); // add copy button to JFrame
    this.add(new JScrollPane(listaCopiada));   
    
    /*
     * Definindo operação padrão, tamanho e por fim
     * tornando o frame visível
     */
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setSize(350, 150); 
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setVisible(true);   
  }
} 
