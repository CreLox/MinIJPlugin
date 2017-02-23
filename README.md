# Minimal_ImageJ_GUI_Plugin
This is an ImageJ plugin (with a GUI) that allows users to select a square ROI with specified coordinates. More importantly, this is a template of a (really) minimal ImageJ plugin without the tedium of configuring an IDE - a text editor like Vim/Emacs/Gedit should do the job as long as you know how to code in java.

Below is a step-by-step instruction to make a functional plugin [for Linux/macOS or other Unix-like OS; use cmd instead of Terminal (since there is no such thing) in Windows]:

a. Download this repository entirely and edit the code (SelectSquareROI.java) and the configuration file (plugins.config) accordingly.

b. Prepare dependency package(s) (here ij.jar is needed, which could be downloaded from: wsr<dot>imagej<dot>net<slash>jars) in the same folder as our source code.

c. Go to Terminal (bash), cd into the folder and compile our source code into a java class file:
javac -classpath ij.jar SelectSquareROI.java
(Note: edit the filename accordingly)

d. Compress the configuration file and the java class file into one java archive file (Select_Square_ROI.jar):
jar -cfe Select_Square_ROI.jar SelectSquareROI SelectSquareROI.class plugins.config
(Note: edit the filenames and the class name(s) accordingly; include an underscore in the filename of the java archive file)

e. Move our java archive file into the "plugins" subfolder of ImageJ.

f. Run ImageJ and test the plugin. There should be a corresponding option in the menu if the configuration file is written correctly.

g. (Optional) Set a shortcut for our plugin by "Plugins > Shortcuts > Add Shortcut...".
