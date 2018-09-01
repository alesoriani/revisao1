package revisao_dh.com.revisao.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import revisao_dh.com.revisao.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentRockstar extends Fragment {


    public FragmentRockstar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_rockstar, container, false);
    }

}
