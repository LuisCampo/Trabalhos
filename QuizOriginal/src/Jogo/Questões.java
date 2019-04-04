/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;
import javax.swing.JOptionPane;
/**
 *
 * @author internet
 */
public class Questoes/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;
import javax.swing.JOptionPane;
/**
 *
 * @author internet
 */
public class Quest�es {
    
    String nome;
    int pergunta1;
    int pergunta2;
    int pergunta3;
    int pergunta4;
    int pergunta5;
    int pergunta6;
    int pergunta7;
    int pergunta8;
    int pergunta9;
    int pergunta10;
    int P=0;
    
    public void usuario(){
      nome = JOptionPane.showInputDialog("Insira seu nome"); 
    }
    public void Questao1(){
    pergunta1 = Integer.parseInt(JOptionPane.showInputDialog("Em qual país e ano foi disputada a primeira copa do mundo?" 
            + "\n" + "1- 1930 no Uruguai" 
            + "\n" + "2- 1938 na França" 
            + "\n" + "3- 1950 no Brasil"
            + "\n" + "4- 1954 na Suíça"
            + "\n" + "5- 1958 na Suécia"));
    switch(pergunta1){
        case 1:
            JOptionPane.showMessageDialog(null, "!!Parabéns!!");
            P++;
        break;
        case 2:
            JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
        break;
        case 3:
            JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
        break;
        case 4:
            JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
        break;
        case 5:
            JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
        break;
        }//Fim do switch
    }//Fim da primeira questão
    
    public void Questao2(){
        pergunta2 = Integer.parseInt(JOptionPane.showInputDialog("Quem é o jogador que mais marcou gols em copas do mundo?"
                + "\n" + "1- Gerd Müller"
                + "\n" + "2- Pelé"
                + "\n" + "3- David Villa"
                + "\n" + "4- Ronlado"
                + "\n" + "5- Miroslav Klose"));
        switch(pergunta2){
            case 1:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 2:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 3:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 4:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 5:
                JOptionPane.showMessageDialog(null, "!!Parabéns!!");
                P++;
            break;
        }//Fim do switch
    }//FIm da segunda questão
    
    public void Questao3(){
        pergunta3 = Integer.parseInt(JOptionPane.showInputDialog("Qual a única seleção que disputou todas as 20 edições de copa do mundo?"
                + "\n" + "1- Alemanha"
                + "\n" + "2- Brasil"
                + "\n" + "3- Inglaterra"
                + "\n" + "4- Argentina"
                + "\n" + "5- Itália"));
        switch(pergunta3){
            case 1:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 2:
                JOptionPane.showMessageDialog(null, "!!Parabéns!!");
                P++;
            break;
            case 3:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 4:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 5:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
        }//Fim do switch
    }//Fim da terceira questão 
    
    public void Questao4(){
        pergunta4 = Integer.parseInt(JOptionPane.showInputDialog("qual destes jogadores disputou três finais de copa do mundo?"
                + "\n" + "1- Cafú"
                + "\n" + "2- Zidane"
                + "\n" + "3- Rivaldo"
                + "\n" + "4- Leônidas da Silva"
                + "\n" + "5- Arjen Robben"));
        switch(pergunta4){
            case 1:
                JOptionPane.showMessageDialog(null, "!!Parabéns!!");
                P++;
            break;
            case 2:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 3:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 4:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 5:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
        }//Fim do switch
    }//Fim da quarta qquestão
    
    public void Questao5(){
        pergunta5 = Integer.parseInt(JOptionPane.showInputDialog("Qual destes goleiros tomou mais gols em copa do mundo?"
                + "\n" + "1- Al Deayea"
                + "\n" + "2- Ramon Quiroza"
                + "\n" + "3- Júlio César"
                + "\n" + "4- Casillas"
                + "\n" + "5- Oliver Kahn"));
        switch(pergunta5){
            case 1:
                JOptionPane.showMessageDialog(null, "!!Parabéns!!");
                P++;
            break;
            case 2:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 3:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 4:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 5:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
        }//Fim do switch 
    }//Fim da Quinta questão
    
    public void Questao6(){
        pergunta6 = Integer.parseInt(JOptionPane.showInputDialog("Qual foi o país sede da copa do mundo de 1998?"
                + "\n" + "1- �?frica do Sul"
                + "\n" + "2- Itália"
                + "\n" + "3- Brasil"
                + "\n" + "4- França"
                + "\n" + "5- Espanha"));
        switch(pergunta6){
            case 1:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 2:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 3:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 4:
                JOptionPane.showMessageDialog(null, "!!Parabéns!!");
                P++;
            break;
            case 5:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
        }//Fim do switch
    }//Fim da Sexta questão
    
    public void Questao7(){
        pergunta7 = Integer.parseInt(JOptionPane.showInputDialog("Quantas Edições de copas do mundo o Jogador Pelé Disputou?"
                + "\n" + "1- 2 Copas"
                + "\n" + "2- 3 Copas"
                + "\n" + "3- 4 Copas"
                + "\n" + "4- 5 Copas"
                + "\n" + "5- 6 Copas"));
        switch(pergunta7){
            case 1:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 2:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 3:
                JOptionPane.showMessageDialog(null, "!!Parabéns!!");
                P++;
            break;
            case 4:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 5:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
        }//Fim do switch
    }//Fim da Setima quetão
    
    public void Questao8(){
        pergunta8 = Integer.parseInt(JOptionPane.showInputDialog(" Em que dia e mês começa a copa do mundo de 2018?"
                + "\n" + "1- 2 de Maio"
                + "\n" + "2- 8 de Maio"
                + "\n" + "3- 10 de Junho"
                + "\n" + "4- 14 de Junho"
                + "\n" + "5- 16 de Junho"));
        switch(pergunta8){
            case 1:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 2:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 3:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 4:
                JOptionPane.showMessageDialog(null, "!!Parabéns!!");
                P++;
            break;
            case 5:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
        }//Fim do switch
    }//Fim da Oitava questão
    
    public void Questao9(){
        pergunta9 = Integer.parseInt(JOptionPane.showInputDialog("Qual o país sede da copa do mundo de 2018?"
                + "\n" + "1- Uruguai"
                + "\n" + "2- Holanda"
                + "\n" + "3- Rússia"
                + "\n" + "4- México"
                + "\n" + "5- Inglaterra"));
        switch(pergunta9){
            case 1:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 2:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 3:
                JOptionPane.showMessageDialog(null, "!!Parabéns!!");
                P++;
            break;
            case 4:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 5:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
        }//Fim do switch
    }//Fim da Nona questão 
    
    public void Questao10(){
        pergunta10 = Integer.parseInt(JOptionPane.showInputDialog("Quantos times irão disputar a copa do mundo de 2018?"
                + "\n" + "1- 26 Times"
                + "\n" + "2- 28 Times"
                + "\n" + "3- 30 Times"
                + "\n" + "4- 32 Times"
                + "\n" + "5- 34 Times"));
        switch(pergunta10){
            case 1:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 2:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 3:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
            case 4:
                JOptionPane.showMessageDialog(null, "!!Parabéns!!");
                P++;
            break;
            case 5:
                JOptionPane.showMessageDialog(null, ":( Não Foi Dessa Vez ):");
            break;
        }//Fim do switch 
    }// Fim da Decima questão
    
    public void Resultado(){
        JOptionPane.showMessageDialog(null, nome + " " + P + " PONTOS"); 
    }

    private int nome(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
