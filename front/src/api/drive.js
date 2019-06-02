import request from '@/utils/request'

export function addReservation(reservation) {
  console.log(reservation)
  return request({
    url: '/drive/addReservation',
    method: 'get',
    params: reservation
  })
}
/*
export function fetchList(query) {
  console.log(query)
  return request({
    url: '/employee/getList',
    method: 'get',
    params: query
  })
}

export function updateEmployee(employee) {
  console.log(employee)
  return request({
    url: '/employee/update',
    method: 'post',
    params: employee
  })
}
*/
