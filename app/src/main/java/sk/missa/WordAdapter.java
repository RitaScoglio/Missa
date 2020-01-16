package sk.missa;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        // View view = super.getView(position, convertView, parent);
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.word_list, parent, false);
        }

        Word currentWord = getItem(position);

        TextView konDen = listItemView.findViewById(R.id.den);
        assert currentWord != null;
        konDen.setText(currentWord.getKonDen());
        konDen.setTextSize(Main.sizeO);

        TextView menoSvatca = listItemView.findViewById(R.id.meno_svatca);
        menoSvatca.setText(currentWord.getMenoSvatca());
        menoSvatca.setTextSize(Main.sizeO);

        TextView slavenie = listItemView.findViewById(R.id.slavenie);
        slavenie.setText(currentWord.getSlavenie());
        slavenie.setTextSize(Main.sizeO);

        TextView farba = listItemView.findViewById(R.id.farba);
        farba.setText(currentWord.getFarba());
        farba.setTextSize(Main.sizeO);

       /* if (Main.pismo) {
            konDen.setTypeface(null, Typeface.BOLD);
            menoSvatca.setTypeface(null, Typeface.BOLD);
            slavenie.setTypeface(null, Typeface.BOLD);
            farba.setTypeface(null, Typeface.BOLD);
        }*/

       //nastavenie rezimu vo výpise sviatkov v uvode a kalendari
        if (Main.rezim) {
            konDen.setTextColor(Color.parseColor("#D20607"));
            menoSvatca.setTextColor(Color.parseColor("#f5ebd2"));
            slavenie.setTextColor(Color.parseColor("#f5ebd2"));
            farba.setTextColor(Color.parseColor("#f5ebd2"));
        }

        if(Main.uvodLayout){
            LinearLayout linear = listItemView.findViewById(R.id.list_layout);
            linear.setPadding(0,0,0,16);
        }

        return listItemView;
    }
}
