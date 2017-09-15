package core.base;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by jomalone_jia on 2017/9/15.
 */
@Setter
@Getter
public class BaseEntity<T extends Model> extends Model<T> {

    @TableId
    private Long id;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
