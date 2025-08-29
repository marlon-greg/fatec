
CREATE TABLE produto(
	id SERIAL PRIMARY KEY NOT NULL, 
	descricao CHARACTER VARYING(250) NOT NULL,
	preco_unitario DOUBLE PRECISION NOT NULL
);

CREATE TABLE cliente(
	id SERIAL PRIMARY KEY NOT NULL, 
	nome CHARACTER VARYING(250) NOT NULL,
	cpf CHARACTER VARYING(30) NOT NULL
);

CREATE TYPE BANDEIRA AS ENUM (
	'Visa',
	'Mastercard',
	'American Express',
	'Elo',
	'Hipercard',
	'Outra'
);

CREATE TABLE pagamento(
	id SERIAL PRIMARY KEY NOT NULL, 
	numero_cartao CHARACTER VARYING(16) NOT NULL,
	bandeira BANDEIRA NOT NULL,
	validade TIMESTAMP WITHOUT TIME ZONE NOT NULL, 
	id_cliente INTEGER NOT NULL, 
	CONSTRAINT fk_pagamento_with_cliente 
	FOREIGN KEY(id_cliente) REFERENCES cliente(id)
);

CREATE TYPE TIPO AS ENUM(
	'Residencial',
	'Comercial'
);

CREATE TYPE ESTADO AS ENUM (
    'AC', 'AL', 'AP', 'AM', 'BA', 'CE', 'DF', 'ES', 'GO', 'MA',
    'MT', 'MS', 'MG', 'PA', 'PB', 'PR', 'PE', 'PI', 'RJ', 'RN',
    'RS', 'RO', 'RR', 'SC', 'SP', 'SE', 'TO'
);

CREATE TABLE endereco(
	id SERIAL PRIMARY KEY NOT NULL, 
	logradouro CHARACTER VARYING(250) NOT NULL,
	numero INTEGER NOT NULL,
	bairro CHARACTER VARYING(200) NOT NULL,
	cidade CHARACTER VARYING(200) NOT NULL,
	estado ESTADO NOT NULL,
	tipo TIPO NOT NULL,
	id_cliente INTEGER NOT NULL,
	CONSTRAINT fk_endereco_with_cliente 
	FOREIGN KEY(id_cliente) REFERENCES cliente(id)
);

CREATE TABLE pedido(
    id SERIAL PRIMARY KEY NOT NULL, 
    data_hora TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    id_cliente INTEGER NOT NULL,
    id_pagamento INTEGER NOT NULL,
	id_endereco INTEGER NOT NULL,
	parcelas INTEGER NOT NULL,
    CONSTRAINT fk_pedido_with_cliente 
    FOREIGN KEY(id_cliente) REFERENCES cliente(id),
	
    CONSTRAINT fk_pedido_with_pagamento 
    FOREIGN KEY(id_pagamento) REFERENCES pagamento(id),
	
	CONSTRAINT fk_pedido_with_endereco 
    FOREIGN KEY(id_endereco) REFERENCES endereco(id)	
);

CREATE TABLE item_pedido(
    id SERIAL PRIMARY KEY NOT NULL, 
    id_pedido INTEGER NOT NULL,
    id_produto INTEGER NOT NULL,
    desconto DOUBLE PRECISION NOT NULL,
    quantidade INTEGER NOT NULL,
    CONSTRAINT fk_item_pedido_with_pedido 
    FOREIGN KEY(id_pedido) REFERENCES pedido(id),
    
    CONSTRAINT fk_item_pedido_with_produto 
    FOREIGN KEY(id_produto) REFERENCES produto(id)
);

/*Aula 4 - 28-08-2025 */

INSERT INTO produto (descricao, preco_unitario) VALUES
('Segredos de quinta turma', 40);

SELECT * FROM cliente;

ALTER TABLE pagamento ADD COLUMN cvv VARCHAR(4);