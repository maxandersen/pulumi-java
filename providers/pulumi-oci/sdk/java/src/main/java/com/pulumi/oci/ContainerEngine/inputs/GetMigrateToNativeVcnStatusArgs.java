// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ContainerEngine.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMigrateToNativeVcnStatusArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMigrateToNativeVcnStatusArgs Empty = new GetMigrateToNativeVcnStatusArgs();

    @Import(name="clusterId", required=true)
    private String clusterId;

    public String clusterId() {
        return this.clusterId;
    }

    private GetMigrateToNativeVcnStatusArgs() {}

    private GetMigrateToNativeVcnStatusArgs(GetMigrateToNativeVcnStatusArgs $) {
        this.clusterId = $.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMigrateToNativeVcnStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMigrateToNativeVcnStatusArgs $;

        public Builder() {
            $ = new GetMigrateToNativeVcnStatusArgs();
        }

        public Builder(GetMigrateToNativeVcnStatusArgs defaults) {
            $ = new GetMigrateToNativeVcnStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterId(String clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public GetMigrateToNativeVcnStatusArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            return $;
        }
    }

}
