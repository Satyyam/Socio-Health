package com.example.iipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton r1,r2,r3,r4,r5;
    RadioGroup radioGroup;
    EditText name;
    EditText age;
    TextView time;
    Button res;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = (RadioButton) findViewById(R.id.whatsapp);
        r2 = (RadioButton) findViewById(R.id.insta);
        r3 = (RadioButton) findViewById(R.id.fb);
        r4 = (RadioButton) findViewById(R.id.Li);
        r5 = (RadioButton) findViewById(R.id.pint);

        name = (EditText) findViewById(R.id.Name);
        age = (EditText) findViewById(R.id.Age);
        time  = (TextView) findViewById(R.id.hrs);
        res = (Button) findViewById(R.id.button);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);

        //back = (ImageView) findViewById(R.id.backg) ;
        //back.setAlpha(95);
        //final String UserAge = age.getText().toString();
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this, PopUp.class);

                //transfer name
                String Nam = name.getText().toString();
                intent.putExtra("Name",Nam);

                // transfer the age
                String UserAge = age.getText().toString();
                intent.putExtra("ageuser",UserAge);

                //transfer the time
                String hr = time.getText().toString();
                intent.putExtra("time",hr);

                //transfer the info about the radio button
                if(r1.isChecked())
                    intent.putExtra("radiobutton","1");
                else if(r2.isChecked())
                    intent.putExtra("radiobutton","2");
                else if(r3.isChecked())
                    intent.putExtra("radiobutton","3");
                else if(r4.isChecked())
                    intent.putExtra("radiobutton","4");
                else if(r5.isChecked())
                    intent.putExtra("radiobutton","5");
                else
                    intent.putExtra("radiobutton","0");
                startActivity(intent);
            }
        });


    }
    int num = 10;
    public void increment(View view){
        if(num<0)
            num=0;
        else if(num>=100)
            num=100;
        else
            num= (int) (num+2);
        disp(num);
    }
    public void decrement(View view){
        if(num<0)
            num=0;
        num= (int) (num-1);
        disp(num);
    }
    private void disp(int num) {
        TextView quantityTextView = (TextView) findViewById(R.id.hrs);
        if(num<0)
            quantityTextView.setText(""+0);
        else if(num>100)
            quantityTextView.setText(""+100);
        else
            quantityTextView.setText(""+num);
    }
}
