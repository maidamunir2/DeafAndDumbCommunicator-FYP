package com.example.deafanddumbcommunicator.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.deafanddumbcommunicator.ModelClass.DataModel;
import com.example.deafanddumbcommunicator.R;
import com.squareup.picasso.Picasso;

import java.util.Locale;

public class ItemDetailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    DataModel dataModel;

    private TextToSpeech mTTs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        imageView = findViewById(R.id.itemDetail_img);
        textView = findViewById(R.id.itemDetail_txt);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Speak();
            }
        });

        dataModel = (DataModel) getIntent().getSerializableExtra("Data");

        Picasso.get().load(dataModel.getImage()).into(imageView);
        textView.setText(dataModel.getDescription());

        mTTs = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS)
                {
                    int result = mTTs.setLanguage(Locale.CANADA);

                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED)
                    {
                        Log.e("TTS", "Language not Supported");
                    }
                }
                else
                {
                    Log.e("TTS", "Initialization Failed");
                }
            }
        });

    }

    private void Speak() {

        String text2 = textView.getText().toString();
        mTTs.speak(text2, TextToSpeech.QUEUE_FLUSH, null);

    }
}