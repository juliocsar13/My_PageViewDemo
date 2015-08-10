package com.example.my_pageviewdemo.History;


import android.app.ActionBar;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.astuetz.PagerSlidingTabStrip;
import com.example.my_pageviewdemo.Model.Entry;
import com.example.my_pageviewdemo.R;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;


public class MainActivity extends ActionBarActivity {

    private ViewPager viewPager;
    private ListView page1;
    private ListView page2;
    private ListView page3;
    private ListView page4;
    private ListView page5;
    private ListView page6;
    private ListView page7;
    private ListView page8;
    private ListView page9;
    private ListView page10;
    private ListView page11;
    private ListView page12;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* final ListView lvHistory = (ListView) findViewById(R.id.listView1);
        final ListView lvHistory1 = (ListView) findViewById(R.id.listView2);
        final ListView lvHistory2 = (ListView) findViewById(R.id.listView3);
        final ListView lvHistory3 = (ListView) findViewById(R.id.listView4);
        final ListView lvHistory4 = (ListView) findViewById(R.id.listView5);
        final ListView lvHistory5 = (ListView) findViewById(R.id.listView6);
        final ListView lvHistory6 = (ListView) findViewById(R.id.listView7);
        final ListView lvHistory7 = (ListView) findViewById(R.id.listView8);
        final ListView lvHistory8 = (ListView) findViewById(R.id.listView9);
        final ListView lvHistory9 = (ListView) findViewById(R.id.listView10);
        final ListView lvHistory10 = (ListView) findViewById(R.id.listView11);
        final ListView lvHistory11 = (ListView) findViewById(R.id.listView12);

        adapter = new MainAdapter(this, titulo);
        lvHistory.setAdapter(adapter);
        lvHistory1.setAdapter(adapter);
        lvHistory2.setAdapter(adapter);
        lvHistory3.setAdapter(adapter);
        lvHistory4.setAdapter(adapter);
        lvHistory5.setAdapter(adapter);
        lvHistory6.setAdapter(adapter);
        lvHistory7.setAdapter(adapter);
        lvHistory8.setAdapter(adapter);
        lvHistory9.setAdapter(adapter);
        lvHistory10.setAdapter(adapter);
        lvHistory11.setAdapter(adapter);*/



        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        actionBar.setCustomView(R.layout.layout_logo_bar);


        viewPager=(ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(new MainPageAdapter());

        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        tabs.setViewPager(viewPager);

        tabs.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                // Toast.makeText(MainActivity.this, "page " + (position + 1), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }

        });
    }

    class MainPageAdapter extends PagerAdapter{

        @Override
        public CharSequence getPageTitle(int position)
        {
            String title = null;

            switch (position)
            {
                case 0:
                    title = getString(R.string.one_indicator);
                    break;
                case 1:
                    title = getString(R.string.two_indicator);
                    break;
                case 2:
                    title = getString(R.string.three_indicator);
                    break;
                case 3:
                    title = getString(R.string.four_indicator);
                    break;
                case 4:
                    title = getString(R.string.five_indicator);
                    break;
                case 5:
                    title = getString(R.string.six_indicator);
                    break;
                case 6:
                    title = getString(R.string.seven_indicator);
                    break;
                case 7:
                    title = getString(R.string.eight_indicator);
                    break;
                case 8:
                    title = getString(R.string.nine_indicator);
                    break;
                case 9:
                    title = getString(R.string.then_indicator);
                    break;
                case 10:
                    title = getString(R.string.elven_indicator);
                    break;
                default:
                    title = getString(R.string.twelve_indicator);
                    break;
            }
            return title;
        }

        @Override

        public int getCount() {
            return 12;
        }

        @Override
        public Object instantiateItem(ViewGroup collection, int position)
        {
            View page = null;
            switch (position)
            {
                case 0:
                    if (page1 == null)
                    {
                        page1 = (ListView) LayoutInflater.from(MainActivity.this).inflate(R.layout.pagina_uno, null);



                    }
                    page = page1;
                    break;
                case 1:
                    if (page2 == null)
                    {
                        page2 = (ListView) LayoutInflater.from(MainActivity.this).inflate(R.layout.pagina_dos, null);

                    }
                    page = page2;
                    break;
                case 2:
                    if (page3 == null)
                    {
                        page3 = (ListView) LayoutInflater.from(MainActivity.this).inflate(R.layout.pagina_tres, null);
                        initListView();

                    }
                    page = page3;
                    break;
                case 3:
                if (page4 == null)
                {
                    page4 = (ListView) LayoutInflater.from(MainActivity.this).inflate(R.layout.pagina_cuatro, null);

                }
                page = page4;
                break;
                case 4:
                    if (page5 == null)
                    {
                        page5 = (ListView) LayoutInflater.from(MainActivity.this).inflate(R.layout.pagina_cinco, null);

                    }
                    page = page5;
                    break;
                case 5:
                    if (page6 == null)
                    {
                        page6 = (ListView) LayoutInflater.from(MainActivity.this).inflate(R.layout.pagina_seis, null);

                    }
                    page = page6;
                    break;
                case 6:
                    if (page7 == null)
                    {
                            page7 = (ListView) LayoutInflater.from(MainActivity.this).inflate(R.layout.pagina_siete, null);

                    }
                    page = page7;
                    break;
                case 7:
                    if (page8 == null)
                    {
                        page8 = (ListView) LayoutInflater.from(MainActivity.this).inflate(R.layout.pagina_ocho, null);

                    }
                    page = page8;
                    break;
                case 8:
                    if (page9 == null)
                    {
                        page9 = (ListView) LayoutInflater.from(MainActivity.this).inflate(R.layout.pagina_nueve, null);

                    }
                    page = page9;
                    break;
                case 9:
                    if (page10 == null)
                    {
                        page10 = (ListView) LayoutInflater.from(MainActivity.this).inflate(R.layout.pagina_diez, null);

                    }
                    page = page10;
                    break;
                case 10:
                    if (page11 == null)
                    {
                        page11 = (ListView) LayoutInflater.from(MainActivity.this).inflate(R.layout.pagina_once, null);

                    }
                    page = page11;
                    break;
                default:
                    if (page12 == null)
                    {
                        page12 = (ListView) LayoutInflater.from(MainActivity.this).inflate(R.layout.pagina_doce, null);

                    }
                    page = page12;
                    break;
            }

            ((ViewPager) collection).addView(page, 0);

            return page;
        }


        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }
        @Override
        public void destroyItem(View collection, int position, Object view)
        {
            ((ViewPager) collection).removeView((View) view);
        }
        class UpdateTimeTask extends TimerTask {
            public void run() {
                //Code for the viewPager to change view
            }
        }




        private void initListView()
        {

            String[] titulo = new String[]{
                    "titulo1",
                    "titulo2",
                    "titulo3",
                    "titulo4",
                    "titulo5",
            };
            page3.setAdapter(new ArrayAdapter<String>(MainActivity.this,R.layout.listview_history, titulo));
        }
    }

}
