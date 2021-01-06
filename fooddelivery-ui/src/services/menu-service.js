import axios from 'axios'

const API_URL = 'http://localhost:8080/menu'

class MenuService {
  getAll () {
    return axios.get(API_URL + '/all')
  }

  getProductsPage (filters, currentPage, perPage) {
    return axios.get(API_URL + '/product/search/page',
      {
        params:
          {
            name: filters.name,
            currentPage: currentPage,
            perPage: perPage
          }
      }
    )
  }

  getProductsByid (id, num) {
    return axios.get(API_URL + '/product/search/id',
      {
        params:
          {
            id: id,
            num: 1
          }
      })
  }
}

export default new MenuService()
