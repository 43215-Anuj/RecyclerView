package com.example.anuj.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.list);
        String[] friends ={ "Anuj", "Vivek","Ajeet","Sahil","Karan","Abhishekh"};
        String[] desc ={"Good Boy","whatever","How are you","hi!!! buddy","moron","nice boy"};
        int[] imgId ={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R .drawable.f};
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ProgramAdapter(friends,desc,imgId));
    }
}
