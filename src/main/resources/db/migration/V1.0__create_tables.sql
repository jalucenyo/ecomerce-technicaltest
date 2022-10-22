
create table prices
(
    price_list  bigint not null,
    brand_id    bigint,
    curr        varchar(15),
    end_date    timestamp,
    price       numeric(19, 2),
    priority    integer,
    product_id  bigint,
    start_date  timestamp,

    primary key (price_list)
)