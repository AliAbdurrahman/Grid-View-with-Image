package com.example.alba33.gridviewimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    GridView GridView;

    String[] club = {
            "Persib", "Viking Batam", "Viking School Indonesia", "Viking School", "Viking Persib Club"
    };
    int[] images = {

            R.drawable.persib,
            R.drawable.vikingbatam,
            R.drawable.vikingschoolindonesia,
            R.drawable.vikingschool,
            R.drawable.futuretires,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView = (GridView) findViewById(R.id.gridview);

        GridAdapter gridAdapter = new GridAdapter();
        GridView.setAdapter(gridAdapter);
    }

    class GridAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int Position, View convertView, ViewGroup viewGroup) {
            View view = getLayoutInflater().inflate(R.layout.griditem, null);
            ImageView mImageView = (ImageView) view.findViewById(R.id.imageview);
            TextView mTextView = (TextView) view.findViewById(R.id.textview);

            mImageView.setImageResource(images[Position]);
            mTextView.setText(club[Position]);

            return view;
        }
    }
}
