package com.example.deafanddumbcommunicator;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.speech.tts.TextToSpeech;
import android.text.Html;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import java.util.Locale;

public class office_interface extends Fragment {

    private TextToSpeech textToSpeech;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.office_interface, container, false);

        CardView cardView1_o = v.findViewById(R.id.card_view1_o);
        CardView cardView2_o = v.findViewById(R.id.card_view2_o);
        CardView cardView3_o = v.findViewById(R.id.card_view3_o);
        CardView cardView4_o = v.findViewById(R.id.card_view4_o);
        CardView cardView5_o = v.findViewById(R.id.card_view5_o);
        CardView cardView6_o = v.findViewById(R.id.card_view6_o);
        CardView cardView7_o = v.findViewById(R.id.card_view7_o);
        CardView cardView8_o = v.findViewById(R.id.card_view8_o);
        CardView cardView9_o = v.findViewById(R.id.card_view9_o);
        CardView cardView10_o = v.findViewById(R.id.card_view10_o);
        CardView cardView11_o = v.findViewById(R.id.card_view11_o);
        CardView cardView12_o = v.findViewById(R.id.card_view12_o);

        cardView1_o.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView2_o.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView3_o.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView4_o.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView5_o.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView6_o.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView7_o.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView8_o.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView9_o.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView10_o.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView11_o.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView12_o.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Text to say aloud", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView1_o.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView2_o.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Panda");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView3_o.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView4_o.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView5_o.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView6_o.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView7_o.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView8_o.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView9_o.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView10_o.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView11_o.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Penguine");
                builder.setMessage("It is a cute penguine");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView12_o.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Title");
                builder.setMessage(Html.fromHtml("<font color='#2C4B45'>This is a test</font>"));
                AlertDialog diag = builder.create();
                diag.show();

                return true;
            }
        });
        return v;
    }
}