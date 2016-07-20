package HomeWork.HomeWork3;

import java.util.Comparator;

/**
 * Created by AlexRS on 20.07.2016.
 */
public class File implements Comparable<File> {
    String words;
    int  dlina;

    @Override
    public String toString() {
        return getWords();
    }

    public File(String words, int dlina) {
        this.words = words;
        this.dlina = dlina;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public int getDlina() {
        return dlina;
    }

    public void setDlina(int dlina) {
        this.dlina = dlina;
    }


    public File() {
    }

    //@Override
    //public int hashCode() {
      //  return this.getWords().hashCode();
    //}

    @Override
    public boolean equals(Object obj) {
        return this.getWords()==((File) obj).getWords();
    }

    @Override
    public int compareTo(File o) {
        if(this.dlina>o.dlina)
            return -1;
        if(this.dlina<o.dlina)
            return  1;
        else
            return 0;
    }
}
