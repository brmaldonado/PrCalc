//"Calculadora de operaciones básicas", esta app
//realiza las operaciones básicas: sumar, restar, dividir y multiplicar
//tomando como base dos valores ingresados por el usuario
package com.example.curacao.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaracion de variables
    //encapsulamiento
    //cajas de texto
    private EditText num1;
    private EditText num2;
    private TextView result;
    //botones
    private Button sumar;
    private Button restar;
    private Button mult;
    private Button div;

    //Sobreescritura del método onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //se vinculan las variables con activity_main
        //cajas de texto
        num1=(EditText)findViewById(R.id.edtNum1);
        num2=(EditText)findViewById(R.id.edtNum2);
        result= (TextView)findViewById(R.id.twResultado);
        //botones(operaciones básicas)
        sumar=(Button)findViewById(R.id.btnSumar);
        restar=(Button)findViewById(R.id.btnRestar);
        mult=(Button)findViewById(R.id.btnMult);
        div=(Button)findViewById(R.id.btndiv);

        //se declara un escuchador para que el programa
        //detecte cuando el usuario haga clic en el boton determinado
        //Realiza la operacion suma
        //se sobreescribe el método OnClick
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Se extraen los valores ingresados por el usuario (num1, num2)
                //se almacenan en variables tipo string
                String valor1= num1.getText().toString();
                String valor2= num2.getText().toString();
                //Se convierten a enteros num1 y num2 para poder manipularlos
                int num1=Integer.parseInt(valor1);
                int num2=Integer.parseInt(valor2);
                //Realiza la operacion y muestra el resultado en la caja de texto
                int resultado= num1+num2;
                result.setText(String.valueOf(resultado));
            }//cierra onClick
        });//Cierra sumar


        //se declara un escuchador para que el programa
        //detecte cuando el usuario haga clic en el boton determinado
        //Realiza la operacion resta
        //se sobreescribe el método OnClick
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Se extraen los valores ingresados por el usuario (num1, num2)
                //se almacenan en variables tipo string
                String valor1= num1.getText().toString();
                String valor2= num2.getText().toString();
                //Se convierten a enteros num1 y num2 para poder manipularlos
                int num1=Integer.parseInt(valor1);
                int num2=Integer.parseInt(valor2);
                //Realiza la operacion y muestra el resultado en la caja de texto
                int resultado= num1-num2;
                result.setText(String.valueOf(resultado));
            }//cierra onClick
        });//cierra restar


        //se declara un escuchador para que el programa
        //detecte cuando el usuario haga clic en el boton determinado
        //Realiza la operacion multiplicacion
        //se sobreescribe el método OnClick
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Se extraen los valores ingresados por el usuario (num1, num2)
                //se almacenan en variables tipo string
                String valor1= num1.getText().toString();
                String valor2= num2.getText().toString();
                //Se convierten a enteros num1 y num2 para poder manipularlos
                int num1=Integer.parseInt(valor1);
                int num2=Integer.parseInt(valor2);
                //Realiza la operacion y muestra el resultado en la caja de texto
                int resultado= num1*num2;
                result.setText(String.valueOf(resultado));
            }//cierra onClick
        });//cierra mult


        //se declara un escuchador para que el programa
        //detecte cuando el usuario haga clic en el boton determinado
        //Realiza la operacion division
        //se sobreescribe el método OnClick
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Se extraen los valores ingresados por el usuario (num1, num2)
                //se almacenan en variables tipo string
                String valor1= num1.getText().toString();
                String valor2= num2.getText().toString();
                //Se convierten a enteros num1 y num2 para poder manipularlos
                int num1=Integer.parseInt(valor1);
                int num2=Integer.parseInt(valor2);
                //Realiza la operacion y muestra el resultado en la caja de texto
                int resultado= num1/num2;
                result.setText(String.valueOf(resultado));


            }//cierra onClick
        });//Cierra div
    }//cierra onCreate
}//cierra MainActivity
