public class Privada extends Universidade {
    //Atributos da Classe Filha
    private double valorMensalidade;
    
    //Construtor
    public Privada(String n, int qA, int qP, double vM) {
        super(n, qA, qP);
        this.valorMensalidade = vM;
    }
    
    //Get para exibir e Set para alterar
    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(double vM) {
        valorMensalidade = vM;
    }
    
    //Imprime informações cadastradas, incluindo as informações da classe mãe
    public void imprimeInfo(){
        super.imprimeInfo();
        System.out.println("Valor da mensalidade: R$"+valorMensalidade);
    }

}
