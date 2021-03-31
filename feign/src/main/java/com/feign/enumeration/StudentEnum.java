package com.feign.enumeration;

public enum StudentEnum {
    STATUS_USe("1", "使用"),
    STATUS_NOT_USE("0", "未使用"),
    ;

    private String key;
    private String value;

    StudentEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //根据key获取value的值
    public static String getValueByKey(int key){
        for (StudentEnum s : StudentEnum.values()) {
            if(s.getKey().equals(key)){
                return s.getValue();
            }
        }
        return "";
    }


    //根据匹配value的值获取key
    public static String getKeyByValue(String channelName){
        for (StudentEnum s : StudentEnum.values()) {
            if(channelName.equals(s.getValue())){
                return s.getKey();
            }
        }
        return "";
    }
}
