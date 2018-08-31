package co.example.takwa.characterinfo;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

   private int[] images = {R.drawable.himitsu,R.drawable.lalouch,R.drawable.tua,R.drawable.johan};
    private String[] actors = {"Maki Tsuyoshi","Lalouch Britania","Tokuchi Toua","Johan Liebert"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();





    }

    private void initView() {

        listView = findViewById(R.id.listViewId);
        customAdapter adapter = new customAdapter(this,actors,images);
        listView.setAdapter(adapter);

    }


}
