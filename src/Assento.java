public class Assento{
  private String codigo;
  private boolean ocupado;
  private Sala sala;

  public Assento(String codigo, boolean valor, Sala sala){
    this.setCodigo(codigo);
    this.setOcupado(valor);
    this.setSala(sala);
  }
  public String getCodigo(){
    return this.codigo;
  }
  public void setCodigo(String codigo){
    this.codigo = codigo;
  }
  public boolean getOcupado(){
    return this.ocupado;
  }
  public void setOcupado(boolean valor){
    this.ocupado = valor;
  }
  public Sala getSala(){
    return this.sala;
  }
  public void setSala(Sala sala){
    this.sala = sala;
  }
}