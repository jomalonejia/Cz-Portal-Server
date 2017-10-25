
package core.base;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class BaseModel<T extends BaseModel> implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId
    private String id;

    /*private Date createTime;*/

    protected Serializable pkVal() {
        // TODO Auto-generated method stub
        return id;
    }
}
