# ClinicFlow

Sistema de Gestão de Clínica desenvolvido em Java (console), criado para praticar
e demonstrar os principais conceitos de Programação Orientada a Objetos (POO).

Este projeto simula as operações principais de uma pequena clínica médica: gestão
de pacientes, médicos e consultas, com foco em código limpo, bem estruturado e
idiomático em Java.

## 🎯 Objetivo

Este é um projeto de estudo pessoal, construído para reforçar e demonstrar:
- Fundamentos de Programação Orientada a Objetos (abstração, encapsulamento,
  herança, polimorfismo)
- Tratamento de exceções em Java, com exceções customizadas de domínio
- Boas práticas de código limpo e organização em pacotes
- Fluxo de trabalho com Git através de commits incrementais e significativos

## 🛠 Tecnologias

- **Linguagem:** Java 25 (LTS)
- **IDE:** IntelliJ IDEA
- **Build:** Sem dependências externas (Java puro, apenas biblioteca padrão)
- **Armazenamento de dados:** Em memória (Collections do Java) — sem banco de dados

## 📁 Estrutura do Projeto

~~~
com.clinicflow
├── model/          → Entidades de domínio (Person, Patient, Doctor, Appointment...)
├── enums/          → Specialty, AppointmentStatus, Gender
├── exception/      → Exceções customizadas (checked e unchecked)
├── service/        → Regras de negócio (agendamento, cadastro)
├── repository/     → Camada de acesso a dados genérica, em memória
├── util/           → Validadores e classes utilitárias
└── Main.java       → Ponto de entrada (menu no console)
~~~


## ✅ Progresso Atual

- [x] Setup do projeto e repositório Git
- [x] Enums: `Specialty`, `AppointmentStatus`, `Gender`
- [x] Exceções customizadas: `InvalidPersonDataException`, `AppointmentConflictException`,
  `EntityNotFoundException`
- [x] Classe abstrata `Person` com validação (CPF, e-mail, data de nascimento)
- [x] Subclasses `Patient` e `Doctor` (herança + polimorfismo via
  `getSummary()` e `getRole()`)
- [ ] Classes `Appointment` e `MedicalRecord`
- [ ] Interface genérica `Repository<T>` + implementação em memória
- [ ] `AppointmentService` com agendamento e validação de conflitos
- [ ] Menu no console (`Main.java`)
- [ ] Testes unitários

## 🧠 Conceitos de POO Demonstrados

| Conceito | Onde aparece |
|---|---|
| Abstração | Classe abstrata `Person` |
| Herança | `Patient` e `Doctor` estendem `Person` |
| Polimorfismo | `getSummary()` / `getRole()` sobrescritos em cada subclasse |
| Encapsulamento | Atributos privados com setters validados |
| Exceções customizadas | Exceções checked/unchecked específicas do domínio |
| Enums com comportamento | Enum `Specialty` carregando um nome de exibição |

## 🚀 Como Executar

```bash
git clone https://github.com/VitorJunior60/ClinicFlow.git
cd ClinicFlow
# Abra no IntelliJ IDEA e execute Main.java
```

## 📌 Status

🚧 **Em desenvolvimento** — projeto de estudo sendo construído ativamente.

---

*Este projeto faz parte do meu portfólio enquanto me preparo para vagas de estágio.*