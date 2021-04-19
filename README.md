# Minimal ImageJ GUI Plugin
This is an ImageJ plugin (with a GUI) that allows users to select a square ROI with specified coordinates. More importantly, this is a template of a (really) minimal ImageJ plugin.

Below is a step-by-step instruction to make a functional plugin without the tedium of configuring an IDE - a text editor will do the job as long as you know how to code in java [to learn the source codes of ImageJ utilities, use `Plugins` > `Utilities` > `Find Commands...` > (choose a specific command) > `Source`]. Note that these steps are for Unix-like OS's (macOS/Linux distributions/...); use Command Prompt/PowerShell on Windows.

1. Download this repository entirely and edit the source code (`SelectSquareROI.java`) and the configuration file (`plugins.config` - do not change this filename) accordingly.

2. Prepare dependency package(s) (here `ij.jar` is needed, which could be downloaded from [here](https://wsr.imagej.net/jars)) in the same folder as our source code.

3. [Install JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html). On Windows, [add](https://docs.oracle.com/javase/7/docs/webnotes/install/windows/jdk-installation-windows.html#path) the folder containing all executables to the `Path` environment variable.

4. Go to Terminal and compile our source code into a java class file: `javac -classpath ij.jar SelectSquareROI.java` (Note: edit the filename accordingly). If you want to check the version of a java class file and determine its compatibility, you might find [this thread](https://stackoverflow.com/questions/27065/tool-to-read-and-display-java-class-versions) helpful.

5. Compress the configuration file and the compiled java class file into one java archive file (`Select_Square_ROI.jar`): `jar -cfe Select_Square_ROI.jar SelectSquareROI SelectSquareROI.class plugins.config` (Note: edit the filenames and the class name(s) accordingly; include an underscore in the filename of the java archive file).

6. Move our java archive file into the `plugins` subfolder of ImageJ (or open ImageJ and run "`Plugins` > `Install Plugin...`").

7. Restart ImageJ and test the plugin. There should now be a corresponding option in the menu if the configuration file is written correctly.

8. (Optional) set a shortcut for our plugin by running the ImageJ command: "`Plugins` > `Shortcuts` > `Add Shortcut...`".
