public class Pessoa{
    private String nome;
    private String endereco;
    private String telefone;


    public Pessoa(){
        System.out.println("*********************");
        System.out.println("Uma pessoa foi criada");

    }

    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        System.out.printf("%n*********************%n");
        System.out.println("Uma pessoa foi criada");
        System.out.printf("%nSeu nome é %s", this.nome);
        System.out.printf("%nSeu telefone é %s%n", this.telefone);
    }


    public Pessoa(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        System.out.printf("%n*********************%n");
        System.out.println("Uma pessoa foi criada");
        System.out.printf("%nSeu nome é %s%n", this.nome);
        System.out.printf("%nSeu telefone é %s%n", this.telefone);
        System.out.printf("%nSeu endereco é %s%n", this.endereco);   
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }







public static void main (String [] args){
    
    //Exercicio1 app = new Exercicio1();


    Pessoa ana = new Pessoa();
    Pessoa bruno =  new Pessoa("Bruno", "71988631495");
    Pessoa maria =  new Pessoa("Maria", "Salvador-BA", "71988631495");


}
}


