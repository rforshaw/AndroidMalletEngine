package com.linxonline.androidmallet.system ;

import java.util.ArrayList ;

import com.linxonline.androidmallet.game.* ;
import com.linxonline.androidmallet.system.AndroidSystem ;
import com.linxonline.androidmallet.input.AndroidInputListener ;

import com.linxonline.mallet.game.* ;

public class ActivityGameRetainer
{
	public ArrayList<AndroidInputListener> inputListeners = new ArrayList<AndroidInputListener>() ;
	public AndroidSystem androidSystem = null ;
	public GameSystem gameSystem = new GameSystem() ;

	public ActivityGameRetainer() {}
}