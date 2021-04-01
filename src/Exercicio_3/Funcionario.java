
package Exercicio_3;


public class Funcionario {
    
    //Atributos
    
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHra;
    private float qtdHra;
    private float salario;
    private float valorDesc;
       
    
    //Metodos

    public int getCracha() {
        return cracha;
    }

    public String getNome() {
        return nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public float getValorHra() {
        return valorHra;
    }

    public float getQtdHra() {
        return qtdHra;
    }

    public float getSalario() {
        return salario;
    }

    public float getValorDesc() {
        return valorDesc;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public void setValorHra(float valorHra) {
        this.valorHra = valorHra;
    }

    public void setQtdHra(float qtdHra) {
        this.qtdHra = qtdHra;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setValorDesc(float valorDesc) {
        this.valorDesc = valorDesc;
    }
    
    public float CalularSalario (){
        
        if(this.getTipoVinculo() == "H".charAt(0)){
            return valorHra * qtdHra - valorDesc;
            
        }else
            return salario - valorDesc ;
    }
    public float CalcularSalario (float valorHra, float qtdHra, float salario){
      if(this.getTipoVinculo() == "H".charAt(0)){
          return valorHra * qtdHra;
          
      }else 
          return salario;
    }
    public String imprimir(){
        return "Cracha:" + cracha + "\n Nome:" + nome + "\n TipoVinculo:" + tipoVinculo
                +"\n Valor Hora:" + valorHra + "\nQuantidade Hra:" + qtdHra +  "\nSalario R$:" + CalcularSalario(valorHra, qtdHra, salario)
                +"\nValor Desconto R$:" + valorDesc + "\nValor a Receber R$"+ CalularSalario ();
        }
}
    

