// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListActiveSecurityUserRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListActiveSecurityUserRuleArgs Empty = new ListActiveSecurityUserRuleArgs();

    /**
     * The name of the network manager.
     * 
     */
    @Import(name="networkManagerName", required=true)
    private String networkManagerName;

    public String networkManagerName() {
        return this.networkManagerName;
    }

    /**
     * List of regions.
     * 
     */
    @Import(name="regions")
    private @Nullable List<String> regions;

    public Optional<List<String>> regions() {
        return Optional.ofNullable(this.regions);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * When present, the value can be passed to a subsequent query call (together with the same query and scopes used in the current request) to retrieve the next page of data.
     * 
     */
    @Import(name="skipToken")
    private @Nullable String skipToken;

    public Optional<String> skipToken() {
        return Optional.ofNullable(this.skipToken);
    }

    private ListActiveSecurityUserRuleArgs() {}

    private ListActiveSecurityUserRuleArgs(ListActiveSecurityUserRuleArgs $) {
        this.networkManagerName = $.networkManagerName;
        this.regions = $.regions;
        this.resourceGroupName = $.resourceGroupName;
        this.skipToken = $.skipToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListActiveSecurityUserRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListActiveSecurityUserRuleArgs $;

        public Builder() {
            $ = new ListActiveSecurityUserRuleArgs();
        }

        public Builder(ListActiveSecurityUserRuleArgs defaults) {
            $ = new ListActiveSecurityUserRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder networkManagerName(String networkManagerName) {
            $.networkManagerName = networkManagerName;
            return this;
        }

        public Builder regions(@Nullable List<String> regions) {
            $.regions = regions;
            return this;
        }

        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder skipToken(@Nullable String skipToken) {
            $.skipToken = skipToken;
            return this;
        }

        public ListActiveSecurityUserRuleArgs build() {
            $.networkManagerName = Objects.requireNonNull($.networkManagerName, "expected parameter 'networkManagerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
