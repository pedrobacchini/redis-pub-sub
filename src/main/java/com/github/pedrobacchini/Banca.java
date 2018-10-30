package com.github.pedrobacchini;

import com.github.pedrobacchini.domain.Revista;

public class Banca {

    public void recebe(Revista revista) {
        System.out.println("Revista recebida "+ revista.toString());
    }
}
