package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView quote,summery ;
    Button plus,minus,order;
    CheckBox ck1,ck2,ck3;
    int a;
    String msg="Order Placed Successfully";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quote = (TextView) findViewById(R.id.textView3);
        minus = (Button) findViewById(R.id.button);
        plus = (Button) findViewById(R.id.button2);
        ck1 = (CheckBox) findViewById(R.id.checkBox);
        ck2 = (CheckBox) findViewById(R.id.checkBox3);
        ck3 = (CheckBox) findViewById(R.id.checkBox4);
        summery = (TextView) findViewById(R.id.textView5);
        order = (Button) findViewById(R.id.button3);


    }
    public void placeorder(View view)
    {
        String chk1 = ck1.getText().toString();
        String chk2 = ck2.getText().toString();
        String chk3 = ck3.getText().toString();
        int b=a*10;
        boolean l=false;
        if(ck1.isChecked() && ck2.isChecked() && ck3.isChecked()==l)
        summery.setText("Order summery"+"\n"+"\n"+msg+"\n"+chk1+"\n"+chk2+"\n"+"Total Price "+b);
        else if(ck1.isChecked() && ck3.isChecked() && ck2.isChecked()==l)
            summery.setText("Order summery"+"\n"+"\n"+msg+"\n"+chk1+"\n"+chk3+"\n"+"Total Price "+b);
        else if (ck2.isChecked() && ck3.isChecked() && ck1.isChecked())
        {
            summery.setText("Please Select One of :DELIVER OR PICKUP");
        }
        else if(ck2.isChecked() && ck3.isChecked()==l && ck1.isChecked()==l)
            summery.setText("Order summery"+"\n"+"\n"+msg+"\n"+chk2+"\n"+"Total Price "+b);
        else if(ck3.isChecked() && ck2.isChecked()==l && ck1.isChecked()==l)
            summery.setText("Order summery"+"\n"+"\n"+msg+"\n"+chk3+"\n"+"Total Price "+b);
        else if(ck2.isChecked()==l || ck3.isChecked()==l)
            summery.setText("Please Select One of :DELIVER OR PICKUP");
    }



    public void increment(View view)
    {
        a=a+1;
        quote.setText("   " + a);
    }
    public void decrement(View view)
    {
        if (a > 0) {
        a = a - 1;
        quote.setText("   " + a);
        }
    }

}