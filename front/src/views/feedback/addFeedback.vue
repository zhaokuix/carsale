<template>
  <div class="app-container">
    <el-header>
      <h3 style="font-family: Microsoft YaHei">添加反馈信息</h3>
      <hr style="border: 0.5px solid #dcdfe6">
    </el-header>
    <el-form ref="ruleForm" :model="ruleForm" :rules="rules" label-width="100px" class="demo-ruleForm" style="width: 500px; margin-left:50px;">
      <el-form-item label="客户姓名" prop="name">
        <el-input v-model="ruleForm.name"/>
      </el-form-item>
      <el-form-item label="联系电话" prop="phone">
        <el-input v-model="ruleForm.phone"/>
      </el-form-item>
      <el-form-item label="反馈时间" prop="feedbackDate">
        <el-date-picker v-model="ruleForm.feedbackDate" type="date" value-format="yyyy-MM-dd" placeholder="选择日期" style="width: 100%;"/>
      </el-form-item>
      <el-form-item label="反馈内容" prop="feedback">
        <el-input v-model="ruleForm.feedback" :autosize="{ minRows: 2, maxRows: 10}" type="textarea" placeholder="输入反馈内容" />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm('ruleForm')">添加</el-button>
        <el-button @click="resetForm('ruleForm')">重置</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
// import { validateIdCard } from '@/utils/validate'
import { addFeedback } from '@/api/feedback'

export default {
  data() {
    return {
      ruleForm: {
        name: '',
        phone: '',
        feedbackDate: undefined,
        feedback: ''
      },
      rules: {
        name: [
          { required: true, message: '请输入客户姓名', trigger: 'blur' }
        ],
        phone: [
          { required: true, message: '请输入客户联系电话', trigger: 'blur' }
        ],
        feedbackDate: [
          { required: true, message: '请输入反馈时间', trigger: 'blur' }
        ],
        feedback: [
          { required: true, message: '请输入反馈内容', trigger: 'blur' }
        ]
      }
    }
  },
  methods: {
    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          addFeedback(this.ruleForm).then(response => {
            if (response.data.code === 20000) {
              this.$notify({
                title: '成功',
                message: '添加成功',
                type: 'success',
                duration: 2000
              })
            } else {
              this.$notify({
                title: '错误',
                message: response.data.message,
                type: 'error',
                duration: 2000
              })
            }
            this.resetForm(formName)
          })
        } else {
          console.log('error submit!!')
          return false
        }
      })
    },
    resetForm(formName) {
      this.$refs[formName].resetFields()
    }
  }
}
</script>
