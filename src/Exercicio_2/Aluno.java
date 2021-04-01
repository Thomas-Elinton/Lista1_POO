
package Exercicio_2;


public class Aluno {
    
    //Atributos
    
    private String RA;
    private String Nome;
    private Float AC1;
    private Float AC2;
    private Float AG;
    private Float AF;
    
    // Metodos

    public String getRA() {
        return RA;
    }

    public String getNome() {
        return Nome;
    }

    public Float getAC1() {
        return AC1;
    }

    public Float getAC2() {
        return AC2;
    }

    public Float getAG() {
        return AG;
    }

    public Float getAF() {
        return AF;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setAC1(Float AC1) {
        this.AC1 = AC1;
    }

    public void setAC2(Float AC2) {
        this.AC2 = AC2;
    }

    public void setAG(Float AG) {
        this.AG = AG;
    }

    public void setAF(Float AF) {
        this.AF = AF;
    }
    
    public float CalculaMedia (){
        return (float) ((AC1 * 0.15) + (AC2 *0.30) + (AG * 0.10) + (AF * 0.45));

    }
    
    public String VerAprovaçao (){
        if(CalculaMedia ()>= 5)
            return "Aprovado";
        else
            return "Reprovado";
    }
    public String imprimir(){
        return "RA:" + RA + "\n Nome:" + Nome + "\n AC1:" + AC1 +"\n AC2:" + AC2 + "\nAG:" + AG + "\nAF:" + AF + "\nMédia:" + CalculaMedia () + "\nSituação:" + VerAprovaçao ();
    }
    
}

