# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.13

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = "/Users/Masa/Library/Application Support/JetBrains/Toolbox/apps/CLion/ch-0/183.5429.37/CLion.app/Contents/bin/cmake/mac/bin/cmake"

# The command to remove a file.
RM = "/Users/Masa/Library/Application Support/JetBrains/Toolbox/apps/CLion/ch-0/183.5429.37/CLion.app/Contents/bin/cmake/mac/bin/cmake" -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/Masa/develop/src/ciccc/ciccc-class/clang/assignments/assignment6

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/Masa/develop/src/ciccc/ciccc-class/clang/assignments/assignment6/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/assignment6.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/assignment6.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/assignment6.dir/flags.make

CMakeFiles/assignment6.dir/vc_sort_params.c.o: CMakeFiles/assignment6.dir/flags.make
CMakeFiles/assignment6.dir/vc_sort_params.c.o: ../vc_sort_params.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/Masa/develop/src/ciccc/ciccc-class/clang/assignments/assignment6/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/assignment6.dir/vc_sort_params.c.o"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/assignment6.dir/vc_sort_params.c.o   -c /Users/Masa/develop/src/ciccc/ciccc-class/clang/assignments/assignment6/vc_sort_params.c

CMakeFiles/assignment6.dir/vc_sort_params.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/assignment6.dir/vc_sort_params.c.i"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/Masa/develop/src/ciccc/ciccc-class/clang/assignments/assignment6/vc_sort_params.c > CMakeFiles/assignment6.dir/vc_sort_params.c.i

CMakeFiles/assignment6.dir/vc_sort_params.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/assignment6.dir/vc_sort_params.c.s"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/Masa/develop/src/ciccc/ciccc-class/clang/assignments/assignment6/vc_sort_params.c -o CMakeFiles/assignment6.dir/vc_sort_params.c.s

# Object files for target assignment6
assignment6_OBJECTS = \
"CMakeFiles/assignment6.dir/vc_sort_params.c.o"

# External object files for target assignment6
assignment6_EXTERNAL_OBJECTS =

assignment6: CMakeFiles/assignment6.dir/vc_sort_params.c.o
assignment6: CMakeFiles/assignment6.dir/build.make
assignment6: CMakeFiles/assignment6.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/Masa/develop/src/ciccc/ciccc-class/clang/assignments/assignment6/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable assignment6"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/assignment6.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/assignment6.dir/build: assignment6

.PHONY : CMakeFiles/assignment6.dir/build

CMakeFiles/assignment6.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/assignment6.dir/cmake_clean.cmake
.PHONY : CMakeFiles/assignment6.dir/clean

CMakeFiles/assignment6.dir/depend:
	cd /Users/Masa/develop/src/ciccc/ciccc-class/clang/assignments/assignment6/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/Masa/develop/src/ciccc/ciccc-class/clang/assignments/assignment6 /Users/Masa/develop/src/ciccc/ciccc-class/clang/assignments/assignment6 /Users/Masa/develop/src/ciccc/ciccc-class/clang/assignments/assignment6/cmake-build-debug /Users/Masa/develop/src/ciccc/ciccc-class/clang/assignments/assignment6/cmake-build-debug /Users/Masa/develop/src/ciccc/ciccc-class/clang/assignments/assignment6/cmake-build-debug/CMakeFiles/assignment6.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/assignment6.dir/depend

