// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterArgs Empty = new GetClusterArgs();

    /**
     * The cluster identifier
     * 
     */
    @Import(name="clusterIdentifier", required=true)
      private final String clusterIdentifier;

    public String clusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * The tags associated to the cluster
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetClusterArgs(
        String clusterIdentifier,
        @Nullable Map<String,String> tags) {
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
        this.tags = tags;
    }

    private GetClusterArgs() {
        this.clusterIdentifier = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterIdentifier;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.tags = defaults.tags;
        }

        public Builder clusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetClusterArgs build() {
            return new GetClusterArgs(clusterIdentifier, tags);
        }
    }
}
