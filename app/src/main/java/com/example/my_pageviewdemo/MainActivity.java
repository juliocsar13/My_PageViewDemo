package com.example.my_pageviewdemo;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.PageIndicator;
import java.util.TimerTask;
import java.util.logging.Handler;


public class MainActivity extends ActionBarActivity {

    private ViewPager viewPager;
    private LinearLayout page1;
    private LinearLayout page2;
    private LinearLayout page3;
    private LinearLayout page4;
    private LinearLayout page5;
    private LinearLayout page6;
    private PageIndicator mIndicador;
    private android.os.Handler handler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler.postDelayed(new Runnable() {
            public void run() {

                viewPager.setCurrentItem(viewPager.getCurrentItem()+1, true);

            }
        },2000);
        viewPager=(ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(new MainPageAdapter());

        CirclePageIndicator circleIndicator = (CirclePageIndicator)findViewById(R.id.indicator);
        circleIndicator.setViewPager(viewPager);

        circleIndicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position)
            {
               // Toast.makeText(MainActivity.this, "page " + (position + 1), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
            {

            }

            @Override
            public void onPageScrollStateChanged(int state)
            {

            }

        });







    }



    class MainPageAdapter extends PagerAdapter{

        /*@Override
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
                default:
                    title = getString(R.string.six_indicator);
                    break;
            }
            return title;
        }*/

        @Override
        public int getCount() {
            return 6;
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
                        page1 = (LinearLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.page_one, null);

                    }
                    page = page1;
                    break;
                case 1:
                    if (page2 == null)
                    {
                        page2 = (LinearLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.page_two, null);
                    }
                    page = page2;
                    break;
                case 2:
                    if (page3 == null)
                    {
                        page3 = (LinearLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.page_three, null);

                    }
                    page = page3;
                    break;
                case 3:
                    if (page4 == null)
                    {
                        page4 = (LinearLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.page_four, null);

                    }
                    page = page4;
                    break;
                case 4:
                    if (page5 == null)
                    {
                        page5 = (LinearLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.page_five, null);

                    }
                    page = page5;
                    break;
                default:
                    if (page6 == null)
                    {
                        page6 = (LinearLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.page_six, null);
                    }
                    page = page6;
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




      /*  private void initListView()
        {

            String[] items = new String[50];
            for (int i = 0; i < 50; i++)
            {
                items[i] = "Item " + i;
            }
            page3.setAdapter(new ArrayAdapter<String>(MainActivity.this, R.layout.textview, items));
            page3.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                {
                    Toast.makeText(MainActivity.this, (String) parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
                }
            });

        }*/
    }

}
