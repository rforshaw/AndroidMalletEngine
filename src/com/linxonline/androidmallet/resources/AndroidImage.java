package com.linxonline.androidmallet.resources ;

import android.graphics.Bitmap ;

import com.linxonline.mallet.resources.* ;


public class AndroidImage implements ImageInterface
{
	public Bitmap bitmap = null ;
	public int height = 0 ;
	public int width = 0 ;
	
	public AndroidImage( Bitmap _bitmap )
	{
		bitmap = _bitmap ;
		width = bitmap.getWidth() ;
		height = bitmap.getHeight() ;
	}
	
	public int getWidth()
	{
		return width ;
	}
	
	public int getHeight()
	{
		return height ;
	}
}