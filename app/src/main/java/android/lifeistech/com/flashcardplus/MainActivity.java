package android.lifeistech.com.flashcardplus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Card> mCards;
    CardAdapter mCardAdapter;
    ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.listView);
        mCards = new ArrayList<Card>();

        mCards.add(new Card(R.drawable.asia, getString(R.string.asia_title));

        mCards.add(new Card(R.drawable.Japan, getString(R.string.Japan_title));

        mCards.add(new Card(R.drawable.Europe, getString(R.string.Europe_title));

        mCardAdapter = new CardAdapter(this, R.layout.card, mCards);
        mListView.setAdapter(mCardAdapter);
    }
}

