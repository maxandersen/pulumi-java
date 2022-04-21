// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionLambdaFunctionAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionLambdaFunctionAssociationArgs Empty = new DistributionLambdaFunctionAssociationArgs();

    @Import(name="eventType")
    private @Nullable Output<String> eventType;

    public Optional<Output<String>> eventType() {
        return Optional.ofNullable(this.eventType);
    }

    @Import(name="includeBody")
    private @Nullable Output<Boolean> includeBody;

    public Optional<Output<Boolean>> includeBody() {
        return Optional.ofNullable(this.includeBody);
    }

    @Import(name="lambdaFunctionARN")
    private @Nullable Output<String> lambdaFunctionARN;

    public Optional<Output<String>> lambdaFunctionARN() {
        return Optional.ofNullable(this.lambdaFunctionARN);
    }

    private DistributionLambdaFunctionAssociationArgs() {}

    private DistributionLambdaFunctionAssociationArgs(DistributionLambdaFunctionAssociationArgs $) {
        this.eventType = $.eventType;
        this.includeBody = $.includeBody;
        this.lambdaFunctionARN = $.lambdaFunctionARN;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionLambdaFunctionAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionLambdaFunctionAssociationArgs $;

        public Builder() {
            $ = new DistributionLambdaFunctionAssociationArgs();
        }

        public Builder(DistributionLambdaFunctionAssociationArgs defaults) {
            $ = new DistributionLambdaFunctionAssociationArgs(Objects.requireNonNull(defaults));
        }

        public Builder eventType(@Nullable Output<String> eventType) {
            $.eventType = eventType;
            return this;
        }

        public Builder eventType(String eventType) {
            return eventType(Output.of(eventType));
        }

        public Builder includeBody(@Nullable Output<Boolean> includeBody) {
            $.includeBody = includeBody;
            return this;
        }

        public Builder includeBody(Boolean includeBody) {
            return includeBody(Output.of(includeBody));
        }

        public Builder lambdaFunctionARN(@Nullable Output<String> lambdaFunctionARN) {
            $.lambdaFunctionARN = lambdaFunctionARN;
            return this;
        }

        public Builder lambdaFunctionARN(String lambdaFunctionARN) {
            return lambdaFunctionARN(Output.of(lambdaFunctionARN));
        }

        public DistributionLambdaFunctionAssociationArgs build() {
            return $;
        }
    }

}
