create table donation(
    donation_id int primary key ,
    donor varchar(150),
    email varchar(150),
    payment_type payment_type not null,
    reference varchar(150),
    amount float not null ,
    payment_date TIMESTAMP
);