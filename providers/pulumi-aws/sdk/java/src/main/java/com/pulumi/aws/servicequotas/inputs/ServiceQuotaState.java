// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicequotas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceQuotaState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceQuotaState Empty = new ServiceQuotaState();

    /**
     * Whether the service quota can be increased.
     * 
     */
    @Import(name="adjustable")
    private @Nullable Output<Boolean> adjustable;

    public Optional<Output<Boolean>> adjustable() {
        return Optional.ofNullable(this.adjustable);
    }

    /**
     * Amazon Resource Name (ARN) of the service quota.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Default value of the service quota.
     * 
     */
    @Import(name="defaultValue")
    private @Nullable Output<Double> defaultValue;

    public Optional<Output<Double>> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    /**
     * Code of the service quota to track. For example: `L-F678F1CE`. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
     * 
     */
    @Import(name="quotaCode")
    private @Nullable Output<String> quotaCode;

    public Optional<Output<String>> quotaCode() {
        return Optional.ofNullable(this.quotaCode);
    }

    /**
     * Name of the quota.
     * 
     */
    @Import(name="quotaName")
    private @Nullable Output<String> quotaName;

    public Optional<Output<String>> quotaName() {
        return Optional.ofNullable(this.quotaName);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    @Import(name="requestStatus")
    private @Nullable Output<String> requestStatus;

    public Optional<Output<String>> requestStatus() {
        return Optional.ofNullable(this.requestStatus);
    }

    /**
     * Code of the service to track. For example: `vpc`. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
     * 
     */
    @Import(name="serviceCode")
    private @Nullable Output<String> serviceCode;

    public Optional<Output<String>> serviceCode() {
        return Optional.ofNullable(this.serviceCode);
    }

    /**
     * Name of the service.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * Float specifying the desired value for the service quota. If the desired value is higher than the current value, a quota increase request is submitted. When a known request is submitted and pending, the value reflects the desired value of the pending request.
     * 
     */
    @Import(name="value")
    private @Nullable Output<Double> value;

    public Optional<Output<Double>> value() {
        return Optional.ofNullable(this.value);
    }

    private ServiceQuotaState() {}

    private ServiceQuotaState(ServiceQuotaState $) {
        this.adjustable = $.adjustable;
        this.arn = $.arn;
        this.defaultValue = $.defaultValue;
        this.quotaCode = $.quotaCode;
        this.quotaName = $.quotaName;
        this.requestId = $.requestId;
        this.requestStatus = $.requestStatus;
        this.serviceCode = $.serviceCode;
        this.serviceName = $.serviceName;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceQuotaState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceQuotaState $;

        public Builder() {
            $ = new ServiceQuotaState();
        }

        public Builder(ServiceQuotaState defaults) {
            $ = new ServiceQuotaState(Objects.requireNonNull(defaults));
        }

        public Builder adjustable(@Nullable Output<Boolean> adjustable) {
            $.adjustable = adjustable;
            return this;
        }

        public Builder adjustable(Boolean adjustable) {
            return adjustable(Output.of(adjustable));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder defaultValue(@Nullable Output<Double> defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        public Builder defaultValue(Double defaultValue) {
            return defaultValue(Output.of(defaultValue));
        }

        public Builder quotaCode(@Nullable Output<String> quotaCode) {
            $.quotaCode = quotaCode;
            return this;
        }

        public Builder quotaCode(String quotaCode) {
            return quotaCode(Output.of(quotaCode));
        }

        public Builder quotaName(@Nullable Output<String> quotaName) {
            $.quotaName = quotaName;
            return this;
        }

        public Builder quotaName(String quotaName) {
            return quotaName(Output.of(quotaName));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder requestStatus(@Nullable Output<String> requestStatus) {
            $.requestStatus = requestStatus;
            return this;
        }

        public Builder requestStatus(String requestStatus) {
            return requestStatus(Output.of(requestStatus));
        }

        public Builder serviceCode(@Nullable Output<String> serviceCode) {
            $.serviceCode = serviceCode;
            return this;
        }

        public Builder serviceCode(String serviceCode) {
            return serviceCode(Output.of(serviceCode));
        }

        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public Builder value(@Nullable Output<Double> value) {
            $.value = value;
            return this;
        }

        public Builder value(Double value) {
            return value(Output.of(value));
        }

        public ServiceQuotaState build() {
            return $;
        }
    }

}
