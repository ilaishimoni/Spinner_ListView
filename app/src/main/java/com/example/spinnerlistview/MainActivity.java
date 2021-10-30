package com.example.spinnerlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {

    String[] classes = {"select a class","yudalef_4", "yudalef_5", "yudalef_6", "yudalef_7"};
    Spinner spin;
    ListView lv;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;

    int pos;

    String[] yudalef_4 = {"yakir", "harel", "paz", "agam", "ofek", "or", "ori", "ooria", "ilai", "etay"};

    String[] yudalef_4_yakir = {"yakir", "Graham","0571822997","17/2/2005" };
    String[] yudalef_4_harel = {"harel", "Walker","0563271573","8/2/2005"};
    String[] yudalef_4_paz = {"paz", "Reid","0554824874","4/8/2005"};
    String[] yudalef_4_agam = {"agam", "Cole","0524741888","14/3/2005"};
    String[] yudalef_4_ofek = {"ofek", "Wagner","0564736743","19/6/2005"};
    String[] yudalef_4_or = {"or", "Mullins","0572221448","21/3/2005"};
    String[] yudalef_4_ori = {"ori", "Stanley","0538069092","18/6/2005"};
    String[] yudalef_4_ooria = {"ooria", "Gomez","0583937312","15/6/2005"};
    String[] yudalef_4_ilai = {"ilai", "Williamson","0542456450","11/11/2005"};
    String[] yudalef_4_etay = {"etay", "Watson","0524875297","2/8/2005"};

    String [][] yudalef_4_arr = {yudalef_4_yakir, yudalef_4_harel,yudalef_4_paz, yudalef_4_agam, yudalef_4_ofek,yudalef_4_or,yudalef_4_ori,yudalef_4_ooria,yudalef_4_ilai,yudalef_4_etay};

    String[] yudalef_5 = {"alon", "amit", "gaya", "noya", "albert", "dorin", "adir", "hila", "zohar", "ziv"};

    String[] yudalef_5_alon = {"alon", "King","0520236579","7/10/2005"};
    String[] yudalef_5_amit = {"amit", "Holt","0514727044","13/6/2005"};
    String[] yudalef_5_gaya = {"gaya", "Haynes","0529264495","6/5/2005"};
    String[] yudalef_5_noya = {"noya", "Phillips","0590074722","8/3/2005"};
    String[] yudalef_5_albert = {"albert", "Edwards","0575258817","5/6/2005"};
    String[] yudalef_5_dorin = {"dorin", "Weaver","0535089515","4/3/2005"};
    String[] yudalef_5_adir = {"adir", "Shelton","0514381110","1/7/2005"};
    String[] yudalef_5_hila = {"hila", "Griffin","0525744505","8/4/2005"};
    String[] yudalef_5_zohar = {"zohar", "Rogers","0587438269","5/9/2005"};
    String[] yudalef_5_ziv = {"ziv", "Olson","0526349594","9/1/2005"};

    String [][] yudalef_5_arr = {yudalef_5_alon, yudalef_5_amit,yudalef_5_gaya, yudalef_5_noya, yudalef_5_albert,yudalef_5_dorin,yudalef_5_adir,yudalef_5_hila,yudalef_5_zohar,yudalef_5_ziv};

    String[] yudalef_6 = {"yehonatan", "yeholakah", "yarin", "lior", "liav", "lia", "lihi", "liron", "may", "matan"};

    String[] yudalef_6_yehonatan = {"yehonatan", "Moreno","0518909151","13/2/2005"};
    String[] yudalef_6_yeholakah = {"yeholakah", "Ortiz","0566743592","22/11/2005"};
    String[] yudalef_6_yarin = {"yarin", "Rodriguez","0586923573","6/9/2005"};
    String[] yudalef_6_lior = {"lior", "Howarth","0580236795","25/8/2005"};
    String[] yudalef_6_liav = {"liav", "Hammond","0549352912","15/11/2005"};
    String[] yudalef_6_lia = {"lia", "Lovell","0589220920","24/3/2005"};
    String[] yudalef_6_lihi = {"lihi", "Drew","0530322330","12/11/2005"};
    String[] yudalef_6_liron = {"liron", "Bird","0586162779","5/4/2005"};
    String[] yudalef_6_may = {"may", "Mccarthy","0574593052","12/3/2005"};
    String[] yudalef_6_matan = {"matan", "Fernandez","0520402002","15/7/2005"};

    String [][] yudalef_6_arr = {yudalef_6_yehonatan, yudalef_6_yeholakah,yudalef_6_yarin, yudalef_6_lior, yudalef_6_liav,yudalef_6_lia,yudalef_6_lihi,yudalef_6_liron,yudalef_6_may,yudalef_6_matan};

    String[] yudalef_7 = {"naor", "noga", "noa", "noam", "nizan", "nikol", "sami", "sahar", "stav", "eden"};

    String[] yudalef_7_naor = {"naor", "Mccoy","0518040802","16/4/2005"};
    String[] yudalef_7_noga = {"noga", "Meyer","0597533807","24/5/2005"};
    String[] yudalef_7_noa = {"noa", "Laing","0577887635","4/3/2005"};
    String[] yudalef_7_noam = {"noam", "Gonzales","0531601951","7/8/2005"};
    String[] yudalef_7_nizan = {"nizan", "Carrillo","0597338852","15/1/2005"};
    String[] yudalef_7_nikol = {"nikol", "Blair","0565911972","19/3/2005"};
    String[] yudalef_7_sami = {"sami", "Rose","0517744668","23/7/2005"};
    String[] yudalef_7_sahar = {"sahar", "Bauer","0518314419","4/6/2005"};
    String[] yudalef_7_stav = {"stav", "Glover","0536470718","6/9/2005"};
    String[] yudalef_7_eden = {"eden", "Garza","0582147247","8/10/2005"};

    String [][] yudalef_7_arr = {yudalef_7_naor, yudalef_7_noga,yudalef_7_noa, yudalef_7_noam, yudalef_7_nizan,yudalef_7_nikol,yudalef_7_sami,yudalef_7_sahar,yudalef_7_stav,yudalef_7_eden};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        spin = findViewById(R.id.spin);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);


        spin.setOnItemSelectedListener(this);

        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lv.setOnItemClickListener(this);



        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, classes);
        spin.setAdapter(adp);


    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if (position == 1){
            ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, yudalef_4);
            lv.setAdapter(adapt);
        }
        if (position == 2){
            ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, yudalef_5);
            lv.setAdapter(adapt);
        }
        if (position == 3){
            ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, yudalef_6);
            lv.setAdapter(adapt);
        }
        if (position == 4){
            ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, yudalef_7);
            lv.setAdapter(adapt);
        }

        pos = position;

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (pos==1){
            tv1.setText(yudalef_4_arr[position][0]);
            tv2.setText(yudalef_4_arr[position][1]);
            tv3.setText(yudalef_4_arr[position][2]);
            tv4.setText(yudalef_4_arr[position][3]);

        }
        if (pos==2){
            tv1.setText(yudalef_5_arr[position][0]);
            tv2.setText(yudalef_5_arr[position][1]);
            tv3.setText(yudalef_5_arr[position][2]);
            tv4.setText(yudalef_4_arr[position][3]);

        }
        if (pos==3){
            tv1.setText(yudalef_6_arr[position][0]);
            tv2.setText(yudalef_6_arr[position][1]);
            tv3.setText(yudalef_6_arr[position][2]);
            tv4.setText(yudalef_4_arr[position][3]);

        }
        if (pos==4){
            tv1.setText(yudalef_7_arr[position][0]);
            tv2.setText(yudalef_7_arr[position][1]);
            tv3.setText(yudalef_7_arr[position][2]);
            tv4.setText(yudalef_4_arr[position][3]);

        }

    }
}