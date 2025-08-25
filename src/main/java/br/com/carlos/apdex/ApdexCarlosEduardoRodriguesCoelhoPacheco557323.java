// Carlos Eduardo rodrigues Coelho Pacheco | RM 557323
package br.com.carlos.apdex;

/**
 * Classe de domínio para cálculo e classificação de APDEX.
 * Fórmula: (S + 0.5 * T) / N
 */
public final class ApdexCarlosEduardoRodriguesCoelhoPacheco557323 {

    public static final long TOTAL_AMOSTRAS = 557_323L;

    private ApdexCarlosEduardoRodriguesCoelhoPacheco557323() { }

    public enum Classificacao {
        EXCELENTE, BOM, RAZOAVEL, RUIM, INACEITAVEL
    }

    public static double calcularApdex(long satisfeitas, long toleraveis, long frustradas) {
        if (satisfeitas < 0 || toleraveis < 0 || frustradas < 0) {
            throw new IllegalArgumentException("Contagens não podem ser negativas.");
        }
        long n = satisfeitas + toleraveis + frustradas;
        if (n == 0) {
            throw new IllegalArgumentException("Total de amostras (N) deve ser > 0.");
        }
        if (n != TOTAL_AMOSTRAS) {
            throw new IllegalArgumentException("Total de amostras deve ser exatamente " + TOTAL_AMOSTRAS + ".");
        }
        return (satisfeitas + 0.5d * toleraveis) / (double) n;
    }

    public static Classificacao classificar(double apdex) {
        if (apdex < 0.0 || apdex > 1.0 || Double.isNaN(apdex)) {
            throw new IllegalArgumentException("APDEX deve estar no intervalo [0,1].");
        }
        if (apdex >= 0.94) return Classificacao.EXCELENTE;
        if (apdex >= 0.85) return Classificacao.BOM;
        if (apdex >= 0.70) return Classificacao.RAZOAVEL;
        if (apdex >= 0.50) return Classificacao.RUIM;
        return Classificacao.INACEITAVEL;
    }
}
