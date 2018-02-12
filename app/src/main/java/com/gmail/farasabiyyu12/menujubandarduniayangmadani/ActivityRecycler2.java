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

public class ActivityRecycler2 extends AppCompatActivity {

    RecyclerView recy2;
    CustomAdapter adap2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler2);

        recy2 = findViewById(R.id.listkuliner);
        recy2.setLayoutManager(new LinearLayoutManager(this));
        adap2 = new CustomAdapter();
        recy2.setAdapter(adap2);
    }

    String [] namakul = {"Mie Tarempa", "Bingka Bakar", "Luti Gendang", "Gonggong", "Otak - Otak"};
    String [] ketkul = {"Mie Khas Batam", "Kue Yang Merupakan Salah Satu Khas Batam",
            "Luti Khas Batam Yang Tidak Terlupakan", "Keong Yang Dimasak Dengan Cita Rasa",
            "Makanan Khas Batam Yang Sangat Terkenal"};
    int [] gambarhewan = {R.drawable.mietrmp, R.drawable.bingkabakar, R.drawable.lutigendang, R.drawable.gonggong, R.drawable.otak2};

    private class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

        @Override
        public CustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.wisata, null);
            return new CustomAdapter.MyViewHolder(v);
        }

        @Override
        public void onBindViewHolder(CustomAdapter.MyViewHolder holder, int position) {
            holder.judul.setText(namakul[position]);
            holder.ket.setText(ketkul[position]);
            holder.img.setImageResource(gambarhewan[position]);
        }

        @Override
        public int getItemCount() {
            return namakul.length;
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
