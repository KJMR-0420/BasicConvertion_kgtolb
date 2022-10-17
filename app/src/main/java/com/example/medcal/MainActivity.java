package com.example.medcal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.example.medcal.R.id.btnKiloToLb;
import static com.example.medcal.R.id.btnLbToKilo;
import static com.example.medcal.R.id.enteredWeight;
import static com.example.medcal.R.id.visible;

public class MainActivity extends AppCompatActivity {
double conversionRate= 2.2;
RadioButton rad1;
RadioButton rad2;
EditText WeightEnter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final EditText Weight = (EditText) findViewById(enteredWeight);
        final RadioButton LbToKilo = (RadioButton) findViewById(R.id.btnLbToKilo);
        final RadioButton KiloToLb = (RadioButton) findViewById(R.id.btnKiloToLb);
        final TextView result = (TextView) findViewById(R.id.result);
        final Button convert = (Button) findViewById(R.id.btnConvert);

        rad1 =(RadioButton)findViewById(btnKiloToLb);
        rad2 = (RadioButton)findViewById(btnLbToKilo);
        WeightEnter = (EditText)findViewById(enteredWeight);

        convert.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (rad1.isChecked()) {
                double entw1 = Double.parseDouble(WeightEnter.getText().toString());
                double results = entw1 * conversionRate;
                result.setText("Patient Weight is " + String.valueOf(results));
            }
                 if (rad2.isChecked()){
                     double entw1 = Double.parseDouble(WeightEnter.getText().toString());
                    double results = entw1/conversionRate;
                    result.setText("Patient Weight is "+String.valueOf(results));
                }
}

    });

    }

}