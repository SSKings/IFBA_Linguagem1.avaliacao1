import java.time.LocalDate;
import java.time.LocalTime;

public class Sessao{
  private LocalDate data;
  private LocalTime hora;
  private double valor;
  private boolean encerrada;
  private Sala sala;
  private Filme filme;

public Sessao(LocalDate data, LocalTime hora, double valor, boolean encerrada, Sala sala, Filme filme){
    this.setData(data);
    this.setHora(hora);
    this.setValor(valor);
    this.setEncerrada(encerrada);
    this.setSala(sala);
    this.setFilme(filme);
    
  }
  public LocalDate getData(){
    return this.data;
  }
  public void setData(LocalDate data){
    this.data = data;
  }
  public LocalTime getHora(){
    return this.hora;
  }
  public void setHora(LocalTime hora){
    this.hora = hora;
  }
  public double getValor(){
    return this.valor;
  }
  public void setValor(double valor){
    this.valor = valor;
  }
  public boolean getEncerrada(){
    return this.encerrada;
  }
  public void setEncerrada(boolean encerrada){
    this.encerrada = encerrada;
  }
  public Sala getSala(){
    return this.sala;
  }
  public void setSala(Sala sala){
    this.sala = sala;
  }
  public Filme getFilme(){
    return this.filme;
  }
  public void setFilme(Filme filme){
    this.filme = filme;
  }
}