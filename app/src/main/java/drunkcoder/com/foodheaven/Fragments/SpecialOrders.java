package drunkcoder.com.foodheaven.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SpecialOrders extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public static SpecialOrders newInstance() {

        Bundle args = new Bundle();

        SpecialOrders fragment = new SpecialOrders();
        fragment.setArguments(args);
        return fragment;
    }
}
