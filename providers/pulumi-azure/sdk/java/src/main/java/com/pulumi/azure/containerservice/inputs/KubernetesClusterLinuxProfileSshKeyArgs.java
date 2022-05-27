// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class KubernetesClusterLinuxProfileSshKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterLinuxProfileSshKeyArgs Empty = new KubernetesClusterLinuxProfileSshKeyArgs();

    /**
     * The Public SSH Key used to access the cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="keyData", required=true)
    private Output<String> keyData;

    /**
     * @return The Public SSH Key used to access the cluster. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> keyData() {
        return this.keyData;
    }

    private KubernetesClusterLinuxProfileSshKeyArgs() {}

    private KubernetesClusterLinuxProfileSshKeyArgs(KubernetesClusterLinuxProfileSshKeyArgs $) {
        this.keyData = $.keyData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterLinuxProfileSshKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterLinuxProfileSshKeyArgs $;

        public Builder() {
            $ = new KubernetesClusterLinuxProfileSshKeyArgs();
        }

        public Builder(KubernetesClusterLinuxProfileSshKeyArgs defaults) {
            $ = new KubernetesClusterLinuxProfileSshKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyData The Public SSH Key used to access the cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder keyData(Output<String> keyData) {
            $.keyData = keyData;
            return this;
        }

        /**
         * @param keyData The Public SSH Key used to access the cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder keyData(String keyData) {
            return keyData(Output.of(keyData));
        }

        public KubernetesClusterLinuxProfileSshKeyArgs build() {
            $.keyData = Objects.requireNonNull($.keyData, "expected parameter 'keyData' to be non-null");
            return $;
        }
    }

}
