package com.example.deafanddumbcommunicator;

import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class houseInterface extends Fragment {

    private Fragment fragment = null;
    private TextToSpeech textToSpeech;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.house_interface, container, false);

        CardView cardView1_h = v.findViewById(R.id.card_view1_h);
        CardView cardView2_h = v.findViewById(R.id.card_view2_h);
        CardView cardView3_h = v.findViewById(R.id.card_view3_h);
        CardView cardView4_h = v.findViewById(R.id.card_view4_h);
        CardView cardView5_h = v.findViewById(R.id.card_view5_h);
        CardView cardView6_h = v.findViewById(R.id.card_view6_h);
        CardView cardView7_h = v.findViewById(R.id.card_view7_h);
        CardView cardView8_h = v.findViewById(R.id.card_view8_h);
        CardView cardView9_h = v.findViewById(R.id.card_view9_h);
        CardView cardView10_h = v.findViewById(R.id.card_view10_h);
        CardView cardView11_h = v.findViewById(R.id.card_view11_h);
        CardView cardView12_h = v.findViewById(R.id.card_view12_h);



        cardView1_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("BRING ME GLASS OF WATER", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });

        cardView2_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("BRING ME MY CLOTHES-WHERE ARE MY CLOTHES", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView3_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("CAN YOU PLEASE PRESS MY CLOTHES", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView4_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("can you please turn on ac", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView5_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("GIVE ME MY BLANCKET", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView6_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("GIVE ME TV REMOTE", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView7_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("HERE IS YOUR CLOTHES", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView8_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("i am hungry", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView9_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("TURN ON THE HEATER", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView10_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("where are my hands free", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView11_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("WHERE IS MY POWER BANK", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView12_h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("I M HUNGRY", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });

        cardView1_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Water");
                builder.setMessage("BRING ME GLASS OF WATER");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView2_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("My Clothes");
                builder.setMessage("BRING ME MY CLOTHES-WHERE ARE MY CLOTHES");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView3_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Press Clothes");
                builder.setMessage("CAN YOU PLEASE PRESS MY CLOTHES");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView4_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("AC");
                builder.setMessage("can you please turn on ac");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView5_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Blanket");
                builder.setMessage("GIVE ME MY BLANKET");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView6_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Remote");
                builder.setMessage("GIVE ME TV REMOTE");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView7_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Clothes");
                builder.setMessage("HERE IS YOUR CLOTHES");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView8_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Hungry");
                builder.setMessage("i am hungry");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView9_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Heater");
                builder.setMessage("TURN ON THE HEATER");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView10_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Handfree");
                builder.setMessage("where are my hands free");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView11_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Power Bank");
                builder.setMessage("WHERE IS MY POWER BANK");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView12_h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Hungry");
                builder.setMessage("I M HUNGRY");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });
        return v;
    }


}