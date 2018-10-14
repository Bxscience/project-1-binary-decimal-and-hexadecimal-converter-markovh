package com.example.harry.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText bin;
    EditText dec;
    EditText hex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bin = (EditText) findViewById(R.id.binInput);
        dec = (EditText) findViewById(R.id.decInput);
        hex = (EditText) findViewById(R.id.hexInput);


        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String BinaryI = bin.getText().toString();
                String DecimalI = dec.getText().toString();
                String HexadecimalI = hex.getText().toString();

                if (BinaryI.equals("") && DecimalI.equals("")) {
                    //HEX CONVERTER
                    int Dec = Integer.parseInt(hex.getText().toString(),16);

                    String Binary = Integer.toBinaryString(Dec);

                    dec.setText(Integer.toString(Dec));
                    bin.setText(Binary);
                }
                else if(BinaryI.equals("")){
                    //DECIMAL CONVERTER

                    int Dec = Integer.parseInt(dec.getText().toString());

                    String Binary = Integer.toBinaryString(Dec);
                    String Hexadecimal = Integer.toHexString(Dec);

                    bin.setText(Binary);
                    hex.setText(Hexadecimal);
                }
                else{
                    //BINARY CONVERTER
                    int Dec=Integer.parseInt(bin.getText().toString(),2);

                    String Hexadecimal = Integer.toHexString(Dec);

                    dec.setText(Integer.toString(Dec));
                    hex.setText(Hexadecimal);
                }
            }
        });

        Button clr = (Button) findViewById(R.id.clr);
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                bin.setText("");
                hex.setText("");
                dec.setText("");

            }
        });

    }

}
