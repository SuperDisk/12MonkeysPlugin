package superdisk.monkeysplugin;

import java.util.Arrays;

import javax.imageio.ImageIO;

import heroesgrave.spade.io.exporters.ExporterGenericImageIO;
import heroesgrave.spade.plugin.Plugin;
import heroesgrave.spade.plugin.Registrar;

public class Main extends Plugin
{
	public static void main(String[] args)
	{
		System.out.println(Arrays.asList(ImageIO.getReaderFormatNames()));
		launchSpadeWithPlugins(args, new Main());
	}
	
	@Override
	public void load()
	{
		
	}

	@Override
	public void register(Registrar registrar)
	{
		//Exporters. The importers are automatically handled by spade. This should be, too.
		registrar.registerExporter(new ExporterGenericImageIO("ppm", "PPM - Portable Pixmap"));
		registrar.registerExporter(new ExporterGenericImageIO("pam", "PAM - Portable Anymap"));
		registrar.registerExporter(new ExporterGenericImageIO("bmp", "BMP - Microsoft Bitmap Image"));
		registrar.registerExporter(new ExporterGenericImageIO("pcx", "PCX - PC Paintbrush"));
	}

}
