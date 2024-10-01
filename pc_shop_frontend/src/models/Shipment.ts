import Reseller from './Reseller'
import Shipment_item from './Shipment_item'

export default class Shipment {
  id: Number
  date: Date
  reseller: Reseller
  shipment_items: any[]

  constructor(data: any) {
    debugger
    this.id = data.id
    this.date = data.date
    this.reseller = data.reseller
    this.shipment_items = []
    for (let shipment_item of data.shipment_items)
      this.shipment_items.push(new Shipment_item(shipment_item))
  }
}
