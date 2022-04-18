// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionLambdaFunctionAssociation extends com.pulumi.resources.InvokeArgs {

    public static final DistributionLambdaFunctionAssociation Empty = new DistributionLambdaFunctionAssociation();

    @Import(name="eventType")
      private final @Nullable String eventType;

    public Optional<String> eventType() {
        return this.eventType == null ? Optional.empty() : Optional.ofNullable(this.eventType);
    }

    @Import(name="includeBody")
      private final @Nullable Boolean includeBody;

    public Optional<Boolean> includeBody() {
        return this.includeBody == null ? Optional.empty() : Optional.ofNullable(this.includeBody);
    }

    @Import(name="lambdaFunctionARN")
      private final @Nullable String lambdaFunctionARN;

    public Optional<String> lambdaFunctionARN() {
        return this.lambdaFunctionARN == null ? Optional.empty() : Optional.ofNullable(this.lambdaFunctionARN);
    }

    public DistributionLambdaFunctionAssociation(
        @Nullable String eventType,
        @Nullable Boolean includeBody,
        @Nullable String lambdaFunctionARN) {
        this.eventType = eventType;
        this.includeBody = includeBody;
        this.lambdaFunctionARN = lambdaFunctionARN;
    }

    private DistributionLambdaFunctionAssociation() {
        this.eventType = null;
        this.includeBody = null;
        this.lambdaFunctionARN = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionLambdaFunctionAssociation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eventType;
        private @Nullable Boolean includeBody;
        private @Nullable String lambdaFunctionARN;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionLambdaFunctionAssociation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.includeBody = defaults.includeBody;
    	      this.lambdaFunctionARN = defaults.lambdaFunctionARN;
        }

        public Builder eventType(@Nullable String eventType) {
            this.eventType = eventType;
            return this;
        }
        public Builder includeBody(@Nullable Boolean includeBody) {
            this.includeBody = includeBody;
            return this;
        }
        public Builder lambdaFunctionARN(@Nullable String lambdaFunctionARN) {
            this.lambdaFunctionARN = lambdaFunctionARN;
            return this;
        }        public DistributionLambdaFunctionAssociation build() {
            return new DistributionLambdaFunctionAssociation(eventType, includeBody, lambdaFunctionARN);
        }
    }
}
