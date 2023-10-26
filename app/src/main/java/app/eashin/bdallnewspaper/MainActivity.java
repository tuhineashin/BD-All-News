package app.eashin.bdallnewspaper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    HashMap<String ,String> hashMap = new HashMap<>();
    ArrayList<HashMap<String,String >> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        hashMap = new HashMap<>();
        hashMap.put("header_title","Police");
        hashMap.put("sub_header", "Army");
        hashMap.put("date","22.2.223");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("header_title","Square");
        hashMap.put("sub_header", "3rd class");
        hashMap.put("date","22.2.223");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("header_title","Square");
        hashMap.put("sub_header", "3rd class");
        hashMap.put("date","22.2.223");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("header_title","Square");
        hashMap.put("sub_header", "3rd class");
        hashMap.put("date","22.2.223");
        arrayList.add(hashMap);

        MyListVIewAdapter myListVIewAdapter = new MyListVIewAdapter();
        listView.setAdapter(myListVIewAdapter);






        for (int i = 0; i <5 ; i++) {


        }
    } //========================================================


    public class MyListVIewAdapter extends BaseAdapter{

        TextView tv_header, tv_sub_header, tv_date;
        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @SuppressLint("MissingInflatedId")
        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {

            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view1 = layoutInflater.inflate(R.layout.sample_list,null);

            tv_header = view1.findViewById(R.id.tv_header);
            tv_sub_header = view1.findViewById(R.id.tv_sub_header);
            tv_date = view1.findViewById(R.id.tv_date);

            hashMap = new HashMap<>();
            hashMap =  arrayList.get(position);
            String header = hashMap.get("header_title");
            String sub_hd = hashMap.get("sub_header");
            String cr_date = hashMap.get("date");

            tv_header.setText(header);
            tv_sub_header.setText(sub_hd);
            tv_date.setText(cr_date);

            return view1;
        }
    }

}