package br.com.rrgomide.aula06.frames;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class ListFrameSingle extends JFrame {

  /*
   * Lista genérica de cores
   */
  private final JList<String> listaCores;

  /*
   * Vetor de descrição das cores em português
   */
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

  /*
   * Vetor de cores enumeradas
   */
  private static final Color[] colors = { 
    Color.BLACK, 
    Color.BLUE, 
    Color.CYAN, 
    Color.DARK_GRAY, 
    Color.GRAY, 
    Color.GREEN,
    Color.LIGHT_GRAY, 
    Color.MAGENTA, 
    Color.ORANGE, 
    Color.PINK, 
    Color.RED, 
    Color.WHITE, 
    Color.YELLOW 
  };

  /*
   * Construtor
   */
  public ListFrameSingle() {

    /*
     * Invocando o construtor e definindo o título do frame
     */
    super("Listagem 'simples'");
    
    //Definindo o layout como FlowLayout
    setLayout(new FlowLayout());

    /*
     * Instanciando a lista de dados através do
     * vetor de cores em português 
     */
    listaCores = new JList<String>(vetorCoresString);
    
    /*
     * Definindo que 10 itens estarão
     * visíveis por vez
     */
    listaCores.setVisibleRowCount(10); 

    /*
     * Definindo que a lista não permitirá seleção múltipla
     */
    listaCores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    /*
     * Adicionando um scrollpane no frame para controlar
     * o movimento da lista de dados
     */
    add(new JScrollPane(listaCores));

    /*
     * Adicionando evento ao se selecionar itens 
     * na lista
     */
    listaCores.addListSelectionListener(new ListSelectionListener() {

      @Override
      public void valueChanged(ListSelectionEvent event) {
        
        /*
         * Definindo a cor de fundo do frame através da associação do
         * índice da lista com o vetor de cores enumeradas
         */
        getContentPane().setBackground(colors[listaCores.getSelectedIndex()]);
      }
    });
    
    /*
     * Definindo operação padrão, tamanho e por fim
     * tornando o frame visível
     */
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setSize(350, 250); 
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setVisible(true);
  }
} 
