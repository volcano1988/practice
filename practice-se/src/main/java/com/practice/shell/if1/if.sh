#!/usr/bin/env bash

NUM1=100
NUM2=200

if [ ! -d /Users/cc/ ]; then
    echo 'dir, not exist!'
else
    echo 'dir, it is exist'
fi


file=/Users/cc/Desktop/go.sh
if [ ! -f $file ]; then
    echo 'file ,not exist'
else
    echo 'file ,it is exist'
fi

scores=$1

if [ -z $scores ]; then
    echo 'usage:{$0 60|80.}'
    exit
fi

