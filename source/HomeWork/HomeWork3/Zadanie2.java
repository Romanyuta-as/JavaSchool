package HomeWork.HomeWork3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by AlexRS on 20.07.2016.
 */
public class Zadanie2 {
    public static void main(String[] args) throws IOException {
        ArrayList<File> files = new ArrayList<>();
        FileFirstLoad.init(files);

        //Collections.sort(files,(o1, o2) -> o1.toString().compareTo(o2.toString()));
       files = FileFirstLoad.Sort(files);
        FileFirstLoad.print(files);
    }

}
