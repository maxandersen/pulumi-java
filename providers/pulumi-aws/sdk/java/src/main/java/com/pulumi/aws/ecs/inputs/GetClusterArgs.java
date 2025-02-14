// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClusterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterArgs Empty = new GetClusterArgs();

    /**
     * The name of the ECS Cluster
     * 
     */
    @Import(name="clusterName", required=true)
    private String clusterName;

    /**
     * @return The name of the ECS Cluster
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }

    private GetClusterArgs() {}

    private GetClusterArgs(GetClusterArgs $) {
        this.clusterName = $.clusterName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterArgs $;

        public Builder() {
            $ = new GetClusterArgs();
        }

        public Builder(GetClusterArgs defaults) {
            $ = new GetClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the ECS Cluster
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public GetClusterArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            return $;
        }
    }

}
