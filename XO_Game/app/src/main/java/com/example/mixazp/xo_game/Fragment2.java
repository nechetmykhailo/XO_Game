package com.example.mixazp.xo_game;

import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment2 extends Fragment implements View.OnClickListener {

    private Button btn11;
    private Button btn12;
    private Button btn13;
    private Button btn14;
    private Button btn15;
    private Button btn21;
    private Button btn22;
    private Button btn23;
    private Button btn24;
    private Button btn25;
    private Button btn31;
    private Button btn32;
    private Button btn33;
    private Button btn34;
    private Button btn35;
    private Button btn41;
    private Button btn42;
    private Button btn43;
    private Button btn44;
    private Button btn45;
    private Button btn51;
    private Button btn52;
    private Button btn53;
    private Button btn54;
    private Button btn55;
    private int counter = 0;

    public Fragment2() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_fragment2, null);

        btn11 = (Button) v.findViewById(R.id.btn11);
        btn12 = (Button) v.findViewById(R.id.btn12);
        btn13 = (Button) v.findViewById(R.id.btn13);
        btn14 = (Button) v.findViewById(R.id.btn14);
        btn15 = (Button) v.findViewById(R.id.btn15);
        btn21 = (Button) v.findViewById(R.id.btn21);
        btn22 = (Button) v.findViewById(R.id.btn22);
        btn23 = (Button) v.findViewById(R.id.btn23);
        btn24 = (Button) v.findViewById(R.id.btn24);
        btn25 = (Button) v.findViewById(R.id.btn25);
        btn31 = (Button) v.findViewById(R.id.btn31);
        btn32 = (Button) v.findViewById(R.id.btn32);
        btn33 = (Button) v.findViewById(R.id.btn33);
        btn34 = (Button) v.findViewById(R.id.btn34);
        btn35 = (Button) v.findViewById(R.id.btn35);
        btn41 = (Button) v.findViewById(R.id.btn41);
        btn42 = (Button) v.findViewById(R.id.btn42);
        btn43 = (Button) v.findViewById(R.id.btn43);
        btn44 = (Button) v.findViewById(R.id.btn44);
        btn45 = (Button) v.findViewById(R.id.btn45);
        btn51 = (Button) v.findViewById(R.id.btn51);
        btn52 = (Button) v.findViewById(R.id.btn52);
        btn53 = (Button) v.findViewById(R.id.btn53);
        btn54 = (Button) v.findViewById(R.id.btn54);
        btn55 = (Button) v.findViewById(R.id.btn55);

        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);
        btn25.setOnClickListener(this);
        btn31.setOnClickListener(this);
        btn32.setOnClickListener(this);
        btn33.setOnClickListener(this);
        btn34.setOnClickListener(this);
        btn35.setOnClickListener(this);
        btn41.setOnClickListener(this);
        btn42.setOnClickListener(this);
        btn43.setOnClickListener(this);
        btn44.setOnClickListener(this);
        btn45.setOnClickListener(this);
        btn51.setOnClickListener(this);
        btn52.setOnClickListener(this);
        btn53.setOnClickListener(this);
        btn54.setOnClickListener(this);
        btn55.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn11:
                if(counter%2==0){
                    btn11.setText("X");
                    counter++;
                }else {
                    btn11.setText("O");
                    counter++;
                }
                btn11.setEnabled(false);
                btn11.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn12:
                if(counter%2==0){
                    btn12.setText("X");
                    counter++;
                }else {
                    btn12.setText("O");
                    counter++;
                }
                btn12.setEnabled(false);
                btn12.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn13:
                if(counter%2==0){
                    btn13.setText("X");
                    counter++;
                }else {
                    btn13.setText("O");
                    counter++;
                }
                btn13.setEnabled(false);
                btn13.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn14:
                if(counter%2==0){
                    btn14.setText("X");
                    counter++;
                }else {
                    btn14.setText("O");
                    counter++;
                }
                btn14.setEnabled(false);
                btn14.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn15:
                if(counter%2==0){
                    btn15.setText("X");
                    counter++;
                }else {
                    btn15.setText("O");
                    counter++;
                }
                btn15.setEnabled(false);
                btn15.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn21:
                if(counter%2==0){
                    btn21.setText("X");
                    counter++;
                }else {
                    btn21.setText("O");
                    counter++;
                }
                btn21.setEnabled(false);
                btn21.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn22:
                if(counter%2==0){
                    btn22.setText("X");
                    counter++;
                }else {
                    btn22.setText("O");
                    counter++;
                }
                btn22.setEnabled(false);
                btn22.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn23:
                if(counter%2==0){
                    btn23.setText("X");
                    counter++;
                }else {
                    btn23.setText("O");
                    counter++;
                }
                btn23.setEnabled(false);
                btn23.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn24:
                if(counter%2==0){
                    btn24.setText("X");
                    counter++;
                }else {
                    btn24.setText("O");
                    counter++;
                }
                btn24.setEnabled(false);
                btn24.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn25:
                if(counter%2==0){
                    btn25.setText("X");
                    counter++;
                }else {
                    btn25.setText("O");
                    counter++;
                }
                btn25.setEnabled(false);
                btn25.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn31:
                if(counter%2==0){
                    btn31.setText("X");
                    counter++;
                }else {
                    btn31.setText("O");
                    counter++;
                }
                btn31.setEnabled(false);
                btn31.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn32:
                if(counter%2==0){
                    btn32.setText("X");
                    counter++;
                }else {
                    btn32.setText("O");
                    counter++;
                }
                btn32.setEnabled(false);
                btn32.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn33:
                if(counter%2==0){
                    btn33.setText("X");
                    counter++;
                }else {
                    btn33.setText("O");
                    counter++;
                }
                btn33.setEnabled(false);
                btn33.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn34:
                if(counter%2==0){
                    btn34.setText("X");
                    counter++;
                }else {
                    btn34.setText("O");
                    counter++;
                }
                btn34.setEnabled(false);
                btn34.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn35:
                if(counter%2==0){
                    btn35.setText("X");
                    counter++;
                }else {
                    btn35.setText("O");
                    counter++;
                }
                btn35.setEnabled(false);
                btn35.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn41:
                if(counter%2==0){
                    btn41.setText("X");
                    counter++;
                }else {
                    btn41.setText("O");
                    counter++;
                }
                btn41.setEnabled(false);
                btn41.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn42:
                if(counter%2==0){
                    btn42.setText("X");
                    counter++;
                }else {
                    btn42.setText("O");
                    counter++;
                }
                btn42.setEnabled(false);
                btn42.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn43:
                if(counter%2==0){
                    btn43.setText("X");
                    counter++;
                }else {
                    btn43.setText("O");
                    counter++;
                }
                btn43.setEnabled(false);
                btn43.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn44:
                if(counter%2==0){
                    btn44.setText("X");
                    counter++;
                }else {
                    btn44.setText("O");
                    counter++;
                }
                btn44.setEnabled(false);
                btn44.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn45:
                if(counter%2==0){
                    btn45.setText("X");
                    counter++;
                }else {
                    btn45.setText("O");
                    counter++;
                }
                btn45.setEnabled(false);
                btn45.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn51:
                if(counter%2==0){
                    btn51.setText("X");
                    counter++;
                }else {
                    btn51.setText("O");
                    counter++;
                }
                btn51.setEnabled(false);
                btn51.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn52:
                if(counter%2==0){
                    btn52.setText("X");
                    counter++;
                }else {
                    btn52.setText("O");
                    counter++;
                }
                btn52.setEnabled(false);
                btn52.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn53:
                if(counter%2==0){
                    btn53.setText("X");
                    counter++;
                }else {
                    btn53.setText("O");
                    counter++;
                }
                btn53.setEnabled(false);
                btn53.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn54:
                if(counter%2==0){
                    btn54.setText("X");
                    counter++;
                }else {
                    btn54.setText("O");
                    counter++;
                }
                btn54.setEnabled(false);
                btn54.setTextColor(Color.BLACK);
                Wins();
                break;
            case R.id.btn55:
                if(counter%2==0){
                    btn55.setText("X");
                    counter++;
                }else {
                    btn55.setText("O");
                    counter++;
                }
                btn55.setEnabled(false);
                btn55.setTextColor(Color.BLACK);
                Wins();
                break;
        }
    }

    private void Wins() {

        if (btn11.getText().equals("X") && btn22.getText().equals("X") && btn33.getText().equals("X") && btn44.getText().equals("X") && btn55.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn11.getText().equals("O") && btn22.getText().equals("O") && btn33.getText().equals("O") && btn44.getText().equals("O") && btn55.getText().equals("O")){
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }

        else if(btn11.getText().equals("X") && btn21.getText().equals("X") && btn31.getText().equals("X") && btn41.getText().equals("X") && btn51.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn11.getText().equals("O") && btn21.getText().equals("O") && btn31.getText().equals("O") && btn41.getText().equals("O") && btn51.getText().equals("O")) {
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }

        else if(btn12.getText().equals("X") && btn22.getText().equals("X") && btn32.getText().equals("X") && btn42.getText().equals("X") && btn52.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn12.getText().equals("O") && btn22.getText().equals("O") && btn32.getText().equals("O") && btn42.getText().equals("O") && btn52.getText().equals("O")) {
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }

        else if(btn13.getText().equals("X") && btn23.getText().equals("X") && btn33.getText().equals("X") && btn43.getText().equals("X") && btn53.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn13.getText().equals("O") && btn23.getText().equals("O") && btn33.getText().equals("O") && btn43.getText().equals("O") && btn53.getText().equals("O")) {
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }

        else if(btn14.getText().equals("X") && btn24.getText().equals("X") && btn34.getText().equals("X") && btn44.getText().equals("X") && btn54.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn14.getText().equals("O") && btn24.getText().equals("O") && btn34.getText().equals("O") && btn44.getText().equals("O") && btn54.getText().equals("O")) {
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }

        else if(btn15.getText().equals("X") && btn25.getText().equals("X") && btn35.getText().equals("X") && btn45.getText().equals("X") && btn55.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn15.getText().equals("O") && btn25.getText().equals("O") && btn35.getText().equals("O") && btn45.getText().equals("O") && btn55.getText().equals("O")) {
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }

        else if(btn11.getText().equals("X") && btn12.getText().equals("X") && btn13.getText().equals("X") && btn14.getText().equals("X") && btn15.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn11.getText().equals("O") && btn12.getText().equals("O") && btn13.getText().equals("O") && btn14.getText().equals("O") && btn15.getText().equals("O")) {
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }

        else if(btn21.getText().equals("X") && btn22.getText().equals("X") && btn23.getText().equals("X") && btn24.getText().equals("X") && btn25.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn21.getText().equals("O") && btn22.getText().equals("O") && btn23.getText().equals("O") && btn24.getText().equals("O") && btn25.getText().equals("O")) {
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }

        else if(btn31.getText().equals("X") && btn32.getText().equals("X") && btn33.getText().equals("X") && btn34.getText().equals("X") && btn35.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn31.getText().equals("O") && btn32.getText().equals("O") && btn33.getText().equals("O") && btn34.getText().equals("O") && btn35.getText().equals("O")) {
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }

        else if(btn41.getText().equals("X") && btn42.getText().equals("X") && btn43.getText().equals("X") && btn44.getText().equals("X") && btn45.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn41.getText().equals("O") && btn42.getText().equals("O") && btn43.getText().equals("O") && btn44.getText().equals("O") && btn45.getText().equals("O")) {
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }

        else if(btn51.getText().equals("X") && btn52.getText().equals("X") && btn53.getText().equals("X") && btn54.getText().equals("X") && btn55.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn51.getText().equals("O") && btn52.getText().equals("O") && btn53.getText().equals("O") && btn54.getText().equals("O") && btn55.getText().equals("O")) {
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }

        else if(btn15.getText().equals("X") && btn24.getText().equals("X") && btn33.getText().equals("X") && btn42.getText().equals("X") && btn51.getText().equals("X")) {
            Toast.makeText(getActivity(),"X WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
        else if(btn15.getText().equals("O") && btn24.getText().equals("O") && btn33.getText().equals("O") && btn42.getText().equals("O") && btn51.getText().equals("O")) {
            Toast.makeText(getActivity(),"O WIN", Toast.LENGTH_SHORT ).show();
            close();
        }
    }

    private void close() {
        getActivity().getFragmentManager().beginTransaction().remove(this).commit();
    }
}
