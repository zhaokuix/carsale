import request from '@/utils/request'

export function addActivity(activity) {
  console.log(activity)
  return request({
    url: '/market/addActivity',
    method: 'get',
    params: activity
  })
}

export function fetchList(query) {
  console.log(query)
  return request({
    url: '/market/getList',
    method: 'get',
    params: query
  })
}

export function updateActivity(activity) {
  console.log(activity)
  return request({
    url: '/market/update',
    method: 'post',
    params: activity
  })
}
