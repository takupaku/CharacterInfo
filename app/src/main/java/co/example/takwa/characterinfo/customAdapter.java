package co.example.takwa.characterinfo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class customAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private Context context;
    private String[] names;
    private int[] images;

    public customAdapter(Context context, String[] names, int[] images) {
        this.context = context;
        this.names = names;
        this.images = images;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if(convertView ==null){
            layoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            layoutInflater.inflate(R.layout.custom_row,parent,false);

        }
       

        ImageView photo =(ImageView) convertView.findViewById(R.id.photoId);
        TextView name=(TextView) convertView.findViewById(R.id.nameId);
        TextView viewdetails= (TextView) convertView.findViewById(R.id.detailId);

        photo.setImageResource(images[position]);
        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context,PhotoActivity.class);
                intent.putExtra("photo",images[position]);
                context.startActivity(intent);



            }
        });

        viewdetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context,DetailActivity.class);
                intent.putExtra("names",names[position]);
                context.startActivity(intent);


            }
        });

        return convertView;
    }
}
