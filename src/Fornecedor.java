public class Fornecedor extends Pessoa{
    private int valorCredito;
    private int valorDivida;
    private int saldo;
        
    public Fornecedor( ){
        super();
        
        
    }

    public Fornecedor(String nome, String endereco, String telefone){
        super(nome, endereco, telefone);

    }

    public int getValorCredito() {
        System.out.printf("%nO credito é %d%n", this.valorCredito);
        return valorCredito;
    }

    public void setValorCredito(int valorCredito) {

        this.valorCredito = valorCredito;
    }

    public int getValorDivida() {
        System.out.printf("%nO deficit é %d%n", this.valorDivida);
        return valorDivida;
    }
    public void setValorDivida(int valorDivida) {
        this.valorDivida = valorDivida;
    }

    public void obterSaldo(){

        this.saldo = this.valorCredito - this.valorDivida;
        System.out.printf("%nO saldo é %d%n", this.saldo);
    }


    public static void main(String[] args){
        //contructor 1
        Fornecedor cliente = new Fornecedor();

        cliente.setValorCredito(100);
        cliente.setValorDivida(50);
        cliente.getValorCredito();
        cliente.getValorDivida();
        cliente.obterSaldo();
        //constructor 2
        Fornecedor cliente2 = new Fornecedor("Rubens", "Salvador-BA", "71988631495");

        cliente2.setValorCredito(6000);
        cliente2.setValorDivida(1500);
        cliente2.getValorCredito();
        cliente2.getValorDivida();
        cliente2.obterSaldo();


    }
}
