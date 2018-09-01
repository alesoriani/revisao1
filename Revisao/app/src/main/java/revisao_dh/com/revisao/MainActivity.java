package revisao_dh.com.revisao;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import revisao_dh.com.revisao.Fragment.FragmentCapcom;
import revisao_dh.com.revisao.Fragment.FragmentIE;
import revisao_dh.com.revisao.Fragment.FragmentKonami;
import revisao_dh.com.revisao.Fragment.FragmentRockstar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fragment> fragmentList = new ArrayList<>();
        List<String> titulos = new ArrayList<>();

        //Criando os Titulos
        String fragment1 = "EA";
        String fragment2 = "Capcom";
        String fragment3 = "Konami";
        String fragment4 = "Rockstar";
        //Adicionando os titulos na lista de titulos
        titulos.add(fragment1);
        titulos.add(fragment2);
        titulos.add(fragment3);
        titulos.add(fragment4);
        //Criando os Fragmentos
        FragmentCapcom fragmentCapcom = new FragmentCapcom();
        FragmentIE fragmentIE = new FragmentIE();
        FragmentKonami fragmentKonami = new FragmentKonami();
        FragmentRockstar fragmentRockstar = new FragmentRockstar();
        //Inserindo os fragmentos na lista
        fragmentList.add(fragmentCapcom);
        fragmentList.add(fragmentIE);
        fragmentList.add(fragmentKonami);
        fragmentList.add(fragmentRockstar);


        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabs);


        FragmentPageAdapterGames fragmentPagerAdapter = new FragmentPageAdapterGames(getSupportFragmentManager(), fragmentList, titulos);

        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);







    }
}
