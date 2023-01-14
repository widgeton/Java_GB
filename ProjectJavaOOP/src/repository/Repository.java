package repository;

public interface Repository<E, I> {
    void save(E entity);

    void delete(E entity);

    E findById(I id);
}
