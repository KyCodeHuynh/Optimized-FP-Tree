# Optimized-FP-Tree

An optimized FP-tree data structure for the FP-Growth data mining algorithm.

## Building 

* Please make sure you have Java 1.8

* Compile all the java programs in the directory by using the following command:
    javac *.java -cp classmexer.jar *.java FPTree.java

* Run FPTree on the given sample.dat file under the sub-directory data as follows:
    java -javaagent:classmexer.jar FPTree <filename> <min_sup>

    ex: java -javaagent:classmexer.jar FPTree data/sample.dat 2

* You need to provide the filename (along with its path) and the support as arguments.

* The programs outputs the following:
    - The tree size i.e. the number of nodes in the tree
    - The time required to build it
    - The average height of the tree
    - The average branching factor (spread) of the tree
    - The frequent itemsets along with its support
    - The statistics of the recursive calls
