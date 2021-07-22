package com.example.demomybatis.utils;


import java.util.HashMap;
import java.util.Map;

public class R extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;





    public static R error(String code ,String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("msg", msg);
        return r;
    }
    public static R ok(Object obj) {
        R r = new R();
        r.put("data", obj);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public static R ok() {
        return new R();
    }


    public static R data(Object data){
        return R.ok().put("data",data);
    }

    public static R page(Object page){
        return R.ok().put("page",page);
    }

    @Override
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
