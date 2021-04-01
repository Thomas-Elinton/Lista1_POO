
package Exercicio_3;


import javax.swing.JOptionPane;


public class Main {
    
    public static void main(String[] args) {
        
        int opc = 0;
        Funcionario funcionario = null;
        int cracha;
        String nome;
        char tipoVinculo = 0;
        float valorHra = 0;
        float qtdHra = 0;
        float salario;
        float valorDesc = 0;
        
        while (opc !=  4) {
        opc = Integer.parseInt(        
        JOptionPane.showInputDialog("1 - Criar Funcionario"
                + " \n 2 - Mostrar Folha de Pagamento \n 3 -  Alterar remuneração \n 4 - Sair"));
        
        switch (opc){
            case 1 :
                tipoVinculo = JOptionPane.showInputDialog("Digite o Tipo Vinculo: ").toUpperCase().charAt(0);  
                if (tipoVinculo == "H".charAt(0)) {                              
                   nome = JOptionPane.showInputDialog("Digite o Nome: ");
                   cracha = Integer.parseInt(JOptionPane.showInputDialog("Digite o Crachá:")); 
                   valorHra = Integer.parseInt(JOptionPane.showInputDialog("Valor por Hora: "));  
                   qtdHra = Integer.parseInt(JOptionPane.showInputDialog("Horas Trabalhadas: "));
                   valorDesc = Integer.parseInt(JOptionPane.showInputDialog("Valor Desconto: "));
                   
                } else {
                    nome = JOptionPane.showInputDialog("Digite o Nome ");
                   cracha = Integer.parseInt(JOptionPane.showInputDialog("Digite o Crachá")); 
                    salario = Integer.parseInt(JOptionPane.showInputDialog("Salário: "));
                    valorDesc = Float.parseFloat(JOptionPane.showInputDialog("Valor à Descontar"));
                    
                    funcionario = new Funcionario();
                    funcionario.setCracha(cracha);
                    funcionario.setNome(nome);
                    funcionario.setTipoVinculo(tipoVinculo);
                    funcionario.setValorHra(valorHra);
                    funcionario.setQtdHra(qtdHra);
                    funcionario.setSalario(salario);
                    funcionario.setValorDesc(valorDesc);
                }   
   
                break;
            case 2 :
                if(funcionario != null)
                    JOptionPane.showMessageDialog(null, funcionario.imprimir());
                   
                    
                else
                     JOptionPane.showMessageDialog(null, "Nenhum Funcionario Cadastrado", "Atenção",
                            JOptionPane.ERROR_MESSAGE);
                break;
            case 3 :
                if(tipoVinculo == 'H'){
                    valorHra = Integer.parseInt(JOptionPane.showInputDialog("Valor hora"));
                    funcionario.setValorHra(valorHra);
                    qtdHra = Integer.parseInt(JOptionPane.showInputDialog("Quantidade Horas"));
                    funcionario.setQtdHra(qtdHra);
                    
                }else{
                    salario = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
                    funcionario.setSalario(salario);
                }
                break;
                
            case 4 :
                JOptionPane.showMessageDialog(null, "Obrigado");
                   break;
            default :
                JOptionPane.showMessageDialog(null," Opção Inválida" , "Atenção", JOptionPane.ERROR_MESSAGE );
                break;
             
    }
    }
}
}