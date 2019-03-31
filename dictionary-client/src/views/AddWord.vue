<template>
  <div>
    <el-row type="flex" justify="center">
      <el-col :span="18">
        <el-card class="box-card box-card-wrapper">
          <el-select
            v-model="requestForm.fieldId"
            @change="searchWord">
            <el-option
              v-for="field in fields"
              :key="field.fieldId"
              :label="field.fieldName"
              :value="field.fieldId">
          </el-option>
          </el-select>
        </el-card>
      </el-col>
    </el-row>
    <el-row type="flex" justify="center">
      <el-col :span="18">
        <el-card class="box-card box-card-wrapper contents-box">

        </el-card>
      </el-col>
    </el-row>
  </div>
</template>



