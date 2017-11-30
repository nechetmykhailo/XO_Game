package com.example.mixazp.xo_game;


import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment implements View.OnClickListener {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private int counter = 0;

    public Fragment1() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment1, null);

        btn1 = (Button) v.findViewById(R.id.btn1); // нашли 9 батонов
        btn2 = (Button) v.findViewById(R.id.btn2);
        btn3 = (Button) v.findViewById(R.id.btn3);
        btn4 = (Button) v.findViewById(R.id.btn4);
        btn5 = (Button) v.findViewById(R.id.btn5);
        btn6 = (Button) v.findViewById(R.id.btn6);
        btn7 = (Button) v.findViewById(R.id.btn7);
        btn8 = (Button) v.findViewById(R.id.btn8);
        btn9 = (Button) v.findViewById(R.id.btn9);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn1:
                if(counter%2==0){ // если при делениий на на 2 без остатка 0 то Вводим Х и наче О.
                    btn1.setText("X");
                    counter++;
                }else {
                    btn1.setText("O");
                    counter++;
                }
                btn1.setEnabled(false);
                btn1.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn2:
                if(counter%2==0){
                    btn2.setText("X");
                    counter++;
                }else {
                    btn2.setText("O");
                    counter++;
                }
                btn2.setEnabled(false);
                btn2.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn3:
                if(counter%2==0){
                    btn3.setText("X");
                    counter++;
                }else {
                    btn3.setText("O");
                    counter++;
                }
                btn3.setEnabled(false);
                btn3.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn4:
                if(counter%2==0){
                    btn4.setText("X");
                    counter++;
                }else {
                    btn4.setText("O");
                    counter++;
                }
                btn4.setEnabled(false);
                btn4.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn5:
                if(counter%2==0){
                    btn5.setText("X");
                    counter++;
                }else {
                    btn5.setText("O");
                    counter++;
                }
                btn5.setEnabled(false);
                btn5.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn6:
                if(counter%2==0){
                    btn6.setText("X");
                    counter++;
                }else {
                    btn6.setText("O");
                    counter++;
                }
                btn6.setEnabled(false);
                btn6.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn7:
                if(counter%2==0){
                    btn7.setText("X");
                    counter++;
                }else {
                    btn7.setText("O");
                    counter++;
                }
                btn7.setEnabled(false);
                btn7.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn8:
                if(counter%2==0){
                    btn8.setText("X");
                    counter++;
                }else {
                    btn8.setText("O");
                    counter++;
                }
                btn8.setEnabled(false);
                btn8.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn9:
                if(counter%2==0){
                    btn9.setText("X");
                    counter++;
                }else {
                    btn9.setText("O");
                    counter++;
                }
                btn9.setEnabled(false);
                btn9.setTextColor(Color.BLACK);
                Wins();
                break;
        }
    }

    public void Wins() { // здесь проверка на схождение. Только ничейку я не сделал. Думал после всег проверок сделать else то ничека то фигня получаеться

        if (btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O")){
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }

        else if(btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")) {
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }

        else if(btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O")) {
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }

        else if(btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O")) {
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }

        else if(btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O")) {
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }

        else if(btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O")) {
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }

        else if(btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }

        else if(btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O")) {
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
    }

    private void close() {
        getActivity().getFragmentManager().beginTransaction().remove(this).commit();
    }
}
