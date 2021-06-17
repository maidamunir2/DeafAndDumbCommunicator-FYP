package com.example.deafanddumbcommunicator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;

public class setImageInFragment extends Fragment  {
    Button submitBtn;
    Spinner spinner;
    EditText editText;
    houseInterface HouseFragment;
    marketInterface MarketFragment;
    office_interface OfficeFragment;
String Text_to_Image;
int item;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
                     // Inflate the layout for this fragment
                   View v = inflater.inflate(R.layout.cutom_imagetext_fragment, container, false);
                 submitBtn= v.findViewById(R.id.submit_btn);
        editText=v.findViewById(R.id.edit_View);

        Text_to_Image= editText.getText().toString();

                 spinner=  v.findViewById(R.id.spinner);

                 // Create an ArrayAdapter using the string array and a default spinner layout
                 ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.interface_array, android.R.layout.simple_spinner_item);
                // Specify the layout to use when the list of choices appears
                 adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                // Apply the adapter to the spinner
                  spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i){
                    case 0:
                        setDataTo(HouseFragment, Text_to_Image);

                    case 1:
                        setDataTo(MarketFragment, Text_to_Image);

                    case 2:
                        setDataTo(OfficeFragment, Text_to_Image);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
                  submitBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    });
        return v;
    }

    private void setDataTo(Fragment fragment, String massage) {

    }

}
