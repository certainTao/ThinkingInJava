package com.hutao.page.page174;

import java.util.Arrays;

import static com.hutao.util.Print.*;

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class UpCase extends Processor{
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}

class DownCase extends Processor{
    String process(Object input){
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor{
    String process(Object input){
        return Arrays.toString(((String) input).split(" "));
    }
}

public class Apply {
    public static void process(Processor p, Object s){
        print("Using Processor "+p.name());
        print(p.process(s));
    }

    public static String s =
            "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new UpCase(),s);
        process(new DownCase(),s);
        process(new Splitter(),s);
    }
}
