<template>
    <div class="crawls">
        <h1>
            Crawling Test Page
        </h1>
        <button @click="START">START</button>
        <div>response: {{ response }}</div>
    </div>
</template>

<script>
    import axios from "../js/axios";
    export default {
        name: 'crawls',

        data() {
            return {
                response: ''
            };
        },
        methods: {
            START: function() {
                axios.get('/crawls')
                .then(res => {
                    this.response = res.data
                    console.log(res)
                    console.log('response test')
                })
                .catch(error => {
                    this.err = error.response
                    console.log(error)
                })
            },
            START2 : function() {
                axios.post('/crawls',{
                    'sourceId' : 'vue',
                    'parameterName' : 'axios'
                })
                .then(res => {
                    this.response = res.data
                })
                .catch(error => {
                    this.err = error.response
                })
            }
        }
    }
</script>