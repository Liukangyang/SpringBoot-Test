package org.example.mybatisplus.entity;


import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@TableName("t_user")
public class User {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    @TableField("user_name")
    private String name;
    private Integer age;
    private String email;
    //逻辑删除字段，查询时默认不会查询到已逻辑删除的条目
    @TableLogic
    private Integer isDeleted;
}
