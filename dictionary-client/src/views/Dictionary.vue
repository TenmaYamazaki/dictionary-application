<template>
  <div>
    <el-row type="flex" justify="center">
      <el-col :span="22">
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
      <el-col :span="22">
        <el-card class="box-card box-card-wrapper">
          <div slot="header" class="clearfix">
            <span>辞書</span>
          </div>
          <el-table :data="dictionaries">
            <el-table-column label="No." width="50">
              <template  slot-scope="scope">
                {{ scope.$index + 1}}
              </template>
            </el-table-column>
            <el-table-column prop="word" label="単語" />
            <el-table-column prop="wordDesc" label="説明" />
          </el-table>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'Dictionary',
  data () {
    return {
      requestForm: {
        fieldId: undefined
      },
      dictionaries: [],
      fields: []
    }
  },
  created: async function () {
    await this.refresh()
  },
  methods: {
    refresh: async function () {
      const res = await axios.get('http://localhost:8080/dictionary/')
      this.dictionaries = res.data.responseForm.wordList
      this.fields = res.data.responseForm.fieldList
      console.info(this.dictionaries)
      console.info(this.Fields)
    },
    searchWord: async function () {
      const res = await axios.post('http://localhost:8080/dictionary/search', this.requestForm)
      this.dictionaries = res.data.responseForm.wordList
      console.info(this.dictionaries)
    }
  }
}
</script>

<style scoped>
  @import "../assets/style/dictionary.css";
</style>
