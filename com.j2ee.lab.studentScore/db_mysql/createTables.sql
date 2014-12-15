create table students(
	sid int, sname varchar(20), spw varchar(20),
	primary key(sid)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table courses(
	cid int, cname varchar(20), 
	primary key(cid)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table courseRecords(
	sid int, cid int, score int,
	foreign key(sid) references students(sid),
	foreign key(cid) references courses(cid),
	primary key(sid, cid)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;