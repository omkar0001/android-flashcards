package com.sample.flashcardtwo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class DemoCollectionPagerAdapter extends FragmentStatePagerAdapter {
	 int len;
	 Context con;
	 String list[];
   public DemoCollectionPagerAdapter(FragmentManager fm,String[] list,Context con,int len) {
   	super(fm);
   	this.len=len;
   	this.con=con;
   	this.list=list;
       
   }
  

   @Override
   public Fragment getItem(int i) {
       Fragment fragment =  new SampleFragment(list[i],con);
       return fragment;
   }

   @Override
   public int getCount() {
       return len;
   }

   
}
