package com.linxonline.androidmallet.main ;

import com.linxonline.AndroidActivity ;

import com.linxonline.mallet.game.GameLoader ;
import com.linxonline.mallet.game.test.GameTestLoader ;
import com.linxonline.mallet.main.desktop.DesktopStarter ;

import com.linxonline.androidmallet.filesystem.* ;
import com.linxonline.androidmallet.system.AndroidSystem ;

public class AndroidStarter extends DesktopStarter
{
	public AndroidStarter( final AndroidActivity _activity )
	{
		super( new AndroidSystem( _activity ), new AndroidFileSystem() ) ;
	}

	@Override
	protected GameLoader getGameLoader()
	{
		return new GameTestLoader() ;
	}
}