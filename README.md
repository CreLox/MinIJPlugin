# Minimal ImageJ GUI Plugin
This is an ImageJ plugin (with a GUI) that allows users to select a square ROI with specified coordinates. More importantly, this is a template of a (really) minimal ImageJ plugin.

Below is a step-by-step instruction to make a functional plugin without the tedium of configuring an IDE - a text editor like Vim/Emacs/Gedit will do the job as long as you know how to code in java [these steps are for Linux/macOS or other Unix-like OS; use cmd instead of Terminal (since there is no such thing) in Windows]:

1. Download this repository entirely and edit the source code (`SelectSquareROI.java`) and the configuration file (`plugins.config` - do not change this filename) accordingly.

2. Prepare dependency package(s) (here `ij.jar` is needed, which could be downloaded from [here](https://wsr.imagej.net/jars)) in the same folder as our source code.

3. Go to Terminal (bash) and compile our source code into a java class file:
```
javac -classpath ij.jar SelectSquareROI.java
```
(Note: edit the filename accordingly)

4. Compress the configuration file and the compiled java class file into one java archive file (`Select_Square_ROI.jar`):
```
jar -cfe Select_Square_ROI.jar SelectSquareROI SelectSquareROI.class plugins.config
```
(Note: edit the filenames and the class name(s) accordingly; include an underscore in the filename of the java archive file)

5. Move our java archive file into the `plugins` subfolder of ImageJ.

6. Run ImageJ and test the plugin. There should be a corresponding option in the menu if the configuration file is written correctly.

7. (Optional) Set a shortcut for our plugin by "`Plugins` > `Shortcuts` > `Add Shortcut...`".
