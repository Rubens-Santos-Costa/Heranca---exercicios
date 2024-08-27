public class Vendedor extends Empregado {
    private int valorVendas;
    private int comissao; 


    public Vendedor() {
        super();
    }

    public Vendedor(String nome, String endereco, String telefone){
        super(nome, endereco, telefone);

    }


    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(int valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }


   
    public int  calcularSalario() {
        return super.calcularSalario() + (this.valorVendas * this.comissao / 100);
    }


    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Ana", "Rua E", "7766554433");
        vendedor.setComissao(850);
        vendedor.setValorVendas(300);
        System.out.println("Salário de " + vendedor.getNome() + ": " + vendedor.calcularSalario());
        System.out.println("Valor das Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao());
    }
}
