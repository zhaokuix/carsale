import request from '@/utils/request'

export function addReservation(reservation) {
  console.log(reservation)
  return request({
    url: '/drive/addReservation',
    method: 'get',
    params: reservation
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

export function updateReservation(reservation) {
  console.log(reservation)
  return request({
    url: '/drive/update',
    method: 'post',
    params: reservation
  })
}

