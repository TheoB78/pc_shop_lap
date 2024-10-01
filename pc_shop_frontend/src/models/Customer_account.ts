export default class Customer_account {
  id: Number
  password: String
  email: String

  constructor(data: any) {
    this.id = data.id
    this.password = data.password
    this.email = data.email
  }
}
