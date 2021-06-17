package com.example.deafanddumbcommunicator;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link marketInterface#newInstance} factory method to
 * create an instance of this fragment.
 */
public class marketInterface extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private TextToSpeech textToSpeech;

    public marketInterface() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment marketInterface.
     */
    // TODO: Rename and change types and number of parameters
    public static marketInterface newInstance(String param1, String param2) {
        marketInterface fragment = new marketInterface();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.market_interface, container, false);

        CardView cardView1_m = v.findViewById(R.id.card_view1_m);
        CardView cardView2_m = v.findViewById(R.id.card_view2_m);
        CardView cardView3_m = v.findViewById(R.id.card_view3_m);
        CardView cardView4_m = v.findViewById(R.id.card_view4_m);
        CardView cardView5_m = v.findViewById(R.id.card_view5_m);
        CardView cardView6_m = v.findViewById(R.id.card_view6_m);
        CardView cardView7_m = v.findViewById(R.id.card_view7_m);
        CardView cardView8_m = v.findViewById(R.id.card_view8_m);
        CardView cardView9_m = v.findViewById(R.id.card_view9_m);
        CardView cardView10_m = v.findViewById(R.id.card_view10_m);
        CardView cardView11_m = v.findViewById(R.id.card_view11_m);
        CardView cardView12_m = v.findViewById(R.id.card_view12_m);

        cardView1_m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("LETS HAVE A BREAK", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView2_m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("BRING ME A CUP OF TEA", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView3_m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("PLEASE MARK MY ATTENDENCE", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView4_m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("DO MORE RESEARCH ON THIS PROJECT", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView5_m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("I HAVE DONE MY WORK", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView6_m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("PLEASE HAVE A SEAT", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView7_m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("LETS GO FOR LUNCH BREAK", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView8_m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("CAN YOU PLEASE PRINT THESE PAGES", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView9_m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("PASS ME THE STAPLER", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView10_m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("CAN YOU BRING ME A CUP OF TEA", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView11_m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("Here is your Tea", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView12_m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            textToSpeech.setLanguage(Locale.US);
                            textToSpeech.speak("PLEASE BRING ME A PEN AND NOTEBOOK", TextToSpeech.QUEUE_ADD, null);
                        }
                    }
                });
            }
        });
        cardView1_m.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Break");
                builder.setMessage("LETS HAVE A BREAK");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView2_m.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Tea");
                builder.setMessage("BRING ME A CUP OF TEA");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView3_m.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Attendence");
                builder.setMessage("PLEASE MARK MY ATTENDENCE");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView4_m.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Research On Project");
                builder.setMessage("DO MORE RESEARCH ON THIS PROJECT");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView5_m.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Work Done");
                builder.setMessage("I HAVE DONE MY WORK");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView6_m.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Have a Seat");
                builder.setMessage("PLEASE HAVE A SEAT");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView7_m.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Lunch");
                builder.setMessage("LETS GO FOR LUNCH BREAK");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView8_m.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Print Pages");
                builder.setMessage("CAN YOU PLEASE PRINT THESE PAGES");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView9_m.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Stapler");
                builder.setMessage("PASS ME THE STAPLER");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView10_m.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Cup of Tea");
                builder.setMessage("CAN YOU BRING ME A CUP OF TEA");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView11_m.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Your Tea");
                builder.setMessage("Here is your Tea");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });

        cardView12_m.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Notebook");
                builder.setMessage("PLEASE BRING ME A PEN AND NOTEBOOK");
                AlertDialog diag = builder.create();
                diag.show();
                return true;
            }
        });
        return v;
    }
}