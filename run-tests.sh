#!/bin/bash

javac -cp classmexer.jar *.java FPTree.java

java -javaagent:classmexer.jar FPTree data/sample.dat 1 > results/sample/result-sample-1.txt
java -javaagent:classmexer.jar FPTree data/sample.dat 2 > results/sample/result-sample-2.txt
java -javaagent:classmexer.jar FPTree data/sample.dat 3 > results/sample/result-sample-3.txt
java -javaagent:classmexer.jar FPTree data/sample.dat 4 > results/sample/result-sample-4.txt
java -javaagent:classmexer.jar FPTree data/sample.dat 5 > results/sample/result-sample-5.txt
java -javaagent:classmexer.jar FPTree data/sample.dat 6 > results/sample/result-sample-6.txt
java -javaagent:classmexer.jar FPTree data/sample.dat 7 > results/sample/result-sample-7.txt
java -javaagent:classmexer.jar FPTree data/sample.dat 8 > results/sample/result-sample-8.txt
java -javaagent:classmexer.jar FPTree data/sample.dat 9 > results/sample/result-sample-9.txt
java -javaagent:classmexer.jar FPTree data/sample.dat 10 > results/sample/result-sample-10.txt

java -javaagent:classmexer.jar FPTree data/mushroom.dat 1000 > results/mushroom/result-mushroom-1000.txt
java -javaagent:classmexer.jar FPTree data/mushroom.dat 2000 > results/mushroom/result-mushroom-2000.txt
java -javaagent:classmexer.jar FPTree data/mushroom.dat 3000 > results/mushroom/result-mushroom-3000.txt
java -javaagent:classmexer.jar FPTree data/mushroom.dat 4000 > results/mushroom/result-mushroom-4000.txt
java -javaagent:classmexer.jar FPTree data/mushroom.dat 5000 > results/mushroom/result-mushroom-5000.txt
java -javaagent:classmexer.jar FPTree data/mushroom.dat 6000 > results/mushroom/result-mushroom-6000.txt
java -javaagent:classmexer.jar FPTree data/mushroom.dat 7000 > results/mushroom/result-mushroom-7000.txt
java -javaagent:classmexer.jar FPTree data/mushroom.dat 8000 > results/mushroom/result-mushroom-8000.txt
java -javaagent:classmexer.jar FPTree data/mushroom.dat 9000 > results/mushroom/result-mushroom-9000.txt
java -javaagent:classmexer.jar FPTree data/mushroom.dat 10000 > results/mushroom/result-mushroom-10000.txt

java -javaagent:classmexer.jar FPTree data/retail.dat 1000 > results/retail/result-retail-1000.txt
java -javaagent:classmexer.jar FPTree data/retail.dat 2000 > results/retail/result-retail-2000.txt
java -javaagent:classmexer.jar FPTree data/retail.dat 3000 > results/retail/result-retail-3000.txt
java -javaagent:classmexer.jar FPTree data/retail.dat 4000 > results/retail/result-retail-4000.txt
java -javaagent:classmexer.jar FPTree data/retail.dat 5000 > results/retail/result-retail-5000.txt
java -javaagent:classmexer.jar FPTree data/retail.dat 6000 > results/retail/result-retail-6000.txt
java -javaagent:classmexer.jar FPTree data/retail.dat 7000 > results/retail/result-retail-7000.txt
java -javaagent:classmexer.jar FPTree data/retail.dat 8000 > results/retail/result-retail-8000.txt
java -javaagent:classmexer.jar FPTree data/retail.dat 9000 > results/retail/result-retail-9000.txt
java -javaagent:classmexer.jar FPTree data/retail.dat 10000 > results/retail/result-retail-10000.txt

java -javaagent:classmexer.jar FPTree data/T10I4D100K.dat 1000 > results/T/result-T-1000.txt
java -javaagent:classmexer.jar FPTree data/T10I4D100K.dat 2000 > results/T/result-T-2000.txt
java -javaagent:classmexer.jar FPTree data/T10I4D100K.dat 3000 > results/T/result-T-3000.txt
java -javaagent:classmexer.jar FPTree data/T10I4D100K.dat 4000 > results/T/result-T-4000.txt
java -javaagent:classmexer.jar FPTree data/T10I4D100K.dat 5000 > results/T/result-T-5000.txt
java -javaagent:classmexer.jar FPTree data/T10I4D100K.dat 6000 > results/T/result-T-6000.txt
java -javaagent:classmexer.jar FPTree data/T10I4D100K.dat 7000 > results/T/result-T-7000.txt
java -javaagent:classmexer.jar FPTree data/T10I4D100K.dat 8000 > results/T/result-T-8000.txt
java -javaagent:classmexer.jar FPTree data/T10I4D100K.dat 9000 > results/T/result-T-9000.txt
java -javaagent:classmexer.jar FPTree data/T10I4D100K.dat 10000 > results/T/result-T-10000.txt