// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Quota contains the essential parameters needed that can be applied on the resources, methods, API source combination associated with this API product. While Quota is optional, setting it prevents requests from exceeding the provisioned parameters.
 * 
 */
public final class GoogleCloudApigeeV1QuotaArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1QuotaArgs Empty = new GoogleCloudApigeeV1QuotaArgs();

    /**
     * Time interval over which the number of request messages is calculated.
     * 
     */
    @Import(name="interval", required=true)
    private Output<String> interval;

    public Output<String> interval() {
        return this.interval;
    }

    /**
     * Upper limit allowed for the time interval and time unit specified. Requests exceeding this limit will be rejected.
     * 
     */
    @Import(name="limit", required=true)
    private Output<String> limit;

    public Output<String> limit() {
        return this.limit;
    }

    /**
     * Time unit defined for the `interval`. Valid values include `minute`, `hour`, `day`, or `month`. If `limit` and `interval` are valid, the default value is `hour`; otherwise, the default is null.
     * 
     */
    @Import(name="timeUnit")
    private @Nullable Output<String> timeUnit;

    public Optional<Output<String>> timeUnit() {
        return Optional.ofNullable(this.timeUnit);
    }

    private GoogleCloudApigeeV1QuotaArgs() {}

    private GoogleCloudApigeeV1QuotaArgs(GoogleCloudApigeeV1QuotaArgs $) {
        this.interval = $.interval;
        this.limit = $.limit;
        this.timeUnit = $.timeUnit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudApigeeV1QuotaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1QuotaArgs $;

        public Builder() {
            $ = new GoogleCloudApigeeV1QuotaArgs();
        }

        public Builder(GoogleCloudApigeeV1QuotaArgs defaults) {
            $ = new GoogleCloudApigeeV1QuotaArgs(Objects.requireNonNull(defaults));
        }

        public Builder interval(Output<String> interval) {
            $.interval = interval;
            return this;
        }

        public Builder interval(String interval) {
            return interval(Output.of(interval));
        }

        public Builder limit(Output<String> limit) {
            $.limit = limit;
            return this;
        }

        public Builder limit(String limit) {
            return limit(Output.of(limit));
        }

        public Builder timeUnit(@Nullable Output<String> timeUnit) {
            $.timeUnit = timeUnit;
            return this;
        }

        public Builder timeUnit(String timeUnit) {
            return timeUnit(Output.of(timeUnit));
        }

        public GoogleCloudApigeeV1QuotaArgs build() {
            $.interval = Objects.requireNonNull($.interval, "expected parameter 'interval' to be non-null");
            $.limit = Objects.requireNonNull($.limit, "expected parameter 'limit' to be non-null");
            return $;
        }
    }

}
