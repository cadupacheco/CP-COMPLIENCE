# Projeto Apdex - TDD & Teste Unitário  
**Aluno:** Carlos Eduardo Rodrigues Coelho Pacheco  
**RM:** 557323  

## 📌 Descrição
Este projeto implementa o cálculo e a classificação do **APDEX (Application Performance Index)**, utilizando **Java 17, Maven e JUnit 5**, como parte da atividade de **TDD & Testes Unitários**.

A fórmula utilizada para o cálculo do APDEX é:  

```
APDEX = (S + 0.5 × T) / N
```

- **S** = número de amostras satisfatórias  
- **T** = número de amostras toleráveis  
- **F** = número de amostras frustradas  
- **N** = total de amostras (**deve ser exatamente 557.323**, número do RM do aluno)  

---

## 📊 Classificações do APDEX
Com base nos materiais da disciplina, o valor calculado do APDEX deve ser classificado em:  

| Faixa      | Intervalo   |
|------------|-------------|
| Excelente  | 0.94 – 1.00 |
| Bom        | 0.85 – 0.93 |
| Razoável   | 0.70 – 0.84 |
| Ruim       | 0.50 – 0.69 |
| Inaceitável| 0.00 – 0.49 |

---

## 📂 Estrutura do Projeto
```
apdex-557323/
 ├── pom.xml
 └── src
     ├── main
     │   └── java
     │       └── br/com/carlos/apdex/
     │           └── ApdexCarlosEduardoRodriguesCoelhoPacheco557323.java
     └── test
         └── java
             └── br/com/carlos/apdex/
                 └── ApdexTestCarlosEduardoRodriguesCoelhoPacheco557323.java
```

- `ApdexCarlosEduardoRodriguesCoelhoPacheco557323.java`: Classe principal responsável pelo cálculo e classificação do APDEX.  
- `ApdexTestCarlosEduardoRodriguesCoelhoPacheco557323.java`: Testes unitários implementados com JUnit 5, cobrindo todos os cenários de classificação.  

---

## ⚙️ Tecnologias Utilizadas
- **Java 17**  
- **Maven** (gerenciamento de dependências)  
- **JUnit 5** (testes unitários)  
- **IntelliJ IDEA** (IDE recomendada)  

---

## ▶️ Como Executar
1. Clone o repositório ou extraia o arquivo `.zip` do projeto.  
2. Abra o projeto no **IntelliJ IDEA** ou outra IDE compatível.  
3. Garanta que o **JDK 17** esteja configurado.  
4. Execute os testes unitários:
   - Pela IDE (clique com botão direito > `Run Tests`)  
   - Ou pelo terminal:
     ```bash
     mvn test
     ```

---

## ✅ Critérios Atendidos
- [x] Projeto Java com Maven  
- [x] Uso do JUnit 5  
- [x] Número de amostras fixado no **RM 557323**  
- [x] Nome completo e RM na **primeira linha de cada classe**  
- [x] Uso adequado de `@BeforeAll` e `@BeforeEach`  
- [x] Cobertura de todas as classificações do APDEX  
- [x] Todos os testes passando com sucesso  

---

## 👨‍💻 Autor
**Carlos Eduardo Rodrigues Coelho Pacheco**  
RM **557323**
