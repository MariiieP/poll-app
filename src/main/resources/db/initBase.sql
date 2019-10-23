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

alter table registration
  owner to dahj3mrjlt8ttd;

create table language
(
  id_language bigint not null
    constraint pk_language
    primary key,
  language    varchar
);

alter table language
  owner to dahj3mrjlt8ttd;

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

alter table question
  owner to dahj3mrjlt8ttd;

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

alter table answer
  owner to dahj3mrjlt8ttd;

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

alter table test_result
  owner to dahj3mrjlt8ttd;

create index fki_fk_poll_test
  on test_result (id);

create index fki_fk_registration_test
  on test_result (id_registration);


