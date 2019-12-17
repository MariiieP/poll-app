create table registration
(
  id_registration bigint not null
    constraint pk_registration
    primary key,
  surname         varchar,
  name            varchar,
  patronymic      varchar,
  university      varchar,
  course          bigint,
  "group"         bigint
);

insert into registration values (1,'Ivanov','Ivan','Ivanovich','VSU',2,9);

alter table registration;

create table language
(
  id_language bigint not null
    constraint pk_language
    primary key,
  language    varchar
);

insert into language values(1,'java');

alter table language;

create table poll
(
  id          bigint not null
    constraint pk_poll
    primary key,
  option      integer,
  id_language bigint not null
    constraint fk_language_poll
    references language
);

insert into poll values (1,1,1);

alter table poll
  owner to dahj3mrjlt8ttd;

create index fki_fk
  on poll (id_language);

create table question
(
  id_question bigint not null
    constraint "pk_id_ question"
    primary key,
  question    varchar,
  id          bigint not null
    constraint fk_poll_question
    references poll
);

insert into question values (1,'what is java?', 1);
insert into question values (2,'What is the default value of int variable?', 1);
insert into question values (3,'What is the default value of Object variable?', 1);
insert into question values (4,'Which operator is considered to be with highest precedence?', 1);
insert into question values (5,'What is an applet?', 1);
insert into question values (6,'What is inheritance?', 1);
insert into question values (7,'What are Wrapper classes?', 1);
insert into question values (8,'What is the default value of Long variable?', 1);

alter table question;

create index fki_fk_poll_question
  on question (id);

create table answer
(
  id_answer    bigint not null
    constraint pk_answer
    primary key,
  id_question  bigint not null
    constraint fk_question_answer
    references question,
  id           bigint not null
    constraint fk_poll_answer
    references poll,
  answer       varchar,
  right_answer varchar,
  mark         bigint
);

insert into answer values (1,1, 1,'java is cool language','java is cool language',2);
delete from answer where id_answer=1;
insert into answer values (1,1, 1,'','language',2);

insert into answer values (2,2, 1,'','32-bit',2);
insert into answer values (3,3, 1,'','null',2);
insert into answer values (4,4, 1,'','+',2);
insert into answer values (5,5, 1,'','Internet-based program',2);
insert into answer values (6,6, 1,'','class',2);
insert into answer values (7,7, 1,'','class',2);
insert into answer values (8,8, 1,'','0',2);

alter table answer;

create index fki_fk_poll_answer
  on answer (id);

create index fki_fk_question_answer
  on answer (id_question);

create table test_result
(
  id_test_result          bigint not null
    constraint pk_test_result
    primary key,
  id                      bigint not null
    constraint fk_poll_test
    references poll,
  id_registration         bigint not null
    constraint fk_registration_test
    references registration,
  correct_answers         bigint,
  sum_mark                bigint,
  percent_correct_answers bigint
);

insert into test_result values (1,1, 1,1,2,100);


alter table test_result;

create index fki_fk_poll_test
  on test_result (id);

create index fki_fk_registration_test
  on test_result (id_registration);


