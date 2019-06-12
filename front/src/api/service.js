import request from '@/utils/request'

export function addService(service) {
  console.log(service)
  return request({
    url: '/service/addService',
    method: 'get',
    params: service
  })
}
