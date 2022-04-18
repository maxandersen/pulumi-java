// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetLaunchTemplateInstanceMarketOptionSpotOption;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetLaunchTemplateInstanceMarketOption extends com.pulumi.resources.InvokeArgs {

    public static final GetLaunchTemplateInstanceMarketOption Empty = new GetLaunchTemplateInstanceMarketOption();

    @Import(name="marketType", required=true)
      private final String marketType;

    public String marketType() {
        return this.marketType;
    }

    @Import(name="spotOptions", required=true)
      private final List<GetLaunchTemplateInstanceMarketOptionSpotOption> spotOptions;

    public List<GetLaunchTemplateInstanceMarketOptionSpotOption> spotOptions() {
        return this.spotOptions;
    }

    public GetLaunchTemplateInstanceMarketOption(
        String marketType,
        List<GetLaunchTemplateInstanceMarketOptionSpotOption> spotOptions) {
        this.marketType = Objects.requireNonNull(marketType, "expected parameter 'marketType' to be non-null");
        this.spotOptions = Objects.requireNonNull(spotOptions, "expected parameter 'spotOptions' to be non-null");
    }

    private GetLaunchTemplateInstanceMarketOption() {
        this.marketType = null;
        this.spotOptions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateInstanceMarketOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String marketType;
        private List<GetLaunchTemplateInstanceMarketOptionSpotOption> spotOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchTemplateInstanceMarketOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.marketType = defaults.marketType;
    	      this.spotOptions = defaults.spotOptions;
        }

        public Builder marketType(String marketType) {
            this.marketType = Objects.requireNonNull(marketType);
            return this;
        }
        public Builder spotOptions(List<GetLaunchTemplateInstanceMarketOptionSpotOption> spotOptions) {
            this.spotOptions = Objects.requireNonNull(spotOptions);
            return this;
        }
        public Builder spotOptions(GetLaunchTemplateInstanceMarketOptionSpotOption... spotOptions) {
            return spotOptions(List.of(spotOptions));
        }        public GetLaunchTemplateInstanceMarketOption build() {
            return new GetLaunchTemplateInstanceMarketOption(marketType, spotOptions);
        }
    }
}
