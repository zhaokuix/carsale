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
    url: '/feedback/getList',
    method: 'get',
    params: query
  })
}

export function updateFeedback(feedback) {
  console.log(feedback)
  return request({
    url: '/feedback/update',
    method: 'post',
    params: feedback
  })
}
