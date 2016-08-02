
/**
 * Nome: Expressao Tipo: Final Class Descrição: Classe que possui 4 atributos
 * que representa um registro de uma expressão. Obs.: Por ser final, seus
 * atributos não podem ser alterados
 *
 * @author Eberty A.
 *
 */
public final class Expressao {

    private int nivel;
    private char tipo;
    private String expr;
    private double resp;

    public Expressao(int nivel, char tipo, String exp, double resp) {
        setNivel(nivel);
        setTipo(tipo);
        setExpr(exp);
        setResp(resp);
    }

    public void setNivel(int nivel) {
        if (nivel >= 1 && nivel <= 5) { //Certificação de nivel válido
            this.nivel = nivel;
        } else {
            System.out.println("Nivel invalido!");
        }
    }

    public void setTipo(char tipo) {
        switch (tipo) { //Certificação de tipo válido
            case 'a':
            case 's':
            case 'm':
            case 'd':
                this.tipo = tipo;
                break;
            default:
                System.out.println("Tipo invalido!");
                break;
        }
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }

    public void setResp(double resp) {
        this.resp = resp;
    }

    public int getNivel() {
        return nivel;
    }

    public char getTipo() {
        return tipo;
    }

    public String getExpressao() {
        return getExpr();
    }

    public String getExpr() {
        return expr;
    }

    public double getResp() {
        return resp;
    }

    @Override
    public String toString() { //para testes
        return nivel + "    " + tipo + "    " + getExpr() + "   " + getResp();
    }

    public String exibirExpressao() {
        return "Qual a resposta para: " + getExpr() + "? ";
    }

}
