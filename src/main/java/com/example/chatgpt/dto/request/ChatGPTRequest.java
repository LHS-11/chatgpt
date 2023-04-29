package com.example.chatgpt.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ChatGPTRequest {

    private String model;
    private String prompt;
    private int temperature;
    private int max_tokens;

    private ChatGPTRequest(String model, String prompt, int temperature, int max_tokens) {
        this.model = model;
        this.prompt = prompt;
        this.temperature = temperature;
        this.max_tokens = max_tokens;
    }

    public static ChatGPTRequest from(ChatGPTQueryRequest chatGPTQueryRequest){
        return new ChatGPTRequest(chatGPTQueryRequest.getModel(), chatGPTQueryRequest.getPrompt(), chatGPTQueryRequest.getTemperature(), chatGPTQueryRequest.getMax_tokens());
    }
}
