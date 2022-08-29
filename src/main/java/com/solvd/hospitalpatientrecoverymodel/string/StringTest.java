package com.solvd.hospitalpatientrecoverymodel.string;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StringTest {
    public static void metoda() throws Exception {
        String c = FileUtils.readFileToString(new File("src/main/resources/result.txt"), "UTF-8");
        String[] d = c.split(" ");
        Map<String, Integer> fregMap = new HashMap<>();
        Collection<Integer> values = fregMap.values();
        Stream<Integer> valuesStream = values.stream();
        for (int i = 0; i < d.length; i++) {
            String key = d[i];
            int freg = fregMap.getOrDefault(key, 0);
            fregMap.put(key, ++freg);
            
        }

    }
    }

