package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    TextView inputTextView, totalTextView;

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonEquals, buttonAdd, buttonSub, buttonMult, buttonDiv, buttonLB, buttonRB, buttonClr,
            buttonDel, buttonDec;

    float value1, value2, valueT=0;

    boolean mAddition, mSubtract, mMultiplication, mDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        inputTextView = (TextView) findViewById(R.id.inputTextView);
        totalTextView = (TextView) findViewById(R.id.totalTextView);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDec = (Button) findViewById(R.id.buttonDec);
        buttonEquals = (Button) findViewById(R.id.buttonEquals);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMult = (Button) findViewById(R.id.buttonMult);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonLB = (Button) findViewById(R.id.buttonLB);
        buttonRB = (Button) findViewById(R.id.buttonRB);
        buttonClr = (Button) findViewById(R.id.buttonClr);
        buttonDel = (Button) findViewById(R.id.buttonDel);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTextView.setText(inputTextView.getText()+"0");
                totalTextView.setText(totalTextView.getText()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTextView.setText(inputTextView.getText()+"1");
                totalTextView.setText(totalTextView.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTextView.setText(inputTextView.getText()+"2");
                totalTextView.setText(totalTextView.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTextView.setText(inputTextView.getText()+"3");
                totalTextView.setText(totalTextView.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTextView.setText(inputTextView.getText()+"4");
                totalTextView.setText(totalTextView.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTextView.setText(inputTextView.getText()+"5");
                totalTextView.setText(totalTextView.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTextView.setText(inputTextView.getText()+"6");
                totalTextView.setText(totalTextView.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTextView.setText(inputTextView.getText()+"7");
                totalTextView.setText(totalTextView.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTextView.setText(inputTextView.getText()+"8");
                totalTextView.setText(totalTextView.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTextView.setText(inputTextView.getText()+"9");
                totalTextView.setText(totalTextView.getText()+"9");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTextView.setText(inputTextView.getText()+"9");
                totalTextView.setText(totalTextView.getText()+"9");
            }
        });

        buttonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String txt = totalTextView.getText().toString();
                if (txt.lastIndexOf(".") == -1) {
                    inputTextView.setText(inputTextView.getText() + ".");
                    totalTextView.setText(totalTextView.getText() + ".");
                }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (totalTextView.getText().toString().length() == 0 || totalTextView.getText().toString().equals(".")){
                    totalTextView.setText("");
                }else {
                    inputTextView.setText(totalTextView.getText() + "+");
                    value1 = Float.parseFloat(totalTextView.getText() + "");
                    mAddition = true;
                    totalTextView.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (totalTextView.getText().toString().length() == 0 || totalTextView.getText().toString().equals(".")){
                    totalTextView.setText("");
                }else {
                    inputTextView.setText(totalTextView.getText() + "-");
                    value1 = Float.parseFloat(totalTextView.getText() + "");
                    mSubtract = true;
                    totalTextView.setText(null);
                }
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (totalTextView.getText().toString().length() == 0 || totalTextView.getText().toString().equals(".")){
                    totalTextView.setText("");
                }else {
                    inputTextView.setText(totalTextView.getText() + "*");
                    value1 = Float.parseFloat(totalTextView.getText() + "");
                    mMultiplication = true;
                    totalTextView.setText(null);
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (totalTextView.getText().toString().length() == 0 || totalTextView.getText().toString().equals(".")){
                    totalTextView.setText("");
                }else {
                    inputTextView.setText(totalTextView.getText() + "/");
                    value1 = Float.parseFloat(totalTextView.getText() + "");
                    mDivision = true;
                    totalTextView.setText(null);
                }
            }
        });

        buttonClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalTextView.setText(null);
                inputTextView.setText(null);
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (totalTextView.getText().toString().length() == 0 || totalTextView.getText().toString().equals(".")) {
                    Toast.makeText(getApplicationContext(), "Please enter next value!",
                            Toast.LENGTH_LONG).show();
                }else{

                    try {
                        value2 = Float.parseFloat(totalTextView.getText() + "");

                        if (mAddition == true) {
                            totalTextView.setText(value1 + value2 + "");
                            mAddition = false;
                            inputTextView.setText(null);
                        }

                        if (mSubtract == true) {
                            totalTextView.setText(value1 - value2 + "");
                            mSubtract = false;
                            inputTextView.setText(null);
                        }

                        if (mMultiplication == true) {
                            totalTextView.setText(value1 * value2 + "");
                            mMultiplication = false;
                            inputTextView.setText(null);
                        }

                        if (mDivision == true) {
                            totalTextView.setText(value1 / value2 + "");
                            mDivision = false;
                            inputTextView.setText(null);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.e("Equals exceptions","exceptions"+e);
                    }

                }
            }
        });

    }

}