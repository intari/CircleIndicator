package net.intari.circleindicatorenhanced.sample.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.antonyt.infiniteviewpager.InfinitePagerAdapter;

import net.intari.circleindicatorenhanced.CircleIndicator;
import net.intari.circleindicatorenhanced.sample.SamplePagerAdapter;
import net.intari.circleindicatorenhanced.sample.R;


public class DefaultFragment extends Fragment {

    @Nullable @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sample_default, container, false);
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ViewPager viewpager = (ViewPager) view.findViewById(R.id.viewpager);
        CircleIndicator indicator = (CircleIndicator) view.findViewById(R.id.indicator);

        PagerAdapter wrappedAdapter = new InfinitePagerAdapter(new SamplePagerAdapter());
        viewpager.setAdapter(wrappedAdapter);

        indicator.setViewPager(viewpager);
        viewpager.setCurrentItem(2);
    }
}
