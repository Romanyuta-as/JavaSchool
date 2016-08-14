package HomeWork.HomeWork10;

/**
 * Created by 1 on 14.08.2016.
 */
@FunctionalInterface
public interface Conventer<F,T> {
    T convert(F from);

}
