// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppVnetConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppVnetConnectionArgs Empty = new WebAppVnetConnectionArgs();

    /**
     * A certificate file (.cer) blob containing the public key of the private key used to authenticate a
     * Point-To-Site VPN connection.
     * 
     */
    @Import(name="certBlob")
    private @Nullable Output<String> certBlob;

    public Optional<Output<String>> certBlob() {
        return Optional.ofNullable(this.certBlob);
    }

    /**
     * DNS servers to be used by this Virtual Network. This should be a comma-separated list of IP addresses.
     * 
     */
    @Import(name="dnsServers")
    private @Nullable Output<String> dnsServers;

    public Optional<Output<String>> dnsServers() {
        return Optional.ofNullable(this.dnsServers);
    }

    /**
     * Flag that is used to denote if this is VNET injection
     * 
     */
    @Import(name="isSwift")
    private @Nullable Output<Boolean> isSwift;

    public Optional<Output<Boolean>> isSwift() {
        return Optional.ofNullable(this.isSwift);
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
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
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
     * Name of an existing Virtual Network.
     * 
     */
    @Import(name="vnetName")
    private @Nullable Output<String> vnetName;

    public Optional<Output<String>> vnetName() {
        return Optional.ofNullable(this.vnetName);
    }

    /**
     * The Virtual Network&#39;s resource ID.
     * 
     */
    @Import(name="vnetResourceId")
    private @Nullable Output<String> vnetResourceId;

    public Optional<Output<String>> vnetResourceId() {
        return Optional.ofNullable(this.vnetResourceId);
    }

    private WebAppVnetConnectionArgs() {}

    private WebAppVnetConnectionArgs(WebAppVnetConnectionArgs $) {
        this.certBlob = $.certBlob;
        this.dnsServers = $.dnsServers;
        this.isSwift = $.isSwift;
        this.kind = $.kind;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.vnetName = $.vnetName;
        this.vnetResourceId = $.vnetResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppVnetConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppVnetConnectionArgs $;

        public Builder() {
            $ = new WebAppVnetConnectionArgs();
        }

        public Builder(WebAppVnetConnectionArgs defaults) {
            $ = new WebAppVnetConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder certBlob(@Nullable Output<String> certBlob) {
            $.certBlob = certBlob;
            return this;
        }

        public Builder certBlob(String certBlob) {
            return certBlob(Output.of(certBlob));
        }

        public Builder dnsServers(@Nullable Output<String> dnsServers) {
            $.dnsServers = dnsServers;
            return this;
        }

        public Builder dnsServers(String dnsServers) {
            return dnsServers(Output.of(dnsServers));
        }

        public Builder isSwift(@Nullable Output<Boolean> isSwift) {
            $.isSwift = isSwift;
            return this;
        }

        public Builder isSwift(Boolean isSwift) {
            return isSwift(Output.of(isSwift));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder name(Output<String> name) {
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

        public Builder vnetName(@Nullable Output<String> vnetName) {
            $.vnetName = vnetName;
            return this;
        }

        public Builder vnetName(String vnetName) {
            return vnetName(Output.of(vnetName));
        }

        public Builder vnetResourceId(@Nullable Output<String> vnetResourceId) {
            $.vnetResourceId = vnetResourceId;
            return this;
        }

        public Builder vnetResourceId(String vnetResourceId) {
            return vnetResourceId(Output.of(vnetResourceId));
        }

        public WebAppVnetConnectionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
