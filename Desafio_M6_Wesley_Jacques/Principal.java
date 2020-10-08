public class Principal{
    
    public static void main(String [] args){        
        //Instanciando objetos
        Universidade[] uni = new Universidade[Teclado.leInt("Digite o tamanho máximo do Array: ")];        
        MEC m = new MEC();  
        

        
        for(int i=0; i<uni.length; i++){
            int tipoUni = Teclado.leInt("Qual tipo de Universidade deseja criar? [1- Privada 2- Pública 0- Encerrar] ");

            if(tipoUni == 1){                
                    uni[i] = new Privada(Teclado.leString("Digite o nome da Universidade: "),Teclado.leInt("Digite a quantidade de Alunos: "),
                        Teclado.leInt("Digite a Quantidade de Professores: "),Teclado.leDouble("Digite o valor da mensalidade: "));

                                
            }
            else if(tipoUni == 2){                
                    uni[i] = new Publica(Teclado.leString("Digite o nome da Universidade: "),Teclado.leInt("Digite a quantidade de Alunos: "),
                        Teclado.leInt("Digite a Quantidade de Professores: "),Teclado.leString("Digite o Estado: "),Teclado.leString("Digite a Cidade: "));

                
            }
            else if(tipoUni == 0){
                System.out.println("Cadastramento encerrado!");
                break;
            }
            else
                System.out.println("!!!ERROR!!! Tipo de Universidade incorreta."); 
        }
        
        System.out.println("");
        System.out.println(">>> Informações Cadastradas <<<");
        System.out.println("");
        m.imprimeUniversidade(uni); 
        System.out.println("");
        m.privadaMaisCara(uni);
        System.out.println("");
        m.universidadesDoSul(uni);
        
        
    }

}