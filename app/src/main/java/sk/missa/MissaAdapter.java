package sk.missa;

import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.text.Html;
import android.text.Layout;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static sk.missa.Main.pismo;
import static sk.missa.Main.rezim;
import static sk.missa.Main.sizeN;
import static sk.missa.Main.sizeO;
import static sk.missa.Main.sizeZ;
import static sk.missa.Main.typeBold;
import static sk.missa.Main.typeBoldItalic;
import static sk.missa.Main.typeItalic;
import static sk.missa.Main.typeNormal;

public class MissaAdapter extends ArrayAdapter<Missa> {

    private String nahrad(String text) {
        if (rezim) {
            return text.replace("B71C1C", "D20607").replace("000000", "F5EBD2");
        } else
            return text.replace("B71C1C", "80242B"); //predtym - 9C0E0F
    }

    MissaAdapter(Context context, ArrayList<Missa> missas) {
        super(context, 0, missas);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        // View view = super.getView(position, convertView, parent);
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.missa_list, parent, false);
        }

        Missa currentMissa = getItem(position);

        //sekcia
        TextView sekcia = listItemView.findViewById(R.id.sekcia);
        assert currentMissa != null;
        sekcia.setText(currentMissa.getSekcia());
        if (currentMissa.getOtvor() == -1) {
            sekcia.setGravity(Gravity.CENTER);
            sekcia.setTextColor(Color.BLACK);
            sekcia.setTextSize(sizeN);
        } else if (currentMissa.getOtvor() == -2) {
                sekcia.setGravity(Gravity.CENTER);
                sekcia.setTextColor(Color.BLACK);
                sekcia.setTextSize(sizeO);
        } else {
            sekcia.setTextColor(getContext().getResources().getColor(R.color.primary));
            sekcia.setGravity(Gravity.START);
            sekcia.setTextSize(sizeO);
        }
        if(currentMissa.getItalic())
            sekcia.setTypeface(typeItalic);
        else
            sekcia.setTypeface(typeBold);

        //nadpis
        TextView nadpis = listItemView.findViewById(R.id.nadpis);
        nadpis.setText(currentMissa.getNadpis());
        nadpis.setTextSize(sizeO);

        //suradnice
        TextView suradnice = listItemView.findViewById(R.id.suradnice);
        suradnice.setText(currentMissa.getSuradnice());
        suradnice.setTextSize(sizeO);

 //citat
        TextView citat = listItemView.findViewById(R.id.citat);
        citat.setText(currentMissa.getCitat());
        citat.setTextSize(sizeO);

