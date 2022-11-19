package com.example.calccc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


    public class MainActivity extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);

                Button sum = findViewById(R.id.sum);
                Button munes = findViewById(R.id.munes);
                Button Bu3 = findViewById(R.id.bu3);
                Button Bu4 = findViewById(R.id.bu4);
                TextView text = findViewById(R.id.tv);

                sum.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int n1=Integer.parseInt(num1.getText().toString());
                        int n2=Integer.parseInt(num2.getText().toString());

                        int Add = n1+n2;
                        text.setText(Integer.toString(Add));
                    }
                });

                munes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int n1=Integer.parseInt(num1.getText().toString());
                        int n2=Integer.parseInt(num2.getText().toString());

                        int Add = n1-n2;
                        text.setText(Integer.toString(Add));
                    }
                });
                Bu3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int n1=Integer.parseInt(num1.getText().toString());
                        int n2=Integer.parseInt(num2.getText().toString());

                        int Add = n1*n2;
                        text.setText(Integer.toString(Add));
                    }
                });
                Bu4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int n1=Integer.parseInt(num1.getText().toString());
                        int n2=Integer.parseInt(num2.getText().toString());

                        int Add = n1/n2;
                        text.setText(Integer.toString(Add));
                    }
                });
    }
}