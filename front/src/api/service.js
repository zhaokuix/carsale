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
    url: '/service/getList',
    method: 'get',
    params: query
  })
}

export function updateService(service) {
  console.log(service)
  return request({
    url: '/service/update',
    method: 'post',
    params: service
  })
}
