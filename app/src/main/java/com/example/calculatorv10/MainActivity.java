package com.example.calculatorv10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button_zero,button_one,button_two,button_three,button_four, button_five,
            button_six, button_seven,button_eight,button_nine,button_point,button_equal,
            button_plus,button_minus,button_mul,button_div,button_c,button_sqrt,button_pow,button_mod;
    private ImageButton backspace;
    TextView textView1,textView2;
    Boolean flag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init_views();
        init_variables();
        init_functions();
        init_listeners();
    }

    private void init_views() {
        button_point=(Button)findViewById(R.id.btn_point);
        button_zero=(Button)findViewById(R.id.btn_0);
        button_equal=(Button)findViewById(R.id.btn_equal);
        button_mod=(Button)findViewById(R.id.btn_mod);

        button_one=(Button)findViewById(R.id.btn_1);
        button_two=(Button)findViewById(R.id.btn_2);
        button_three=(Button)findViewById(R.id.btn_3);
        button_div=(Button)findViewById(R.id.btn_div);

        button_four=(Button)findViewById(R.id.btn_4);
        button_five=(Button)findViewById(R.id.btn_5);
        button_six=(Button)findViewById(R.id.btn_6);
        button_mul=(Button)findViewById(R.id.btn_mul);

        button_seven=(Button)findViewById(R.id.btn_7);
        button_eight=(Button)findViewById(R.id.btn_8);
        button_nine=(Button)findViewById(R.id.btn_9);
        button_minus=(Button)findViewById(R.id.btn_minus);

        button_c=(Button)findViewById(R.id.btn_c);
        button_sqrt=(Button)findViewById(R.id.btn_root);
        button_pow=(Button)findViewById(R.id.btn_pow);
        button_plus=(Button)findViewById(R.id.btn_plus);

        backspace=(ImageButton)findViewById(R.id.btn_del);

        textView1=(TextView) findViewById(R.id.tv1);
        textView2=(TextView)findViewById(R.id.tv2);
    }

    private void init_variables() {

    }

    private void init_functions() {
    }

    private void init_listeners() {
    }
}
