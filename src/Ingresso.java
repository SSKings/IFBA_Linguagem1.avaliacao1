public class Ingresso {
  private boolean meiaEntrada;
  private Sessao sessao;
  private Assento assento;

  public Ingresso(boolean meiaEntrada, Sessao sessao, Assento assento){
    this.setMeiaEntrada(meiaEntrada);
    this.setSessao(sessao);
    this.setAssento(assento);
  }
  public boolean getMeiaEntrada(){
    return this.meiaEntrada;
  }
  public void setMeiaEntrada(boolean meiaEntrada){
    this.meiaEntrada = meiaEntrada;
  }
  public Sessao getSessao(){
    return this.sessao;
  }
  public void setSessao(Sessao sessao){
    this.sessao = sessao;
  }
  public Assento getAssento(){
    return this.assento;
  }
  public void setAssento(Assento assento){
    this.assento = assento;
  }
  
}