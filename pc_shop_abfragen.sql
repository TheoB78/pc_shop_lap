use pc_shop;

-- Welches Modell wurde am häufigsten bestellt
select pc.pc_name, Sum(quantity) as total_items_ordered from shipment_item
join pc on pc.id=shipment_item.pc_id
group by shipment_item.pc_id
order by Sum(quantity) desc;


-- Gesamter Umsatz je modell
select pc.pc_name, Sum(coalesce(pc.base_price, 0)+coalesce(addition.price, 0)) from shipment_item
join pc on pc.id=shipment_item.pc_id
left join shipment_item2addition on shipment_item2addition.shipment_item_id=shipment_item.id
left join addition on addition.id=shipment_item2addition.addition_id
group by pc.id
order by Sum(pc.base_price+addition.price) desc;

-- Anzahl modelle je reseller
select reseller.reseller_name, sum(shipment_item.quantity) from shipment_item
left join shipment on shipment_item.shipment_id=shipment.id
join reseller on reseller.id=shipment.reseller_id
group by reseller.id;


-- bestellungen mit mehr als 3 computern
select count(*) as shipment_count
from (
    select shipment.id
    from shipment
    join shipment_item on shipment_item.shipment_id = shipment.id
    group by shipment.id
    having SUM(shipment_item.quantity) > 3
) as subquery;

-- reseller mit höchstem umsatz reseller.reseller_name
select reseller.reseller_name, Sum(coalesce(pc.base_price, 0)+coalesce(addition.price, 0)) from shipment_item
join pc on pc.id=shipment_item.pc_id
left join shipment_item2addition on shipment_item2addition.shipment_item_id=shipment_item.id
left join addition on addition.id=shipment_item2addition.addition_id
join shipment on shipment.id = shipment_item.shipment_id
join reseller on reseller.id=shipment.reseller_id
group by reseller.id
order by Sum(coalesce(pc.base_price, 0)+coalesce(addition.price, 0)) desc
limit 1;