// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2;

import com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterArgs;
import com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclLoggingConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationArgs Empty = new WebAclLoggingConfigurationArgs();

    /**
     * The Amazon Kinesis Data Firehose, Cloudwatch Log log group, or S3 bucket Amazon Resource Names (ARNs) that you want to associate with the web ACL.
     * 
     */
    @Import(name="logDestinationConfigs", required=true)
    private Output<List<String>> logDestinationConfigs;

    public Output<List<String>> logDestinationConfigs() {
        return this.logDestinationConfigs;
    }

    /**
     * A configuration block that specifies which web requests are kept in the logs and which are dropped. You can filter on the rule action and on the web request labels that were applied by matching rules during web ACL evaluation. See Logging Filter below for more details.
     * 
     */
    @Import(name="loggingFilter")
    private @Nullable Output<WebAclLoggingConfigurationLoggingFilterArgs> loggingFilter;

    public Optional<Output<WebAclLoggingConfigurationLoggingFilterArgs>> loggingFilter() {
        return Optional.ofNullable(this.loggingFilter);
    }

    /**
     * The parts of the request that you want to keep out of the logs. Up to 100 `redacted_fields` blocks are supported. See Redacted Fields below for more details.
     * 
     */
    @Import(name="redactedFields")
    private @Nullable Output<List<WebAclLoggingConfigurationRedactedFieldArgs>> redactedFields;

    public Optional<Output<List<WebAclLoggingConfigurationRedactedFieldArgs>>> redactedFields() {
        return Optional.ofNullable(this.redactedFields);
    }

    /**
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with `log_destination_configs`.
     * 
     */
    @Import(name="resourceArn", required=true)
    private Output<String> resourceArn;

    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    private WebAclLoggingConfigurationArgs() {}

    private WebAclLoggingConfigurationArgs(WebAclLoggingConfigurationArgs $) {
        this.logDestinationConfigs = $.logDestinationConfigs;
        this.loggingFilter = $.loggingFilter;
        this.redactedFields = $.redactedFields;
        this.resourceArn = $.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclLoggingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclLoggingConfigurationArgs $;

        public Builder() {
            $ = new WebAclLoggingConfigurationArgs();
        }

        public Builder(WebAclLoggingConfigurationArgs defaults) {
            $ = new WebAclLoggingConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder logDestinationConfigs(Output<List<String>> logDestinationConfigs) {
            $.logDestinationConfigs = logDestinationConfigs;
            return this;
        }

        public Builder logDestinationConfigs(List<String> logDestinationConfigs) {
            return logDestinationConfigs(Output.of(logDestinationConfigs));
        }

        public Builder logDestinationConfigs(String... logDestinationConfigs) {
            return logDestinationConfigs(List.of(logDestinationConfigs));
        }

        public Builder loggingFilter(@Nullable Output<WebAclLoggingConfigurationLoggingFilterArgs> loggingFilter) {
            $.loggingFilter = loggingFilter;
            return this;
        }

        public Builder loggingFilter(WebAclLoggingConfigurationLoggingFilterArgs loggingFilter) {
            return loggingFilter(Output.of(loggingFilter));
        }

        public Builder redactedFields(@Nullable Output<List<WebAclLoggingConfigurationRedactedFieldArgs>> redactedFields) {
            $.redactedFields = redactedFields;
            return this;
        }

        public Builder redactedFields(List<WebAclLoggingConfigurationRedactedFieldArgs> redactedFields) {
            return redactedFields(Output.of(redactedFields));
        }

        public Builder redactedFields(WebAclLoggingConfigurationRedactedFieldArgs... redactedFields) {
            return redactedFields(List.of(redactedFields));
        }

        public Builder resourceArn(Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        public WebAclLoggingConfigurationArgs build() {
            $.logDestinationConfigs = Objects.requireNonNull($.logDestinationConfigs, "expected parameter 'logDestinationConfigs' to be non-null");
            $.resourceArn = Objects.requireNonNull($.resourceArn, "expected parameter 'resourceArn' to be non-null");
            return $;
        }
    }

}
