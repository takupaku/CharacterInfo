package co.example.takwa.characterinfo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView textView1, textView2;
    ImageView imageView;

    private int photoid;
    private String name;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        initView();
        loadData();
    }

    private void initView() {

        imageView = findViewById(R.id.detailViewingId);
        textView1 = findViewById(R.id.headlineId);
        textView2 = findViewById(R.id.detailviewId);
    }

    private void loadData() {
        name = getIntent().getExtras().getString("names");
        photoid = getIntent().getExtras().getInt("photo");

        imageView.setImageResource(photoid);
        textView1.setText(name);

        if(name.equalsIgnoreCase("Maki Tsuyoshi"))
        {
            String know = getResources().getString(R.string.maki);
            textView2.setText(know);
        }
       else if(name.equalsIgnoreCase("Lalouch Britania"))
        {
            String know = getResources().getString(R.string.lalouch);
            textView2.setText(know);


        }

        else if (name.equalsIgnoreCase("Tokuchi Toua")){
            String know = getResources().getString(R.string.toua);
            textView2.setText(know);

        }

        else if (name.equalsIgnoreCase("Johan Liebert")){
            String know = getResources().getString(R.string.johan);
            textView2.setText(know);

        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }
}
