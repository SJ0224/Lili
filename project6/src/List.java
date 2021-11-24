public interface List {
    Position first();

    Position last();

    Position before(Position p);

    Position after(Position p);

    Position insertBefore(Position p, Object d);

    Position insertAfter(Position p, Object d);

    Position insertFirst(Object d);

    Position insertLast(Object d);

    Object remove(Position p);

    int size();

    boolean isEmpty();
}
