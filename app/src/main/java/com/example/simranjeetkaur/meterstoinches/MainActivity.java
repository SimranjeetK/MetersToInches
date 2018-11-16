package com.example.simranjeetkaur.meterstoinches;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
            1 meter = 39.3701 inches
     */

   private Button convertButton;
   private EditText enterMeters;
   private TextView resultView;


   private  EditText enterInches;
   private Button changeButton;
   private TextView solutionView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterMeters = (EditText) findViewById(R.id.meterText);
        resultView = (TextView) findViewById(R.id.result);
        convertButton = (Button)findViewById(R.id.convert);

        enterInches =(EditText) findViewById(R.id.inchText);
        changeButton = (Button) findViewById(R.id.change);
        solutionView= (TextView) findViewById(R.id.solution);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double multiplier =39.37;
                double answer = 0.0;

                if(enterMeters.getText().toString().equals(""))
                {
                    resultView.setText(R.string.error_message);
                    resultView.setTextColor(Color.RED);
                }
                else
                {
                double meterValue= Double.parseDouble(enterMeters.getText().toString());
                answer = meterValue*multiplier;
                    resultView.setTextColor(Color.BLUE);
                resultView.setText(String.format("%.2f", answer)+ " inches");
                }
            }
        });


        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double answer = 0.0;

                if(enterInches.getText().toString().equals(""))
                {
                    solutionView.setText(R.string.error_message);
                    solutionView.setTextColor(Color.RED);
                }
                else
                {
                    double inchValue= Double.parseDouble(enterInches.getText().toString());
                    answer = inchValue * 0.0254 ;
                    solutionView.setTextColor(Color.BLUE);
                    solutionView.setText(String.format("%.2f", answer)+ " meters");
                }



            }
        });


    }
}
