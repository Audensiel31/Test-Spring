create table if not exists eleve (id int8, nom varchar(30) not null, prenom varchar(30) not null, primary key(id));
create table if not exists  note(id int8, matiere varchar(30) not null, note numeric (4,2) not null, eleve_id int8 not null,
constraint fk_eleve foreign key  (eleve_id) references eleve(id));
