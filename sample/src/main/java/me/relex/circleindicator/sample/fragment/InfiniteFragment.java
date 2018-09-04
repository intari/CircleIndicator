package net.intari.circleindicator.sample.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.antonyt.infiniteviewpager.InfinitePagerAdapter;

import net.intari.circleindicator.CircleIndicator;
import net.intari.circleindicator.sample.SamplePagerAdapter;
import net.intari.circleindicator.sample.R;
/**
 * Created by Dmitriy Kazimirov on 04.09.2018.
 */
public class InfiniteFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sample_infinite, container, false);
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ViewPager viewpager = (ViewPager) view.findViewById(R.id.viewpager);
        final CircleIndicator indicator = (CircleIndicator) view.findViewById(R.id.indicator);

        InfinitePagerAdapter wrappedAdapter = new InfinitePagerAdapter(new SamplePagerAdapter());
        viewpager.setAdapter(wrappedAdapter);
        indicator.setViewPager(viewpager);
    }
}