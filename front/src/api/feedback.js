import request from '@/utils/request'

export function addFeedback(activity) {
  console.log(activity)
  return request({
    url: '/feedback/addFeedback',
    method: 'get',
    params: activity
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
