import Customer_account from '@/models/Customer_account'
import axios from 'axios'

export default class Customer_accountService {
  baseHref = 'http://localhost:8080'

  async addCustomerAccount(data: any) {
    try {
      await axios
        .post(`${this.baseHref}/addCustomerAccount`, data)
        .then((response) => {
          console.log('successfully saved')
        })
        .catch((error) => {
          alert(`Error message: ${error.message}\nCode: ${error.code}`)
        })
    } catch (error: any) {
      alert(`Error message: ${error.message}\nCode: ${error.code}`)
    }
  }
}
