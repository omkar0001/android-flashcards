package com.sample.flashcardtwo;


import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.Toast;


public class MyActivity extends FragmentActivity implements  GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener {
	DemoCollectionPagerAdapter mDemoCollectionPagerAdapter;
	ViewPager mViewPager;
    private static final String DEBUG_TAG = "Gestures";
    private GestureDetectorCompat mDetector;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d("helllllo", "my appp");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_collection_demo);
		 
		String str[]= getIntent().getExtras().getStringArray("data");
		//String comp=getIntent().getExtras().getString("chosenWord");
		mDemoCollectionPagerAdapter =
                new DemoCollectionPagerAdapter(getSupportFragmentManager(),str,this,str.length);
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mDemoCollectionPagerAdapter); 
        mDetector = new GestureDetectorCompat(this,this);
        mDetector.setOnDoubleTapListener(this);
   
        
	}
	public boolean onTouchEvent(MotionEvent event){ 
        this.mDetector.onTouchEvent(event);
        // Be sure to call the superclass implementation
        return super.onTouchEvent(event);
    }
	@Override
	public boolean onSingleTapConfirmed(MotionEvent e) {
		// TODO Auto-generated method stub
	
        return false;
	}
	@Override
	public boolean onDoubleTap(MotionEvent e) {
		// TODO Auto-generated method stub
		 Log.d(DEBUG_TAG, "onDoubleTap: " + e.toString());
        return true;
	}
	@Override
	public boolean onDoubleTapEvent(MotionEvent e) {
		// TODO Auto-generated method stub
		Log.d(DEBUG_TAG, "onDoubleTapEvent: " + e.toString());
        return true;
	}
	@Override
	public boolean onDown(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void onShowPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean onSingleTapUp(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
			float distanceY) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void onLongPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) {
		// TODO Auto-generated method stub
		return false;
	}
	 		
}