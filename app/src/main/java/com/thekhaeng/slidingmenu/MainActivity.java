package com.thekhaeng.slidingmenu;

import android.app.FragmentTransaction;
import android.os.Bundle;

import com.thekhaeng.slidingmenu.lib.SlidingMenu;
import com.thekhaeng.slidingmenu.lib.app.SlidingFragmentActivity;

public class MainActivity extends SlidingFragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBehindContentView(R.layout.layout_side_menu_container);

        if (savedInstanceState == null) {
            setupSlidingMenuFragment();
        }
        getSetupSlidingMenu();
    }

    private void getSetupSlidingMenu() {
        getSlidingMenu().setBehindWidthRes(R.dimen.sliding_menu_width);
        getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);
    }

    private void setupSlidingMenuFragment() {
        FragmentTransaction fragmentTransaction = this.getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.layout_side_menu_container, SlidingMenuFragment.newInstance());
        fragmentTransaction.commit();
    }
}
