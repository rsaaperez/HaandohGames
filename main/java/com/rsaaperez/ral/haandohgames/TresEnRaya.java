package com.rsaaperez.ral.haandohgames;

import android.app.Dialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;


public class TresEnRaya extends ActionBarActivity implements View.OnClickListener {
    public int[][] posiciones = new int[3][3];
    public int turno = 0, cuentaVictorias = 0, cuentaEmpates = 0, cVVieja = 0, cEVieja = 0;
    public boolean bloqueo, bloqueo2, bloqueo3, bloqueo4,
            bloqueo5, bloqueo6, bloqueo7, bloqueo8,
            bloqueo9;
    public ImageButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    public String ganador = "";
    public Button llamaTresRaya;
    public boolean ganar = false;

    public static final String ODB_NAME = "BaseDatos.neodatis";

    public TresEnRaya() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres_en_raya);
        bloqueo = false;
        bloqueo2 = false;
        bloqueo3 = false;
        bloqueo4 = false;
        bloqueo5 = false;
        bloqueo6 = false;
        bloqueo7 = false;
        bloqueo8 = false;
        bloqueo9 = false;
        b1 = (ImageButton) findViewById(R.id.imageButton);
        b1.setOnClickListener(this);
        b2 = (ImageButton) findViewById(R.id.imageButton2);
        b2.setOnClickListener(this);
        b3 = (ImageButton) findViewById(R.id.imageButton3);
        b3.setOnClickListener(this);
        b4 = (ImageButton) findViewById(R.id.imageButton4);
        b4.setOnClickListener(this);
        b5 = (ImageButton) findViewById(R.id.imageButton5);
        b5.setOnClickListener(this);
        b6 = (ImageButton) findViewById(R.id.imageButton6);
        b6.setOnClickListener(this);
        b7 = (ImageButton) findViewById(R.id.imageButton7);
        b7.setOnClickListener(this);
        b8 = (ImageButton) findViewById(R.id.imageButton8);
        b8.setOnClickListener(this);
        b9 = (ImageButton) findViewById(R.id.imageButton9);
        b9.setOnClickListener(this);
        llamaTresRaya = (Button) findViewById(R.id.bRContinuar);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.imageButton):
                if (bloqueo == false) {
                    if (turno == 0 || turno == 1) {
                        posiciones[0][0] = 1;
                        turno = 3;
                        b1.setBackgroundResource(R.drawable.circulo);
                        bloqueo = true;
                        mostrarGanador(view);
                        if (comprobar(view).equalsIgnoreCase("")) {
                            comprobarGanar(view);
                        }
                    }
                }
                break;
            case (R.id.imageButton2):
                if (bloqueo2 == false) {
                    if (turno == 0 || turno == 1) {
                        posiciones[1][0] = 1;
                        turno = 3;
                        b2.setBackgroundResource(R.drawable.circulo);
                        bloqueo2 = true;
                        mostrarGanador(view);
                        if (comprobar(view).equalsIgnoreCase("")) {
                            comprobarGanar(view);
                        }
                    }
                }
                break;
            case (R.id.imageButton3):
                if (bloqueo3 == false) {
                    if (turno == 0 || turno == 1) {
                        posiciones[2][0] = 1;
                        turno = 3;
                        b3.setBackgroundResource(R.drawable.circulo);
                        bloqueo3 = true;
                        mostrarGanador(view);
                        if (comprobar(view).equalsIgnoreCase("")) {
                            comprobarGanar(view);
                        }
                    }
                }
                break;
            case (R.id.imageButton4):
                if (bloqueo4 == false) {
                    if (turno == 0 || turno == 1) {
                        posiciones[0][1] = 1;
                        turno = 3;
                        b4.setBackgroundResource(R.drawable.circulo);
                        bloqueo4 = true;
                        mostrarGanador(view);
                        if (comprobar(view).equalsIgnoreCase("")) {
                            comprobarGanar(view);
                        }
                    }
                }
                break;
            case (R.id.imageButton5):
                if (bloqueo5 == false) {
                    if (turno == 0 || turno == 1) {
                        posiciones[1][1] = 1;
                        turno = 3;
                        b5.setBackgroundResource(R.drawable.circulo);
                        bloqueo5 = true;
                        mostrarGanador(view);
                        if (comprobar(view).equalsIgnoreCase("")) {
                            comprobarGanar(view);
                        }
                    }
                }
                break;
            case (R.id.imageButton6):
                if (bloqueo6 == false) {
                    if (turno == 0 || turno == 1) {
                        posiciones[2][1] = 1;
                        turno = 3;
                        b6.setBackgroundResource(R.drawable.circulo);
                        bloqueo6 = true;
                        mostrarGanador(view);
                        if (comprobar(view).equalsIgnoreCase("")) {
                            comprobarGanar(view);
                        }
                    }
                }
                break;
            case (R.id.imageButton7):
                if (bloqueo7 == false) {
                    if (turno == 0 || turno == 1) {
                        posiciones[0][2] = 1;
                        turno = 3;
                        b7.setBackgroundResource(R.drawable.circulo);
                        bloqueo7 = true;
                        mostrarGanador(view);
                        if (comprobar(view).equalsIgnoreCase("")) {
                            comprobarGanar(view);
                        }
                    }
                }
                break;
            case (R.id.imageButton8):
                if (bloqueo8 == false) {
                    if (turno == 0 || turno == 1) {
                        posiciones[1][2] = 1;
                        turno = 3;
                        b8.setBackgroundResource(R.drawable.circulo);
                        bloqueo8 = true;
                        mostrarGanador(view);
                        if (comprobar(view).equalsIgnoreCase("")) {
                            comprobarGanar(view);
                        }
                    }
                }
                break;
            case (R.id.imageButton9):
                if (bloqueo9 == false) {
                    if (turno == 0 || turno == 1) {
                        posiciones[2][2] = 1;
                        turno = 3;
                        b9.setBackgroundResource(R.drawable.circulo);
                        bloqueo9 = true;
                        mostrarGanador(view);
                        if (comprobar(view).equalsIgnoreCase("")) {
                            comprobarGanar(view);
                        }
                    }
                }
                break;
        }
    }

    public String comprobar(View view) {
        if (posiciones[0][0] != 0 && posiciones[0][0] == posiciones[0][1] && posiciones[0][0] == posiciones[0][2]) {
            bloqueo = bloqueo2 = bloqueo3 = bloqueo4 = bloqueo5 = bloqueo6 = bloqueo7 = bloqueo8 = bloqueo9 = true;
            if (posiciones[0][0] == 1) {
                ganador = "verde";
            } else {
                ganador = "rojo";
            }
        } else if (posiciones[1][0] != 0 && posiciones[1][0] == posiciones[1][1] && posiciones[1][0] == posiciones[1][2]) {
            bloqueo = bloqueo2 = bloqueo3 = bloqueo4 = bloqueo5 = bloqueo6 = bloqueo7 = bloqueo8 = bloqueo9 = true;
            if (posiciones[1][0] == 1) {
                ganador = "verde";
            } else {
                ganador = "rojo";
            }
        } else if (posiciones[2][0] != 0 && posiciones[2][0] == posiciones[2][1] && posiciones[2][0] == posiciones[2][2]) {
            bloqueo = bloqueo2 = bloqueo3 = bloqueo4 = bloqueo5 = bloqueo6 = bloqueo7 = bloqueo8 = bloqueo9 = true;
            if (posiciones[2][0] == 1) {
                ganador = "verde";
            } else {
                ganador = "rojo";
            }
        } else if (posiciones[0][0] != 0 && posiciones[0][0] == posiciones[1][0] && posiciones[0][0] == posiciones[2][0]) {
            bloqueo = bloqueo2 = bloqueo3 = bloqueo4 = bloqueo5 = bloqueo6 = bloqueo7 = bloqueo8 = bloqueo9 = true;
            if (posiciones[0][0] == 1) {
                ganador = "verde";
            } else {
                ganador = "rojo";
            }
        } else if (posiciones[0][1] != 0 && posiciones[0][1] == posiciones[1][1] && posiciones[0][1] == posiciones[2][1]) {
            bloqueo = bloqueo2 = bloqueo3 = bloqueo4 = bloqueo5 = bloqueo6 = bloqueo7 = bloqueo8 = bloqueo9 = true;
            if (posiciones[0][1] == 1) {
                ganador = "verde";
            } else {
                ganador = "rojo";
            }
        } else if (posiciones[0][2] != 0 && posiciones[0][2] == posiciones[1][2] && posiciones[0][2] == posiciones[2][2]) {
            bloqueo = bloqueo2 = bloqueo3 = bloqueo4 = bloqueo5 = bloqueo6 = bloqueo7 = bloqueo8 = bloqueo9 = true;
            if (posiciones[0][2] == 1) {
                ganador = "verde";
            } else {
                ganador = "rojo";
            }
        } else if (posiciones[0][0] != 0 && posiciones[0][0] == posiciones[1][1] && posiciones[0][0] == posiciones[2][2]) {
            bloqueo = bloqueo2 = bloqueo3 = bloqueo4 = bloqueo5 = bloqueo6 = bloqueo7 = bloqueo8 = bloqueo9 = true;
            if (posiciones[0][0] == 1) {
                ganador = "verde";
            } else {
                ganador = "rojo";
            }
        } else if (posiciones[0][2] != 0 && posiciones[0][2] == posiciones[1][1] && posiciones[0][2] == posiciones[2][0]) {
            bloqueo = bloqueo2 = bloqueo3 = bloqueo4 = bloqueo5 = bloqueo6 = bloqueo7 = bloqueo8 = bloqueo9 = true;
            if (posiciones[0][2] == 1) {
                ganador = "verde";
            } else {
                ganador = "rojo";
            }
        } else if (posiciones[0][1] != 0 && posiciones[0][2] != 0 && posiciones[1][0] != 0 && posiciones[2][0] != 0
                && posiciones[1][1] != 0 && posiciones[1][2] != 0 && posiciones[2][1] != 0 && posiciones[2][2] != 0
                && posiciones[0][0] != 0) {
            ganador = "empate";
        }
        return ganador;
    }

    public void comprobarPosiciones(View view) {
        int aleatorio;
        if (posiciones[0][0] + posiciones[1][1] + posiciones[2][2] == 2) {
            aleatorio = (int) (Math.random() * (100 - 0 + 1) + 0);
            if (posiciones[0][0] == 0) {
                if (aleatorio < 100) {
                    posiciones[0][0] = turno;
                    turno = 1;
                    b1.setBackgroundResource(R.drawable.equis);
                    bloqueo = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[1][1] == 0) {
                if (aleatorio < 100) {
                    posiciones[1][1] = turno;
                    turno = 1;
                    b5.setBackgroundResource(R.drawable.equis);
                    bloqueo5 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[2][2] == 0) {
                if (aleatorio < 100) {
                    posiciones[2][2] = turno;
                    turno = 1;
                    b9.setBackgroundResource(R.drawable.equis);
                    bloqueo9 = true;
                    mostrarGanador(view);
                } else {

                }
            }
        } else if (posiciones[2][0] + posiciones[1][1] + posiciones[0][2] == 2) {
            aleatorio = (int) (Math.random() * (100 - 0 + 1) + 0);
            if (posiciones[2][0] == 0) {
                if (aleatorio < 100) {
                    posiciones[2][0] = turno;
                    turno = 1;
                    b3.setBackgroundResource(R.drawable.equis);
                    bloqueo3 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[1][1] == 0) {
                if (aleatorio < 100) {
                    posiciones[1][1] = turno;
                    turno = 1;
                    b5.setBackgroundResource(R.drawable.equis);
                    bloqueo5 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[0][2] == 0) {
                if (aleatorio < 100) {
                    posiciones[0][2] = turno;
                    turno = 1;
                    b7.setBackgroundResource(R.drawable.equis);
                    bloqueo7 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            }
        } else if (posiciones[0][0] + posiciones[1][0] + posiciones[2][0] == 2) {
            aleatorio = (int) (Math.random() * (100 - 0 + 1) + 0);
            if (posiciones[0][0] == 0) {
                if (aleatorio < 100) {
                    posiciones[0][0] = turno;
                    turno = 1;
                    b1.setBackgroundResource(R.drawable.equis);
                    bloqueo = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[1][0] == 0) {
                if (aleatorio < 100) {
                    posiciones[1][0] = turno;
                    turno = 1;
                    b2.setBackgroundResource(R.drawable.equis);
                    bloqueo2 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[2][0] == 0) {
                if (aleatorio < 100) {
                    posiciones[2][0] = turno;
                    turno = 1;
                    b3.setBackgroundResource(R.drawable.equis);
                    bloqueo3 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            }
        } else if (posiciones[0][0] + posiciones[0][1] + posiciones[0][2] == 2) {
            aleatorio = (int) (Math.random() * (100 - 0 + 1) + 0);
            if (posiciones[0][0] == 0) {
                if (aleatorio < 100) {
                    posiciones[0][0] = turno;
                    turno = 1;
                    b1.setBackgroundResource(R.drawable.equis);
                    bloqueo = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[0][1] == 0) {
                if (aleatorio < 100) {
                    posiciones[0][1] = turno;
                    turno = 1;
                    b4.setBackgroundResource(R.drawable.equis);
                    bloqueo4 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[0][2] == 0) {
                if (aleatorio < 100) {
                    posiciones[0][2] = turno;
                    turno = 1;
                    b7.setBackgroundResource(R.drawable.equis);
                    bloqueo7 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            }
        } else if (posiciones[0][1] + posiciones[1][1] + posiciones[2][1] == 2) {
            aleatorio = (int) (Math.random() * (100 - 0 + 1) + 0);
            if (posiciones[0][1] == 0) {
                if (aleatorio < 100) {
                    posiciones[0][1] = turno;
                    turno = 1;
                    b4.setBackgroundResource(R.drawable.equis);
                    bloqueo4 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[1][1] == 0) {
                if (aleatorio < 100) {
                    posiciones[1][1] = turno;
                    turno = 1;
                    b5.setBackgroundResource(R.drawable.equis);
                    bloqueo5 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[2][1] == 0) {
                if (aleatorio < 100) {
                    posiciones[2][1] = turno;
                    turno = 1;
                    b6.setBackgroundResource(R.drawable.equis);
                    bloqueo6 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            }
        } else if (posiciones[1][0] + posiciones[1][1] + posiciones[1][2] == 2) {
            aleatorio = (int) (Math.random() * (100 - 0 + 1) + 0);
            if (posiciones[1][0] == 0) {
                if (aleatorio < 100) {
                    posiciones[1][0] = turno;
                    turno = 1;
                    b2.setBackgroundResource(R.drawable.equis);
                    bloqueo2 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[1][1] == 0) {
                if (aleatorio < 100) {
                    posiciones[1][1] = turno;
                    turno = 1;
                    b5.setBackgroundResource(R.drawable.equis);
                    bloqueo5 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[1][2] == 0) {
                if (aleatorio < 100) {
                    posiciones[1][2] = turno;
                    turno = 1;
                    b8.setBackgroundResource(R.drawable.equis);
                    bloqueo8 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            }
        } else if (posiciones[0][2] + posiciones[1][2] + posiciones[2][2] == 2) {
            aleatorio = (int) (Math.random() * (100 - 0 + 1) + 0);
            if (posiciones[0][2] == 0) {
                if (aleatorio < 100) {
                    posiciones[0][2] = turno;
                    turno = 1;
                    b7.setBackgroundResource(R.drawable.equis);
                    bloqueo7 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[1][2] == 0) {
                if (aleatorio < 100) {
                    posiciones[1][2] = turno;
                    turno = 1;
                    b8.setBackgroundResource(R.drawable.equis);
                    bloqueo8 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[2][2] == 0) {
                if (aleatorio < 100) {
                    posiciones[2][2] = turno;
                    turno = 1;
                    b9.setBackgroundResource(R.drawable.equis);
                    bloqueo9 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            }
        } else if (posiciones[2][0] + posiciones[2][1] + posiciones[2][2] == 2) {
            aleatorio = (int) (Math.random() * (100 - 0 + 1) + 0);
            if (posiciones[2][0] == 0) {
                if (aleatorio < 100) {
                    posiciones[2][0] = turno;
                    turno = 1;
                    b3.setBackgroundResource(R.drawable.equis);
                    bloqueo3 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[2][1] == 0) {
                if (aleatorio < 100) {
                    posiciones[2][1] = turno;
                    turno = 1;
                    b6.setBackgroundResource(R.drawable.equis);
                    bloqueo6 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[2][2] == 0) {
                if (aleatorio < 100) {
                    posiciones[2][2] = turno;
                    turno = 1;
                    b9.setBackgroundResource(R.drawable.equis);
                    bloqueo9 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            }
        } else {
            aleatorio = (int) (Math.random() * (9 - 1 + 1) + 1);
            switch (aleatorio) {
                case 1:
                    if (bloqueo == false) {
                        posiciones[0][0] = turno;
                        turno = 1;
                        b1.setBackgroundResource(R.drawable.equis);
                        bloqueo = true;
                        mostrarGanador(view);
                        break;
                    } else {
                    }
                case 2:
                    if (bloqueo2 == false) {
                        posiciones[1][0] = turno;
                        turno = 1;
                        b2.setBackgroundResource(R.drawable.equis);
                        bloqueo2 = true;
                        mostrarGanador(view);
                        break;
                    } else {
                    }
                case 3:
                    if (bloqueo3 == false) {
                        posiciones[2][0] = turno;
                        turno = 1;
                        b3.setBackgroundResource(R.drawable.equis);
                        bloqueo3 = true;
                        mostrarGanador(view);
                        break;
                    } else {
                    }
                case 4:
                    if (bloqueo4 == false) {
                        posiciones[0][1] = turno;
                        turno = 1;
                        b4.setBackgroundResource(R.drawable.equis);
                        bloqueo4 = true;
                        mostrarGanador(view);
                        break;
                    } else {
                    }
                case 5:
                    if (bloqueo5 == false) {
                        posiciones[1][1] = turno;
                        turno = 1;
                        b5.setBackgroundResource(R.drawable.equis);
                        bloqueo5 = true;
                        mostrarGanador(view);
                        break;
                    } else {
                    }
                case 6:
                    if (bloqueo6 == false) {
                        posiciones[2][1] = turno;
                        turno = 1;
                        b6.setBackgroundResource(R.drawable.equis);
                        bloqueo6 = true;
                        mostrarGanador(view);
                        break;
                    } else {
                    }
                case 7:
                    if (bloqueo7 == false) {
                        posiciones[0][2] = turno;
                        turno = 1;
                        b7.setBackgroundResource(R.drawable.equis);
                        bloqueo7 = true;
                        mostrarGanador(view);
                        break;
                    } else {
                    }
                case 8:
                    if (bloqueo8 == false) {
                        posiciones[1][2] = turno;
                        turno = 1;
                        b8.setBackgroundResource(R.drawable.equis);
                        bloqueo8 = true;
                        mostrarGanador(view);
                        break;
                    } else {
                    }
                case 9:
                    if (bloqueo9 == false) {
                        posiciones[2][2] = turno;
                        turno = 1;
                        b9.setBackgroundResource(R.drawable.equis);
                        bloqueo9 = true;
                        mostrarGanador(view);
                        break;
                    } else {
                        comprobarPosiciones(view);
                        break;
                    }
            }
        }
    }

    public void comprobarGanar(View view) {
        int aleatorio;
        if (posiciones[0][0] + posiciones[1][1] + posiciones[2][2] == 6) {
            aleatorio = (int) (Math.random() * (100 - 0 + 1) + 0);
            if (posiciones[0][0] == 0) {
                if (aleatorio < 100) {
                    posiciones[0][0] = turno;
                    turno = 1;
                    b1.setBackgroundResource(R.drawable.equis);
                    bloqueo = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[1][1] == 0) {
                if (aleatorio < 100) {
                    posiciones[1][1] = turno;
                    turno = 1;
                    b5.setBackgroundResource(R.drawable.equis);
                    bloqueo5 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[2][2] == 0) {
                if (aleatorio < 100) {
                    posiciones[2][2] = turno;
                    turno = 1;
                    b9.setBackgroundResource(R.drawable.equis);
                    bloqueo9 = true;
                    mostrarGanador(view);
                } else {

                }
            }
        } else if (posiciones[2][0] + posiciones[1][1] + posiciones[0][2] == 6) {
            aleatorio = (int) (Math.random() * (100 - 0 + 1) + 0);
            if (posiciones[2][0] == 0) {
                if (aleatorio < 100) {
                    posiciones[2][0] = turno;
                    turno = 1;
                    b3.setBackgroundResource(R.drawable.equis);
                    bloqueo3 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[1][1] == 0) {
                if (aleatorio < 100) {
                    posiciones[1][1] = turno;
                    turno = 1;
                    b5.setBackgroundResource(R.drawable.equis);
                    bloqueo5 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[0][2] == 0) {
                if (aleatorio < 100) {
                    posiciones[0][2] = turno;
                    turno = 1;
                    b7.setBackgroundResource(R.drawable.equis);
                    bloqueo7 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            }
        } else if (posiciones[0][0] + posiciones[1][0] + posiciones[2][0] == 6) {
            aleatorio = (int) (Math.random() * (100 - 0 + 1) + 0);
            if (posiciones[0][0] == 0) {
                if (aleatorio < 100) {
                    posiciones[0][0] = turno;
                    turno = 1;
                    b1.setBackgroundResource(R.drawable.equis);
                    bloqueo = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[1][0] == 0) {
                if (aleatorio < 100) {
                    posiciones[1][0] = turno;
                    turno = 1;
                    b2.setBackgroundResource(R.drawable.equis);
                    bloqueo2 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[2][0] == 0) {
                if (aleatorio < 100) {
                    posiciones[2][0] = turno;
                    turno = 1;
                    b3.setBackgroundResource(R.drawable.equis);
                    bloqueo3 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            }
        } else if (posiciones[0][0] + posiciones[0][1] + posiciones[0][2] == 6) {
            aleatorio = (int) (Math.random() * (100 - 0 + 1) + 0);
            if (posiciones[0][0] == 0) {
                if (aleatorio < 100) {
                    posiciones[0][0] = turno;
                    turno = 1;
                    b1.setBackgroundResource(R.drawable.equis);
                    bloqueo = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[0][1] == 0) {
                if (aleatorio < 100) {
                    posiciones[0][1] = turno;
                    turno = 1;
                    b4.setBackgroundResource(R.drawable.equis);
                    bloqueo4 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[0][2] == 0) {
                if (aleatorio < 100) {
                    posiciones[0][2] = turno;
                    turno = 1;
                    b7.setBackgroundResource(R.drawable.equis);
                    bloqueo7 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            }
        } else if (posiciones[0][1] + posiciones[1][1] + posiciones[2][1] == 6) {
            aleatorio = (int) (Math.random() * (100 - 0 + 1) + 0);
            if (posiciones[0][1] == 0) {
                if (aleatorio < 100) {
                    posiciones[0][1] = turno;
                    turno = 1;
                    b4.setBackgroundResource(R.drawable.equis);
                    bloqueo4 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[1][1] == 0) {
                if (aleatorio < 100) {
                    posiciones[1][1] = turno;
                    turno = 1;
                    b5.setBackgroundResource(R.drawable.equis);
                    bloqueo5 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[2][1] == 0) {
                if (aleatorio < 100) {
                    posiciones[2][1] = turno;
                    turno = 1;
                    b6.setBackgroundResource(R.drawable.equis);
                    bloqueo6 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            }
        } else if (posiciones[1][0] + posiciones[1][1] + posiciones[1][2] == 6) {
            aleatorio = (int) (Math.random() * (100 - 0 + 1) + 0);
            if (posiciones[1][0] == 0) {
                if (aleatorio < 100) {
                    posiciones[1][0] = turno;
                    turno = 1;
                    b2.setBackgroundResource(R.drawable.equis);
                    bloqueo2 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[1][1] == 0) {
                if (aleatorio < 100) {
                    posiciones[1][1] = turno;
                    turno = 1;
                    b5.setBackgroundResource(R.drawable.equis);
                    bloqueo5 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[1][2] == 0) {
                if (aleatorio < 100) {
                    posiciones[1][2] = turno;
                    turno = 1;
                    b8.setBackgroundResource(R.drawable.equis);
                    bloqueo8 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            }
        } else if (posiciones[0][2] + posiciones[1][2] + posiciones[2][2] == 6) {
            aleatorio = (int) (Math.random() * (100 - 0 + 1) + 0);
            if (posiciones[0][2] == 0) {
                if (aleatorio < 100) {
                    posiciones[0][2] = turno;
                    turno = 1;
                    b7.setBackgroundResource(R.drawable.equis);
                    bloqueo7 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[1][2] == 0) {
                if (aleatorio < 100) {
                    posiciones[1][2] = turno;
                    turno = 1;
                    b8.setBackgroundResource(R.drawable.equis);
                    bloqueo8 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[2][2] == 0) {
                if (aleatorio < 100) {
                    posiciones[2][2] = turno;
                    turno = 1;
                    b9.setBackgroundResource(R.drawable.equis);
                    bloqueo9 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            }
        } else if (posiciones[2][0] + posiciones[2][1] + posiciones[2][2] == 6) {
            aleatorio = (int) (Math.random() * (100 - 0 + 1) + 0);
            if (posiciones[2][0] == 0) {
                if (aleatorio < 100) {
                    posiciones[2][0] = turno;
                    turno = 1;
                    b3.setBackgroundResource(R.drawable.equis);
                    bloqueo3 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[2][1] == 0) {
                if (aleatorio < 100) {
                    posiciones[2][1] = turno;
                    turno = 1;
                    b6.setBackgroundResource(R.drawable.equis);
                    bloqueo6 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarGanar(view);
                                break;
                            }
                    }
                }
            } else if (posiciones[2][2] == 0) {
                if (aleatorio < 100) {
                    posiciones[2][2] = turno;
                    turno = 1;
                    b9.setBackgroundResource(R.drawable.equis);
                    bloqueo9 = true;
                    mostrarGanador(view);
                } else {
                    aleatorio = (int) (Math.random() * (11 - 1 + 1) + 1);
                    switch (aleatorio) {
                        case 1:
                            if (bloqueo == false) {
                                posiciones[0][0] = turno;
                                turno = 1;
                                b1.setBackgroundResource(R.drawable.equis);
                                bloqueo = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 2:
                            if (bloqueo2 == false) {
                                posiciones[1][0] = turno;
                                turno = 1;
                                b2.setBackgroundResource(R.drawable.equis);
                                bloqueo2 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 3:
                            if (bloqueo3 == false) {
                                posiciones[2][0] = turno;
                                turno = 1;
                                b3.setBackgroundResource(R.drawable.equis);
                                bloqueo3 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 4:
                            if (bloqueo4 == false) {
                                posiciones[0][1] = turno;
                                turno = 1;
                                b4.setBackgroundResource(R.drawable.equis);
                                bloqueo4 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 5:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 6:
                            if (bloqueo6 == false) {
                                posiciones[2][1] = turno;
                                turno = 1;
                                b6.setBackgroundResource(R.drawable.equis);
                                bloqueo6 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 7:
                            if (bloqueo7 == false) {
                                posiciones[0][2] = turno;
                                turno = 1;
                                b7.setBackgroundResource(R.drawable.equis);
                                bloqueo7 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 8:
                            if (bloqueo8 == false) {
                                posiciones[1][2] = turno;
                                turno = 1;
                                b8.setBackgroundResource(R.drawable.equis);
                                bloqueo8 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                            }
                        case 9:
                            if (bloqueo9 == false) {
                                posiciones[2][2] = turno;
                                turno = 1;
                                b9.setBackgroundResource(R.drawable.equis);
                                bloqueo9 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 10:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                        case 11:
                            if (bloqueo5 == false) {
                                posiciones[1][1] = turno;
                                turno = 1;
                                b5.setBackgroundResource(R.drawable.equis);
                                bloqueo5 = true;
                                mostrarGanador(view);
                                break;
                            } else {
                                comprobarPosiciones(view);
                                break;
                            }
                    }
                }
            }
        } else {
            comprobarPosiciones(view);
        }
    }

    public void mostrarGanador(final View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Has ganado", Toast.LENGTH_LONG);
        if (comprobar(view).equalsIgnoreCase("verde")) {
            cuentaVictorias = cuentaVictorias + 1;
            toast = Toast.makeText(getApplicationContext(), "¡Felicidades has ganado!", Toast.LENGTH_LONG);
            toast.show();
            llamaTresRaya.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    abrirDialogo(view);
                }
            });
        } else if (comprobar(view).equalsIgnoreCase("rojo")) {
            toast = Toast.makeText(getApplicationContext(), "Ha ganado la maquina", Toast.LENGTH_LONG);
            toast.show();
            cVVieja = cuentaVictorias;
            cEVieja = cuentaEmpates;
            cuentaVictorias = 0;
            cuentaEmpates = 0;
            llamaTresRaya.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    abrirDialogo(view);
                }
            });
        } else if (comprobar(view).equalsIgnoreCase("empate")) {
            cuentaEmpates = cuentaEmpates + 1;
            toast = Toast.makeText(getApplicationContext(), "¡Empate!", Toast.LENGTH_LONG);
            toast.show();
            llamaTresRaya.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    abrirDialogo(view);
                }
            });
        }
    }

    public void abrirDialogo(View view) {
        final Dialog customDialog = new Dialog(this);
        customDialog.setTitle("Puntuaciones:");
        //establecemos el contenido de nuestro dialog
        customDialog.setContentView(R.layout.activity_dialogo_tresraya);

        final TextView tVictoria = (TextView) customDialog.findViewById(R.id.tVictoria);
        final TextView tEmpate = (TextView) customDialog.findViewById(R.id.tEmpate);
        final EditText eNombre = (EditText) customDialog.findViewById(R.id.eNombre);
        final Button bContinuar = (Button) customDialog.findViewById(R.id.bContinuar);
        final Button bCompartir = (Button) customDialog.findViewById(R.id.bCompartir);

        if (!comprobar(view).equalsIgnoreCase("rojo")) {
            tVictoria.setText(String.valueOf(cuentaVictorias));
            tEmpate.setText(String.valueOf(cuentaEmpates));
        } else {
            tVictoria.setText(String.valueOf(cVVieja));
            tEmpate.setText(String.valueOf(cEVieja));
        }

        bContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!comprobar(view).equalsIgnoreCase("rojo")) {
                    customDialog.dismiss();
                    reiniciar(view);
                }
            }
        });
        bCompartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ODB odb = null;
                Puntuaciones puntuaciones;
                try {
                    odb = ODBFactory.open(ODB_NAME);
                    puntuaciones = new Puntuaciones("Tres en raya", String.valueOf(eNombre.getText()), 0, Integer.parseInt(tVictoria.getText().toString()), Integer.parseInt(tEmpate.getText().toString()));
                    odb.store(puntuaciones);
                } finally {
                    if (odb != null) {
                        odb.close();
                    }
                }
                customDialog.dismiss();
                reiniciar(view);
            }
        }
    );
    customDialog.show();
}

    public void reiniciar(View view) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                posiciones[i][j] = 0;
            }
        }
        ganador = "";
        turno = 0;
        bloqueo = false;
        bloqueo2 = false;
        bloqueo3 = false;
        bloqueo4 = false;
        bloqueo5 = false;
        bloqueo6 = false;
        bloqueo7 = false;
        bloqueo8 = false;
        bloqueo9 = false;
        b1.setBackgroundResource(R.drawable.nada);
        b2.setBackgroundResource(R.drawable.nada);
        b3.setBackgroundResource(R.drawable.nada);
        b4.setBackgroundResource(R.drawable.nada);
        b5.setBackgroundResource(R.drawable.nada);
        b6.setBackgroundResource(R.drawable.nada);
        b7.setBackgroundResource(R.drawable.nada);
        b8.setBackgroundResource(R.drawable.nada);
        b9.setBackgroundResource(R.drawable.nada);
        llamaTresRaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}