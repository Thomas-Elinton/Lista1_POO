
package Exercicio_1;

import javax.swing.JOptionPane;

public class Main {

    
    public static void main(String[] args) {
        
        int opc = 0;
        Pessoa pessoa = null;
        String CPF , Nome;
        char Sexo;
        int Idade;
        
        while (opc !=  3) {
        opc = Integer.parseInt(        
        JOptionPane.showInputDialog("1 - Criar Pessoa \n 2 - Mostrar Pessoa \n 3 -  Sair"));
         
        switch (opc){
            case 1 :
                CPF = JOptionPane.showInputDialog("Digite o CPF:");
                Nome = JOptionPane.showInputDialog("Digite o Nome:");
                Sexo = JOptionPane.showInputDialog("Digite o Sexo:").charAt(0);
                Idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade:"));
                pessoa = new Pessoa();
                pessoa.setCPF(CPF);
                pessoa.setNome(Nome);
                pessoa.setSexo(Sexo);
                pessoa.setIdade(Idade);
                break;
            case 2 :
                if(pessoa == null)
                    JOptionPane.showInternalMessageDialog(null, "Nenhuma Pessoa Cadastrada", "Atenção", 
                            JOptionPane.ERROR_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, pessoa.imprimir());
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