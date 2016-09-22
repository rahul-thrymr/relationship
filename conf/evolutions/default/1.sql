# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table detail (
  detail_pk                     bigserial not null,
  income                        bigint,
  city                          varchar(255),
  constraint pk_detail primary key (detail_pk)
);

create table person (
  p_id                          bigserial not null,
  name                          varchar(255),
  lname                         varchar(255),
  password                      varchar(255),
  detail_fk                     bigint,
  constraint uq_person_detail_fk unique (detail_fk),
  constraint pk_person primary key (p_id)
);

alter table person add constraint fk_person_detail_fk foreign key (detail_fk) references detail (detail_pk) on delete restrict on update restrict;


# --- !Downs

alter table if exists person drop constraint if exists fk_person_detail_fk;

drop table if exists detail cascade;

drop table if exists person cascade;

