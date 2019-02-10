package android.lifeistech.com.flashcardplus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CardAdapter extends ArrayAdapter<Card> {
    List<Card> mCards;

    public CardAdapter(Context context, int layoutResourceId, List<Card> objects) {
        super(context, layoutResourceId, objects);
        mCards = objects;
    }

    @Override
    public int getCount() {
        return mCards.size();
    }

    @Override
    public Card getItem(int position) {
        return mCards.get(position);

    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if (convertView == null) {//一件め：使い回しのviewを作成//
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.card, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        final Card item = getItem(position);

        if (item != null) {
            viewHolder.iconImageView.setBackgroundResource(item.imageId);
            viewHolder.titleTextView.setText(item.title);
            viewHolder.iconImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }

            });
        }

        return convertView;
    }


    public static class ViewHolder {
        ImageView iconImageView;
        TextView titleTextView;

        public ViewHolder(View view) {
            iconImageView = (ImageView) view.findViewById(R.id.icon);
            titleTextView = (TextView) view.findViewById(R.id.title);
        }

    }

}
