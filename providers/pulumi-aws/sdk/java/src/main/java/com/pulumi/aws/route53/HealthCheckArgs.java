// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HealthCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final HealthCheckArgs Empty = new HealthCheckArgs();

    /**
     * The minimum number of child health checks that must be healthy for Route 53 to consider the parent health check to be healthy. Valid values are integers between 0 and 256, inclusive
     * 
     */
    @Import(name="childHealthThreshold")
      private final @Nullable Output<Integer> childHealthThreshold;

    public Output<Integer> childHealthThreshold() {
        return this.childHealthThreshold == null ? Codegen.empty() : this.childHealthThreshold;
    }

    /**
     * For a specified parent health check, a list of HealthCheckId values for the associated child health checks.
     * 
     */
    @Import(name="childHealthchecks")
      private final @Nullable Output<List<String>> childHealthchecks;

    public Output<List<String>> childHealthchecks() {
        return this.childHealthchecks == null ? Codegen.empty() : this.childHealthchecks;
    }

    /**
     * The name of the CloudWatch alarm.
     * 
     */
    @Import(name="cloudwatchAlarmName")
      private final @Nullable Output<String> cloudwatchAlarmName;

    public Output<String> cloudwatchAlarmName() {
        return this.cloudwatchAlarmName == null ? Codegen.empty() : this.cloudwatchAlarmName;
    }

    /**
     * The CloudWatchRegion that the CloudWatch alarm was created in.
     * 
     */
    @Import(name="cloudwatchAlarmRegion")
      private final @Nullable Output<String> cloudwatchAlarmRegion;

    public Output<String> cloudwatchAlarmRegion() {
        return this.cloudwatchAlarmRegion == null ? Codegen.empty() : this.cloudwatchAlarmRegion;
    }

    /**
     * A boolean value that stops Route 53 from performing health checks. When set to true, Route 53 will do the following depending on the type of health check:
     * * For health checks that check the health of endpoints, Route5 53 stops submitting requests to your application, server, or other resource.
     * * For calculated health checks, Route 53 stops aggregating the status of the referenced health checks.
     * * For health checks that monitor CloudWatch alarms, Route 53 stops monitoring the corresponding CloudWatch metrics.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> disabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    /**
     * A boolean value that indicates whether Route53 should send the `fqdn` to the endpoint when performing the health check. This defaults to AWS' defaults: when the `type` is "HTTPS" `enable_sni` defaults to `true`, when `type` is anything else `enable_sni` defaults to `false`.
     * 
     */
    @Import(name="enableSni")
      private final @Nullable Output<Boolean> enableSni;

    public Output<Boolean> enableSni() {
        return this.enableSni == null ? Codegen.empty() : this.enableSni;
    }

    /**
     * The number of consecutive health checks that an endpoint must pass or fail.
     * 
     */
    @Import(name="failureThreshold")
      private final @Nullable Output<Integer> failureThreshold;

    public Output<Integer> failureThreshold() {
        return this.failureThreshold == null ? Codegen.empty() : this.failureThreshold;
    }

    /**
     * The fully qualified domain name of the endpoint to be checked.
     * 
     */
    @Import(name="fqdn")
      private final @Nullable Output<String> fqdn;

    public Output<String> fqdn() {
        return this.fqdn == null ? Codegen.empty() : this.fqdn;
    }

    /**
     * The status of the health check when CloudWatch has insufficient data about the state of associated alarm. Valid values are `Healthy` , `Unhealthy` and `LastKnownStatus`.
     * 
     */
    @Import(name="insufficientDataHealthStatus")
      private final @Nullable Output<String> insufficientDataHealthStatus;

    public Output<String> insufficientDataHealthStatus() {
        return this.insufficientDataHealthStatus == null ? Codegen.empty() : this.insufficientDataHealthStatus;
    }

    /**
     * A boolean value that indicates whether the status of health check should be inverted. For example, if a health check is healthy but Inverted is True , then Route 53 considers the health check to be unhealthy.
     * 
     */
    @Import(name="invertHealthcheck")
      private final @Nullable Output<Boolean> invertHealthcheck;

    public Output<Boolean> invertHealthcheck() {
        return this.invertHealthcheck == null ? Codegen.empty() : this.invertHealthcheck;
    }

    /**
     * The IP address of the endpoint to be checked.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> ipAddress() {
        return this.ipAddress == null ? Codegen.empty() : this.ipAddress;
    }

    /**
     * A Boolean value that indicates whether you want Route 53 to measure the latency between health checkers in multiple AWS regions and your endpoint and to display CloudWatch latency graphs in the Route 53 console.
     * 
     */
    @Import(name="measureLatency")
      private final @Nullable Output<Boolean> measureLatency;

    public Output<Boolean> measureLatency() {
        return this.measureLatency == null ? Codegen.empty() : this.measureLatency;
    }

    /**
     * The port of the endpoint to be checked.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * This is a reference name used in Caller Reference
     * (helpful for identifying single health_check set amongst others)
     * 
     */
    @Import(name="referenceName")
      private final @Nullable Output<String> referenceName;

    public Output<String> referenceName() {
        return this.referenceName == null ? Codegen.empty() : this.referenceName;
    }

    /**
     * A list of AWS regions that you want Amazon Route 53 health checkers to check the specified endpoint from.
     * 
     */
    @Import(name="regions")
      private final @Nullable Output<List<String>> regions;

    public Output<List<String>> regions() {
        return this.regions == null ? Codegen.empty() : this.regions;
    }

    /**
     * The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the time that it sends the next health-check request.
     * 
     */
    @Import(name="requestInterval")
      private final @Nullable Output<Integer> requestInterval;

    public Output<Integer> requestInterval() {
        return this.requestInterval == null ? Codegen.empty() : this.requestInterval;
    }

    /**
     * The path that you want Amazon Route 53 to request when performing health checks.
     * 
     */
    @Import(name="resourcePath")
      private final @Nullable Output<String> resourcePath;

    public Output<String> resourcePath() {
        return this.resourcePath == null ? Codegen.empty() : this.resourcePath;
    }

    /**
     * The Amazon Resource Name (ARN) for the Route 53 Application Recovery Controller routing control. This is used when health check type is `RECOVERY_CONTROL`
     * 
     */
    @Import(name="routingControlArn")
      private final @Nullable Output<String> routingControlArn;

    public Output<String> routingControlArn() {
        return this.routingControlArn == null ? Codegen.empty() : this.routingControlArn;
    }

    /**
     * String searched in the first 5120 bytes of the response body for check to be considered healthy. Only valid with `HTTP_STR_MATCH` and `HTTPS_STR_MATCH`.
     * 
     */
    @Import(name="searchString")
      private final @Nullable Output<String> searchString;

    public Output<String> searchString() {
        return this.searchString == null ? Codegen.empty() : this.searchString;
    }

    /**
     * A map of tags to assign to the health check. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The protocol to use when performing health checks. Valid values are `HTTP`, `HTTPS`, `HTTP_STR_MATCH`, `HTTPS_STR_MATCH`, `TCP`, `CALCULATED`, `CLOUDWATCH_METRIC` and `RECOVERY_CONTROL`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public HealthCheckArgs(
        @Nullable Output<Integer> childHealthThreshold,
        @Nullable Output<List<String>> childHealthchecks,
        @Nullable Output<String> cloudwatchAlarmName,
        @Nullable Output<String> cloudwatchAlarmRegion,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<Boolean> enableSni,
        @Nullable Output<Integer> failureThreshold,
        @Nullable Output<String> fqdn,
        @Nullable Output<String> insufficientDataHealthStatus,
        @Nullable Output<Boolean> invertHealthcheck,
        @Nullable Output<String> ipAddress,
        @Nullable Output<Boolean> measureLatency,
        @Nullable Output<Integer> port,
        @Nullable Output<String> referenceName,
        @Nullable Output<List<String>> regions,
        @Nullable Output<Integer> requestInterval,
        @Nullable Output<String> resourcePath,
        @Nullable Output<String> routingControlArn,
        @Nullable Output<String> searchString,
        @Nullable Output<Map<String,String>> tags,
        Output<String> type) {
        this.childHealthThreshold = childHealthThreshold;
        this.childHealthchecks = childHealthchecks;
        this.cloudwatchAlarmName = cloudwatchAlarmName;
        this.cloudwatchAlarmRegion = cloudwatchAlarmRegion;
        this.disabled = disabled;
        this.enableSni = enableSni;
        this.failureThreshold = failureThreshold;
        this.fqdn = fqdn;
        this.insufficientDataHealthStatus = insufficientDataHealthStatus;
        this.invertHealthcheck = invertHealthcheck;
        this.ipAddress = ipAddress;
        this.measureLatency = measureLatency;
        this.port = port;
        this.referenceName = referenceName;
        this.regions = regions;
        this.requestInterval = requestInterval;
        this.resourcePath = resourcePath;
        this.routingControlArn = routingControlArn;
        this.searchString = searchString;
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private HealthCheckArgs() {
        this.childHealthThreshold = Codegen.empty();
        this.childHealthchecks = Codegen.empty();
        this.cloudwatchAlarmName = Codegen.empty();
        this.cloudwatchAlarmRegion = Codegen.empty();
        this.disabled = Codegen.empty();
        this.enableSni = Codegen.empty();
        this.failureThreshold = Codegen.empty();
        this.fqdn = Codegen.empty();
        this.insufficientDataHealthStatus = Codegen.empty();
        this.invertHealthcheck = Codegen.empty();
        this.ipAddress = Codegen.empty();
        this.measureLatency = Codegen.empty();
        this.port = Codegen.empty();
        this.referenceName = Codegen.empty();
        this.regions = Codegen.empty();
        this.requestInterval = Codegen.empty();
        this.resourcePath = Codegen.empty();
        this.routingControlArn = Codegen.empty();
        this.searchString = Codegen.empty();
        this.tags = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> childHealthThreshold;
        private @Nullable Output<List<String>> childHealthchecks;
        private @Nullable Output<String> cloudwatchAlarmName;
        private @Nullable Output<String> cloudwatchAlarmRegion;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<Boolean> enableSni;
        private @Nullable Output<Integer> failureThreshold;
        private @Nullable Output<String> fqdn;
        private @Nullable Output<String> insufficientDataHealthStatus;
        private @Nullable Output<Boolean> invertHealthcheck;
        private @Nullable Output<String> ipAddress;
        private @Nullable Output<Boolean> measureLatency;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> referenceName;
        private @Nullable Output<List<String>> regions;
        private @Nullable Output<Integer> requestInterval;
        private @Nullable Output<String> resourcePath;
        private @Nullable Output<String> routingControlArn;
        private @Nullable Output<String> searchString;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.childHealthThreshold = defaults.childHealthThreshold;
    	      this.childHealthchecks = defaults.childHealthchecks;
    	      this.cloudwatchAlarmName = defaults.cloudwatchAlarmName;
    	      this.cloudwatchAlarmRegion = defaults.cloudwatchAlarmRegion;
    	      this.disabled = defaults.disabled;
    	      this.enableSni = defaults.enableSni;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.fqdn = defaults.fqdn;
    	      this.insufficientDataHealthStatus = defaults.insufficientDataHealthStatus;
    	      this.invertHealthcheck = defaults.invertHealthcheck;
    	      this.ipAddress = defaults.ipAddress;
    	      this.measureLatency = defaults.measureLatency;
    	      this.port = defaults.port;
    	      this.referenceName = defaults.referenceName;
    	      this.regions = defaults.regions;
    	      this.requestInterval = defaults.requestInterval;
    	      this.resourcePath = defaults.resourcePath;
    	      this.routingControlArn = defaults.routingControlArn;
    	      this.searchString = defaults.searchString;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder childHealthThreshold(@Nullable Output<Integer> childHealthThreshold) {
            this.childHealthThreshold = childHealthThreshold;
            return this;
        }
        public Builder childHealthThreshold(@Nullable Integer childHealthThreshold) {
            this.childHealthThreshold = Codegen.ofNullable(childHealthThreshold);
            return this;
        }
        public Builder childHealthchecks(@Nullable Output<List<String>> childHealthchecks) {
            this.childHealthchecks = childHealthchecks;
            return this;
        }
        public Builder childHealthchecks(@Nullable List<String> childHealthchecks) {
            this.childHealthchecks = Codegen.ofNullable(childHealthchecks);
            return this;
        }
        public Builder childHealthchecks(String... childHealthchecks) {
            return childHealthchecks(List.of(childHealthchecks));
        }
        public Builder cloudwatchAlarmName(@Nullable Output<String> cloudwatchAlarmName) {
            this.cloudwatchAlarmName = cloudwatchAlarmName;
            return this;
        }
        public Builder cloudwatchAlarmName(@Nullable String cloudwatchAlarmName) {
            this.cloudwatchAlarmName = Codegen.ofNullable(cloudwatchAlarmName);
            return this;
        }
        public Builder cloudwatchAlarmRegion(@Nullable Output<String> cloudwatchAlarmRegion) {
            this.cloudwatchAlarmRegion = cloudwatchAlarmRegion;
            return this;
        }
        public Builder cloudwatchAlarmRegion(@Nullable String cloudwatchAlarmRegion) {
            this.cloudwatchAlarmRegion = Codegen.ofNullable(cloudwatchAlarmRegion);
            return this;
        }
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Codegen.ofNullable(disabled);
            return this;
        }
        public Builder enableSni(@Nullable Output<Boolean> enableSni) {
            this.enableSni = enableSni;
            return this;
        }
        public Builder enableSni(@Nullable Boolean enableSni) {
            this.enableSni = Codegen.ofNullable(enableSni);
            return this;
        }
        public Builder failureThreshold(@Nullable Output<Integer> failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = Codegen.ofNullable(failureThreshold);
            return this;
        }
        public Builder fqdn(@Nullable Output<String> fqdn) {
            this.fqdn = fqdn;
            return this;
        }
        public Builder fqdn(@Nullable String fqdn) {
            this.fqdn = Codegen.ofNullable(fqdn);
            return this;
        }
        public Builder insufficientDataHealthStatus(@Nullable Output<String> insufficientDataHealthStatus) {
            this.insufficientDataHealthStatus = insufficientDataHealthStatus;
            return this;
        }
        public Builder insufficientDataHealthStatus(@Nullable String insufficientDataHealthStatus) {
            this.insufficientDataHealthStatus = Codegen.ofNullable(insufficientDataHealthStatus);
            return this;
        }
        public Builder invertHealthcheck(@Nullable Output<Boolean> invertHealthcheck) {
            this.invertHealthcheck = invertHealthcheck;
            return this;
        }
        public Builder invertHealthcheck(@Nullable Boolean invertHealthcheck) {
            this.invertHealthcheck = Codegen.ofNullable(invertHealthcheck);
            return this;
        }
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Codegen.ofNullable(ipAddress);
            return this;
        }
        public Builder measureLatency(@Nullable Output<Boolean> measureLatency) {
            this.measureLatency = measureLatency;
            return this;
        }
        public Builder measureLatency(@Nullable Boolean measureLatency) {
            this.measureLatency = Codegen.ofNullable(measureLatency);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder referenceName(@Nullable Output<String> referenceName) {
            this.referenceName = referenceName;
            return this;
        }
        public Builder referenceName(@Nullable String referenceName) {
            this.referenceName = Codegen.ofNullable(referenceName);
            return this;
        }
        public Builder regions(@Nullable Output<List<String>> regions) {
            this.regions = regions;
            return this;
        }
        public Builder regions(@Nullable List<String> regions) {
            this.regions = Codegen.ofNullable(regions);
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }
        public Builder requestInterval(@Nullable Output<Integer> requestInterval) {
            this.requestInterval = requestInterval;
            return this;
        }
        public Builder requestInterval(@Nullable Integer requestInterval) {
            this.requestInterval = Codegen.ofNullable(requestInterval);
            return this;
        }
        public Builder resourcePath(@Nullable Output<String> resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }
        public Builder resourcePath(@Nullable String resourcePath) {
            this.resourcePath = Codegen.ofNullable(resourcePath);
            return this;
        }
        public Builder routingControlArn(@Nullable Output<String> routingControlArn) {
            this.routingControlArn = routingControlArn;
            return this;
        }
        public Builder routingControlArn(@Nullable String routingControlArn) {
            this.routingControlArn = Codegen.ofNullable(routingControlArn);
            return this;
        }
        public Builder searchString(@Nullable Output<String> searchString) {
            this.searchString = searchString;
            return this;
        }
        public Builder searchString(@Nullable String searchString) {
            this.searchString = Codegen.ofNullable(searchString);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public HealthCheckArgs build() {
            return new HealthCheckArgs(childHealthThreshold, childHealthchecks, cloudwatchAlarmName, cloudwatchAlarmRegion, disabled, enableSni, failureThreshold, fqdn, insufficientDataHealthStatus, invertHealthcheck, ipAddress, measureLatency, port, referenceName, regions, requestInterval, resourcePath, routingControlArn, searchString, tags, type);
        }
    }
}
