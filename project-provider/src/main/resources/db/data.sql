DROP TABLE IF EXISTS product;

CREATE TABLE IF NOT EXISTS product(id varchar(32) unsigned not null primary key,name varchar(32),price int,tenant_id varchar(32),created_by varchar(32),updated_by varchar(32),created_at date,updated_at date, dr int(1));

INSERT INTO product(id, name, price, tenant_id, created_by, updated_by, created_at, updated_at, dr) VALUES ('1', '苹果', 20, null, null, null, null, null, 0),
('2', '梨', 10, null, null ,null, null, null, 0),
('3', '桃子', 123, null, null ,null, null, null, 0),
('4', '香蕉', 11, null, null ,null, null, null, 0),
('5', '猕猴桃', 50, null, null ,null, null, null, 0),
('6', '桔子', 33, null, null ,null, null, null, 0),
('7', '菠萝', 90, null, null ,null, null, null, 0),
('8', '芒果', 766, null, null ,null, null, null, 0),
('9', '红枣', 29, null, null ,null, null, null, 0),
('10', '榴莲', 990, null, null ,null, null, null, 0),
('11', '柚子', 291, null, null ,null, null, null, 0),
('12', '小番茄', 200, null, null ,null, null, null, 0);
CREATE TABLE IF NOT EXISTS appbricks_user(
    shop_id varchar(255)  ,    job varchar(255)  ,    tenant_code varchar(255)  ,    work_status varchar(255)  ,    dr tinyint  ,    id varcahr(32) not null primary key,    username varchar(255) not null ,    usernumber varchar(255)  ,    password varchar(255)  ,    token varchar(255)  ,    fullname varchar(255)  ,    fullname_en varchar(255)  ,    email varchar(255)  ,    gender varchar(255)  ,    tel varchar(255)  ,    work_tel varchar(255)  ,    update_time datetime  ,    update_person varchar(255)  ,    create_time datetime  ,    create_person varchar(255)  ,    guid varchar(255)  ,    current_project_no varchar(255)  ,    project_no varchar(255) not null ,    status varchar(255)  ,    type varchar(255)  ,    avatar varchar(255)  );
CREATE TABLE IF NOT EXISTS appbricks_department(
    id varcahr(32) not null primary key,    name varchar(255)  ,    name_en varchar(255)  ,    code varchar(255)  ,    parent_id varchar(255)  ,    update_time datetime  ,    create_time datetime  ,    project_no varchar(255) not null ,    shop_id varchar(255)  ,    is_shop_root int   ,    tenant_code varchar(255)  ,    dr tinyint  );
CREATE TABLE IF NOT EXISTS appbricks_project(
    id int  not null primary key,    create_person_id varchar(255)  ,    create_time datetime  ,    name varchar(255)  ,    project_no varchar(255) not null ,    update_person_id varchar(255)  ,    update_time datetime  ,    system_project varchar(255) not null ,    user_source varchar(255) not null ,    tenant_code varchar(255) not null ,    status varchar(255)  ,    attribute1 varchar(255)  ,    dr tinyint  );
