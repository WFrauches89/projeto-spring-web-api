#Projeto Spring Web API - Bootcamp SANTANDER - DIO

###Diagrama de Classes

```mermaid
classDiagram
    class Usuario {
        -String name
        -Conta account
        -Cartao card
        -Lista<Feature> features
        -Lista<News> news
    }
    
    class Conta {
        -String number
        -String agency
        -float balance
        -float limit
    }
    
    class Cartao {
        -String number
        -float limit
    }
    
    class Feature {
        -String icon
        -String description
    }
    
    class News {
        -String icon
        -String description
    }
```
