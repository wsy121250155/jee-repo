create table students(
	sid int, sname varchar(20), spw varchar(20),
	primary key(sid)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table courses(
	cid int, cname varchar(20), 
	primary key(cid)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table courseRecords(
	id int, cr_sid int, cr_cid int, score int,
	foreign key(cr_sid) references students(sid),
	foreign key(cr_cid) references courses(cid),
	primary key(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;