package com.example.angelo.mbelateste1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Settings_Fragment2 extends Fragment {
    ListView lista;




    public Settings_Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        String [] definicoes = {"Nome","email", "numero","Servicos","contactos","Logout"};

        lista = (ListView) view.findViewById(R.id.setting_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (getActivity(),android.R.layout.simple_expandable_list_item_1,
                        definicoes);
        lista.setAdapter(arrayAdapter);

        Toast.makeText(getActivity(), "Toast", Toast.LENGTH_LONG).show();

        return view;

    }

    public void onItemClick (AdapterView <?> parent, View view, int position, long id){
        TextView tv = (TextView) view;
        Toast.makeText(getActivity(), "selecionou"+tv.getText()+position, Toast.LENGTH_SHORT).show();

    }

}
