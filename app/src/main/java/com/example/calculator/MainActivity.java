package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText fno, lno;
    Button submit;
    TextView sum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fno=(EditText)findViewById(R.id.fno);
        lno=(EditText)findViewById(R.id.lno);
        submit=(Button)findViewById(R.id.submit);
        sum=(TextView)findViewById(R.id.sum);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fno1=fno.getText().toString();
                String lno1=lno.getText().toString();
            if(TextUtils.isEmpty(fno1))
            {
                        fno.setError("Enter First Number");

            }
                        else if(TextUtils.isEmpty(lno1)) {
                lno.setError("Enter Second no");
            }else {
                int number1=Integer.parseInt(fno1);
                int number2=Integer.parseInt(lno1);
                int c =number1+number2;
                sum.setText(c);
            }
            }
        });

    }
}
