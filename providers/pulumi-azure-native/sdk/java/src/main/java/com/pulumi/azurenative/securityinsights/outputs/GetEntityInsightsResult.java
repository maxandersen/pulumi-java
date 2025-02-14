// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.outputs;

import com.pulumi.azurenative.securityinsights.outputs.EntityInsightItemResponse;
import com.pulumi.azurenative.securityinsights.outputs.GetInsightsResultsMetadataResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEntityInsightsResult {
    /**
     * @return The metadata from the get insights operation results.
     * 
     */
    private final @Nullable GetInsightsResultsMetadataResponse metaData;
    /**
     * @return The insights result values.
     * 
     */
    private final @Nullable List<EntityInsightItemResponse> value;

    @CustomType.Constructor
    private GetEntityInsightsResult(
        @CustomType.Parameter("metaData") @Nullable GetInsightsResultsMetadataResponse metaData,
        @CustomType.Parameter("value") @Nullable List<EntityInsightItemResponse> value) {
        this.metaData = metaData;
        this.value = value;
    }

    /**
     * @return The metadata from the get insights operation results.
     * 
     */
    public Optional<GetInsightsResultsMetadataResponse> metaData() {
        return Optional.ofNullable(this.metaData);
    }
    /**
     * @return The insights result values.
     * 
     */
    public List<EntityInsightItemResponse> value() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntityInsightsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GetInsightsResultsMetadataResponse metaData;
        private @Nullable List<EntityInsightItemResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntityInsightsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metaData = defaults.metaData;
    	      this.value = defaults.value;
        }

        public Builder metaData(@Nullable GetInsightsResultsMetadataResponse metaData) {
            this.metaData = metaData;
            return this;
        }
        public Builder value(@Nullable List<EntityInsightItemResponse> value) {
            this.value = value;
            return this;
        }
        public Builder value(EntityInsightItemResponse... value) {
            return value(List.of(value));
        }        public GetEntityInsightsResult build() {
            return new GetEntityInsightsResult(metaData, value);
        }
    }
}
