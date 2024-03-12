package com.mddesai.portfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView list=findViewById(R.id.recycler_view_project);
      Project[] projects= {
              new Project("hello title", "this is description", R.drawable.ic_launcher_background),
              new Project("hello title2", "this is description", R.drawable.ic_launcher_background),
              new Project("hello title3", "this is description", R.drawable.ic_launcher_background),
              new Project("hello title4", "this is description", R.drawable.ic_launcher_background),
      };

      ProjectsAdapter adapter=new ProjectsAdapter(projects);
       list.setAdapter(adapter);



    }
}