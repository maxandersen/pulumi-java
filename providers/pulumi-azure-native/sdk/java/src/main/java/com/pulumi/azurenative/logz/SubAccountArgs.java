// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz;

import com.pulumi.azurenative.logz.inputs.IdentityPropertiesArgs;
import com.pulumi.azurenative.logz.inputs.MonitorPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubAccountArgs extends ResourceArgs {

    public static final SubAccountArgs Empty = new SubAccountArgs();

    @Import(name="identity")
    private @Nullable Output<IdentityPropertiesArgs> identity;

    public Optional<Output<IdentityPropertiesArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Monitor resource name
     * 
     */
    @Import(name="monitorName", required=true)
    private Output<String> monitorName;

    /**
     * @return Monitor resource name
     * 
     */
    public Output<String> monitorName() {
        return this.monitorName;
    }

    /**
     * Properties specific to the monitor resource.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<MonitorPropertiesArgs> properties;

    /**
     * @return Properties specific to the monitor resource.
     * 
     */
    public Optional<Output<MonitorPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Sub Account resource name
     * 
     */
    @Import(name="subAccountName")
    private @Nullable Output<String> subAccountName;

    /**
     * @return Sub Account resource name
     * 
     */
    public Optional<Output<String>> subAccountName() {
        return Optional.ofNullable(this.subAccountName);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SubAccountArgs() {}

    private SubAccountArgs(SubAccountArgs $) {
        this.identity = $.identity;
        this.location = $.location;
        this.monitorName = $.monitorName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.subAccountName = $.subAccountName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubAccountArgs $;

        public Builder() {
            $ = new SubAccountArgs();
        }

        public Builder(SubAccountArgs defaults) {
            $ = new SubAccountArgs(Objects.requireNonNull(defaults));
        }

        public Builder identity(@Nullable Output<IdentityPropertiesArgs> identity) {
            $.identity = identity;
            return this;
        }

        public Builder identity(IdentityPropertiesArgs identity) {
            return identity(Output.of(identity));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param monitorName Monitor resource name
         * 
         * @return builder
         * 
         */
        public Builder monitorName(Output<String> monitorName) {
            $.monitorName = monitorName;
            return this;
        }

        /**
         * @param monitorName Monitor resource name
         * 
         * @return builder
         * 
         */
        public Builder monitorName(String monitorName) {
            return monitorName(Output.of(monitorName));
        }

        /**
         * @param properties Properties specific to the monitor resource.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<MonitorPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Properties specific to the monitor resource.
         * 
         * @return builder
         * 
         */
        public Builder properties(MonitorPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param subAccountName Sub Account resource name
         * 
         * @return builder
         * 
         */
        public Builder subAccountName(@Nullable Output<String> subAccountName) {
            $.subAccountName = subAccountName;
            return this;
        }

        /**
         * @param subAccountName Sub Account resource name
         * 
         * @return builder
         * 
         */
        public Builder subAccountName(String subAccountName) {
            return subAccountName(Output.of(subAccountName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SubAccountArgs build() {
            $.monitorName = Objects.requireNonNull($.monitorName, "expected parameter 'monitorName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
