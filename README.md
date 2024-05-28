## 📝 Sobre

## 🪙 ConversorDeMoedas

Este programa Java permite aos usuários converter valores entre diferentes moedas, utilizando a API ExchangeRate-API para obter as taxas de câmbio em tempo real.

- **Funcionalidade:** Solicita ao usuário um valor e as moedas de origem e destino, realiza a conversão utilizando a API ExchangeRate-API e salva o resultado em um arquivo JSON.
- **Recursos Utilizados:** Utiliza `JOptionPane` para entrada do usuário e exibição de mensagens, `HttpClient` para fazer a requisição HTTP à API ExchangeRate-API e `Gson` para processar a resposta JSON.
- **Como Usar:** Execute o programa, insira seu nome e escolha a conversão desejada no menu. Insira os valores solicitados para realizar a conversão.

---

## 🔍 ConversorDeMoedas

### Classe Principal: `Main`

Esta classe lida com a interface gráfica e a lógica do menu de conversão.

#### Descrição:
- **JOptionPane:** Utilizado para criar a interface gráfica que solicita ao usuário que insira seu nome e escolha as opções do menu.
- **TextMenu:** Fornece o texto do menu baseado no nome do usuário.
- **Conversor:** Realiza a conversão das moedas e gera o arquivo JSON com o resultado.

### Classe `Conversor`

Esta classe lida com a lógica de conversão e a comunicação com a API ExchangeRate-API.

#### Descrição:
- **HttpClient e HttpRequest:** Utilizados para fazer uma requisição HTTP ao serviço ExchangeRate-API.
- **Gson:** Utilizado para converter a resposta JSON da API ExchangeRate-API em um objeto Java (`Moeda`).
- **FileWriter:** Utilizado para escrever o JSON em um arquivo chamado `resultadoConversao.json`.

#### Métodos:
- **converter:** Método que realiza a conversão de moedas chamando a API.
- **salvarResultadoComoJson:** Método que salva o resultado da conversão em um arquivo JSON.

### Classe `Moeda`

Esta classe representa o resultado da conversão de moeda retornado pela API.

#### Atributos:
- **base_code:** Código da moeda de origem.
- **target_code:** Código da moeda de destino.
- **conversion_rate:** Taxa de conversão.
- **conversion_result:** Resultado da conversão.
- **amount:** Quantidade convertida.

#### Métodos:
- **getters:** Métodos para acessar os atributos do resultado da conversão.
- **setAmount:** Método para definir a quantidade convertida.

### Classe `TextMenu`

Esta classe fornece o texto do menu de opções baseado no nome do usuário.

#### Métodos:
- **setMenuText:** Método que define o texto do menu baseado no nome do usuário.
- **getMenuText:** Método que retorna o texto do menu.

---

## 📸 Captura de Tela

### ConversorDeMoedas 🪙
![image](https://github.com/franciscgg/ConversorMoedas/assets/113110382/3515342b-be35-4971-81e7-92ec97cca4ea)
![image](https://github.com/franciscgg/ConversorMoedas/assets/113110382/d97579ea-4407-4689-a865-5523ad35eb02)
![image](https://github.com/franciscgg/ConversorMoedas/assets/113110382/01050f3a-5dd5-4b7a-9b2c-3aae5ac4e243)
![image](https://github.com/franciscgg/ConversorMoedas/assets/113110382/44f271ad-116d-4024-8e76-80b8c08d4d1a)
![image](https://github.com/franciscgg/ConversorMoedas/assets/113110382/6573a3bf-d351-4573-bf5f-1b97fb706731)
![image](https://github.com/franciscgg/ConversorMoedas/assets/113110382/f6323b99-74f9-4676-b25e-eadcce56c20f)
![image](https://github.com/franciscgg/ConversorMoedas/assets/113110382/b28c3bec-1598-46c2-9034-ab7c2ff4dc91)




---
## 🪙 Badge de Conversor de Moedas

<div align="center">
  <img src="https://github.com/franciscgg/ConversorMoedas/assets/113110382/bcd63aac-d812-4359-9a5e-6239fe063fa8" alt="Badge-Conversor" width="150">
</div>




## 🚀 Tecnologias

<div>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="Java" title="Java" width="40" height="40"/>
</div>

---

## 💼 Linkedin

### link: [Francisco Hélio](https://www.linkedin.com/in/francisco-helio/)
