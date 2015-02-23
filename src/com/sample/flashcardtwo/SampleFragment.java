package com.sample.flashcardtwo;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SampleFragment extends Fragment  {
	   // public static final String ARG_OBJECT = "object"
	String text;
	public SampleFragment(String text,Context con){
		this.text=text;
	}

	    @Override
	    public View onCreateView(LayoutInflater inflater,
	            ViewGroup container, Bundle savedInstanceState) {
	        // The last two arguments ensure LayoutParams are inflated
	        // properly.
	    	View rootView = inflater.inflate(
	                R.layout.fragment_collection_object, container, false);
	        ((TextView) rootView.findViewById(android.R.id.text1)).setText(text);
	        
	        return rootView;
	    }
	    }
