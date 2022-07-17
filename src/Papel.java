public class Papel{
  private String nome;
  private Ator ator;
  private Filme filme;

  public Papel(String nome, Ator ator, Filme filme){
    this.setNome(nome);
    this.setAtor(ator);
    this.setFilme(filme);
  }
  public String getNome(){
    return this.nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public Ator getAtor(){
    return this.ator;
  }
  public void setAtor(Ator ator){
    this.ator = ator;
  }
  public Filme getFilme(){
    return this.filme;
  }
  public void setFilme(Filme filme){
    this.filme = filme;
  }
}