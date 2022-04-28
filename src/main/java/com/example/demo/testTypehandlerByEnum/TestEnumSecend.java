package com.example.demo.testTypehandlerByEnum;

/**
 * @author QianWei.Song
 * @version 1.1.0
 * @description  测试自定义解析枚举类   这个类使用了EnumOrdinalTypeHandler
 *            去处理枚举类  是按照枚举类的下标 作为存在数据库中的值
 *
 * @date 2022/2/22 15:54
 */
public enum TestEnumSecend {
    MAN(1,"男"),NOSEX(2,"无"),WOMAN(3,"女");
    private Integer sexId;
    private String sex;

    TestEnumSecend(Integer sexId, String sex) {
        this.sexId = sexId;
        this.sex = sex;
    }

    public Integer getSexId() {
        return sexId;
    }

    public void setSexId(Integer sexId) {
        this.sexId = sexId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
