import java.util.ArrayList;
import java.util.List;

public class Exercício01 {

    public static void main(String[] args) {
        List<Heroi> grupoHerois = new ArrayList<Heroi>();

        try {
            adicionarHeroi(grupoHerois, "Superman");//<---Apenas coloque algum nome igual para funcionar//
            adicionarHeroi(grupoHerois, "Batman");//<---Apenas coloque algum nome igual para funcionar//
            adicionarHeroi(grupoHerois, "Batman");//<---Apenas coloque algum nome igual para funcionar//
            adicionarHeroi(grupoHerois, "Mulher-Maravilha");//<---Apenas coloque algum nome igual para funcionar//
        } catch (NomeRepetidoException e) {
            System.out.println("Os heróis não podem ter nome repetido".toUpperCase());
        }
    }

    public static void adicionarHeroi(List<Heroi> grupoHerois, String nome) throws NomeRepetidoException {
        for (Heroi heroi : grupoHerois) {
            if (heroi.getNome().equals(nome)) {
                throw new NomeRepetidoException();
            }

            {


            }
        }

        class Heroi {
            private String nome;

            public Heroi(String nome) {
                this.nome = nome;
            }

            public String getNome() {
                return nome;
            }
        }

        class NomeRepetidoException extends Exception {

        }


    }}