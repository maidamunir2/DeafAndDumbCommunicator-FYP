package com.example.deafanddumbcommunicator;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Locale;

import static android.app.Activity.RESULT_OK;


public class TalkFragment extends Fragment {

    private EditText text;
    /*private FloatingActionButton speakButton;*/
    private TextToSpeech textToSpeech;
    private static final int REQUEST_CODE = 100;
    ImageView speakButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_talk, container, false);

        speakButton = v.findViewById(R.id.fab_speak);
        text = v.findViewById(R.id.text_field);



        textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i != TextToSpeech.ERROR) {

                    textToSpeech.setLanguage(Locale.US);
                }
            }
        });

        speakButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech.speak(text.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                text.setText(" ",null);
            }
        });

        RelativeLayout fab = v.findViewById(R.id.fab);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                try {
                    startActivityForResult(intent, REQUEST_CODE);
                } catch (ActivityNotFoundException a) {

                }

            }

        });



        return v;
    }


    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        TalkFragment.super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case REQUEST_CODE: {
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                    builder.setMessage(result.get(0));
                    AlertDialog diag = builder.create();
                    diag.show();
                    diag.getWindow().setBackgroundDrawableResource(R.drawable.audiopopup_bg);
                }
                break;
            }

        }
    }

}

