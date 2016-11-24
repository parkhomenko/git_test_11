package buffers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Buffers {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("h");
        builder.append("e");
        builder.append("l");
        builder.append("l");
        builder.append("o");

        System.out.println(builder.toString());

        StringBuffer buffer = new StringBuffer();

        final List<Object> objects = Collections.synchronizedList(new ArrayList<Object>());
    }
}
