package com.gmail.farasabiyyu12.menujubandarduniayangmadani;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityRecycle3 extends AppCompatActivity {

    RecyclerView recy3;
    CustomAdapter adap3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle3);
        /*
        recy2 = findViewById(R.id.listkuliner);
        recy2.setLayoutManager(new LinearLayoutManager(this));
        adap2 = new CustomAdapter();
        recy2.setAdapter(adap2);
         */

        recy3 = findViewById(R.id.listhotel);
        recy3.setLayoutManager(new LinearLayoutManager(this));
        adap3 = new CustomAdapter();
        recy3.setAdapter(adap3);
    }

    String [] namahot = {"Harris Hotel", "Goodway Hotel", "Golden View", "I Hotel Baloy", "Biz Hotel Batam"};
    String [] kethot = {"Hotel Yang Paling Terkenal Di Batam", "Goodway Hotel Batam in Batam Island, Indonesia: Special deals ",
            "Hotel Yang Bertepatan Di Jodoh", "Hotel Elite Nan Mahal",
            "Hotel Elite Mayan Murah"};
    int [] gambarhewan = {R.drawable.harris, R.drawable.goodway, R.drawable.golden, R.drawable.ihotel, R.drawable.biz};

    private class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

        @Override
        public CustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.wisata, null);
            return new CustomAdapter.MyViewHolder(v);
        }

        @Override
        public void onBindViewHolder(CustomAdapter.MyViewHolder holder, int position) {
            holder.judul.setText(namahot[position]);
            holder.ket.setText(kethot[position]);
            holder.img.setImageResource(gambarhewan[position]);
        }

        @Override
        public int getItemCount() {
            return namahot.length;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {

            TextView judul;
            TextView ket;
            ImageView img;

            public MyViewHolder (View itemView){
                super(itemView);

                judul = itemView.findViewById(R.id.judul);
                ket = itemView.findViewById(R.id.keterangan);
                img = itemView.findViewById(R.id.img);
            }
        }

    }
}
