public class Operario extends Empregado {
    private int valorProducao;
    private int  comissao; 

    public Operario() {
        super();
    }
    public Operario(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }



    public int getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(int valorProducao) {
        this.valorProducao = valorProducao;
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }


    public int calcularSalario() {

        int salarioLiquido = getSalarioBase() - ((getImposto() * getSalarioBase()) / 100);
        this.comissao = (this.valorProducao * this.comissao / 100);
        int resultado = getSalarioBase() + this.comissao;
        System.out.printf("O salario liquido é %d%n", resultado);
        return resultado;
    }

    // Método de teste
    public static void main(String[] args) {
        Operario operario = new Operario("Virginia", "Esplanada-BA", "79984851623");
        
        operario.setComissao(250);
        operario.setValorProducao(250);
        System.out.println("Salário de " + operario.getNome() + ": " + operario.calcularSalario());
        System.out.println("Valor da Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao());
    }
}
