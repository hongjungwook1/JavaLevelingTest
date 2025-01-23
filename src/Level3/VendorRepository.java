package Level3;

import java.util.List;

public class VendorRepository extends AbstractRepository<Vendor , Integer>{

    @Override
    public Vendor create(Vendor entity) {
        int getIdCount = idGenerator();
        entity.setId(getIdCount);
        userMap.put(getIdCount , entity);
        return entity;
    }

    @Override
    public Vendor read(Integer integer) {
        return findById(integer)
                .orElseThrow(()-> new RuntimeException("[Vendor] ID 없음"));
    }

    @Override
    public List<Vendor> read() {
        return userMap.values().stream()
                .filter(user -> !user.isDeleted())
                .toList();
    }

    @Override
    public Vendor update(Integer integer, Vendor entity) {
        read(integer);
        entity.setId(integer);
        userMap.replace(integer , entity);
        return entity;
    }

    @Override
    public void delete(Integer integer) {
        read(integer);
        Vendor vendor = userMap.get(integer);
        vendor.activationIsDeleted();
    }
}