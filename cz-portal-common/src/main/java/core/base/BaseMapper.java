package core.base;


/**
 * 演示 mapper 父类，注意这个类不要让 mp 扫描到！！
 * do not scan
 */
public interface BaseMapper<T> {

    int insert(T model);
    int insertSelective(T model);
    T selectByPrimaryKey(Long id);
    int deleteByPrimaryKey(Long id);
    int updateByPrimaryKey(T model);
    int updateByPrimaryKeySelective(T model);
}
