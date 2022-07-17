import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) throws Exception {
        
            Ator a1 = new Ator("Fulana");
            Ator a2 = new Ator("Cicrano");
            Genero g1 = new Genero("Ação e Aventura");
            Filme f1 = new Filme("Programador Assassino", LocalTime.of(02,25), g1);
            Papel p1 = new Papel("Protagonista", a1, f1);
            Papel p2 = new Papel("Coadjuvante", a2, f1);
            Sala s1 = new Sala(10, 100);
            Assento as1 = new Assento("L20", true, s1);
            Sessao ss1 = new Sessao(LocalDate.of(2022,07,16), LocalTime.of(14,00), 20.00, false, s1, f1);
            Ingresso i1 = new Ingresso(true, ss1, as1);

            System.out.println("\n<<<Dados do Ingresso>>>");
            System.out.println("Filme: "+i1.getSessao().getFilme().getTitulo());
            System.out.println("Duração: "+i1.getSessao().getFilme().getDuracao());
            System.out.println("Gênero: "+i1.getSessao().getFilme().getGenero().getDescricao());
            System.out.println("Data da Sessão: "+i1.getSessao().getData());
            System.out.println("Hora da Sessão: "+i1.getSessao().getHora());
            double valorIngresso = i1.getSessao().getValor();
            if(i1.getMeiaEntrada())
              System.out.println("Valor do Ingresso: "+(valorIngresso/2));
            else
              System.out.println("Valor do Ingresso: "+valorIngresso);
            System.out.println("Meia Entrada: "+i1.getMeiaEntrada());
            System.out.println("Numero da Sala: "+i1.getSessao().getSala().getNumero());
            System.out.println("Código do Assento: "+i1.getAssento().getCodigo());
        
    }
}
