// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceArgs Empty = new GetServiceArgs();

    @Import(name="cluster", required=true)
    private String cluster;

    public String cluster() {
        return this.cluster;
    }

    @Import(name="serviceArn", required=true)
    private String serviceArn;

    public String serviceArn() {
        return this.serviceArn;
    }

    private GetServiceArgs() {}

    private GetServiceArgs(GetServiceArgs $) {
        this.cluster = $.cluster;
        this.serviceArn = $.serviceArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceArgs $;

        public Builder() {
            $ = new GetServiceArgs();
        }

        public Builder(GetServiceArgs defaults) {
            $ = new GetServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder cluster(String cluster) {
            $.cluster = cluster;
            return this;
        }

        public Builder serviceArn(String serviceArn) {
            $.serviceArn = serviceArn;
            return this;
        }

        public GetServiceArgs build() {
            $.cluster = Objects.requireNonNull($.cluster, "expected parameter 'cluster' to be non-null");
            $.serviceArn = Objects.requireNonNull($.serviceArn, "expected parameter 'serviceArn' to be non-null");
            return $;
        }
    }

}
