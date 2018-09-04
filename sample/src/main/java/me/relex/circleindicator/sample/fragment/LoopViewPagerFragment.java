package net.intari.circleindicatorenhanced.sample.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.imbryk.viewPager.LoopViewPager;
import net.intari.circleindicatorenhanced.CircleIndicator;
import net.intari.circleindicatorenhanced.sample.R;
import net.intari.circleindicatorenhanced.sample.SamplePagerAdapter;

public class LoopViewPagerFragment extends Fragment {

    @Nullable @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sample_loop_viewpager, container, false);
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        LoopViewPager viewpager = (LoopViewPager) view.findViewById(R.id.viewpager);
        CircleIndicator indicator = (CircleIndicator) view.findViewById(R.id.indicator);
        viewpager.setAdapter(new SamplePagerAdapter());
        indicator.setViewPager(viewpager);
    }
}
