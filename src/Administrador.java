
public class Administrador extends Empregado{
    private int ajudaDeCusto = 0;

    public Administrador(){
        super();
    }

    public Administrador(String nome, String endereco, String telefone){
        super(nome, endereco, telefone);
    }

    public int getAjudaDeCusto() {
        System.out.println(ajudaDeCusto);
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(int ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public int calcularSalario(){
        int salarioLiquido = super.getSalarioBase() - ((getImposto() * getSalarioBase()) / 100) + this.ajudaDeCusto;

        System.out.printf("O salario liquido é %d", salarioLiquido);
        return salarioLiquido;
    }



    public static void main(String[] args){
        Administrador diretor = new Administrador();


        Administrador diretor2 = new Administrador("luana", "sao-paulo", "11999435629");
        diretor2.getImposto();
        diretor2.setAjudaDeCusto(1000);
        diretor2.getAjudaDeCusto();
        diretor2.calcularSalario();


    }
}
