package com.qalex.testnavigation;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by m7mD on 5/21/2017.
 */
public class Home_Fragment extends Fragment {

   /* ListView list;
    String[] web = {
            "Google Plus",
            "Twitter",
            "Windows"
    } ;
    Integer[] imageId = {
            R.drawable.home,
            R.drawable.fav,
            R.drawable.userpic

    };
*/
    View MyView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        MyView = inflater.inflate(R.layout.content_home,container,false);
     /*   CustomListImages adapter = new CustomListImages(getActivity(), web, imageId);
        list=(ListView)MyView.findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
LinearLayout relativeclic1 =(LinearLayout)findViewById(R.id.RelativeMain1);
         relativeclic1.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v){
                 startActivityForResult(new Intent(A_My_Galaxy.this,C_Student_Book_Planet.class), 0);
             }
         });
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getActivity(), "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });*/
        LinearLayout relative1 =(LinearLayout) MyView.findViewById(R.id.cat1);
        relative1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getActivity(), Activity_Hotels.class) );
            }
        });

        LinearLayout relative2 =(LinearLayout) MyView.findViewById(R.id.cat2);
        relative1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
        Toast.makeText(getActivity(),"Not Available Now ...!",Toast.LENGTH_LONG).show();            }
        });

        LinearLayout relative3 =(LinearLayout) MyView.findViewById(R.id.cat3);
        relative1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getActivity(),"Not Available Now ...!",Toast.LENGTH_LONG).show();            }

        });
        return MyView;

    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Home");



    }
}
