/*observação importante!!
caso a variavel double não funcione use o decimal*/
drop database if exists SistemaBuffet; 
create database SistemaBuffet;
use SistemaBuffet;

create table usuario(
id_usuario       int                auto_increment      primary key,
nome_usuario           varchar(50),
email_usuario          varchar(50),
senha          		   varchar(50)
);

create table cliente (
id_cliente             			int               auto_increment  primary key,
nome_cliente           			varchar(80)       not null,
data_de_nasc                    varchar(60)       not null,
cpf_cliente          			varchar(60),
rg_cliente               	    varchar(60),
celular_cliente   			    varchar(60),
email_cliente                   varchar(60)       not null      
);

create table fornecedor (
id_fornecdor                   int             auto_increment  primary key,
nome_fornecedor            	   varchar(80)     not null,
cnpj                           varchar(60),
email_fornecedor               varchar(80)     not null,
celular_fornecedor             varchar(80)     not null
);

create table produto (
id_produto                    int              auto_increment  primary key,
nome_produto                  varchar(60),
tipo                          varchar(60),
qtd_estoque                   int,
valor_produto                 double,
ultimo_pagamento              double
);

create table funcionario(
id_funcionario               int                auto_increment   primary key,
nome_funcionario             varchar(80)        not null,
funcao                       varchar(30)        not null,
salario                      double,
quantidade                   int
);

create table orcamento(
id_orcamento       int                auto_increment      primary key,
tipo               varchar(80)       not null,
convidados   	   int       not null,
data_evento        varchar(80),
horario_evento     varchar(80),
endereco           varchar(90),
descricao          varchar(150),
duracao            int,
valor_servico      double,
valor_entrada      double,
valor_final        double,
deconto            double

);

create table lacamento(
id_lancamento      int,
id_orcamento       int primary key  auto_increment,
parcela            int,
abertura           varchar(80),
vencimento         varchar(80),
tipo_lancamento    varchar(80),
status_lancamento  varchar(80)
);

create table tarefa(
id_tarefa       int                auto_increment      primary key,
descricao_tarefa  varchar(150),
data_tarefa       varchar(80)
);

/*tabela feita para relação de muitos para muitos*/
create table produto_fornecedor (
	pf_produto_id				    int				references produtos    (id_produto),
	pf_fornecedor_id				int				references fornecedores(id_funcionario),
	
	primary key (pf_produto_id, pf_fornecedor_id)
);

insert into usuario values(null,"fulano usuario","fulano@gmail.com","1234");
select * from usuario;
