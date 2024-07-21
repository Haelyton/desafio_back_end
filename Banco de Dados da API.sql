CREATE TABLE conta_bancaria(
    id SERIAL PRIMARY KEY,
    documento VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) UNIQUE NOT NULL,
    data_nascimento DATE NOT NULL,
    senha TEXT NOT NULL,
    saldo NUMERIC(18, 3) NOT NULL DEFAULT 0.0
);

CREATE TABLE transferencia (
    id SERIAL PRIMARY KEY,
    conta_emitente INTEGER NOT NULL,
    conta_recebimento INTEGER NOT NULL,
    valor NUMERIC(18, 3),
    FOREIGN KEY (conta_emitente) REFERENCES conta_bancaria(id),
    FOREIGN KEY (conta_recebimento) REFERENCES conta_bancaria(id)
);