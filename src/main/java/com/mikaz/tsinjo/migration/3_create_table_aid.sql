create table aid(
                    aid_id int primary key ,
                    beneficiary varchar(150),
                    email varchar(150),
                    amount float not null ,
                    accident_description text not null
);