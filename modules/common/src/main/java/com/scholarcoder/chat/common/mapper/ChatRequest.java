package com.scholarcoder.chat.common.mapper;

import com.scholarcoder.chat.common.session.Session;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
public class ChatRequest {
    private String method;
    private String metaData;
    private Map<String, String> headers;
    private String body;

    private Session session;

    public ChatRequest() {
    }

    public void setRequestLine(String method, String metaData) {
        this.method = method;
        this.metaData = metaData;
    }

    public void putHeader(String headerName, String headerValue) {
        if (headers == null) {
            headers = new HashMap<String, String>();
        }

        headers.put(headerName, headerValue);
    }

    protected void setSession(Session session) {
        this.session = session;
    }
}
