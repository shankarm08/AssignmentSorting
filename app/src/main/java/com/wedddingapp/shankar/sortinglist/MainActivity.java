package com.wedddingapp.shankar.sortinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static android.R.attr.data;
import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    ListView lv;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv = (ListView) findViewById(R.id.monthslist);

        // Instanciating an array list (you don't need to do this,
        // you already have yours).
        final List<String> your_array_list = new ArrayList<String>();
        your_array_list.add("January");
        your_array_list.add("Febrary");
        your_array_list.add("March");
        your_array_list.add("April");
        your_array_list.add("May");
        your_array_list.add("June");
        your_array_list.add("July");
        your_array_list.add("August");
        your_array_list.add("September");
        your_array_list.add("October");
        your_array_list.add("November");
        your_array_list.add("December");


        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, R.layout.tecolor,android.R.id.text1,
                your_array_list);

        lv.setAdapter(arrayAdapter);


        Button Ascending = (Button) findViewById(R.id.b1);
        Button Descending=(Button)findViewById(R.id.b2);

        Ascending.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {


                Collections.sort(your_array_list);
             //   for (int i = 0; i < your_array_list.size(); i++)
                 //   System.out.println(your_array_list.get(i));
                arrayAdapter.notifyDataSetChanged();


                //  Collections.sort(your_array_list, new Comparator<String>() {


                //     public int compare(String lhs, String rhs) {
                //   return lhs.compareToIgnoreCase(rhs);//Ascending order.
                //        //return (lhs.compareToIgnoreCase(rhs)*(-1));//Descending order.

                //      }
                //   });


                // System.out.println("name : "+your_array_list);


                //   list = new ArrayList<String>(Arrays.asList(months));


                //Collections.sort(your_array_list);
                //// for (String str : your_array_list) {
                //  System.out.println(str);


                //   }


            }


        });


        Descending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Collections.sort(your_array_list, Collections.reverseOrder());
              //  for (int i = 0; i < your_array_list.size(); i++)
                  //  System.out.println(your_array_list.get(i));
                arrayAdapter.notifyDataSetChanged();




            }


        });


    }

}

  //  }
 //}























