<template>
  <div class="app-container">
    <el-header>
      <h3 style="font-family: Microsoft YaHei">添加预约信息</h3>
      <hr style="border: 0.5px solid #dcdfe6">
    </el-header>
    <el-form ref="ruleForm" :model="ruleForm" :rules="rules" label-width="100px" class="demo-ruleForm" style="width: 400px; margin-left:50px;">
      <el-form-item label="姓名" prop="name">
        <el-input v-model="ruleForm.name"/>
      </el-form-item>
      <el-form-item label="联系电话" prop="phone">
        <el-input v-model="ruleForm.phone"/>
      </el-form-item>
      <el-form-item label="身份证号" prop="idCard">
        <el-input v-model="ruleForm.idCard"/>
      </el-form-item>
      <el-form-item label="性别" prop="gender">
        <el-radio-group v-model="ruleForm.gender">
          <el-radio label="男"/>
          <el-radio label="女"/>
        </el-radio-group>
      </el-form-item>
      <!--<el-form-item label="年龄" prop="age">-->
      <!--<el-input v-model.number="ruleForm.age"/>-->
      <!--</el-form-item>-->
      <el-form-item label="预约日期" prop="reservationDate">
        <el-date-picker v-model="ruleForm.reservationDate" type="date" value-format="yyyy-MM-dd" placeholder="选择日期" style="width: 100%;"/>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm('ruleForm')">添加</el-button>
        <el-button @click="resetForm('ruleForm')">重置</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
import { validateIdCard } from '@/utils/validate'
import { addReservation } from '@/api/drive'

export default {
  data() {
    return {
      ruleForm: {
        name: '',
        phone: '',
        idCard: '',
        gender: undefined,
        reservationDate: undefined
      },
      rules: {
        name: [
          { required: true, message: '请输入客户姓名', trigger: 'blur' }
        ],
        phone: [
          { required: true, message: '请输入客户联系电话', trigger: 'blur' }
        ],
        idCard: [
          { required: true, validator: validateIdCard, trigger: 'blur' }
        ],
        gender: [
          { required: true, message: '请选择客户性别', trigger: 'change' }
        ],
        reservationDate: [
          { required: true, message: '请选择预约日期', trigger: 'change' }
        ]
      }
    }
  },
  methods: {
    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          addReservation(this.ruleForm).then(response => {
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
