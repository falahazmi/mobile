package org.aplas.basicappx;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private Distance dist;
    private Weight weight;
    private Temperature temp;
    private Button convertBtn;
    private EditText inputTxt;
    private EditText outputTxt;
    private Spinner unitOri;
    private Spinner unitConv;
    private RadioGroup unitType;
    private CheckBox roundBox;
    private CheckBox formBox;
    private ImageView imgView;

    public MainActivity() {
        dist = new Distance();
        weight = new Weight();
        temp = new Temperature();
    }

    public MainActivity(Distance dist, Weight weight, Temperature temp){
        this.dist = dist;
        this.weight = weight;
        this.temp = temp;
    }

    protected double convertUnit(String type, String oriUnit, String convUnit, double value){
        if (type.equals("Temperature")) {
            if (oriUnit.equals("°C")) {

                if (convUnit.equals("°F")) {
                    return temp.getFahrenheit();

                } else if (convUnit.equals("K")) {
                    return temp.getKelvins();

                } else if (convUnit.equals("°C")) {
                    return temp.getCelcius();
                }
            } else if (oriUnit.equals("°F")) {

                if (convUnit.equals("°C")) {
                    return temp.getCelcius();

                } else if (convUnit.equals("K")) {
                    return temp.getKelvins();

                } else if (convUnit.equals("°F")) {
                    return temp.getFahrenheit();
                }
            } else if (oriUnit.equals("K")) {

                if (convUnit.equals("°C")) {
                    return temp.getCelcius();

                } else if (convUnit.equals("°F")) {
                    return temp.getFahrenheit();

                } else if (convUnit.equals("K")) {
                    return temp.getKelvins();
                }
            }
        } else if (type.equals("Distance")) {
            if (oriUnit.equals("Mtr")) {

                if (convUnit.equals("Mtr")) {
                    return dist.getMeter();

                } else if (convUnit.equals("Inc")) {
                    return dist.getInch();

                } else if (convUnit.equals("Mil")) {
                    return dist.getMile();
                } else if (convUnit.equals("Ft")) {
                    return dist.getFoot();
                }
            } else if (oriUnit.equals("Inc")) {

                if (convUnit.equals("Mtr")) {
                    return dist.getMeter();

                } else if (convUnit.equals("Inc")) {
                    return dist.getInch();

                } else if (convUnit.equals("Mil")) {
                    return dist.getMile();
                } else if (convUnit.equals("Ft")) {
                    return dist.getFoot();
                }
            } else if (oriUnit.equals("Mil")) {

                if (convUnit.equals("Mtr")) {
                    return dist.getMeter();

                } else if (convUnit.equals("Inc")) {
                    return dist.getInch();

                } else if (convUnit.equals("Mil")) {
                    return dist.getMile();
                } else if (convUnit.equals("Ft")) {
                    return dist.getFoot();
                }
            } else if (oriUnit.equals("Ft")) {

                if (convUnit.equals("Mtr")) {
                    return dist.getMeter();

                } else if (convUnit.equals("Inc")) {
                    return dist.getInch();

                } else if (convUnit.equals("Mil")) {
                    return dist.getMile();
                } else if (convUnit.equals("Ft")) {
                    return dist.getFoot();
                }
            }
        } else if (type.equals("Weight")) {
            if (oriUnit.equals("Grm")) {

                if (convUnit.equals("Onc")) {
                    return weight.getOunce();

                } else if (convUnit.equals("Pnd")) {
                    return weight.getPound();

                } else if (convUnit.equals("Grm")) {
                    return weight.getGram();
                }
            } else if (oriUnit.equals("Onc")) {

                if (convUnit.equals("Grm")) {
                    return weight.getGram();

                } else if (convUnit.equals("Pnd")) {
                    return weight.getPound();

                } else if (convUnit.equals("Onc")) {
                    return weight.getOunce();
                }
            } else if (oriUnit.equals("Pnd")) {

                if (convUnit.equals("Grm")) {
                    return weight.getGram();

                } else if (convUnit.equals("Onc")) {
                    return weight.getOunce();

                } else if (convUnit.equals("Pnd")) {
                    return weight.getPound();
                }
            }
        }

        return 0;
    }

    protected String strResult(double val, boolean rounded) {
        if (rounded) {
            DecimalFormat d = new DecimalFormat("#.##");
            return d.format(val);
        } else {
            DecimalFormat d2 = new DecimalFormat("#.####");
            return d2.format(val);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}