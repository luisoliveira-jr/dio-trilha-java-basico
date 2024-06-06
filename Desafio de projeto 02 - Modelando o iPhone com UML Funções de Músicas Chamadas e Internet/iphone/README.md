# [DIO](www.dio.me) - Trilha Java Básico

## Autores
- [Gleyson Sampaio](https://github.com/glysns)

## Resolução
- [Luis Oliveira](https://github.com/luisoliveira-jr)

## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
- Minutos relevantes: 00:15 até 00:55

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

### Exemplo de Diagrama UML (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class AparelhoTelefonico {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class NavegadorInternet {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```

### Instruções
1. Assista ao vídeo do lançamento do iPhone para entender as funcionalidades principais.
2. Utilize uma ferramenta UML de sua preferência para criar o diagrama das classes e interfaces. Você pode utilizar o modelo acima (criado na sintaxe [Mermaid](https://mermaid.js.org/)), uma alternativa open-source e compatível com arquivos Markdown como este.
3. Opcionalmente, caso esteja cheio(a) de confiança, pode implementar as classes Java representadas em seu diagrama UML.
4. Submeta seu repositório GitHub conforme as orientações da plataforma DIO. Por exemplo:

```bash
https://github.com/glysns/trilha-java-basico/desafios/poo/README.md
```` 

# Resolução Diagrama UML

[![](https://mermaid.ink/img/pako:eNptUs1O4zAQfhXLp6IldNuyBXJAQsCBAwgtqz3lMrUnzkiOJ3LsaqGbp-GwD8KLrVNaSDfrk-ebn2_mm9lIxRplLrMsK1ygYDEX9wmyYLAWKG4IjIca3v68vbLQKGItrrlu2KELKOixSr_CbdMLpyy07S6lt0V6W0x8x8azjoH9fWxJgd28e_v3pUWLitjBzjl5Cp6cEfXWOhpEBlbgJ0Okgdh-Qt2Q86oBj7biH6l8yY4Ub_ZpgwKWTMrfMbpYo-dhfQjoNB5yUqpF4K_ZeyT-yS__pX-ANRrQ7O-SUt5hGI6Mv2hF_hEMuY9xo7cHzJreRXngNVytYHLYVgRLL7Av8dnAXve7pl-NyLLfl-NWxiFjscYxoyX2XPJYJs1qIJ3OaDtiIUOFNRYyT1-NJUQbClm4LoVCyn56dkrmwUc8lp6jqWRegm2TFRud9N4d0D_oraZE_AFahrQWmW9keG76CzbUhkSg2JVkejzJmeAqhKbNp9PefWIoVHF1orietqQr8KFaXyyny_nyHOYLXJ4t4NtiodVqdnFezk9npT77OpuD7LruL75sCH0?type=png)](https://mermaid.live/edit#pako:eNptUs1O4zAQfhXLp6IldNuyBXJAQsCBAwgtqz3lMrUnzkiOJ3LsaqGbp-GwD8KLrVNaSDfrk-ebn2_mm9lIxRplLrMsK1ygYDEX9wmyYLAWKG4IjIca3v68vbLQKGItrrlu2KELKOixSr_CbdMLpyy07S6lt0V6W0x8x8azjoH9fWxJgd28e_v3pUWLitjBzjl5Cp6cEfXWOhpEBlbgJ0Okgdh-Qt2Q86oBj7biH6l8yY4Ub_ZpgwKWTMrfMbpYo-dhfQjoNB5yUqpF4K_ZeyT-yS__pX-ANRrQ7O-SUt5hGI6Mv2hF_hEMuY9xo7cHzJreRXngNVytYHLYVgRLL7Av8dnAXve7pl-NyLLfl-NWxiFjscYxoyX2XPJYJs1qIJ3OaDtiIUOFNRYyT1-NJUQbClm4LoVCyn56dkrmwUc8lp6jqWRegm2TFRud9N4d0D_oraZE_AFahrQWmW9keG76CzbUhkSg2JVkejzJmeAqhKbNp9PefWIoVHF1orietqQr8KFaXyyny_nyHOYLXJ4t4NtiodVqdnFezk9npT77OpuD7LruL75sCH0)

