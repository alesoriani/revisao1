package revisao_dh.com.revisao;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

import java.util.List;

import revisao_dh.com.revisao.Fragment.FragmentIE;
import revisao_dh.com.revisao.Fragment.FragmentRockstar;

public class FragmentPageAdapterGames extends FragmentPagerAdapter {

    List<Fragment> fragmentList;
    List<String> titleFragment;

    public FragmentPageAdapterGames(FragmentManager fm,List<Fragment> fragmentList, List<String> titleFragment) {
        super(fm);
        this.fragmentList = fragmentList;
        this.titleFragment = titleFragment;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }


    @Override
    public CharSequence getPageTitle(int position){
        return titleFragment.get(position);
    }
}