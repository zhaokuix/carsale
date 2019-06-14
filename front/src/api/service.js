import request from '@/utils/request'

export function addService(service) {
  console.log(service)
  return request({
    url: '/service/addService',
    method: 'get',
    params: service
  })
}

export function fetchList(query) {
  console.log(query)
  return request({
    url: '/drive/getList',
    method: 'get',
    params: query
  })
}

export function updateReservation(employee) {
  console.log(employee)
  return request({
    url: '/drive/update',
    method: 'post',
    params: employee
  })
}
