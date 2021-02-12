package com.pouyaheydari.learning.sematecandroidbasicdey99;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TestViewPagerAdapter extends FragmentStateAdapter {

    public TestViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                TestFragment1 frg1 = new TestFragment1();
                return frg1;
            case 1:
                TestFragment2 frg2 = new TestFragment2();
                return frg2;
            default:
                TestFragment2 frg3 = new TestFragment2();
                return frg3;
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
