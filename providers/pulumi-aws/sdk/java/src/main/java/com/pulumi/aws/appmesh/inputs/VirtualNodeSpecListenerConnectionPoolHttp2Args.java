// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class VirtualNodeSpecListenerConnectionPoolHttp2Args extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerConnectionPoolHttp2Args Empty = new VirtualNodeSpecListenerConnectionPoolHttp2Args();

    /**
     * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    @Import(name="maxRequests", required=true)
    private Output<Integer> maxRequests;

    public Output<Integer> maxRequests() {
        return this.maxRequests;
    }

    private VirtualNodeSpecListenerConnectionPoolHttp2Args() {}

    private VirtualNodeSpecListenerConnectionPoolHttp2Args(VirtualNodeSpecListenerConnectionPoolHttp2Args $) {
        this.maxRequests = $.maxRequests;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecListenerConnectionPoolHttp2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecListenerConnectionPoolHttp2Args $;

        public Builder() {
            $ = new VirtualNodeSpecListenerConnectionPoolHttp2Args();
        }

        public Builder(VirtualNodeSpecListenerConnectionPoolHttp2Args defaults) {
            $ = new VirtualNodeSpecListenerConnectionPoolHttp2Args(Objects.requireNonNull(defaults));
        }

        public Builder maxRequests(Output<Integer> maxRequests) {
            $.maxRequests = maxRequests;
            return this;
        }

        public Builder maxRequests(Integer maxRequests) {
            return maxRequests(Output.of(maxRequests));
        }

        public VirtualNodeSpecListenerConnectionPoolHttp2Args build() {
            $.maxRequests = Objects.requireNonNull($.maxRequests, "expected parameter 'maxRequests' to be non-null");
            return $;
        }
    }

}
