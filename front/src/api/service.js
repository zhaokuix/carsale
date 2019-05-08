import request from '@/utils/request'

export function addService(activity) {
  console.log(activity)
  return request({
    url: '/service/addService',
    method: 'post',
    params: activity
  })
}
