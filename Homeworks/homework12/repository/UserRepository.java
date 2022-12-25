package repository;

import data.user.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {
    E findByFio(String fio);
}
