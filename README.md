# Interfaces
As interfaces são análogas aos contratos que assinamos para poder trabalhar em uma empresa.

Nestes contratos, temos diversas cláusulas, que precisam ser seguidas, para que sejamos considerados como sendo um funcionário(a), por exemplo: temos X horas a serem trabalhadas no mês, devemos respeitar aos outros, saber criar uma calculadora em JavaScript, etc.

As interfaces em Java são muito semelhantes!

Basicamente, ela dita tudo aquilo que um objeto deve fazer, para ser considerado aquilo que a interface é. Assim como o contrato, que dita tudo que o ser humano deve ser, para que seja um funcionário.

# Classes abstratas
As classes abstratas são onde escrevemos abstrações, ou seja, comportamentos (métodos) e características (atributos) comuns entre as entidades.

# Exemplo prático
Para implementar os conceitos apresentados acima, vamos fazer um exemplo prático, com base em animais.

Vamos supor que temos uma Pet Shop, onde atendemos gatos, cachorros e papagaios. Faremos quatro coisas: lavar, tosar, alimentar e acariciar.

Poderíamos criar uma interface, dizendo tudo aquilo que uma classe deve ter para que ela seja considerada um animal:

```java
public interface IAnimal {

    public void lavar();
    public void alimentar();
    public void acariciar();

}
```

Note que nem todos os animais serão tosados, por isso, o método `tosar()` não está declarado na interface.

Como citado anteriormente, teremos três animais que serão atendidos. Vou criar uma classe (ou objeto) para cada um deles.

```java
public class Cachorro implements IAnimal {

    public Cachorro() {
    }

    public void lavar() {
        System.out.println();
        System.out.println("Pegar o shampoo");
        System.out.println("Lavando ...");
        System.out.println("Lavando ...");
        System.out.println("Lavando ...");
        System.out.println("Secar");
    }

    public void tosar() {
        System.out.println();
        System.out.println("Ligar a máquinha.");
        System.out.println("Tosando ...");
        System.out.println("Tosando ...");
        System.out.println("Tosando ...");
        System.out.println("Desligar a máquinha.");
    }

    public void alimentar() {
        System.out.println();
        System.out.println("Pegar a ração");
        System.out.println("Alimentando ...");
        System.out.println("Guardar a ração");
    }

    public void acariciar() {
        System.out.println();
        System.out.println("Colocando a mão sobre o animal!");
        System.out.println("Acariciando ...");
        System.out.println("Acariciando ...");
        System.out.println("Acariciando ...");
        System.out.println("Tirando a mão do animal!");
    }

}
```
```java
public class Gato implements IAnimal {

    public Gato() {
    }

    public void lavar() {
        System.out.println();
        System.out.println("Pegar o shampoo");
        System.out.println("Lavando ...");
        System.out.println("Lavando ...");
        System.out.println("Lavando ...");
        System.out.println("Secar");
    }

    public void tosar() {
        System.out.println();
        System.out.println("Ligar a máquinha.");
        System.out.println("Tosando ...");
        System.out.println("Tosando ...");
        System.out.println("Tosando ...");
        System.out.println("Desligar a máquinha.");
    }

    public void alimentar() {
        System.out.println();
        System.out.println("Pegar a ração para cachorro");
        System.out.println("Alimentando ...");
        System.out.println("Guardar a ração");
    }

    public void acariciar() {
        System.out.println();
        System.out.println("Colocando a mão sobre o animal!");
        System.out.println("Acariciando ...");
        System.out.println("Acariciando ...");
        System.out.println("Acariciando ...");
        System.out.println("Tirando a mão do animal!");
    }

}
```

```java
public class Papagaio implements IAnimal {

    public Papagaio() {
    }

    public void lavar() {
        System.out.println();
        System.out.println("Pegar o shampoo");
        System.out.println("Lavando ...");
        System.out.println("Lavando ...");
        System.out.println("Lavando ...");
        System.out.println("Secar");
    }

    public void alimentar() {
        System.out.println();
        System.out.println("Pegar a ração");
        System.out.println("Alimentando ...");
        System.out.println("Guardar a ração");
    }

    public void acariciar() {
        System.out.println();
        System.out.println("Colocando a mão sobre o animal!");
        System.out.println("Acariciando ...");
        System.out.println("Acariciando ...");
        System.out.println("Acariciando ...");
        System.out.println("Tirando a mão do animal!");
    }

}
```

As entidades foram declaradas, agora podemos fazer o uso delas.

```java
public class Main {

    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.lavar();
        meuCachorro.tosar();
        meuCachorro.alimentar();
        meuCachorro.acariciar();

        Gato meuGato = new Gato();
        meuGato.lavar();
        meuGato.tosar();
        meuGato.alimentar();
        meuGato.acariciar();

        Papagaio meuPapagaio = new Papagaio();
        meuPapagaio.lavar();
        meuPapagaio.alimentar();
        meuPapagaio.acariciar();

    }
}
```

Este código funciona, e vai permitir, de acordo com a implementação do método `main`, que façamos o uso destes objetos `meuCachorro`, `meuGato` e `meuPapagaio` que criamos.

Apesar disso, se formos olhar o nosso código, ele esta bastante repetitivo, não é?

Com um excelente suporte à Programação Orientada a Objetos (POO), iremos modificar o nosso código Java para reaproveitar os métodos semelhantes. Além de diminuir a quantidade de código, esta operação vai conferir maior manutenabilidade para a nossa aplicação, dado que o código, que pode apresentar defeitos (_bugs_) estará declarado em apenas um lugar.

Para tal, irei declarar uma classe abstrata, descrevendo todos os comportamentos que são inerentes ao tipo de animal (cachorro, gato ou papagaio) que o nosso _software_ atende.

