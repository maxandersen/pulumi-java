// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.random;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RandomUuidArgs extends io.pulumi.resources.ResourceArgs {

    public static final RandomUuidArgs Empty = new RandomUuidArgs();

    /**
     * Arbitrary map of values that, when changed, will trigger recreation of resource. See the main provider documentation for more information.
     * 
     */
    @InputImport(name="keepers")
    private final @Nullable Input<Map<String,Object>> keepers;

    public Input<Map<String,Object>> getKeepers() {
        return this.keepers == null ? Input.empty() : this.keepers;
    }

    public RandomUuidArgs(@Nullable Input<Map<String,Object>> keepers) {
        this.keepers = keepers;
    }

    private RandomUuidArgs() {
        this.keepers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RandomUuidArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,Object>> keepers;

        public Builder() {
    	      // Empty
        }

        public Builder(RandomUuidArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keepers = defaults.keepers;
        }

        public Builder setKeepers(@Nullable Input<Map<String,Object>> keepers) {
            this.keepers = keepers;
            return this;
        }

        public Builder setKeepers(@Nullable Map<String,Object> keepers) {
            this.keepers = Input.ofNullable(keepers);
            return this;
        }

        public RandomUuidArgs build() {
            return new RandomUuidArgs(keepers);
        }
    }
}
