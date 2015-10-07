create table product (
  id                        bigint not null,
  title                     varchar(255),
  price                     decimal(10),
  quantity                  integer,
  constraint pk_product primary key (id))
;

create table purchace (
  id                        bigint not null,
  product_id                bigint,
  user_id                   bigint,
  constraint pk_purchace primary key (id))
;

create table user (
  id                        bigint not null,
  full_name                 varchar(255),
  email                     varchar(255),
  balance                   decimal(10),
  constraint uq_user_email unique (email),
  constraint pk_user primary key (id))
;

create sequence product_seq;

create sequence purchace_seq;

create sequence user_seq;

alter table purchace add constraint fk_purchace_product_1 foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_purchace_product_1 on purchace (product_id);
alter table purchace add constraint fk_purchace_user_2 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_purchace_user_2 on purchace (user_id);