//maly text
        TextView text_small = listItemView.findViewById(R.id.text_small);
        text_small.setTextSize((float) (sizeO * 0.75));
        if(currentMissa.getItalic())
            text_small.setTypeface(typeItalic);
        else
            text_small.setTypeface(typeNormal);
        if (currentMissa.getVypisHtml() && currentMissa.getText_small() != null)
            text_small.setText(Html.fromHtml(nahrad(currentMissa.getText_small())));
        else
            text_small.setText(currentMissa.getText_small());

        //text v strede
        TextView text_center = listItemView.findViewById(R.id.text_center);
        text_center.setText(currentMissa.getText_center());
        if (currentMissa.getText() == null)
            text_center.setTextColor(Color.BLACK);
        else
            text_center.setTextColor(getContext().getResources().getColor(R.color.primary));
        text_center.setTextSize(sizeO);

        //normalny text
        TextView text = listItemView.findViewById(R.id.text);
        if (currentMissa.getText() != null) {
            if (currentMissa.getVypisHtml())
                text.setText(Html.fromHtml(nahrad(currentMissa.getText())));
            else
                text.setText(currentMissa.getText());
        }
        text.setTextSize(sizeO);
        if(currentMissa.getItalic())
            text.setTypeface(typeItalic);
        else
            text.setTypeface(typeNormal);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            if (currentMissa.getOtvor() == -2)
                text.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
            else
                text.setJustificationMode(Layout.JUSTIFICATION_MODE_NONE);
        }

        //citat v prosbach
        TextView citat_prosby = listItemView.findViewById(R.id.citat_prosby);
        if(currentMissa.getCitat_prosby() != null)
        citat_prosby.setText(Html.fromHtml(nahrad(currentMissa.getCitat_prosby())));
        citat_prosby.setTextSize(sizeO);

        //text v prosbach
        TextView text_prosby = listItemView.findViewById(R.id.text_prosby);
        if (currentMissa.getText_prosby() != null)
            text_prosby.setText(Html.fromHtml(nahrad(currentMissa.getText_prosby())));
        else
            text_prosby.setText(null);
        text_prosby.setTextSize(sizeO);

        //zvoncek
        ImageView zvoncek = listItemView.findViewById(R.id.zvoncek);

        //pokiaľ pre dané views nie je text, nastaví ich veľkosť na 0
        if (currentMissa.getSekcia() == null) {
            sekcia.setTextSize(0);
        }

        if (currentMissa.getNadpis() == null) {
            nadpis.setTextSize(0);
        }

        if (currentMissa.getSuradnice() == null) {
            suradnice.setTextSize(0);
        }

        if (currentMissa.getCitat() == null) {
            citat.setTextSize(0);
        }

        if (currentMissa.getText_small() == null) {
            text_small.setTextSize(0);
        }

        if (currentMissa.getText_center() == null) {
            text_center.setTextSize(0);
        }

        if (currentMissa.getText() == null) {
            text.setTextSize(0);
        }

        if (currentMissa.getCitat_prosby() == null) {
            citat_prosby.setTextSize(0);
        }

        if (currentMissa.getText_prosby() == null) {
            text_prosby.setTextSize(0);
        }

        //pokiaľ nie jezvoncek, nastaví ho na 0
        if (!currentMissa.getZvonec()) {
            zvoncek.getLayoutParams().height = 0;
            zvoncek.getLayoutParams().width = 0;
        }

        //nastaví farbu textu podľa režimu
        if (rezim) {
            if (currentMissa.getOtvor() == -1)
                sekcia.setTextColor(getContext().getResources().getColor(R.color.background));
            else
                sekcia.setTextColor(getContext().getResources().getColor(R.color.primary_light));
            nadpis.setTextColor(getContext().getResources().getColor(R.color.primary_light));
            suradnice.setTextColor(getContext().getResources().getColor(R.color.primary_light));
            citat.setTextColor(getContext().getResources().getColor(R.color.background));
            if (currentMissa.getText() == null)
                text_center.setTextColor(getContext().getResources().getColor(R.color.background));
            else
                text_center.setTextColor(getContext().getResources().getColor(R.color.primary_light));
            text_small.setTextColor(getContext().getResources().getColor(R.color.primary_light));
            text.setTextColor(getContext().getResources().getColor(R.color.background));
            citat_prosby.setTextColor(getContext().getResources().getColor(R.color.background));
            text_prosby.setTextColor(getContext().getResources().getColor(R.color.background));
        }
        //nastaví hrube písmo
        if (pismo) {
            if (currentMissa.getItalic())
                sekcia.setTypeface(typeBoldItalic);
            nadpis.setTypeface(typeBold);
            suradnice.setTypeface(typeBold);
            citat.setTypeface(typeBoldItalic);
            text_center.setTypeface(typeBold);
            if (currentMissa.getItalic())
                text_small.setTypeface(typeBoldItalic);
            else
                text_small.setTypeface(typeBold);
            if (currentMissa.getItalic())
                text.setTypeface(typeBoldItalic);
            else
                text.setTypeface(typeBold);
            citat_prosby.setTypeface(typeBoldItalic);
            text_prosby.setTypeface(typeBold);
        }

        //nastaví veľkosť zvončeka
        if (currentMissa.getZvonec()) {
            if (Main.zvoncek) {
                zvoncek.setBackgroundResource(R.drawable.bell);
                zvoncek.getLayoutParams().height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, sizeZ, getContext().getResources().getDisplayMetrics());
                zvoncek.getLayoutParams().width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, sizeZ, getContext().getResources().getDisplayMetrics());
                zvoncek.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mMediaPlayer = MediaPlayer.create(getContext(), R.raw.zvoncek);
                        mMediaPlayer.start();
                    }
                });
            } else {
                zvoncek.getLayoutParams().height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 15, getContext().getResources().getDisplayMetrics());
                zvoncek.getLayoutParams().width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 15, getContext().getResources().getDisplayMetrics());
            }
        }

        //medzery medzi textami
        LinearLayout list_linear = listItemView.findViewById(R.id.list_linear);
        switch (currentMissa.getMedzera()) {
            case 1:
                list_linear.setPadding(8, 8, 8, 0); //medzera mala
                break;
            case 2:
                list_linear.setPadding(8, 16, 8, 0); //medzera velka
                break;
            default:
                list_linear.setPadding(8, 0, 8, 0); //medzera klasik
                break;
        }

        return listItemView;
    }

}
