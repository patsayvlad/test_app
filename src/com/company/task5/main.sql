-- 1
select *
from myShop.Products
where productname LIKE 'C%';

-- 2
select *
from myShop.Products
where price = (select MIN(price) from myShop.Products);

-- 3
SELECT SUM(price)
from myShop.Products,
     myShop.Supplier
where Products.supplierid = Supplier.supplierid
  and myShop.Supplier.country = 'USA';

-- 4
select *
from myShop.Supplier
where supplierid IN (select supplierid
                     from myShop.Products
                     where categoryid IN (select categoryid from myShop.categories where categoryname = 'Condiments'));


-- 5
insert into myShop.Supplier (suppliername, city, country)
values ('Norske Meierier', 'Lviv', 'Ukraine');
insert into myShop.categories(categoryname, description) values
('Beverages', '.....');
insert into myShop.Products(productname, supplierid, categoryid, price) values
('Green tea', (select MAX(supplierid) from myShop.Supplier), (select MAX(categoryid) from myShop.categories), 10);