create table produto(
    id bigint not null auto_increment primary key,
    marca varchar(100) not null,
    peca varchar(100) not null,
    tamanho varchar(2) not null,
    cor varchar(50),
    qtde int not null,
    valor decimal(10,2) not null
)