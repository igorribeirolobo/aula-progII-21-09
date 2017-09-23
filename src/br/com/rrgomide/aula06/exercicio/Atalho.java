package br.com.rrgomide.aula06.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Atalho {

  private String atalho;
  private String conteudo;
  
  public Atalho(String _atalho, String _conteudo) {
    this.atalho = _atalho;
    this.conteudo = _conteudo;
  }
  
  public String getAtalho() {
    return atalho;
  }  
  
  public String getConteudo() {
    return conteudo;
  } 
  
  @Override
  public String toString() {
    return getAtalho();
  }


  public static List<Atalho> getAtalhosPadrao() {
    
    List<Atalho> atalhos = new ArrayList<Atalho>();
    
    String html = 
      "!<doctype html>\n" +
      "<html>\n" +
      "  <head>\n" +
      "    <meta charset='utf-8'>\n" +
      "    <title></title>\n" +
      "  </head>\n" +
      "  <body>\n" +
      "  </body>\n" +
      "</html>\n" ; 
    String link = "<a src='www.google.com'> Link </a>";
    String img = "<img src='img.jpg' />";
 
    atalhos.add(new Atalho("html", html));
    atalhos.add(new Atalho("link", link));
    atalhos.add(new Atalho("img", img));
    

    return atalhos;
  }  
}
