
package Exercicio_1;


public class Pessoa {
    
    //Atributos
    private String CPF;
    private String Nome;
    private char Sexo;
    private int Idade;
    
    // Metodos
    
    public void  setCPF(String CPF){   
        this.CPF = CPF;
    }
    public String getCPF (){
        return CPF;
    }
    public void setNome (String Nome){
        this.Nome = Nome;
    }
     public String getNome (){
        return Nome;
     }
     public void  setSexo(char Sexo){   
        this.Sexo = Sexo;
     }
     public char getSexo (){
        return Sexo;
     }
     public void  setIdade(int Idade){   
        this.Idade = Idade;
     }
     public String imprimir(){
        return "CPF:" + CPF + "\n Nome:" + Nome + "\n Sexo:" + Sexo +"\n idade:" + Idade;
     }

    void setSexo(String Sexo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setIdade(String Idade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
