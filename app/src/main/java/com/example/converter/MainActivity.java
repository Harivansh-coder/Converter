package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner quantity_list, from, to;
    private EditText valueIn;
    //private EditText valueOut;

    private Button convert;

    private ArrayList<String> arr = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // getting instance of spinners
        from = (Spinner) findViewById(R.id.unit1);

        to = (Spinner) findViewById(R.id.unit2);

        convert = (Button) findViewById(R.id.but_convert);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.length_unit,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        from.setAdapter(adapter);
        to.setAdapter(adapter);



        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = (String) from.getSelectedItem();
                String b = (String) to.getSelectedItem();
                Toast.makeText(getApplicationContext(),a+" "+b,Toast.LENGTH_LONG).show();
                convert(a,b);
            }
        });
    }





    public void convert(String a, String b){

        String val = valueIn.getText().toString();
        Double result = Double.parseDouble(val);


        if (a.equalsIgnoreCase("mm") && b.equalsIgnoreCase("cm")){
            result /= 10;
            Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_LONG).show();
            //valueOut.setText(String.valueOf(result));

        }else if (a.equalsIgnoreCase("mm") && b.equalsIgnoreCase("m")){
            result /= 1000;
            Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_LONG).show();
            //valueOut.setText(String.valueOf(result));

        }else if (a.equalsIgnoreCase("mm") && b.equalsIgnoreCase("km")){
            result /= 1000000;
            Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_LONG).show();
            //valueOut.setText(String.valueOf(result));
        }else if (a.equalsIgnoreCase("cm") && b.equalsIgnoreCase("mm")){
            result *= 10;
            Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_LONG).show();

            //valueOut.setText(String.valueOf(result));

        }else if (a.equalsIgnoreCase("cm") && b.equalsIgnoreCase("m")){
            result /= 100;
            Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_LONG).show();
            //valueOut.setText(String.valueOf(result));
        }else if (a.equalsIgnoreCase("cm") && b.equalsIgnoreCase("km")){
            result /= 100000;
            Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_LONG).show();
            //valueOut.setText(String.valueOf(result));
        }else if (a.equalsIgnoreCase("m") && b.equalsIgnoreCase("mm")){
            result *= 1000;
            Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_LONG).show();
           // valueOut.setText(String.valueOf(result));

        }else if (a.equalsIgnoreCase("m") && b.equalsIgnoreCase("cm")){
            result *= 100;
            Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_LONG).show();
           // valueOut.setText(String.valueOf(result));
        }else if (a.equalsIgnoreCase("m") && b.equalsIgnoreCase("km")){
            result /= 1000;
            Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_LONG).show();
            //valueOut.setText(String.valueOf(result));
        }else if (a.equalsIgnoreCase("km") && b.equalsIgnoreCase("mm")){
            result *= 1000000;
            Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_LONG).show();
            //valueOut.setText(String.valueOf(result));
            Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_LONG).show();
        }else if (a.equalsIgnoreCase("km") && b.equalsIgnoreCase("cm")){
            result *= 100000;
            Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_LONG).show();
            //valueOut.setText(String.valueOf(result));
        }else if (a.equalsIgnoreCase("km") && b.equalsIgnoreCase("m")){
            result /= 1000;
            Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_LONG).show();
           // valueOut.setText(String.valueOf(result));
        }else{

            //valueOut.setText(String.valueOf(result));
        }

    }


}
