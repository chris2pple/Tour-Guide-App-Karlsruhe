package com.tryouts.chris2pple.myapplication;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/*Fragment link for Viewpager*/

public class TabSelectorAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public TabSelectorAdapter(Context context, FragmentManager fm)
    {
        super(fm);
        mContext=context;
    }




    @Override
    public Fragment getItem(int position){
        switch (position) {
            case 0:
                return new EntertaintmentFragment();
            case 1:
                return new FoodFragment();
            case 2:
                return new ShoppingFragment();
            case 3:
                return new TransportationFragment();
                default:
            return null;
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.entertaintment_category);
            case 1:
                return mContext.getString(R.string.food_category);
            case 2:
                return mContext.getString(R.string.shopping_category);
            case 3:
                return mContext.getString(R.string.transportation_category);
            default:
    return null;
        }
    }
    @Override
    public int getCount() {
        return 4;
    }
}
