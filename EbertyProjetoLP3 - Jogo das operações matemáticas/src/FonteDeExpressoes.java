
/**
 * Nome: FonteDeExpressoes Tipo: Classe Descrição: Classe possui um método que
 * retorna uma lista do tipo ArrayList<Expressao> lida a partir de um arquivo.
 * Obs.: arquivo no formato: nivel tipo expressao resposta
 *
 * @author Eberty A.
 *
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FonteDeExpressoes {

    public static int totExp = 0; //por ser static é igual para todas as FontesDeExpr e funciona como o size do ArrayList.
    ArrayList<Expressao> lista;

    public FonteDeExpressoes() {
        LerExpressao();
    }

    private void LerExpressao() {
        BufferedReader br = null;
        lista = new ArrayList<>();

        try { //Tenta fazer, por ser uma exeption ele faz o tratamento de erro
            String s;
            br = new BufferedReader(new FileReader("Lp3.txt"));
            String strAux[]; //= new String[4];

            while ((s = br.readLine()) != null) {
                //StringTokenizer tokens = new StringTokenizer(s);
                //Expressao aux = new Expressao(Integer.parseInt(tokens.nextToken("\t")), tokens.nextToken("\t").charAt(0),tokens.nextToken("\t"), Double.parseDouble(tokens.nextToken()));
                strAux = s.split("\t");
                Expressao aux = new Expressao(Integer.parseInt(strAux[0]), strAux[1].charAt(0), strAux[2], Double.parseDouble(strAux[3]));
                totExp++; //ver quantas expressoes tem ao todo
                lista.add(aux);
            }
        } catch (IOException e) { //tratamento de erro
            e.printStackTrace();
        } finally { //sempre faz, independentemente de onde entrou no try
            try {
                if (br != null) { //fecha o arquivo ja lido
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public ArrayList<Expressao> GetLista() {
        return lista;
    }
}
