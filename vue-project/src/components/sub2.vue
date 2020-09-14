<template>
    <div class="hello">
        <h1>
            여기는 sub2
            {{user.name}},{{user.age}}
        </h1>
    </div>
</template>

<script>
    import axios from "../js/axios";
    export default {

        data() {
            return {
                user:{name:"",age:0}
            };
        },
        mounted(){
            axios.get("/sub2")
            .then(res=>{
                this.user = res.data;
            });
        }
    }
</script>