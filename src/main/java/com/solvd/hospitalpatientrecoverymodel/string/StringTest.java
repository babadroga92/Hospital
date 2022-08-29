package com.solvd.hospitalpatientrecoverymodel.string;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringTest {
    public static Map<String, Long> metoda() throws Exception {
        String c = FileUtils.readFileToString(new File("src/main/resources/result.txt"), "UTF-8").replaceAll("\n", " ");
        Map<String, Long> counts = Arrays.asList(c.split(" ")).stream().sorted().collect(Collectors.groupingBy(s -> s.toLowerCase(), Collectors.counting()));
        return counts;
    }
}

