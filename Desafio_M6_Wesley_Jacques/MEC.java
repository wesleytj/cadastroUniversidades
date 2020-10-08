public class MEC{
    
    //Método que exibe se a Universidade é Privada ou Pública
    public void imprimeUniversidade(Universidade[]uni){

        for(int i=0; i<uni.length; i++){
            if(uni[i] instanceof Privada){                
                uni[i].imprimeInfo();     
                System.out.println("Tipo: Privada");
                System.out.println("");
            }

            else if(uni[i] instanceof Publica){                
                uni[i].imprimeInfo();
                System.out.println("Tipo: Pública");
                System.out.println("");
            }
        }        
    }
    
    //Método que exibe a universidade privada mais cara
    public void privadaMaisCara(Universidade[] uni){  
        double valor = 0;  
        int j = 0;
        for(int i=0; i<uni.length; i++){
            if(uni[i] instanceof Privada){
                if(((Privada)uni[i]).getValorMensalidade() > valor){
                    valor = ((Privada)uni[i]).getValorMensalidade();                
                    j = i;    
                }
            }
        }
        System.out.println("Universidade mais cara: ");
        ((Privada)uni[j]).imprimeInfo();
    } 

    //Método que exibe todas as universidades da região Sul
    public void universidadesDoSul(Universidade[]uni){
        for(int i=0; i<uni.length; i++){
            if(uni[i] instanceof Publica){
                if(((Publica)uni[i]).getEstado().equalsIgnoreCase("RS")){
                    System.out.println("Universidade do Rio Grande do Sul: ");
                    uni[i].imprimeInfo();
                }      
                else if(((Publica)uni[i]).getEstado().equalsIgnoreCase("SC")){
                    System.out.println("Universidade de Santa Catarina: ");
                    uni[i].imprimeInfo();
                }
                else if(((Publica)uni[i]).getEstado().equalsIgnoreCase("PR")){
                    System.out.println("Universidade do Paraná: ");
                    uni[i].imprimeInfo();
                }                  
            }    

        }

    }
}