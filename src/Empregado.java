

public class Empregado extends Pessoa{
    private int codigoSetor;
    private int salarioBase = 1400;
    private int imposto = 12;

    public Empregado(){
        super();
    }

    public Empregado(String nome, String endereco, String telefone){
        super(nome, endereco, telefone);

    }

    public int getCodigoSetor() {
        System.out.printf("%nO codigo do setor é %d%n", this.codigoSetor);
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public int getSalarioBase() {
        System.out.printf("%nO salario bruto é %d%n", this.salarioBase);
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getImposto() {
        System.out.printf("%nO imposto em porcentagem é %d%n", this.imposto);
        return imposto;

    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }

    public int calcularSalario(){
        int salarioLiquido = salarioBase - ((this.imposto * this.salarioBase) / 100);
        System.out.printf("O salario liquido é %d%n", salarioLiquido);
        return salarioLiquido;
    }



    public static void main(String[] args){

        Empregado empregado = new Empregado();

        empregado.setCodigoSetor(50162752);
        empregado.getCodigoSetor();
        empregado.setSalarioBase(1400);
        empregado.getSalarioBase();
        empregado.setImposto(14);
        empregado.getImposto();
        empregado.calcularSalario();

        Empregado empregado2 = new Empregado("samuel", "Salvador-BA", "71988121122");

        empregado2.setCodigoSetor(50162752);
        empregado2.getCodigoSetor();
        empregado2.setSalarioBase(1400);
        empregado2.getSalarioBase();
        empregado2.setImposto(14);
        empregado2.getImposto();
        empregado2.calcularSalario();


    }
}
