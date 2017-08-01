/**
 * Created by mahajani on 7/28/2017.
 */
@FunctionalInterface
interface FoldInterface<T,E> {
    public T accept(T t, E e);
}
