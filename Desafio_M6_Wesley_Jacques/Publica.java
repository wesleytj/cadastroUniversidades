public class Publica extends Universidade {
    //Atributos da Classe Filha
    private String estado, cidade;
    
    //Construtor
    public Publica(String n, int qA, int qP, String e, String c) {
        super(n, qA, qP);
        estado = e;
        cidade = c;
    }
    
    //Get para exibir e Set para alterar
    public String getEstado() {
        return estado;
    }

    public void setEstado(String e) {
        estado = e;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String c) {
        cidade = c;
    }
    
    //Imprime informações cadastradas, incluindo as informações da classe mãe
    public void imprimeInfo(){
        super.imprimeInfo();
        System.out.println("Estado: "+estado);
        System.out.println("Cidade: "+cidade);
    }
    
}
