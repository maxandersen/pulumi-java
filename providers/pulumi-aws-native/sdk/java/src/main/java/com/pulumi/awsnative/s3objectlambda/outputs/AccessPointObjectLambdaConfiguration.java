// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3objectlambda.outputs;

import com.pulumi.awsnative.s3objectlambda.outputs.AccessPointTransformationConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessPointObjectLambdaConfiguration {
    private final @Nullable List<String> allowedFeatures;
    private final @Nullable Boolean cloudWatchMetricsEnabled;
    private final String supportingAccessPoint;
    private final List<AccessPointTransformationConfiguration> transformationConfigurations;

    @CustomType.Constructor
    private AccessPointObjectLambdaConfiguration(
        @CustomType.Parameter("allowedFeatures") @Nullable List<String> allowedFeatures,
        @CustomType.Parameter("cloudWatchMetricsEnabled") @Nullable Boolean cloudWatchMetricsEnabled,
        @CustomType.Parameter("supportingAccessPoint") String supportingAccessPoint,
        @CustomType.Parameter("transformationConfigurations") List<AccessPointTransformationConfiguration> transformationConfigurations) {
        this.allowedFeatures = allowedFeatures;
        this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
        this.supportingAccessPoint = supportingAccessPoint;
        this.transformationConfigurations = transformationConfigurations;
    }

    public List<String> allowedFeatures() {
        return this.allowedFeatures == null ? List.of() : this.allowedFeatures;
    }
    public Optional<Boolean> cloudWatchMetricsEnabled() {
        return Optional.ofNullable(this.cloudWatchMetricsEnabled);
    }
    public String supportingAccessPoint() {
        return this.supportingAccessPoint;
    }
    public List<AccessPointTransformationConfiguration> transformationConfigurations() {
        return this.transformationConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointObjectLambdaConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedFeatures;
        private @Nullable Boolean cloudWatchMetricsEnabled;
        private String supportingAccessPoint;
        private List<AccessPointTransformationConfiguration> transformationConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointObjectLambdaConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedFeatures = defaults.allowedFeatures;
    	      this.cloudWatchMetricsEnabled = defaults.cloudWatchMetricsEnabled;
    	      this.supportingAccessPoint = defaults.supportingAccessPoint;
    	      this.transformationConfigurations = defaults.transformationConfigurations;
        }

        public Builder allowedFeatures(@Nullable List<String> allowedFeatures) {
            this.allowedFeatures = allowedFeatures;
            return this;
        }
        public Builder allowedFeatures(String... allowedFeatures) {
            return allowedFeatures(List.of(allowedFeatures));
        }
        public Builder cloudWatchMetricsEnabled(@Nullable Boolean cloudWatchMetricsEnabled) {
            this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
            return this;
        }
        public Builder supportingAccessPoint(String supportingAccessPoint) {
            this.supportingAccessPoint = Objects.requireNonNull(supportingAccessPoint);
            return this;
        }
        public Builder transformationConfigurations(List<AccessPointTransformationConfiguration> transformationConfigurations) {
            this.transformationConfigurations = Objects.requireNonNull(transformationConfigurations);
            return this;
        }
        public Builder transformationConfigurations(AccessPointTransformationConfiguration... transformationConfigurations) {
            return transformationConfigurations(List.of(transformationConfigurations));
        }        public AccessPointObjectLambdaConfiguration build() {
            return new AccessPointObjectLambdaConfiguration(allowedFeatures, cloudWatchMetricsEnabled, supportingAccessPoint, transformationConfigurations);
        }
    }
}
