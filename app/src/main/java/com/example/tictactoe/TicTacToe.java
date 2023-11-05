package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class TicTacToe extends AppCompatActivity {


    boolean x = true;
    int potez = 0;

    String[] igra = {"a","b","c", "d" , "e" , "f ", "g", "h", "k"};
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        TextView pobedniktv = findViewById(R.id.pobednikTextView);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x) {
                    button1.setBackground(getDrawable(R.drawable.x_sign));
                    x = false;
                    igra[0] = "x";
                    potez++;
                    if (provera()) {
                        pobedniktv.setText(R.string.pobednikX);
                        krajIgre();
                    } else {
                        potezKompjuter();
                        if (provera()) {
                            pobedniktv.setText(R.string.pobednikO);
                            krajIgre();
                        }
                    }
                }
                button1.setEnabled(false);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                potez++;

                if (x) {
                    button2.setBackground(getDrawable(R.drawable.x_sign));
                    x = false;
                    igra[1] = "x";
                    if (provera()) {
                        pobedniktv.setText(R.string.pobednikX);
                        krajIgre();
                    } else {
                        potezKompjuter();
                        if (provera()) {
                            pobedniktv.setText(R.string.pobednikO);
                            krajIgre();
                        }
                    }
                }
                button2.setEnabled(false);

            }

        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                potez++;

                if (x) {
                    button3.setBackground(getDrawable(R.drawable.x_sign));
                    x = false;
                    igra[2] = "x";
                    if (provera()) {
                        pobedniktv.setText(R.string.pobednikX);
                        krajIgre();
                    } else {
                        potezKompjuter();
                        if (provera()) {
                            pobedniktv.setText(R.string.pobednikO);
                            krajIgre();
                        }
                    }
                }
                button3.setEnabled(false);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                potez++;

                if (x) {
                    button4.setBackground(getDrawable(R.drawable.x_sign));
                    x = false;
                    igra[3] = "x";
                    if (provera()) {
                        pobedniktv.setText(R.string.pobednikX);
                        krajIgre();
                    } else {
                        potezKompjuter();
                        if (provera()) {
                            pobedniktv.setText(R.string.pobednikO);
                            krajIgre();
                        }
                    }
                }
                button4.setEnabled(false);

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                potez++;

                if (x) {
                    button5.setBackground(getDrawable(R.drawable.x_sign));
                    x = false;
                    igra[4] = "x";
                    if (provera()) {
                        pobedniktv.setText(R.string.pobednikX);
                        krajIgre();
                    } else {
                        potezKompjuter();
                        if (provera()) {
                            pobedniktv.setText(R.string.pobednikO);
                            krajIgre();
                        }
                    }
                }
                button5.setEnabled(false);

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                potez++;

                if (x) {
                    button6.setBackground(getDrawable(R.drawable.x_sign));
                    x = false;
                    igra[5] = "x";
                    if (provera()) {
                        pobedniktv.setText(R.string.pobednikX);
                        krajIgre();
                    } else {
                        potezKompjuter();
                        if (provera()) {
                            pobedniktv.setText(R.string.pobednikO);
                            krajIgre();
                        }
                    }
                }
                button6.setEnabled(false);

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                potez++;

                if (x) {
                    button7.setBackground(getDrawable(R.drawable.x_sign));
                    x = false;
                    igra[6] = "x";
                    if (provera()) {
                        pobedniktv.setText(R.string.pobednikX);
                        krajIgre();
                    } else {
                        potezKompjuter();
                        if (provera()) {
                            pobedniktv.setText(R.string.pobednikO);
                            krajIgre();
                        }
                    }
                }
                button7.setEnabled(false);

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                potez++;

                if (x) {
                    button8.setBackground(getDrawable(R.drawable.x_sign));
                    x = false;
                    igra[7] = "x";
                    if (provera()) {
                        pobedniktv.setText(R.string.pobednikX);
                        krajIgre();
                    } else {
                        potezKompjuter();
                        if (provera()) {
                            pobedniktv.setText(R.string.pobednikO);
                            krajIgre();
                        }
                    }
                }
                button8.setEnabled(false);

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                potez++;

                if (x) {
                    button9.setBackground(getDrawable(R.drawable.x_sign));
                    x = false;
                    igra[8] = "x";
                    if (provera()) {
                        pobedniktv.setText(R.string.pobednikX);
                        krajIgre();
                    } else {
                        potezKompjuter();
                        if (provera()) {
                            pobedniktv.setText(R.string.pobednikO);
                            krajIgre();
                        }
                    }
                }
                button9.setEnabled(false);
            }
        });

    }
    Boolean provera() {
        if (igra[0] == igra[1] && igra[1] == igra[2]) {
            return true;
        } else if (igra[3] == igra[4] && igra[4] == igra[5]) {
            return true;
        } else if (igra[6] == igra[7] && igra[7] == igra[8]) {
            return true;
        } else if (igra[0] == igra[3] && igra[3] == igra[6]) {
            return true;
        } else if (igra[1] == igra[4] && igra[4] == igra[7]) {
            return true;
        } else if (igra[2] == igra[5] && igra[5] == igra[8]) {
            return true;
        } else if (igra[0] == igra[4] && igra[4] == igra[8]) {
            return true;
        } else if (igra[2] == igra[4] && igra[4] == igra[6]) {
            return true;
        } else {
            return false;
        }
    }

    void potezKompjuter() {

        if(potez != 5) {
            int random;

            do {
                random = new Random().nextInt(9);
            } while (igra[random] == "x" || igra[random] == "o");

            igra[random] = "o";

            switch (random) {
                case 0:
                    button1.setBackground(getDrawable(R.drawable.o_sign));
                    button1.setEnabled(false);
                    break;
                case 1:
                    button2.setBackground(getDrawable(R.drawable.o_sign));
                    button2.setEnabled(false);

                    break;
                case 2:
                    button3.setBackground(getDrawable(R.drawable.o_sign));
                    button3.setEnabled(false);

                    break;
                case 3:
                    button4.setBackground(getDrawable(R.drawable.o_sign));
                    button4.setEnabled(false);

                    break;
                case 4:
                    button5.setBackground(getDrawable(R.drawable.o_sign));
                    button5.setEnabled(false);

                    break;
                case 5:
                    button6.setBackground(getDrawable(R.drawable.o_sign));
                    button6.setEnabled(false);

                    break;
                case 6:
                    button7.setBackground(getDrawable(R.drawable.o_sign));
                    button7.setEnabled(false);

                    break;
                case 7:
                    button8.setBackground(getDrawable(R.drawable.o_sign));
                    button8.setEnabled(false);

                    break;
                case 8:
                    button9.setBackground(getDrawable(R.drawable.o_sign));
                    button9.setEnabled(false);

                    break;
            }

            x = true;
        }
    }

    void krajIgre() {
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }
}