```java
public abstract class Animal implements IAnimal {

    public void lavar() {
        System.out.println();
        System.out.println("Pegar o shampoo");
        System.out.println("Lavando ...");
        System.out.println("Lavando ...");
        System.out.println("Lavando ...");
        System.out.println("Secar");
    }

    public void alimentar() {
        System.out.println();
        System.out.println("Pegar a ração");
        System.out.println("Alimentando ...");
        System.out.println("Guardar a ração");
    }

    public void acariciar() {
        System.out.println();
        System.out.println("Colocando a mão sobre o animal!");
        System.out.println("Acariciando ...");
        System.out.println("Acariciando ...");
        System.out.println("Acariciando ...");
        System.out.println("Tirando a mão do animal!");
    }

}
```

Como o código já foi declarado nesta classe abstrata, irei atualizar as classes `Cachorro`, `Gato` e `Papagaio`, removendo os métodos que foram abstraídos.

```java
public class Cachorro extends Animal {

    public Cachorro() {
    }

    public void tosar() {
        System.out.println();
        System.out.println("Ligar a máquinha.");
        System.out.println("Tosando ...");
        System.out.println("Tosando ...");
        System.out.println("Tosando ...");
        System.out.println("Desligar a máquinha.");
    }

}
```
```java
public class Gato extends Animal {

    public Gato() {
    }

    public void tosar() {
        System.out.println();
        System.out.println("Ligar a máquinha.");
        System.out.println("Tosando ...");
        System.out.println("Tosando ...");
        System.out.println("Tosando ...");
        System.out.println("Desligar a máquinha.");
    }

}
```

```java
public class Papagaio extends Animal {

    public Papagaio() {
    }

}
```

Note que o método `Main.main` não precisa ser alterado, dado que apenas a implementação foi alterada, mas o formato de cada um dos animais, não foi alterado, pois estão seguindo a especificação da interface! Execute o novo código e comprove.

Tudo bem, nosso código já diminuiu muito, mas ainda assim, o método `tosar` está sendo declarado duas vezes. Podemos incluir na classe abstrata, um atributo, que indicará se o animal possui pelos ou não. Somente se ele possuir pelos, ele poderá ser tosado.

```java
public abstract class Animal implements IAnimal {

    private boolean hasPelo = false;

    public Animal(boolean hasPelo) {
        this.hasPelo = hasPelo;
    }

    public void lavar() { /* Código ocultado */ }

    public void tosar() {

        if (hasPelo) {
            System.out.println();
            System.out.println("Ligar a máquinha.");
            System.out.println("Tosando ...");
            System.out.println("Tosando ...");
            System.out.println("Tosando ...");
            System.out.println("Desligar a máquinha.");
        }

    }

    public void alimentar() { /* Código ocultado */ }

    public void acariciar() { /* Código ocultado */ }

}
```
Agora temos a definição de como deve ser o construtor de todas as classes que implementam a `Animal`. Portanto, devemos atualizá-las também.

```java
public class Cachorro extends Animal {

    public Cachorro() {
        super(true);
    }
}
```
```java
public class Gato extends Animal {

    public Gato() {
        super(true);
    }

}
```

```java
public class Papagaio extends Animal {

    public Papagaio() {
        super(false);
    }

}
```

Vale ressaltar que o método `Main.main` continua funcionando!

Tudo bem, nosso código está bastante reduzido, mas eu tenho três classes idências, eu preciso disso?

Neste exemplo simples, conseguimos abstrair todas as características do animal. Mas podemos desenvolver algumas outras funcionalidades, para cada animal, ou até mesmo, mudar o comportamento abstrato que fora definido para ele.

```java
public class Cachorro extends Animal {

    public Cachorro() {
        super(true);
    }

}
```
```java
public class Gato extends Animal {

    public Gato() {
        super(true);
    }

    public void brincar() { // Função nova para o gato.
        System.out.println();
        System.out.println("Pegar o rato de brinquedo!");
        System.out.println("Brincando ...");
        System.out.println("Brincando ...");
        System.out.println("Brincando ...");
        System.out.println("Guardar o rato de brinquedo!");
    }
}
```

```java
public class Papagaio extends Animal {

    public Papagaio() {
        super(false);
    }

    @Override
    public void lavar() {
        System.out.println();
        System.out.println("Pegar o pó para limpeza de aves");
        System.out.println("Abanar o papagaio");
    }
}
```

Note que, como temos certeza de que todos os animais são uma implementação da `Animal`, podemos abstrair o nosso código do método `Main.main`.

```java
public class Main {

    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();
        meuAnimal.lavar();
        meuAnimal.tosar();
        meuAnimal.alimentar();
        meuAnimal.acariciar();

        meuAnimal = new Gato();
        meuAnimal.lavar();
        meuAnimal.tosar();
        meuAnimal.alimentar();
        meuAnimal.acariciar();

        meuAnimal = new Papagaio();
        meuAnimal.lavar();
        meuAnimal.alimentar();
        meuAnimal.acariciar();

    }
}
```

Podemos dizer, que todos os animais são do tipo `IAnimal` ou `Animal`.

# Quando isso tudo é utilizado?
Estes conceitos são muito utilizados para simplificar e facilitar a manutenção do código, como citado anteriormente.

Além disso, diversos frameworks do Java fazem o uso de interfaces/abstrações para permitir que o desenvolvedor mude o comportamento do framework.

Imagine que fornecemos a nossa aplicação para a comunidade utilizar. O desenvolvedor que vai personalizar nossa aplicação, para se adequar á sua realidade, pode declarar qualquer animal novo, contanto, que não infrinja a nossa abstração `Animal`.