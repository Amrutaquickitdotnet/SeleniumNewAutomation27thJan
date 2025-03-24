package com.collectionExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveMiddleCharacters {


	  public static Set<String> removeMiddleStringFromSet(Set<String> inputSet) {
	       
	        System.out.println("Before removing middle strings: " + inputSet);
	        List<String> list = new ArrayList<>(inputSet);
	        int middleIndex = list.size() / 2;

	        if (list.size() % 2 == 0) {
	            list.remove(middleIndex);
	            list.remove(middleIndex - 1);
	        } else {
	            list.remove(middleIndex);
	            if (middleIndex > 0) {
	                list.remove(middleIndex - 1);
	            }
	        }

	        return new HashSet<>(list);
	    }

	    public static void main(String[] args) {
	        Set<String> sampleSet = new HashSet<>(Arrays.asList("apple", "banana", "carrot", "dog", "egg"));
	        Set<String> result = removeMiddleStringFromSet(sampleSet);
	        System.out.println(result);
	    }
}
