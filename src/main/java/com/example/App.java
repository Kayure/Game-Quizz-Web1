package com.example;

import java.util.ArrayList;
import java.util.Arrays;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {  
   
    
   

    @Override
    public void start(Stage stage) throws Exception{ 
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        
     
       

        //TEXTO 1
        Text texto = new Text("Digite um numero");
        root.getChildren().add(texto);        
        TextField tfNumero1 = new TextField();
        root.getChildren().add(tfNumero1);  
        
        //CONVERTE PRA STRING
        //String n1 = String.valueOf(tfNumero1.getText());
        
       

        //TEXTO 2
        Text texto2 = new Text("Digite um numero");
        root.getChildren().add(texto2);
        TextField tfNumero2 = new TextField();
        root.getChildren().add(tfNumero2);
        

        //TEXTO 3
        Text texto3 = new Text("Digite um numero");
        root.getChildren().add(texto3);
        TextField tfNumero3 = new TextField();
        root.getChildren().add(tfNumero3);

        //TEXTO 4
        Text texto4 = new Text("Digite um numero");
        root.getChildren().add(texto4);
        TextField tfNumero4 = new TextField();
        root.getChildren().add(tfNumero4);

        //TEXTO 5
        Text texto5 = new Text("Digite um numero");
        root.getChildren().add(texto5);
        TextField tfNumero5 = new TextField();
        root.getChildren().add(tfNumero5);

        //CRIA BOTÃO
        Button btAcao = new Button("OK, ORDENE OS NUMEROS");
        root.getChildren().add(btAcao);
        
       

        //MOSTRA FRASE NA TELA
        Text txtResultado = new Text("Clique em ok quando concluido");
        root.getChildren().add(txtResultado);
                        

        //CRIA UM EVENTO
        System.out.print("Criando a Ação do botão...");
        btAcao.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {        
                
                String numeroDigitado = tfNumero1.getText();
               // System.out.println(numeroDigitado);

               
                 //CONVERTE PRA INT
                 int n1 = Integer.valueOf(tfNumero1.getText());
                 int n2 = Integer.valueOf(tfNumero2.getText());
                 int n3 = Integer.valueOf(tfNumero3.getText());
                 int n4 = Integer.valueOf(tfNumero4.getText());
                 int n5 = Integer.valueOf(tfNumero5.getText());

                 //CRIA VETOR COM AS 5 POSIÇÕES
                 int vetor[] = {n1,n2,n3,n4,n5};
                
                   Arrays.sort(vetor);

                   //ORDENA O VETOR
                   System.out.println("Números ordenados:");
                   for(int numero : vetor)
                       System.out.println(numero);

                       //txtResultado.setText("Numeros ordenados", numero);

                      // String numeroOrdenado = numero.getText();

                      // txtResultado.setText(numeroOrdenado);

                System.out.println("Evento Finalizado");
               
               
               
            } 
            
        });

           

        //DEFINE O TAMANHO DA JANELA
        Scene cena = new Scene(root,600,600);

        stage.setScene(cena);
        stage.setTitle("Minha Primeira Gui");

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    } 

}