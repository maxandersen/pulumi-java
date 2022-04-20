// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.secretmanager_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a Replica for this Secret.
 * 
 */
public final class ReplicaArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplicaArgs Empty = new ReplicaArgs();

    /**
     * The canonical IDs of the location to replicate data. For example: `&#34;us-east1&#34;`.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    public ReplicaArgs(@Nullable Output<String> location) {
        this.location = location;
    }

    private ReplicaArgs() {
        this.location = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }        public ReplicaArgs build() {
            return new ReplicaArgs(location);
        }
    }
}
