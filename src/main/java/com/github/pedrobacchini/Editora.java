package com.github.pedrobacchini;

import com.github.pedrobacchini.domain.Revista;
import org.springframework.data.redis.core.RedisTemplate;

public class Editora {

    public static final String NOME_CANAL = "revista";

    private RedisTemplate<String, Revista> redisTemplate;

    public RedisTemplate<String, Revista> getRedisTemplate() {
        return redisTemplate;
    }

    public void setRedisTemplate(RedisTemplate<String, Revista> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void publicarRevista(Revista revista) {
        redisTemplate.convertAndSend(NOME_CANAL, revista);
        System.out.println("Revista publicada!!");
    }
}
