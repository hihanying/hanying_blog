<template>
  <div>
    <svg-icon icon-class="doc" style="height: 2.5em;font-size: 18px;cursor: pointer" @click.native="goto"/>
  </div>
</template>

<script>
export default {
  name: 'Doc',
  data() {
    return {
      url: 'http://hihanying.gihub.io'
    }
  },
  methods: {
    goto() {
      window.open(this.url)
    }
  }
}
</script>
