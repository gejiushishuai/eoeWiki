package cn.eoe.wiki;

import java.io.File;

import cn.eoe.wiki.utils.WikiUtil;

/**
 * 主要是定义一些全局的静态变量
 * @author <a href="mailto:kris1987@qq.com">Kris.lee</a>
 * @data  2012-8-2
 * @version 1.0.0
 */
public class Constants {

	public static final String  APP_NAME			= "eoeWiki";

	public static  		String		EXTERNAL_DIR 		= WikiUtil.getExternalStoragePath()+File.separator+APP_NAME;
	public static  		String		CACHE_DIR 			= EXTERNAL_DIR+File.separator+"cache";
	public static  		String		LOGS_DIR 			= EXTERNAL_DIR+File.separator+"logs";
}
