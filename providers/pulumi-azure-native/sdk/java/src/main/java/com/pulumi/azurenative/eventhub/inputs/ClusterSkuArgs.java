// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.inputs;

import com.pulumi.azurenative.eventhub.enums.ClusterSkuName;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SKU parameters particular to a cluster instance.
 * 
 */
public final class ClusterSkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterSkuArgs Empty = new ClusterSkuArgs();

    /**
     * The quantity of Event Hubs Cluster Capacity Units contained in this cluster.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Output<Integer> capacity;

    public Output<Integer> capacity() {
        return this.capacity == null ? Codegen.empty() : this.capacity;
    }

    /**
     * Name of this SKU.
     * 
     */
    @Import(name="name", required=true)
      private final Output<Either<String,ClusterSkuName>> name;

    public Output<Either<String,ClusterSkuName>> name() {
        return this.name;
    }

    public ClusterSkuArgs(
        @Nullable Output<Integer> capacity,
        Output<Either<String,ClusterSkuName>> name) {
        this.capacity = capacity;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ClusterSkuArgs() {
        this.capacity = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> capacity;
        private Output<Either<String,ClusterSkuName>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
        }

        public Builder capacity(@Nullable Output<Integer> capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = Codegen.ofNullable(capacity);
            return this;
        }
        public Builder name(Output<Either<String,ClusterSkuName>> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(Either<String,ClusterSkuName> name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public ClusterSkuArgs build() {
            return new ClusterSkuArgs(capacity, name);
        }
    }
}
