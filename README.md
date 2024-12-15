# Kotlin List Modification Bug

This repository demonstrates a potential issue when using `removeIf` and `removeAll` functions on mutable lists in Kotlin.  Modifying a list while iterating over it can lead to unexpected results or exceptions.  The provided code illustrates this behavior and offers a safer alternative using `filter` to create a new list before removing elements.

## Problem

The `removeIf` and `removeAll` functions modify the list directly during iteration.  If elements are removed, it can affect the iteration process and skip or double-count elements.

## Solution

The safer method is to create a new list using the `filter` function to select elements to remove and then use `removeAll` to remove only those elements.