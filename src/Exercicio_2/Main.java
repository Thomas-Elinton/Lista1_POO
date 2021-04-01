 
package Exercicio_2;


import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        
        int opc = 0;
        Aluno aluno = null;
        String RA;
        String Nome;
        float AC1;
        float AC2;
        float AG;
        float AF;
        
    
    while (opc !=  3) {
        opc = Integer.parseInt(        
        JOptionPane.showInputDialog("1 - Criar Aluno"
                + " \n 2 - Mostrar Aluno \n 3 -  Sair"));
         
        switch (opc){
            case 1 :
                RA = JOptionPane.showInputDialog("Digite o RA:");
                Nome = JOptionPane.showInputDialog("Digite o Nome:");
                AC1 = Float.parseFloat(JOptionPane.showInputDialog("Digite Nota AC1:"));
                AC2= Float.parseFloat(JOptionPane.showInputDialog("Digite Nota AC2:"));
                AG = Float.parseFloat(JOptionPane.showInputDialog("Digite Nota AG:"));
                AF = Float.parseFloat(JOptionPane.showInputDialog("Digite Nota AF:"));
                aluno = new Aluno(); // Construtor
                aluno.setRA(RA);
                aluno.setNome(Nome);
                aluno.setAC1(AC1);
                aluno.setAC2(AC2);
                aluno.setAG(AG);
                aluno.setAF(AF);
                
                break;
            case 2 :
                if(aluno == null)
                    JOptionPane.showInternalMessageDialog(null, "Nenhum Aluno Cadastrado", "Atenção", 
                            JOptionPane.ERROR_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, aluno.imprimir());
                break;
            case 3 :
                
                break;
            default :
                JOptionPane.showMessageDialog(null," Opção Inválida" , "Atenção", JOptionPane.ERROR_MESSAGE );
                break;
    }
    

        }
    }
}
    

