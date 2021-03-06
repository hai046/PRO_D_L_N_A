package com.brunjoy.weiget;


import android.content.Context;
import android.view.KeyEvent;
import android.view.View;

public class ViewController {
	
	public ViewController(Context context)
	{
		this.mContext = context;
		onCreate();
	}
	public ViewControllerManager controllerManager;
	protected Context mContext;
	protected void setContentView(int rid)
	{
		 view = View.inflate(mContext, rid, null);
	}
	protected View findViewById(int rid)
	{
		return view.findViewById(rid);
	}
	protected View view;
	
	protected void onCreate()
	{
		
	}
	protected void onStart()
	{
		 
	}
	protected void onStop()
	{
		
	}
	protected void onFinished()
	{

	}	
	
	protected boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode == KeyEvent.KEYCODE_BACK)
		{
			if(controllerManager != null)
			{
				controllerManager.dismissController();
				return true;
			}
		}
		return false;
	}
}
