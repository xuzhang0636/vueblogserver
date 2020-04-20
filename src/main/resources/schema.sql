create database robert_blog;
use robert_blog;
create table article(
    id int primary key auto_increment,
    title varchar(50) not null ,
    markdown_content text not null,
    html_content text not null
)