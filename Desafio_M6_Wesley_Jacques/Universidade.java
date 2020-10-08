public class Universidade {
    //Atributos da Classe Mãe
    private String nome;
    private int quantAlunos, quantProfessores;
    
    //Construtor
    public Universidade(String n, int qA, int qP) {
        nome = n;
        quantAlunos = qA;
        quantProfessores = qP;
    }
    
    //Método get para exibir informações e set para altera-las
    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        nome = n;
    }
    public int getQuantAlunos() {
        return quantAlunos;
    }
    public void setQuantAlunos(int qA) {
        quantAlunos = qA;
    }
    public int getQuantProfessores() {
        return quantProfessores;
    }
    public void setQuantProfessores(int qP) {
        quantProfessores = qP;
    }
    
    //Método para imprimir informações cadastradas
    public void imprimeInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Quantidade de alunos: "+quantAlunos);
        System.out.println("Quantidade de professores: "+quantProfessores);
    }
}
