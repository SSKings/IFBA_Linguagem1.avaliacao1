public class Sala{
  private int numero;
  private int capacidade;

  public Sala(int numero, int capacidade){
    this.setNumero(numero);
    this.setCapacidade(capacidade);
  }
  public int getNumero(){
    return this.numero;
  }
  public void setNumero(int numero){
    this.numero = numero;
  }
  public int getCapacidade(){
    return this.capacidade;
  }
  public void setCapacidade(int capacidade){
    this.capacidade = capacidade;
  }
  
}