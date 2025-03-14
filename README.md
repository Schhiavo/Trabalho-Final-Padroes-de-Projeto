# Trabalho Final
**Padrões Utilizados:**
* Builder
* Bridge
* Abstract Factory
* Factory Method
* Strategy
* State
* Singleton
* Visitor
* Observer
#
**Contextualizando a aplicação**

A aplicação escolhida gira em torno de um sistema de atendimento médico. Cobrindo várias áreas pertinentes para a realização desses atendimento. Tais como: Formulários de atendimentos, prontuários, comunicação, pagamentos etc...

# 

**Onde foi usado cada padrão?**
* **Builder** e **Bridge**: Utilizados no atendimento. O **Builder** é responsável por criar um atendimento detalhado com suas composições definidas. Já o **Bridge** é responsável por abstrair o atendimento de seus tipos.
* **Abstract Factory**: Utilizado na criação e emissão de registros dos pacientes.
* **Visitor**: Utilizado na geração de relatórios de atendimento dos médicos para exportação dos dados em **JSON**, **XML** e **THRIFT**.
* **State**, **Singleton** e **Observer**: Utilizados em conjunto nas atualizações dos estados de um prontuário.
* **Strategy**: Utilizado em um pequeno sistema de pagamentos
* **Factory Method**:  Utilizado na criação de notificações 
