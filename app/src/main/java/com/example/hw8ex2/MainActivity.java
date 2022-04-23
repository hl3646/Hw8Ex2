package com.example.hw8ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    Button btn;
    Switch sw;
    LinearLayout layout;
    boolean canButtonBeClicked = true;
    boolean switchState = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = (RadioGroup) findViewById(R.id.radiogroup);
        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);
        btn = (Button) findViewById(R.id.button);
        sw = (Switch) findViewById(R.id.switch1);
        layout = (LinearLayout) findViewById(R.id.linear);
    }


    public void changeState(View view)
    {
        if(switchState == false)
        {
            switchState = true;
            btn.setEnabled(false);
            canButtonBeClicked = false;
        }
        else
        {
            switchState = false;
            btn.setEnabled(true);
            canButtonBeClicked = true;
        }
    }

    public void checkAndChangeColor(View view)
    {
        if(rb1.isChecked())
        {
            layout.setBackgroundResource(R.color.red);
        }
        else if(rb2.isChecked())
        {
            layout.setBackgroundResource(R.color.blue);
        }
        else if(rb3.isChecked())
        {
            layout.setBackgroundResource(R.color.green);
        }
        else
        {
            layout.setBackgroundResource(R.color.yellow);
        }
    }

    public void changeColorToRed(View view)
    {
        if(canButtonBeClicked == false)
        {
            layout.setBackgroundResource(R.color.red);
        }
    }
    public void changeColorToBlue(View view)
    {
        if(canButtonBeClicked == false)
        {
            layout.setBackgroundResource(R.color.blue);
        }
    }
    public void changeColorToGreen(View view)
    {
        if(canButtonBeClicked == false)
        {
            layout.setBackgroundResource(R.color.green);
        }
    }
    public void changeColorToYellow(View view)
    {
        if(canButtonBeClicked == false)
        {
            layout.setBackgroundResource(R.color.yellow);
        }
    }
}