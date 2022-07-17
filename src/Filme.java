import java.time.LocalTime;

public class Filme{
  private String titulo;
  private LocalTime duracao;
  private Genero genero;

  public Filme(String titulo, LocalTime duracao, Genero genero){
    this.setTitulo(titulo);
    this.setDuracao(duracao);
    this.setGenero(genero);
    
  }
  public String getTitulo(){
    return this.titulo;
  }
  public void setTitulo(String titulo){
    this.titulo = titulo;
  }
  public LocalTime getDuracao(){
    return this.duracao;
  }
  public void setDuracao(LocalTime duracao){
    this.duracao = duracao;
  }
  public Genero getGenero(){
    return this.genero;
  }
  public void setGenero(Genero genero){
    this.genero = genero;
  }
}