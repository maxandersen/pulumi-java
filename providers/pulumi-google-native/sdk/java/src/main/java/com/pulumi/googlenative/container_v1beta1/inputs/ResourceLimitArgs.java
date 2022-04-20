// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains information about amount of some resource in the cluster. For memory, value should be in GB.
 * 
 */
public final class ResourceLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceLimitArgs Empty = new ResourceLimitArgs();

    /**
     * Maximum amount of the resource in the cluster.
     * 
     */
    @Import(name="maximum")
      private final @Nullable Output<String> maximum;

    public Output<String> maximum() {
        return this.maximum == null ? Codegen.empty() : this.maximum;
    }

    /**
     * Minimum amount of the resource in the cluster.
     * 
     */
    @Import(name="minimum")
      private final @Nullable Output<String> minimum;

    public Output<String> minimum() {
        return this.minimum == null ? Codegen.empty() : this.minimum;
    }

    /**
     * Resource name &#34;cpu&#34;, &#34;memory&#34; or gpu-specific string.
     * 
     */
    @Import(name="resourceType")
      private final @Nullable Output<String> resourceType;

    public Output<String> resourceType() {
        return this.resourceType == null ? Codegen.empty() : this.resourceType;
    }

    public ResourceLimitArgs(
        @Nullable Output<String> maximum,
        @Nullable Output<String> minimum,
        @Nullable Output<String> resourceType) {
        this.maximum = maximum;
        this.minimum = minimum;
        this.resourceType = resourceType;
    }

    private ResourceLimitArgs() {
        this.maximum = Codegen.empty();
        this.minimum = Codegen.empty();
        this.resourceType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> maximum;
        private @Nullable Output<String> minimum;
        private @Nullable Output<String> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceLimitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder maximum(@Nullable Output<String> maximum) {
            this.maximum = maximum;
            return this;
        }
        public Builder maximum(@Nullable String maximum) {
            this.maximum = Codegen.ofNullable(maximum);
            return this;
        }
        public Builder minimum(@Nullable Output<String> minimum) {
            this.minimum = minimum;
            return this;
        }
        public Builder minimum(@Nullable String minimum) {
            this.minimum = Codegen.ofNullable(minimum);
            return this;
        }
        public Builder resourceType(@Nullable Output<String> resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = Codegen.ofNullable(resourceType);
            return this;
        }        public ResourceLimitArgs build() {
            return new ResourceLimitArgs(maximum, minimum, resourceType);
        }
    }
}
