// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aadiam;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureADMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureADMetricArgs Empty = new AzureADMetricArgs();

    /**
     * Name of the azureADMetrics instance.
     * 
     */
    @Import(name="azureADMetricsName")
    private @Nullable Output<String> azureADMetricsName;

    public Optional<Output<String>> azureADMetricsName() {
        return Optional.ofNullable(this.azureADMetricsName);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Name of an Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AzureADMetricArgs() {}

    private AzureADMetricArgs(AzureADMetricArgs $) {
        this.azureADMetricsName = $.azureADMetricsName;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureADMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureADMetricArgs $;

        public Builder() {
            $ = new AzureADMetricArgs();
        }

        public Builder(AzureADMetricArgs defaults) {
            $ = new AzureADMetricArgs(Objects.requireNonNull(defaults));
        }

        public Builder azureADMetricsName(@Nullable Output<String> azureADMetricsName) {
            $.azureADMetricsName = azureADMetricsName;
            return this;
        }

        public Builder azureADMetricsName(String azureADMetricsName) {
            return azureADMetricsName(Output.of(azureADMetricsName));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
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

        public AzureADMetricArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
