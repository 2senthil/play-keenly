# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table skill (
  id                        varchar(255) not null,
  name                      varchar(255),
  constraint pk_skill primary key (id))
;

create sequence skill_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists skill;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists skill_seq;

