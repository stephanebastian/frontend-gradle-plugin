<template>
    <fgp-property
        name="proxyHost"
        type="java.lang.String"
        :required="false"
        example="127.0.0.1"
        :tasks="['installNode', 'installYarn']"
    >
        <p>
            IP address or domain name of a HTTP proxy server to use when downloading distributions. By default, the
            plugin uses direct connections.
        </p>
    </fgp-property>
</template>

<script>
import Vue from "vue";
import fgpProperty from "./property";

export default Vue.component("fgp-proxy-host-property", {
    components: { fgpProperty }
});
</script>
