// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.random.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RandomUuidState extends io.pulumi.resources.ResourceArgs {

    public static final RandomUuidState Empty = new RandomUuidState();

    /**
     * Arbitrary map of values that, when changed, will trigger recreation of resource. See the main provider documentation for more information.
     * 
     */
    @InputImport(name="keepers")
    private final @Nullable Input<Map<String,Object>> keepers;

    public Input<Map<String,Object>> getKeepers() {
        return this.keepers == null ? Input.empty() : this.keepers;
    }

    /**
     * The generated uuid presented in string format.
     * 
     */
    @InputImport(name="result")
    private final @Nullable Input<String> result;

    public Input<String> getResult() {
        return this.result == null ? Input.empty() : this.result;
    }

    public RandomUuidState(
        @Nullable Input<Map<String,Object>> keepers,
        @Nullable Input<String> result) {
        this.keepers = keepers;
        this.result = result;
    }

    private RandomUuidState() {
        this.keepers = Input.empty();
        this.result = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RandomUuidState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,Object>> keepers;
        private @Nullable Input<String> result;

        public Builder() {
    	      // Empty
        }

        public Builder(RandomUuidState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keepers = defaults.keepers;
    	      this.result = defaults.result;
        }

        public Builder setKeepers(@Nullable Input<Map<String,Object>> keepers) {
            this.keepers = keepers;
            return this;
        }

        public Builder setKeepers(@Nullable Map<String,Object> keepers) {
            this.keepers = Input.ofNullable(keepers);
            return this;
        }

        public Builder setResult(@Nullable Input<String> result) {
            this.result = result;
            return this;
        }

        public Builder setResult(@Nullable String result) {
            this.result = Input.ofNullable(result);
            return this;
        }

        public RandomUuidState build() {
            return new RandomUuidState(keepers, result);
        }
    }
}
