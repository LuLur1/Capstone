package com.example.temptest;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequestActivity extends StringRequest {

    // 서버 URL 설정 (PHP 파일 연동)
    final static private String URL = "ec2-13-125-205-121.ap-northeast-2.compute.amazonaws.com/Resitest.php";

    private Map<String, String> map;

    public RegisterRequestActivity(String id, String pw, Response.Listener<String> listener)
    {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("id", id);
        map.put("pw", pw);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
