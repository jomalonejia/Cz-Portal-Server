package core.base;


/**
 * 演示 mapper 父类，注意这个类不要让 mp 扫描到！！
 * do not scan
 */
public interface BaseMapper<T> extends com.baomidou.mybatisplus.mapper.BaseMapper<T> {

    // do something
}
