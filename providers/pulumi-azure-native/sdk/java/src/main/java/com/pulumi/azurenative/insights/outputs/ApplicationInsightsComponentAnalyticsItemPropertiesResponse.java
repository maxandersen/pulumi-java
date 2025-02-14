// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationInsightsComponentAnalyticsItemPropertiesResponse {
    /**
     * @return A function alias, used when the type of the item is Function
     * 
     */
    private final @Nullable String functionAlias;

    @CustomType.Constructor
    private ApplicationInsightsComponentAnalyticsItemPropertiesResponse(@CustomType.Parameter("functionAlias") @Nullable String functionAlias) {
        this.functionAlias = functionAlias;
    }

    /**
     * @return A function alias, used when the type of the item is Function
     * 
     */
    public Optional<String> functionAlias() {
        return Optional.ofNullable(this.functionAlias);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationInsightsComponentAnalyticsItemPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String functionAlias;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationInsightsComponentAnalyticsItemPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionAlias = defaults.functionAlias;
        }

        public Builder functionAlias(@Nullable String functionAlias) {
            this.functionAlias = functionAlias;
            return this;
        }        public ApplicationInsightsComponentAnalyticsItemPropertiesResponse build() {
            return new ApplicationInsightsComponentAnalyticsItemPropertiesResponse(functionAlias);
        }
    }
}
