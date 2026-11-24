package com.example.advancedandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TabFragment extends Fragment {

    private static final String ARG_TITLE = "title";
    private static final String ARG_MESSAGE = "message";

    public static TabFragment newInstance(String title, String message) {
        TabFragment fragment = new TabFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TITLE, title);
        args.putString(ARG_MESSAGE, message);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab, container, false);
        Bundle args = getArguments();
        TextView title = view.findViewById(R.id.tabTitle);
        TextView message = view.findViewById(R.id.tabMessage);
        title.setText(args != null ? args.getString(ARG_TITLE, "Tab") : "Tab");
        message.setText(args != null ? args.getString(ARG_MESSAGE, "") : "");
        return view;
    }
}
