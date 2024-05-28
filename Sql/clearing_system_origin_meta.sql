create table if not exists clearing_system_origin_meta(
country_code varchar(255) not null,
routing_meta varchar(255) null,
origin varchar(255) null,
template varchar(255) null,
model_partition_type char null,
routing_system Integer null,
clearing_routing_type char null,
clearing_routing_system varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint clearing_system_origin_meta_pk primary key(country_code));