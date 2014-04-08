package com.linxonline.androidmallet.resources ;

import android.os.Environment ;

public class Directory
{
	private Directory() {}
	
	public static String getSDCardPath()
	{
		return Environment.getExternalStorageDirectory().getAbsolutePath() + "/" ;
	}
}