package com.gmail.farasabiyyu12.menujubandarduniayangmadani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityRecycler extends AppCompatActivity {

    RecyclerView recy;
    CustomAdapter adap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recy = findViewById(R.id.listwisata);
        recy.setLayoutManager(new LinearLayoutManager(this));
        adap = new CustomAdapter();
        recy.setAdapter(adap);

    }

    String [] namaHewan = {"Masjid Raya", "Waterpark", "Engku Putri", "Barelang Bridge", "Ocarina"};
    String [] ket = {"Masjid Besar Di Batam", "Kolam Renang Terbaik Di Batam",
            "Satu - Satunya Alun - Alun Di Batam", "Jembatan Buatan Habibie Yang Terkenal",
    "Kolam Renang Yang Dulu Terkenal"};
    int [] gambarhewan = {R.drawable.mraya, R.drawable.waterpark, R.drawable.alun2, R.drawable.barelang, R.drawable.ocarina};

    private class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

//        private final OnClickListener mOnClickListener = new MyOnClickListener();

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.wisata, null);
            return new MyViewHolder(v);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.judul.setText(namaHewan[position]);
            holder.ket.setText(ket[position]);
            holder.img.setImageResource(gambarhewan[position]);
        }

        @Override
        public int getItemCount() {
            return namaHewan.length;
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
        /*
        @Override
        public void onClick(final View view) {
            int itemPosition = recy.getChildLayoutPosition(view);
            String item = namaHe.get(itemPosition);
        }
        */
    }

}
