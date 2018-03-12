package mytest;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Created by lq on 2018/3/9.
 */
@Data
@MappedSuperclass
public class BaseDateTime {
    @JSONField(format = "yyyy-mm-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format = "yyyy-mm-dd HH:mm:ss")
    private Date updateTime;
}
