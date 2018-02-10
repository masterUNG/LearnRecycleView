package masterung.androidthai.in.th.learnrecycleview.utility;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import masterung.androidthai.in.th.learnrecycleview.R;

/**
 * Created by masterung on 11/2/2018 AD.
 */

public class MyAdapter extends BaseAdapter{

    private Context context;
    private String[] titleStrings;
    private int[] iconInts;

    public MyAdapter(Context context,
                     String[] titleStrings,
                     int[] iconInts) {
        this.context = context;
        this.titleStrings = titleStrings;
        this.iconInts = iconInts;
    }

    @Override
    public int getCount() {
        return titleStrings.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.listview_layout, parent, false);

        TextView textView = view.findViewById(R.id.textViewFood);
        textView.setText(titleStrings[position]);

        ImageView imageView = view.findViewById(R.id.imageViewFood);
        imageView.setImageResource(iconInts[position]);

        return view;
    }
}
