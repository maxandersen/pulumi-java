// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class QueryLogArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueryLogArgs Empty = new QueryLogArgs();

    /**
     * CloudWatch log group ARN to send query logs.
     * 
     */
    @Import(name="cloudwatchLogGroupArn", required=true)
    private Output<String> cloudwatchLogGroupArn;

    public Output<String> cloudwatchLogGroupArn() {
        return this.cloudwatchLogGroupArn;
    }

    /**
     * Route53 hosted zone ID to enable query logs.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    public Output<String> zoneId() {
        return this.zoneId;
    }

    private QueryLogArgs() {}

    private QueryLogArgs(QueryLogArgs $) {
        this.cloudwatchLogGroupArn = $.cloudwatchLogGroupArn;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueryLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueryLogArgs $;

        public Builder() {
            $ = new QueryLogArgs();
        }

        public Builder(QueryLogArgs defaults) {
            $ = new QueryLogArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudwatchLogGroupArn(Output<String> cloudwatchLogGroupArn) {
            $.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
            return this;
        }

        public Builder cloudwatchLogGroupArn(String cloudwatchLogGroupArn) {
            return cloudwatchLogGroupArn(Output.of(cloudwatchLogGroupArn));
        }

        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public QueryLogArgs build() {
            $.cloudwatchLogGroupArn = Objects.requireNonNull($.cloudwatchLogGroupArn, "expected parameter 'cloudwatchLogGroupArn' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
