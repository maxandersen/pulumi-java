// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UsagePlanApiStage {
    /**
     * The ID of an API that is in the specified Stage property that you want to associate with the usage plan.
     * 
     */
    private final @Nullable String apiId;
    /**
     * The name of the stage to associate with the usage plan.
     * 
     */
    private final @Nullable String stage;
    /**
     * Map containing method-level throttling information for an API stage in a usage plan. The key for the map is the path and method for which to configure custom throttling, for example, &#39;/pets/GET&#39;. Duplicates are not allowed.
     * 
     */
    private final @Nullable Object throttle;

    @CustomType.Constructor
    private UsagePlanApiStage(
        @CustomType.Parameter("apiId") @Nullable String apiId,
        @CustomType.Parameter("stage") @Nullable String stage,
        @CustomType.Parameter("throttle") @Nullable Object throttle) {
        this.apiId = apiId;
        this.stage = stage;
        this.throttle = throttle;
    }

    /**
     * The ID of an API that is in the specified Stage property that you want to associate with the usage plan.
     * 
    */
    public Optional<String> apiId() {
        return Optional.ofNullable(this.apiId);
    }
    /**
     * The name of the stage to associate with the usage plan.
     * 
    */
    public Optional<String> stage() {
        return Optional.ofNullable(this.stage);
    }
    /**
     * Map containing method-level throttling information for an API stage in a usage plan. The key for the map is the path and method for which to configure custom throttling, for example, &#39;/pets/GET&#39;. Duplicates are not allowed.
     * 
    */
    public Optional<Object> throttle() {
        return Optional.ofNullable(this.throttle);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanApiStage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiId;
        private @Nullable String stage;
        private @Nullable Object throttle;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanApiStage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.stage = defaults.stage;
    	      this.throttle = defaults.throttle;
        }

        public Builder apiId(@Nullable String apiId) {
            this.apiId = apiId;
            return this;
        }
        public Builder stage(@Nullable String stage) {
            this.stage = stage;
            return this;
        }
        public Builder throttle(@Nullable Object throttle) {
            this.throttle = throttle;
            return this;
        }        public UsagePlanApiStage build() {
            return new UsagePlanApiStage(apiId, stage, throttle);
        }
    }
}
