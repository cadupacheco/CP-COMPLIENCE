// Carlos Eduardo rodrigues Coelho Pacheco | RM 557323
package br.com.carlos.apdex;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static br.com.carlos.apdex.ApdexCarlosEduardoRodriguesCoelhoPacheco557323.*;
import static org.junit.jupiter.api.Assertions.*;

public class ApdexTestCarlosEduardoRodriguesCoelhoPacheco557323 {

    private static long N;
    private long S, T, F;

    @BeforeAll
    static void configurarTotalAmostras() {
        N = ApdexCarlosEduardoRodriguesCoelhoPacheco557323.TOTAL_AMOSTRAS;
        assertEquals(557_323L, N);
    }

    @BeforeEach
    void preparar() {
        S = T = F = 0L;
    }

    @Test
    void deveCalcularEClassificarComoExcelente() {
        S = N; T = 0; F = 0;
        double a = calcularApdex(S, T, F);
        assertEquals(1.0, a, 1e-12);
        assertEquals(Classificacao.EXCELENTE, classificar(a));
    }

    @Test
    void deveCalcularEClassificarComoBom() {
        S = Math.round(0.90 * N); T = 0; F = N - S;
        double a = calcularApdex(S, T, F);
        assertEquals(Classificacao.BOM, classificar(a));
    }

    @Test
    void deveCalcularEClassificarComoRazoavel() {
        S = Math.round(0.75 * N); T = 0; F = N - S;
        double a = calcularApdex(S, T, F);
        assertEquals(Classificacao.RAZOAVEL, classificar(a));
    }

    @Test
    void deveCalcularEClassificarComoRuim() {
        S = Math.round(0.60 * N); T = 0; F = N - S;
        double a = calcularApdex(S, T, F);
        assertEquals(Classificacao.RUIM, classificar(a));
    }

    @Test
    void deveCalcularEClassificarComoInaceitavel() {
        S = Math.round(0.40 * N); T = 0; F = N - S;
        double a = calcularApdex(S, T, F);
        assertEquals(Classificacao.INACEITAVEL, classificar(a));
    }
}
