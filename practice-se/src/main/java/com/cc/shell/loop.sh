#!/usr/bin/env bash

NUM1=100
NUM2=200

if (($NUM1>4)); then
    echo "num1>num2"
fi

if (($NUM1>4)); then
    echo "num1>4"
else (($NUM1>$NUM2))
    echo "num1>num2"
fi