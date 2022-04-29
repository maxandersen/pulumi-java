// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datadog.inputs;

import com.pulumi.azurenative.datadog.enums.MonitoringStatus;
import com.pulumi.azurenative.datadog.inputs.DatadogOrganizationPropertiesArgs;
import com.pulumi.azurenative.datadog.inputs.UserInfoArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties specific to the monitor resource.
 * 
 */
public final class MonitorPropertiesArgs extends ResourceArgs {

    public static final MonitorPropertiesArgs Empty = new MonitorPropertiesArgs();

    /**
     * Datadog organization properties
     * 
     */
    @Import(name="datadogOrganizationProperties")
    private @Nullable Output<DatadogOrganizationPropertiesArgs> datadogOrganizationProperties;

    /**
     * @return Datadog organization properties
     * 
     */
    public Optional<Output<DatadogOrganizationPropertiesArgs>> datadogOrganizationProperties() {
        return Optional.ofNullable(this.datadogOrganizationProperties);
    }

    /**
     * Flag specifying if the resource monitoring is enabled or disabled.
     * 
     */
    @Import(name="monitoringStatus")
    private @Nullable Output<Either<String,MonitoringStatus>> monitoringStatus;

    /**
     * @return Flag specifying if the resource monitoring is enabled or disabled.
     * 
     */
    public Optional<Output<Either<String,MonitoringStatus>>> monitoringStatus() {
        return Optional.ofNullable(this.monitoringStatus);
    }

    /**
     * User info
     * 
     */
    @Import(name="userInfo")
    private @Nullable Output<UserInfoArgs> userInfo;

    /**
     * @return User info
     * 
     */
    public Optional<Output<UserInfoArgs>> userInfo() {
        return Optional.ofNullable(this.userInfo);
    }

    private MonitorPropertiesArgs() {}

    private MonitorPropertiesArgs(MonitorPropertiesArgs $) {
        this.datadogOrganizationProperties = $.datadogOrganizationProperties;
        this.monitoringStatus = $.monitoringStatus;
        this.userInfo = $.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorPropertiesArgs $;

        public Builder() {
            $ = new MonitorPropertiesArgs();
        }

        public Builder(MonitorPropertiesArgs defaults) {
            $ = new MonitorPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datadogOrganizationProperties Datadog organization properties
         * 
         * @return builder
         * 
         */
        public Builder datadogOrganizationProperties(@Nullable Output<DatadogOrganizationPropertiesArgs> datadogOrganizationProperties) {
            $.datadogOrganizationProperties = datadogOrganizationProperties;
            return this;
        }

        /**
         * @param datadogOrganizationProperties Datadog organization properties
         * 
         * @return builder
         * 
         */
        public Builder datadogOrganizationProperties(DatadogOrganizationPropertiesArgs datadogOrganizationProperties) {
            return datadogOrganizationProperties(Output.of(datadogOrganizationProperties));
        }

        /**
         * @param monitoringStatus Flag specifying if the resource monitoring is enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder monitoringStatus(@Nullable Output<Either<String,MonitoringStatus>> monitoringStatus) {
            $.monitoringStatus = monitoringStatus;
            return this;
        }

        /**
         * @param monitoringStatus Flag specifying if the resource monitoring is enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder monitoringStatus(Either<String,MonitoringStatus> monitoringStatus) {
            return monitoringStatus(Output.of(monitoringStatus));
        }

        /**
         * @param monitoringStatus Flag specifying if the resource monitoring is enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder monitoringStatus(String monitoringStatus) {
            return monitoringStatus(Either.ofLeft(monitoringStatus));
        }

        /**
         * @param monitoringStatus Flag specifying if the resource monitoring is enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder monitoringStatus(MonitoringStatus monitoringStatus) {
            return monitoringStatus(Either.ofRight(monitoringStatus));
        }

        /**
         * @param userInfo User info
         * 
         * @return builder
         * 
         */
        public Builder userInfo(@Nullable Output<UserInfoArgs> userInfo) {
            $.userInfo = userInfo;
            return this;
        }

        /**
         * @param userInfo User info
         * 
         * @return builder
         * 
         */
        public Builder userInfo(UserInfoArgs userInfo) {
            return userInfo(Output.of(userInfo));
        }

        public MonitorPropertiesArgs build() {
            return $;
        }
    }

}
