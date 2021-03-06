#!/usr/bin/env groovy

import com.cleverbuilder.Test

 

def parse_yml(environment){
    // def datas = readYaml file: "test.yml"
    def datas = readYaml text: """
   accounts:
    dev:
      account_id: '12312142'
      apiKey: JENK-YY92WIWSI4W6RJMZVMRAO6G2RFR
    qa:
      account_id: '12312144'
      apiKey: JENK-21L7AP9HTFJEGAQO78D8Q9WTNF5
    staging:
      account_id: '12312143'
      apiKey: JENK-OGJVRHIZKKUYWL4ESYLLE2IEYIR
    prod:
      account_id: '12312145'
      apiKey: JENK-AC966NDDCU3PALCJ3R2MRDFWICI

 """

  // assert datas.size() == 2
       // assert datas[0].something == 'my first document'
       // assert datas[1].something == 'my second document'
//modify
 echo "${environment}"
 if(environment=='dev'){
  echo "${datas.accounts.dev}"}
 else if(environment=='qa'){
  echo "${datas.accounts.qa}"}
 else if(environment=='staging'){
  echo "${datas.accounts.staging}"}
 else if(environment=='prod'){
  echo "${datas.accounts.prod}"}
 else{echo "Please select a correct environment!!"}


}

def call(String environment = 'dev') {
  echo "Hello, ${environment}."
  parse_yml(environment)

  def t = new Test('a')
  t.func()
  // t.parse_yml(environment)

}

