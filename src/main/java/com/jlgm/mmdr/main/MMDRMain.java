package com.jlgm.mmdr.main;

import com.jlgm.mmdr.block.MMDRBlock;
import com.jlgm.mmdr.creativetab.MMDRCreativeTab;
import com.jlgm.mmdr.item.MMDRItem;
import com.jlgm.mmdr.lib.MMDRConstants;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = MMDRConstants.MODID,
	name = MMDRConstants.NAME,
	version = MMDRConstants.VERSION,
	acceptedMinecraftVersions = MMDRConstants.ACCEPTEDMINECRAFTVERSIONS)

public class MMDRMain {
	
	@SidedProxy(clientSide = MMDRConstants.CLIENT_PROXY, serverSide = MMDRConstants.SERVER_PROXY)
	public static CommonProxy proxy;
	@Instance("MMDR")
	public static MMDRMain instance;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent preInitEvent){
		proxy.preInit(preInitEvent);
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent initEvent){
		proxy.init(initEvent);
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent postInitEvent){
		proxy.postInit(postInitEvent);
	}
}