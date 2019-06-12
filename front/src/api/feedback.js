import request from '@/utils/request'

export function addFeedback(activity) {
  console.log(activity)
  return request({
    url: '/feedback/addFeedback',
    method: 'get',
    params: activity
  })
}
