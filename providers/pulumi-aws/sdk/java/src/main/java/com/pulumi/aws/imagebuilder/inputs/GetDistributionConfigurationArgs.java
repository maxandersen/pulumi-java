// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDistributionConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDistributionConfigurationArgs Empty = new GetDistributionConfigurationArgs();

    /**
     * Amazon Resource Name (ARN) of the distribution configuration.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    public String arn() {
        return this.arn;
    }

    /**
     * Key-value map of resource tags for the distribution configuration.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetDistributionConfigurationArgs() {}

    private GetDistributionConfigurationArgs(GetDistributionConfigurationArgs $) {
        this.arn = $.arn;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDistributionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDistributionConfigurationArgs $;

        public Builder() {
            $ = new GetDistributionConfigurationArgs();
        }

        public Builder(GetDistributionConfigurationArgs defaults) {
            $ = new GetDistributionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetDistributionConfigurationArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
