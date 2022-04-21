// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.insights.inputs.DataSourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GuestDiagnosticsSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuestDiagnosticsSettingArgs Empty = new GuestDiagnosticsSettingArgs();

    /**
     * the array of data source object which are configured to collect and send data
     * 
     */
    @Import(name="dataSources")
    private @Nullable Output<List<DataSourceArgs>> dataSources;

    public Optional<Output<List<DataSourceArgs>>> dataSources() {
        return Optional.ofNullable(this.dataSources);
    }

    /**
     * The name of the diagnostic setting.
     * 
     */
    @Import(name="diagnosticSettingsName")
    private @Nullable Output<String> diagnosticSettingsName;

    public Optional<Output<String>> diagnosticSettingsName() {
        return Optional.ofNullable(this.diagnosticSettingsName);
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Operating system type for the configuration
     * 
     */
    @Import(name="osType")
    private @Nullable Output<String> osType;

    public Optional<Output<String>> osType() {
        return Optional.ofNullable(this.osType);
    }

    @Import(name="proxySetting")
    private @Nullable Output<String> proxySetting;

    public Optional<Output<String>> proxySetting() {
        return Optional.ofNullable(this.proxySetting);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GuestDiagnosticsSettingArgs() {}

    private GuestDiagnosticsSettingArgs(GuestDiagnosticsSettingArgs $) {
        this.dataSources = $.dataSources;
        this.diagnosticSettingsName = $.diagnosticSettingsName;
        this.location = $.location;
        this.osType = $.osType;
        this.proxySetting = $.proxySetting;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuestDiagnosticsSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuestDiagnosticsSettingArgs $;

        public Builder() {
            $ = new GuestDiagnosticsSettingArgs();
        }

        public Builder(GuestDiagnosticsSettingArgs defaults) {
            $ = new GuestDiagnosticsSettingArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataSources(@Nullable Output<List<DataSourceArgs>> dataSources) {
            $.dataSources = dataSources;
            return this;
        }

        public Builder dataSources(List<DataSourceArgs> dataSources) {
            return dataSources(Output.of(dataSources));
        }

        public Builder dataSources(DataSourceArgs... dataSources) {
            return dataSources(List.of(dataSources));
        }

        public Builder diagnosticSettingsName(@Nullable Output<String> diagnosticSettingsName) {
            $.diagnosticSettingsName = diagnosticSettingsName;
            return this;
        }

        public Builder diagnosticSettingsName(String diagnosticSettingsName) {
            return diagnosticSettingsName(Output.of(diagnosticSettingsName));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder osType(@Nullable Output<String> osType) {
            $.osType = osType;
            return this;
        }

        public Builder osType(String osType) {
            return osType(Output.of(osType));
        }

        public Builder proxySetting(@Nullable Output<String> proxySetting) {
            $.proxySetting = proxySetting;
            return this;
        }

        public Builder proxySetting(String proxySetting) {
            return proxySetting(Output.of(proxySetting));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GuestDiagnosticsSettingArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
