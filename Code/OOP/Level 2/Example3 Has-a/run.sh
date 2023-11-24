#!/bin/bash
if [ ! -d "CompiledClasses" ];then
    mkdir CompiledClasses
fi
javac -d "CompiledClasses" $1."java"
java -cp CompiledClasses $1