// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.web.enums.LoadBalancingMode;
import com.pulumi.azurenative.web.inputs.NameValuePairArgs;
import com.pulumi.azurenative.web.inputs.VirtualNetworkProfileArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppServiceEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppServiceEnvironmentArgs Empty = new AppServiceEnvironmentArgs();

    /**
     * Custom settings for changing the behavior of the App Service Environment.
     * 
     */
    @Import(name="clusterSettings")
    private @Nullable Output<List<NameValuePairArgs>> clusterSettings;

    public Optional<Output<List<NameValuePairArgs>>> clusterSettings() {
        return Optional.ofNullable(this.clusterSettings);
    }

    /**
     * DNS suffix of the App Service Environment.
     * 
     */
    @Import(name="dnsSuffix")
    private @Nullable Output<String> dnsSuffix;

    public Optional<Output<String>> dnsSuffix() {
        return Optional.ofNullable(this.dnsSuffix);
    }

    /**
     * Scale factor for front-ends.
     * 
     */
    @Import(name="frontEndScaleFactor")
    private @Nullable Output<Integer> frontEndScaleFactor;

    public Optional<Output<Integer>> frontEndScaleFactor() {
        return Optional.ofNullable(this.frontEndScaleFactor);
    }

    /**
     * Specifies which endpoints to serve internally in the Virtual Network for the App Service Environment.
     * 
     */
    @Import(name="internalLoadBalancingMode")
    private @Nullable Output<Either<String,LoadBalancingMode>> internalLoadBalancingMode;

    public Optional<Output<Either<String,LoadBalancingMode>>> internalLoadBalancingMode() {
        return Optional.ofNullable(this.internalLoadBalancingMode);
    }

    /**
     * Number of IP SSL addresses reserved for the App Service Environment.
     * 
     */
    @Import(name="ipsslAddressCount")
    private @Nullable Output<Integer> ipsslAddressCount;

    public Optional<Output<Integer>> ipsslAddressCount() {
        return Optional.ofNullable(this.ipsslAddressCount);
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Resource Location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Front-end VM size, e.g. &#34;Medium&#34;, &#34;Large&#34;.
     * 
     */
    @Import(name="multiSize")
    private @Nullable Output<String> multiSize;

    public Optional<Output<String>> multiSize() {
        return Optional.ofNullable(this.multiSize);
    }

    /**
     * Name of the App Service Environment.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Name of the resource group to which the resource belongs.
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

    /**
     * User added ip ranges to whitelist on ASE db
     * 
     */
    @Import(name="userWhitelistedIpRanges")
    private @Nullable Output<List<String>> userWhitelistedIpRanges;

    public Optional<Output<List<String>>> userWhitelistedIpRanges() {
        return Optional.ofNullable(this.userWhitelistedIpRanges);
    }

    /**
     * Description of the Virtual Network.
     * 
     */
    @Import(name="virtualNetwork", required=true)
    private Output<VirtualNetworkProfileArgs> virtualNetwork;

    public Output<VirtualNetworkProfileArgs> virtualNetwork() {
        return this.virtualNetwork;
    }

    private AppServiceEnvironmentArgs() {}

    private AppServiceEnvironmentArgs(AppServiceEnvironmentArgs $) {
        this.clusterSettings = $.clusterSettings;
        this.dnsSuffix = $.dnsSuffix;
        this.frontEndScaleFactor = $.frontEndScaleFactor;
        this.internalLoadBalancingMode = $.internalLoadBalancingMode;
        this.ipsslAddressCount = $.ipsslAddressCount;
        this.kind = $.kind;
        this.location = $.location;
        this.multiSize = $.multiSize;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.userWhitelistedIpRanges = $.userWhitelistedIpRanges;
        this.virtualNetwork = $.virtualNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppServiceEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppServiceEnvironmentArgs $;

        public Builder() {
            $ = new AppServiceEnvironmentArgs();
        }

        public Builder(AppServiceEnvironmentArgs defaults) {
            $ = new AppServiceEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterSettings(@Nullable Output<List<NameValuePairArgs>> clusterSettings) {
            $.clusterSettings = clusterSettings;
            return this;
        }

        public Builder clusterSettings(List<NameValuePairArgs> clusterSettings) {
            return clusterSettings(Output.of(clusterSettings));
        }

        public Builder clusterSettings(NameValuePairArgs... clusterSettings) {
            return clusterSettings(List.of(clusterSettings));
        }

        public Builder dnsSuffix(@Nullable Output<String> dnsSuffix) {
            $.dnsSuffix = dnsSuffix;
            return this;
        }

        public Builder dnsSuffix(String dnsSuffix) {
            return dnsSuffix(Output.of(dnsSuffix));
        }

        public Builder frontEndScaleFactor(@Nullable Output<Integer> frontEndScaleFactor) {
            $.frontEndScaleFactor = frontEndScaleFactor;
            return this;
        }

        public Builder frontEndScaleFactor(Integer frontEndScaleFactor) {
            return frontEndScaleFactor(Output.of(frontEndScaleFactor));
        }

        public Builder internalLoadBalancingMode(@Nullable Output<Either<String,LoadBalancingMode>> internalLoadBalancingMode) {
            $.internalLoadBalancingMode = internalLoadBalancingMode;
            return this;
        }

        public Builder internalLoadBalancingMode(Either<String,LoadBalancingMode> internalLoadBalancingMode) {
            return internalLoadBalancingMode(Output.of(internalLoadBalancingMode));
        }

        public Builder ipsslAddressCount(@Nullable Output<Integer> ipsslAddressCount) {
            $.ipsslAddressCount = ipsslAddressCount;
            return this;
        }

        public Builder ipsslAddressCount(Integer ipsslAddressCount) {
            return ipsslAddressCount(Output.of(ipsslAddressCount));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder multiSize(@Nullable Output<String> multiSize) {
            $.multiSize = multiSize;
            return this;
        }

        public Builder multiSize(String multiSize) {
            return multiSize(Output.of(multiSize));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
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

        public Builder userWhitelistedIpRanges(@Nullable Output<List<String>> userWhitelistedIpRanges) {
            $.userWhitelistedIpRanges = userWhitelistedIpRanges;
            return this;
        }

        public Builder userWhitelistedIpRanges(List<String> userWhitelistedIpRanges) {
            return userWhitelistedIpRanges(Output.of(userWhitelistedIpRanges));
        }

        public Builder userWhitelistedIpRanges(String... userWhitelistedIpRanges) {
            return userWhitelistedIpRanges(List.of(userWhitelistedIpRanges));
        }

        public Builder virtualNetwork(Output<VirtualNetworkProfileArgs> virtualNetwork) {
            $.virtualNetwork = virtualNetwork;
            return this;
        }

        public Builder virtualNetwork(VirtualNetworkProfileArgs virtualNetwork) {
            return virtualNetwork(Output.of(virtualNetwork));
        }

        public AppServiceEnvironmentArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualNetwork = Objects.requireNonNull($.virtualNetwork, "expected parameter 'virtualNetwork' to be non-null");
            return $;
        }
    }

}
