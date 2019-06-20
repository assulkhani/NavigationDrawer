package com.assulkhani.navigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    ImageView ivLogo;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // membuat variable view dengan cara block inflater sampai dengan akhir kemudian(ctrl + alt + V)
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ivLogo = view.findViewById(R.id.imageView);
        ivLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Menampilkan Toast", Toast.LENGTH_SHORT).show();
                // context pada fragment activity menggunakan getActivity()
            }
        });
        return view;
    }

}
