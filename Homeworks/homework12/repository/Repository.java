package repository;

public interface Repository<E, I> {
    void save(E entity);

    E findById(I id);
}
