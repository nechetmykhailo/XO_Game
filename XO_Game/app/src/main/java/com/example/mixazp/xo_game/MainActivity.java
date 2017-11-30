package com.example.mixazp.xo_game;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn3x3;
    private Button btn5x5;
    private Fragment1 f1;
    private Fragment2 f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            btn3x3 = (Button) findViewById(R.id.btn3x3);
            btn5x5 = (Button) findViewById(R.id.btn5x5);

            btn3x3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    f1 = new Fragment1();
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.container1, f1);
                    ft.commit();
                }
            });

            btn5x5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    f2 = new Fragment2();
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.container1, f2);
                    ft.commit();
                }
            });
        }catch (Exception e) {
            Toast.makeText(this, "Exeptions", Toast.LENGTH_SHORT).show();
        }


    }
}
